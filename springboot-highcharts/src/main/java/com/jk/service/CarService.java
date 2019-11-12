package com.jk.service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName CarService
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/7 17:02
 * @Version V1.0
 **/
public interface CarService {
    List<Map<String, Object>> queryCar();

    List<Map<String, Object>> areaCar();

    List<Map<String, Object>> queryCarAll();
}
