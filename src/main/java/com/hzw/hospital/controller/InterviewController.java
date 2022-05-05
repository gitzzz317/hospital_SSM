package com.hzw.hospital.controller;

import com.hzw.hospital.bean.Interview;
import com.hzw.hospital.bean.Patient;
import com.hzw.hospital.bean.Sch;
import com.hzw.hospital.service.InterviewService;
import com.hzw.hospital.service.SchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class InterviewController {
    @Autowired
    SchService schService;
    @Autowired
    InterviewService interviewService;

    //查出所有医生大于对于今天的排班，跳转到添加预约页面
    @RequestMapping(value = "/InterviewAdd")
    public String toInterview(Model model){
//        List<Sch> schList = schService.getSchAll();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String iDate = formatter.format(new Date());
        System.out.println(iDate);
        List<Sch> schList = schService.getSchByDate(iDate);
        model.addAttribute("schList",schList);
        return "patient/interviewAdd";
    }
    //添加预约信息
    @RequestMapping(value = "/Interview" , method = RequestMethod.POST)
    public String addInterview(Sch sch , HttpSession session , Model model){
        Patient patient = (Patient)session.getAttribute("Logined_User");
        //1.查询是否已预约过了
        Interview interviewed = interviewService.getInterviewByPidIdateItimeDid(patient.getpId(), sch.getSchDate(), sch.getSchTime(), sch.getDoctor().getdId());
        //2.如果没预约
        if(interviewed == null ){
            if(sch.getSchBooked()<10){
                Interview interview = new Interview(null, patient, sch.getSchDate(), sch.getSchTime(), sch.getDoctor());
                Integer schBooked = sch.getSchBooked();
                Integer schId = sch.getSchId();
                interviewService.addInterview(interview , schId , schBooked);
                return "redirect:/InterviewShow";
            }else {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String sDate = formatter.format(new Date());
                System.out.println(sDate);
                List<Sch> schList = schService.getSchByDate(sDate);
                model.addAttribute("schList",schList);
                model.addAttribute("Msg" , "预约人数已满，无法预约！");
                return "patient/interviewAdd";
            }
        }else {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String sDate = formatter.format(new Date());
            System.out.println(sDate);
            List<Sch> schList = schService.getSchByDate(sDate);
            model.addAttribute("schList",schList);
            model.addAttribute("Msg" , "已预约过了，无法重复预约！");
            return "patient/interviewAdd";
        }
    }
    //根据日期或者时间查询医生排班
    @RequestMapping(value = "/Sch" , method = RequestMethod.POST)
    public String getSCHbyDateOrTime(@RequestParam(value = "searchDate") String  searchDate , @RequestParam(value = "searchTime") String searchTime , Model model){
        List<Sch> schList = schService.getSchByDateOrTime(searchDate, searchTime);
        model.addAttribute("schList",schList);
        return "patient/interviewAdd";
    }

    //删除预约信息
    @RequestMapping(value = "/DelInterview/{id}")
    public String delInterview(@PathVariable("id") Integer id){
        interviewService.delInterviewById(id);
        return "redirect:/InterviewShow";
    }

}
