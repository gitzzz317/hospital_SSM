package com.hzw.hospital.service;

import com.hzw.hospital.bean.Patient;
import com.hzw.hospital.mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    PatientMapper patientMapper;

    public Patient selectPatientByUsernameAndPwd(String pUsername, String pPwd) {
        return patientMapper.selectPatientByUsernameAndPwd(pUsername, pPwd);
    }

    public int updatePatient(Patient patient) {
        return patientMapper.updatePatient(patient);
    }

    public Patient getPatientById(Integer pId) {
        return patientMapper.getPatientById(pId);
    }
}
