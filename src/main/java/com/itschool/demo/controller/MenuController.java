package com.itschool.demo.controller;

import com.itschool.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/find/menu/")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/treeCategory")
    public List findCategoryTree() {
        return menuService.findCategoryTree();
    }
}
