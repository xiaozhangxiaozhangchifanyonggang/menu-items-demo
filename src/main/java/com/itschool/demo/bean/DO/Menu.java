package com.itschool.demo.bean.DO;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Menu {
    @Id
    //主键
    private Integer id;
    //分类名称
    private String name;
    //排序
    private Integer seq;
    //上级ID
    private Integer parentId;
    //对应级别(可省略)
    private String level;
}
