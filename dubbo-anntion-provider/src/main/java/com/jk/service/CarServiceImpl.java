package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.CarMapper;
import com.jk.model.Car;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CarServiceImpl
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/6 10:42
 * @Version V1.0
 **/
@Service(version = "1.0")
public class CarServiceImpl implements CarService{
    @Autowired
    private CarMapper carMapper;

    @Override
    public List<Car> queryCarList() {
        List list = new ArrayList();
        try {
            list = carMapper.queryCarList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
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

    @Override
    public void addCarList(List<Car> list) {
        carMapper.addCarList(list);
    }

    @Override
    public List<Car> queryCarByColum(String column) {

        return carMapper.queryCarByColum(column);
    }
}
