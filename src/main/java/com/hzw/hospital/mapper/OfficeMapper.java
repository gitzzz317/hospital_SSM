package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Office;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OfficeMapper {
    int deleteByPrimaryKey(Integer oId);

    int insert(Office record);

    Office selectByPrimaryKey(Integer oId);

    List<Office> selectAll();

    int updateByPrimaryKey(Office record);
}