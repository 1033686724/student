package com.briup.demo.bean;



import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class student implements Serializable {
    @ApiModelProperty(value = "学生id")
    private int id;

    @ApiModelProperty(value = "学生姓名")
    private String name;

    @ApiModelProperty(value = "学生分数")
    private int score;

}
