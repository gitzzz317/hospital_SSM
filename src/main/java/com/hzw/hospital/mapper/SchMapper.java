package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Sch;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SchMapper {
    int deleteByPrimaryKey(Integer schId);

    int insert(Sch record);

    Sch selectByPrimaryKey(Integer schId);

    List<Sch> selectAll();

    int updateByPrimaryKey(Sch record);
}