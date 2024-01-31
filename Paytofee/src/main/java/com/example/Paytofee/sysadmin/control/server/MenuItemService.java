package com.example.Paytofee.sysadmin.control.server;


import com.example.Paytofee.sysadmin.control.dto.MenuItemDto;
import com.example.Paytofee.sysadmin.control.entity.MenuItem;
import com.example.Paytofee.sysadmin.control.repository.MenuItemRepository;
import org.springframework.stereotype.Service;

import java.io.Serial;
import java.util.List;


public interface MenuItemService {

    MenuItemDto save(MenuItem obj);
    MenuItemDto update(MenuItemDto obj, int userId);
    Boolean delete(MenuItemDto obj, int userId);
    MenuItemDto getById(int id, int userId);
    List<MenuItemDto> getAll();
    List<MenuItemDto> getAllActive(int userId);
//    List<MenuItemDto>findAll();
//
//    MenuItemDto save(MenuItemDto menuItemDto);
//
//
//    MenuItemDto findById(MenuItemDto menuItemDto);
//
//
//    MenuItemDto update(MenuItemDto menuItemDto);
//
//    void  deleteById(Integer id);







}
