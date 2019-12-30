package com.itschool.demo.service;

import com.itschool.demo.bean.DTO.TreeMenu;

import java.util.List;

public interface MenuService {
    /**
     * 返回树形结构菜单分类
     * @return
     */
    List<TreeMenu> findCategoryTree();
}
