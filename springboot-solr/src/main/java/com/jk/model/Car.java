package com.jk.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Car
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/11 18:39
 * @Version V1.0
 **/
@Data
public class Car implements Serializable {

    private static final long serialVersionUID = 8506191501202450805L;

    private Integer carId;

    private String  carName;

    private String  carTime;

    private Double  carPrice;

    private String  carShow;

    private Double  startPrice;

    private Double  endPrice;
}
