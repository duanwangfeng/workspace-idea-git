package com.jk.controller;

import com.jk.model.Car;
import com.jk.service.CarService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName CarController
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/5 20:15
 * @Version V1.0
 **/
@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("toQueryCar")
    public String toQueryCar(){

        return "carList";
    }

    @RequestMapping("toAddCar")
    public String toAddCar(){

        return "addCar";
    }

    @RequestMapping("queryCarList")
    @ResponseBody
    public List<Car> queryCarList(){

        return carService.queryCarList();
    }

    @RequestMapping("addCar")
    @ResponseBody
    public void addCar(Car car){
        carService.addCar(car);
    }

    @RequestMapping("delCar")
    @ResponseBody
    public void delCar(Integer carId){
        carService.delCar(carId);
    }

    @RequestMapping("queryCarById")
    @ResponseBody
    public Car queryCarById(Integer carId){

        return carService.queryCarById(carId);
    }

    @RequestMapping("updCar")
    @ResponseBody
    public void updCar(Car car){
        carService.updCar(car);
    }
}
