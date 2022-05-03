package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Doctor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DoctorMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Doctor record);

    Doctor selectByPrimaryKey(Integer dId);

    List<Doctor> selectAll();

    int updateByPrimaryKey(Doctor record);

    /**
     * 通过分步查询，医生排班及所对应的医生信息
     * 分步查询第二步：查询医生信息
     * @param dId
     * @return
     */
    Doctor getSchAndDoctorAllTwo(@Param("dId") Integer dId);
}