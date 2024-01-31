package com.example.Paytofee.sysadmin.control.repository;

import com.example.Paytofee.sysadmin.control.entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItem,Integer> {

//    List<MenuItem> findByMenuType(Integer menuType);


    String searchQuery="select a.*\n"
            +"from sya_menu_item a\n"
            +"left outer join sya_menu_item  b on a.parent_id=b.id\n"
            +"where 1=1\n"
            +"and concat(a.name,a.bangla_name,a.menu_type_name,b.name) like %:searchValue%\n";



}
