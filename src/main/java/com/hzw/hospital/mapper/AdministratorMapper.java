package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Administrator;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdministratorMapper {
    int deleteByPrimaryKey(String mId);

    int insert(Administrator record);

    Administrator selectByPrimaryKey(String mId);

    List<Administrator> selectAll();

    int updateByPrimaryKey(Administrator record);
}