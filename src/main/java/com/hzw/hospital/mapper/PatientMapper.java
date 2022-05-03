package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PatientMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(Patient record);

    Patient selectByPrimaryKey(Integer pId);

    List<Patient> selectAll();

    int updateByPrimaryKey(Patient record);
}