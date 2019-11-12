package com.jk.model;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Model
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/7 21:44
 * @Version V1.0
 **/
@Data
public class Model {
    private String count;
    private String name;
    private String time;
    private List<Integer> data;
}
