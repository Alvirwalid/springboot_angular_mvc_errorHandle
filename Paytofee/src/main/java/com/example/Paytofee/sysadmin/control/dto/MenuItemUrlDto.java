package com.example.Paytofee.sysadmin.control.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemUrlDto implements Serializable {

    private  static  final  long serialVersionUID=1L;
    private Integer menuItemId;
    private String menuItemName;
    private String baseURL;
    private Boolean insert;
    private Boolean edit;
    private Boolean delete;
    private Boolean view;


}
