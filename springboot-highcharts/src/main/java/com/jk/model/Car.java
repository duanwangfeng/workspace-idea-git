package com.jk.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Car
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/7 16:54
 * @Version V1.0
 **/
@Data
public class Car implements Serializable {
    private static final long serialVersionUID = 8506191501202450805L;

    private Integer carId;

    private String  carName;

    private Double  carPrice;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date    carTime;

    private Integer typeId;
}
