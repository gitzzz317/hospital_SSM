package com.hzw.hospital.service;

import com.hzw.hospital.bean.Interview;
import com.hzw.hospital.mapper.InterviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewService {
    @Autowired
    InterviewMapper interviewMapper;
    public List<Interview> getInterviewByPid(Integer pId) {
        return interviewMapper.getInterviewByPid(pId);
    }

}
