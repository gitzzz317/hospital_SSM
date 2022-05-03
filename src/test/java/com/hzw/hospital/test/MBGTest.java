package com.hzw.hospital.test;

import com.hzw.hospital.bean.Doctor;
import com.hzw.hospital.bean.Patient;
import com.hzw.hospital.bean.Sch;
import com.hzw.hospital.mapper.DoctorMapper;
import com.hzw.hospital.mapper.PatientMapper;
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
//        DoctorMapper doctorMapper = context.getBean(DoctorMapper.class);
//        Doctor doctor = doctorMapper.getSchAndDoctorAllTwo(1);
//        System.out.println(doctor);
        SchMapper schMapper = context.getBean(SchMapper.class);
        List<Sch> schList = schMapper.getSchAndDoctorAllOne();
        System.out.println(schList.get(0).getSchSize());
//        System.out.println(schList);
//        List<Interview> interviews = bean.selectAll();
//        System.out.println(interviews);

//        List<Interview> interviews = bean.selectAll();
//        System.out.println(interviews);
//        Interview interview = new Interview(null, 1, new Date(), "上午", 1);
//        bean.insert(interview);
    }
}
