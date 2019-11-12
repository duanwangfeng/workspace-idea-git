package com.jk.mapper;

import com.jk.model.Car;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CarMapper
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/6 10:44
 * @Version V1.0
 **/
public interface CarMapper {
    List<Car> queryCarList() throws Exception;

    void addCar(Car car);

    void delCar(Integer carId);

    Car queryCarById(Integer carId);

    void updCar(Car car);

    void addCarList(List<Car> list);

    List<Car> queryCarByColum(@Param("column") String column);
}
