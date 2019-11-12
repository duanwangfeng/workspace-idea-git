package com.jk.mapper;

import java.util.List;
import java.util.Map;

/**
 * @ClassName CarMapper
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/7 17:03
 * @Version V1.0
 **/
public interface CarMapper {
    List<Map<String, Object>> queryCar();

    List<Map<String, Object>> areaCar();

    List<Map<String, Object>> queryCarAll();
}
