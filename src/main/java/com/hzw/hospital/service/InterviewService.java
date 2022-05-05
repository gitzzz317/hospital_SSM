package com.hzw.hospital.service;

import com.hzw.hospital.bean.Interview;
import com.hzw.hospital.bean.Sch;
import com.hzw.hospital.mapper.InterviewMapper;
import com.hzw.hospital.mapper.SchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InterviewService {
    @Autowired
    InterviewMapper interviewMapper;
    @Autowired
    SchMapper schMapper;
    public List<Interview> getInterviewByPid(Integer pId) {
        return interviewMapper.getInterviewByPid(pId);
    }

    @Transactional
    public void addInterview(Interview interview,Integer schId , Integer schBooked) {
        interviewMapper.addInterview(interview);
        schMapper.updateSchBookedBySchId(schId , schBooked+1);
    }
    @Transactional
    public void delInterviewById(Integer id) {
        //1.根据预约id查询预约信息
        Interview interview = interviewMapper.getInterviewById(id);
        //2.根据预约信息查询对于的医生排班
        Sch sch = schMapper.getSchByTimeAndDid(interview.getiDate(), interview.getiTime(), interview.getDoctor().getdId());
        //3.删除该预约信息
        interviewMapper.delInterview(id);
        //4.医生排班中已预约人数减1
        schMapper.updateSchBookedBySchId(sch.getSchId(),sch.getSchBooked()-1);
    }

    public Interview getInterviewByPidIdateItimeDid(Integer pId, String schDate, String schTime, Integer dId) {
        return interviewMapper.getInterviewByPidIdateItimeDid(pId,schDate,schTime,dId);
    }
}
