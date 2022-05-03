package com.hzw.hospital.test;

import com.hzw.hospital.bean.Patient;
import com.hzw.hospital.mapper.PatientMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MBGTest {
    @Test
    public void mapperTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        InterviewMapper bean = context.getBean(InterviewMapper.class);
        PatientMapper patientMapper = context.getBean(PatientMapper.class);
        Patient patient = patientMapper.selectPatientByUsernameAndPwd("hzw", "hzw");
//        List<Interview> interviews = bean.selectAll();
//        System.out.println(interviews);
        System.out.println(patient);
//        List<Interview> interviews = bean.selectAll();
//        System.out.println(interviews);
//        Interview interview = new Interview(null, 1, new Date(), "上午", 1);
//        bean.insert(interview);
    }
}
