package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Patient;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientMapper {
    //用户登录
    Patient selectPatientByUsernameAndPwd(@Param("pUsername") String pUsername,@Param("pPwd") String pPwd);
}