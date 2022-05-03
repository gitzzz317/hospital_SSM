package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Interview;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InterviewMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(Interview record);

    Interview selectByPrimaryKey(Integer iId);

    List<Interview> selectAll();

    int updateByPrimaryKey(Interview record);



    List<Interview> getInterviewByPid(@Param("pId") Integer pId);
}