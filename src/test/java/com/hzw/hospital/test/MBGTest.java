package com.hzw.hospital.test;

import com.hzw.hospital.bean.Interview;
import com.hzw.hospital.mapper.InterviewMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class MBGTest {
    @Test
    public void mapperTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        InterviewMapper bean = context.getBean(InterviewMapper.class);
//        List<Interview> interviews = bean.selectAll();
//        System.out.println(interviews);
//        Interview interview = new Interview(null, 1, new Date(), "上午", 1);
//        bean.insert(interview);
    }
}
