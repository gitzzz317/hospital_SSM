package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Doctor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DoctorMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Doctor record);

    Doctor selectByPrimaryKey(Integer dId);

    List<Doctor> selectAll();

    int updateByPrimaryKey(Doctor record);
}