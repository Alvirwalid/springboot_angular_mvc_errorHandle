package com.example.Paytofee.sysadmin.control.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.awt.*;
import java.io.Serializable;



@Data
@Entity
@Table(name = "SYA_MENU_ITEM_URL")
public class MenuItemUrl implements Serializable {


    private  static  final  long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "MENU_ITEM_ID",nullable = false,unique = true)
    private MenuItem menuItem;

    @Column(name = "BASE_URL",nullable = false)
    private  String baseUrl;
    @Column(name = "IS_INSERT")
    private  Boolean insert;

    @Column(name = "IS_EDIT")
    private  Boolean edit;

    @Column(name = "IS_DELETE")
    private  Boolean delete;

    @Column(name = "IS_VIEW")
    private  Boolean view;
}
