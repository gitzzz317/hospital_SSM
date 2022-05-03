package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Sch;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SchMapper {
    int deleteByPrimaryKey(Integer schId);

    int insert(Sch record);

    Sch selectByPrimaryKey(Integer schId);


    int updateByPrimaryKey(Sch record);


    /**
     * 通过分步查询，医生排班及所对应的医生信息
     * 分步查询第一步：查询医生排班信息
     * @return
     */
    List<Sch> getSchAndDoctorAllOne();
}