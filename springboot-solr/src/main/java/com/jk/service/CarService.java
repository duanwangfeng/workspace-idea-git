package com.jk.service;

import com.jk.model.Car;

/**
 * @ClassName CarService
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/11 20:32
 * @Version V1.0
 **/
public interface CarService {
    void delCar(String id);

    void addCar(Car car);

    Car queryCarById(Integer id);

    void updCar(Integer carId);
}
