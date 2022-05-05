package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Sch;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SchMapper {
    int deleteByPrimaryKey(Integer schId);

    int insert(Sch record);

    int updateByPrimaryKey(Sch record);


    /**
     * 通过分步查询，医生排班及所对应的医生信息
     * 分步查询第一步：查询医生排班信息
     * @return
     */
    List<Sch> getSchAll();

    /**
     * 根据日期或者时间查询医生排班信息
     * @param searchDate
     * @param searchTime
     * @return
     */
    List<Sch> getSchByDateOrTime(@Param("searchDate") String searchDate,@Param("searchTime") String searchTime);

    /**
     * 通过id修改预约人数
     * @param schId
     * @param schBooked
     * @return
     */
    boolean updateSchBookedBySchId(@Param("schId") Integer schId,@Param("schBooked") Integer schBooked);

    /**
     * 根据日期和时间和医生ID查询医生排班信息
     * @param iDate
     * @param iTime
     * @param dId
     * @return
     */
    Sch getSchByTimeAndDid(@Param("iDate") String iDate,@Param("iTime") String iTime,@Param("dId") Integer dId);

    /**
     * 根据日期获取大于等于日期的医生排班信息
     * @param sDate
     * @return
     */
    List<Sch> getSchByDate(@Param("iDate") String sDate);
}