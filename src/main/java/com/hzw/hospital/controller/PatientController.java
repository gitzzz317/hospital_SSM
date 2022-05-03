package com.hzw.hospital.controller;

import com.hzw.hospital.bean.Interview;
import com.hzw.hospital.bean.Patient;
import com.hzw.hospital.bean.Sch;
import com.hzw.hospital.service.InterviewService;
import com.hzw.hospital.service.PatientService;
import com.hzw.hospital.service.SchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class PatientController {
    @Autowired
    PatientService patientService;
    @Autowired
    InterviewService interviewService;
    //用户登录
    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public String addinterview(String pUsername , String pPwd , HttpSession session){
        Patient patient = patientService.selectPatientByUsernameAndPwd(pUsername,pPwd);
        if (patient != null) {
            //获取当前登录患者的所有预约
//            List<Interview> interviews = interviewService.getInterviewByP_id(patient.getP_id());
            //将登录的用户共享到session域
            session.setAttribute("Logined_User", patient);
            //将当前登录的患者和所有预约的信息传到Request域
//            model.addAttribute("interviews", interviews);
//            model.addAttribute("patient", patient);
            //跳转患者主页
            return "patient/index";
        } else {
            return "index";
        }

    }
    //
//    @RequestMapping(value = "/interviewAdd" )
//    public String toInterviewAdd(Model model){
//        List<Sch> schs = schService.selectAll();
//        model.addAttribute("schs",schs);
//        return "patient/interviewAdd";
//    }
    @RequestMapping(value = "/success")
    public String toInterviewAdd(){
        return "success";
    }

    //显示用户预约信息
    @RequestMapping(value = "/InterviewShow", method = RequestMethod.GET)
    public String InterviewShow(HttpSession session, Model model) {
        //从session域中获取patient对象
        Patient patient = (Patient) session.getAttribute("Logined_User");
//        //获取患者的预约信息
        List<Interview> interviewList = interviewService.getInterviewByPid(patient.getpId());
//        //共享到request域中
        model.addAttribute("interviewList", interviewList);
        return "patient/interviewShow";
    }
}
