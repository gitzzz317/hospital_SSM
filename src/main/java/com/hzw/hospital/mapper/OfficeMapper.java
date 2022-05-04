package com.hzw.hospital.mapper;

import com.hzw.hospital.bean.Office;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OfficeMapper {
    int deleteByPrimaryKey(Integer oId);

    int insert(Office record);

    List<Office> selectAll();

    int updateByPrimaryKey(Office record);

    /**
     * 通过Id查询科室
     * @param oId
     * @return
     */
    Office getOfficeById(@Param("oId") Integer oId);

}