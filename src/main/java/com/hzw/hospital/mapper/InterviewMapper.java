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


    /**
     * 根据患者id查询预约信息
     * @param pId
     * @return
     */
    List<Interview> getInterviewByPid(@Param("pId") Integer pId);

    /**
     * 添加预约信息
     * @param interview
     * @return
     */
    boolean addInterview(Interview interview);

    /**
     * 根据预约id查询预约信息
     * @param id
     * @return
     */
    Interview getInterviewById(@Param("id") Integer id);

    /**
     * 根据预约id删除预约信息
     * @param id
     * @return
     */
    boolean delInterview(@Param("id") Integer id);
}