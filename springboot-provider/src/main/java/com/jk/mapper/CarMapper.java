package com.jk.mapper;

import com.jk.model.Car;

import java.util.List;

/**
 * @ClassName CarMapper
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/5 20:05
 * @Version V1.0
 **/
public interface CarMapper {
    List<Car> queryCarList();

    void addCar(Car car);

    void delCar(Integer carId);

    Car queryCarById(Integer carId);

    void updCar(Car car);
}
