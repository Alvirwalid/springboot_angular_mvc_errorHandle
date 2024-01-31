package com.example.Paytofee.sysadmin.control.controller;


import com.example.Paytofee.constant.BaseConstans;
import com.example.Paytofee.sysadmin.common.BaseResponse;
import com.example.Paytofee.sysadmin.common.Utils;
import com.example.Paytofee.sysadmin.control.entity.MenuItem;
import com.example.Paytofee.sysadmin.control.repository.MenuItemRepository;
import com.example.Paytofee.sysadmin.control.server.MenuItemEmpl;
import com.example.Paytofee.sysadmin.control.server.MenuItemService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/system-admin-menu-item")
public class MenuItemController {




    private  final MenuItemEmpl service;


    @PostMapping
    public BaseResponse save(@RequestBody MenuItem body, HttpServletRequest request) {
        System.out.println(body + "Body...");
        try {
            return Utils.generateSuccessResponse(service.save(body), "Successfully Save", "সফলভাবে সংরক্ষণ হয়েছে");
        } catch (Exception e) {
            e.printStackTrace();
            return Utils.generateErrorResponse(e);
        }
    }

    @GetMapping(produces = BaseConstans.EXTERNAL_MEDIA_TYPE)
    public BaseResponse getAll(HttpServletRequest request) {
        try {
            return Utils.generateSuccessResponse(service.getAll());
        } catch (Exception e) {
            return Utils.generateErrorResponse(e);
        }
    }


















}
