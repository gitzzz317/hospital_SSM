package com.hzw.hospital.controller;

import com.hzw.hospital.bean.Interview;
import com.hzw.hospital.mapper.InterviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class PatientController {
    @Autowired
    InterviewMapper interviewMapper;


    @RequestMapping(value = "/interview" , method = RequestMethod.POST)
    public String addinterview(Interview interview){
//        List<Interview> interviews = bean.selectAll();
//        System.out.println(interviews);
        //Interview interview = new Interview(null, 1, new Date(), "上午", 1);
        interviewMapper.insert(interview);
        return "success";
    }
}
