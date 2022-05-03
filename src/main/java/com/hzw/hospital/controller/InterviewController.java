package com.hzw.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterviewController {

    @RequestMapping(value = "/interviewAdd")
    public String toInterview(){
        return "patient/interviewAdd";
    }

}
