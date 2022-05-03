package com.hzw.hospital.controller;

import com.hzw.hospital.bean.Patient;
import com.hzw.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class PatientController {
    @Autowired
    PatientService patientService;
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

    @RequestMapping(value = "/success" )
    public String toSuccess(){
        return "success";
    }
}
