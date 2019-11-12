package com.jk.service;

import com.jk.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName CarServiceImpl
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/7 17:03
 * @Version V1.0
 **/
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarMapper carMapper;

    @Override
    public List<Map<String, Object>> queryCar() {
        return carMapper.queryCar();
    }

    @Override
    public List<Map<String, Object>> areaCar() {
        return carMapper.areaCar();
    }

    @Override
    public List<Map<String, Object>> queryCarAll() {
        return carMapper.queryCarAll();
    }
}

