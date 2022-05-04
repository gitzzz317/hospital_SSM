package com.hzw.hospital.test;


import com.hzw.hospital.bean.Sch;
import com.hzw.hospital.mapper.SchMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MBGTest {
    @Test
    public void mapperTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        InterviewMapper bean = context.getBean(InterviewMapper.class);
//        PatientMapper patientMapper = context.getBean(PatientMapper.class);
//        Patient patient = patientMapper.selectPatientByUsernameAndPwd("hzw", "hzw");
//        System.out.println(patient);
//
//        SurgeryMapper surgeryMapper = context.getBean(SurgeryMapper.class);
//        Surgery surgeryBySurId = surgeryMapper.getSurgeryBySurId(1);
//        System.out.println(surgeryBySurId);

        SchMapper schMapper = context.getBean(SchMapper.class);
        List<Sch> schList = schMapper.getSchAll();
        System.out.println(schList);

    }
}
