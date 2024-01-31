package com.example.Paytofee.sysadmin.control.server;

import com.example.Paytofee.sysadmin.control.dto.MenuItemDto;
import com.example.Paytofee.sysadmin.control.entity.MenuItem;
import com.example.Paytofee.sysadmin.control.repository.MenuItemRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
@AllArgsConstructor
public class MenuItemEmpl implements  MenuItemService{

    private  final  MenuItemRepository repo;

    @Transactional
    @Override
    public MenuItemDto save(MenuItem obj) {

        MenuItem entity= repo.save(obj);
        return generateDto(entity);
    }
    @Transactional
    @Override
    public MenuItemDto update(MenuItemDto obj, int userId) {
        return null;
    }
    @Transactional
    @Override
    public Boolean delete(MenuItemDto obj, int userId) {
        return null;
    }
    @Transactional
    @Override
    public MenuItemDto getById(int id, int userId) {
        return null;
    }
    @Transactional
    @Override
    public List<MenuItemDto> getAll() {
        return convertEntityListToDtoList(repo.findAll().stream());
    }
    @Transactional
    @Override
    public List<MenuItemDto> getAllActive(int userId) {
        return null;
    }

//    @Override
//    public List<MenuItemDto> findAll() {
//        return null;
//    }
////    @Override
////    public List<MenuItemDto> findAll() {
////        return repo.findAll()
////                .stream()
////                .map(this::converEntityToDto)
////                .collect(Collectors.toList());
////    }
//    @Transactional
//    @Override
//    public MenuItemDto save(MenuItemDto menuItemDto) {
//        return null;
//    }
//
//    @Transactional
//    @Override
//    public MenuItemDto findById(MenuItemDto menuItemDto) {
//        return null;
//    }
//
//    @Transactional
//    @Override
//    public MenuItemDto update(MenuItemDto menuItemDto) {
//        return null;
//    }
//
//    @Transactional
//    @Override
//    public void deleteById(Integer id) {
//
//    }

    //.....................Generate Model.......................//






    private List<MenuItemDto>convertEntityListToDtoList(Stream<MenuItem>entityList){

        return  entityList.map(entity->{
            return generateDto(entity);
        }).collect(Collectors.toList());
    }


    private  MenuItemDto generateDto(MenuItem menuItem){
        MenuItemDto menuItemDto=new MenuItemDto();
        menuItemDto.setMenuType(menuItem.getId());
        menuItemDto.setMenuTypeName(menuItem.getMenuTypeName());
        menuItemDto.setIcon(menuItem.getIcon());
        menuItemDto.setUrl(menuItem.getUrl());
//        menuItemDto.setParentId(menuItem.getParent().getId());
        //menuItemDto.setParentName(menuItem.getParent().getMenuTypeName());
        menuItemDto.setSerialNo(menuItem.getSerialNo());
        return  menuItemDto;

    }





}
