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
import java.util.List;

@Controller
public class InterviewController {
    @Autowired
    SchService schService;
    @Autowired
    InterviewService interviewService;

    //查出所有医生排班，跳转到添加预约页面
    @RequestMapping(value = "/InterviewAdd")
    public String toInterview(Model model){
        List<Sch> schList = schService.getSchAll();
        model.addAttribute("schList",schList);
        return "patient/interviewAdd";
    }
    //添加预约信息
    @RequestMapping(value = "/Interview" , method = RequestMethod.POST)
    public String addInterview(Sch sch , HttpSession session){
        Interview interview = new Interview(null, ((Patient) session.getAttribute("Logined_User")), sch.getSchDate(), sch.getSchTime(), sch.getDoctor());
        //Interview interview = new Interview(null, ((Patient) session.getAttribute("Logined_User")).getpId(), sch.getSchDate(), sch.getSchTime(), sch.getDoctor().getdId());
        Integer schBooked = sch.getSchBooked();
        Integer schId = sch.getSchId();
        interviewService.addInterview(interview , schId , schBooked);
        return "redirect:/InterviewShow";
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
