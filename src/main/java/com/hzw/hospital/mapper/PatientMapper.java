package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Patient;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientMapper {
    /**
     * 根据用户名和密码查询患者
     * @param pUsername
     * @param pPwd
     * @return
     */
    Patient selectPatientByUsernameAndPwd(@Param("pUsername") String pUsername,@Param("pPwd") String pPwd);

    /**
     * 根据id查询患者
     * @param pId
     * @return
     */
    Patient getPatientById(@Param("pId") Integer pId);

    /**
     * 修改patient
     * @param patient
     * @return
     */
    int updatePatient(Patient patient);
}