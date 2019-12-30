package com.itschool.demo.bean.DTO;

import lombok.Data;

import java.util.List;

@Data
public class TreeMenu {
    //对应级别(可省略)
    private String level;
    //分类名称
    private String name;
    //下级分类
    private List<TreeMenu> children;
}
