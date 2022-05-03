package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Surgery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SurgeryMapper {
    int deleteByPrimaryKey(Integer surId);

    int insert(Surgery record);

    Surgery selectByPrimaryKey(Integer surId);

    List<Surgery> selectAll();

    int updateByPrimaryKey(Surgery record);
}