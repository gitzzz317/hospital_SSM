package com.hzw.hospital.controller;

import com.hzw.hospital.bean.Interview;
import com.hzw.hospital.bean.Patient;
import com.hzw.hospital.service.InterviewService;
import com.hzw.hospital.service.PatientService;
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
    public String addinterview(String pUsername , String pPwd , HttpSession session , Model model){
        Patient patient = patientService.selectPatientByUsernameAndPwd(pUsername,pPwd);
        if (patient != null) {
            //将登录的用户共享到session域
            session.setAttribute("Logined_User", patient);
            //跳转患者主页
            return "patient/index";
        } else {
            model.addAttribute("Msg","可能用户名或者密码出错了，请重新登录！");
            return "index";
        }

    }

    //显示用户预约信息
    @RequestMapping(value = "/InterviewShow", method = RequestMethod.GET)
    public String interviewShow(HttpSession session, Model model) {
        //从session域中获取patient对象
        Patient patient = (Patient) session.getAttribute("Logined_User");
        //获取患者的预约信息
        List<Interview> interviewList = interviewService.getInterviewByPid(patient.getpId());
        //共享到request域中
        model.addAttribute("interviewList", interviewList);
        return "patient/interviewShow";
    }

    //跳转到修改用户信息页面
    @RequestMapping(value = "/PatientUpdate" , method = RequestMethod.GET)
    public String patientUpdate(HttpSession session , Model model){
        //从session域中获取patient对象
        Patient patient = (Patient) session.getAttribute("Logined_User");
        model.addAttribute("patient" , patient);
        return "patient/patientUpdate";
    }

    @RequestMapping(value = "/patient" , method = RequestMethod.PUT)
    public String updatePatient(Patient patient , HttpSession session , Model model){
        if(patientService.updatePatient(patient) > 0){
            Patient patiented = patientService.getPatientById(patient.getpId());
            session.setAttribute("Logined_User", patiented);
            return "redirect:/PatientUpdate";
        }
        return "patient/index";
    }

    @RequestMapping(value = "/Loginout" , method = RequestMethod.GET)
    public String Loginout(HttpSession session){
        session.removeAttribute("Logined_User");
        return "index";
    }
}
