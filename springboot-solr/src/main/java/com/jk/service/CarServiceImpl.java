package com.jk.service;

import com.jk.mapper.CarMapper;
import com.jk.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName CarServiceImpl
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/11 20:33
 * @Version V1.0
 **/
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarMapper carMapper;

    @Override
    public void delCar(String id) {
        carMapper.delCar(id);
    }

    @Override
    public void addCar(Car car) {
        carMapper.addCar(car);
    }

    @Override
    public Car queryCarById(Integer id) {
        return carMapper.queryCarById(id);
    }

    @Override
    public void updCar(Integer carId) {
        carMapper.updCar(carId);
    }
}
