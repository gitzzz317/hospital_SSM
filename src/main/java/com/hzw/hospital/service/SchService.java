package com.hzw.hospital.service;

import com.hzw.hospital.bean.Sch;
import com.hzw.hospital.mapper.SchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchService {
    @Autowired
    SchMapper schMapper;

    public List<Sch> getSchAll() {
        return schMapper.getSchAll();
    }


    public List<Sch> getSchByDateOrTime(String searchDate, String searchTime) {
        return schMapper.getSchByDateOrTime(searchDate,searchTime);
    }

    public List<Sch> getSchByDate(String sDate) {
        return schMapper.getSchByDate(sDate);
    }
}
