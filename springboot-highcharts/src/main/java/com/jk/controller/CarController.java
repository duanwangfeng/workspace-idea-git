package com.jk.controller;

import com.jk.model.Model;
import com.jk.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CarController
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/7 17:02
 * @Version V1.0
 **/
@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("toShow")
    public String toShow(){

        return "show";
    }

    @RequestMapping("queryCar")
    @ResponseBody
    public List<Map<String, Object>> queryCar(){
        List<Map<String, Object>> map1 = carService.queryCar();

        List<Map<String,Object>>  map2 = new ArrayList<Map<String,Object>>();

        for (Map<String, Object> map:map1) {
            Map<String, Object> map3 = new HashMap<String, Object>();
            map3.put("y",map.get("y"));
            map3.put("name",map.get("月份"));

            map2.add(map3);
        }
        return map2;
    }

    @RequestMapping("areaCar")
    @ResponseBody
    public List<Map<String, Object>> areaCar(){
        List<Map<String, Object>> map1 = carService.areaCar();

        List<Map<String,Object>>  map2 = new ArrayList<Map<String,Object>>();

        for (Map<String,Object> map:map1) {
            Map<String, Object> map3 = new HashMap<String, Object>();
            map3.put("name",map.get("name"));
            map3.put("data",map.get("data"));

            map2.add(map3);
        }

        return map2;
    }









    @RequestMapping("queryHistogram")
    @ResponseBody
    public List<Model> queryHistogram(){
        /**
         * 1.使用饼状图展示2019年每一个月的销量
         * 2.使用折线图展示每一周的销量
         * 3.使用面积图展示每个品牌的销量
         * 4.使用柱状图展示一个月内每一天的销量
         */

        List<Model> resultList = new ArrayList<>();
        List<Map<String,Object>> map =carService.queryCarAll();
        ArrayList<Integer> type1 = new ArrayList<>();
        ArrayList<Integer> type2 = new ArrayList<>();
        ArrayList<Integer> type3 = new ArrayList<>();
        ArrayList<Integer> type4 = new ArrayList<>();

        for (Map<String,Object> map1:map) {
            if(map1.get("typeId").toString().equals("1")){
                type1.add(Integer.parseInt(map1.get("count").toString()));
            }
            if(map1.get("typeId").toString().equals("2")){
                type2.add(Integer.parseInt(map1.get("count").toString()));
            }
            if(map1.get("typeId").toString().equals("3")){
                type3.add(Integer.parseInt(map1.get("count").toString()));
            }
            if(map1.get("typeId").toString().equals("4")){
                type4.add(Integer.parseInt(map1.get("count").toString()));
            }

        }

        for (Map<String,Object> map1:map) {
            Model model = new Model();
            Map<String,Object> map3=new HashMap<String,Object>();
            if(map1.get("typeId").toString().equals("1")){
                model.setData(type1);
                model.setName("跑车");
                model.setTime(map1.get("time").toString());
                resultList.add(model);
            }
            if(map1.get("typeId").toString().equals("2")){
                model.setData(type2);
                model.setName("轿车");
                model.setTime(map1.get("time").toString());
                resultList.add(model);
            }
            if(map1.get("typeId").toString().equals("3")){
                model.setData(type3);
                model.setName("轿跑");
                model.setTime(map1.get("time").toString());
                resultList.add(model);
            }
            if(map1.get("typeId").toString().equals("4")){
                model.setData(type4);
                model.setName("suv");
                model.setTime(map1.get("time").toString());
                resultList.add(model);
            }

        }

        return resultList;
    }




}
