package com.jk.service;

import com.jk.mapper.CarMapper;
import com.jk.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CarServiceImpl
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/5 20:02
 * @Version V1.0
 **/
@Service("carService")
public class CarServiceImpl implements CarService{
    @Autowired
    private CarMapper carMapper;

    /*查询汽车信息*/
    @Override
    public List<Car> queryCarList() {

        return carMapper.queryCarList();
    }

    @Override
    public void addCar(Car car) {
        carMapper.addCar(car);
    }

    @Override
    public void delCar(Integer carId) {
        carMapper.delCar(carId);
    }

    @Override
    public Car queryCarById(Integer carId) {

        return carMapper.queryCarById(carId);
    }

    @Override
    public void updCar(Car car) {
        carMapper.updCar(car);
    }
}
