package com.itschool.demo.service.impl;

import com.itschool.demo.bean.DO.Menu;
import com.itschool.demo.bean.DTO.TreeMenu;
import com.itschool.demo.mapper.MenuMapper;
import com.itschool.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.*;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<TreeMenu> findCategoryTree() {
        Example example = new Example(Menu.class);
        example.setOrderByClause("seq");
        List<Menu> menus = menuMapper.selectByExample(example);
        return findByParentId(menus, 0);
    }

    /**
     * 根据父级ID分类返回树形菜单
     * @param menus 根据seq排序后的所有菜单
     * @param parentId  父级id
     * @return
     */
    private List<TreeMenu> findByParentId(List<Menu> menus, Integer parentId) {
        List<TreeMenu> result = new ArrayList<>();
        for (Menu menu : menus) {
            if (menu.getParentId().equals(parentId)) {
                TreeMenu treeMenu = new TreeMenu();
                treeMenu.setLevel(menu.getLevel());
                treeMenu.setName(menu.getName());
                //递归查询下级菜单
                treeMenu.setChildren(findByParentId(menus, menu.getId()));
                result.add(treeMenu);
            }
        }
        return result;
    }

}
