package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Interview;
import com.hzw.hospital.bean.Patient;
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

    /**
     * 根据预约患者 预约时间 预约医生 查询预约信息
     * @param pId
     * @param schDate
     * @param schTime
     * @param dId
     * @return
     */
    Interview getInterviewByPidIdateItimeDid(@Param("pId") Integer pId,@Param("iDate") String schDate,@Param("iTime") String schTime,@Param("dId") Integer dId);
}