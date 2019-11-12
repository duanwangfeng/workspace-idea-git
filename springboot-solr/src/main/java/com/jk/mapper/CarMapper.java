package com.jk.mapper;

import com.jk.model.Car;

/**
 * @ClassName CarMapper
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/11 20:34
 * @Version V1.0
 **/
public interface CarMapper {
    void delCar(String id);

    void addCar(Car car);

    Car queryCarById(Integer id);

    void updCar(Integer carId);
}
