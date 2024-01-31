package com.example.Paytofee.sysadmin.control.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuItemDto implements Serializable {

    private  static  final  long serialVersionUID=1L;
    private  Integer menuType;
    private  String menuTypeName;
    private  Integer parentId;
    private  String parentName;
    private  Integer serialNo;
    private  String url;
    private  String icon;
}
