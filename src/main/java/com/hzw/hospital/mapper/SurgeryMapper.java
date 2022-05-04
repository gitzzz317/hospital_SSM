package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Surgery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SurgeryMapper {
    int deleteByPrimaryKey(Integer surId);

    int insert(Surgery record);

    List<Surgery> selectAll();

    int updateByPrimaryKey(Surgery record);

    /**
     * 通过Id查询诊室
     * @param surId
     * @return
     */
    Surgery getSurgeryBySurId(@Param("surId") Integer surId);

}