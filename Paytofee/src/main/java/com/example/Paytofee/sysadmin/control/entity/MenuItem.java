package com.example.Paytofee.sysadmin.control.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "SYA_MENU_ITEM")
public class MenuItem  implements Serializable {

    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name = "NAME" ,length = 100,nullable = false)
    private  String name;

    @Column(name = "BANGLA_NAME" ,length = 100,nullable = false)
    private  String banglaName;

    @Column(name = "MENU_TYPE" ,length = 100)
    private  Integer menuType;
    @Column(name = "MENU_TYPE_NAME" ,length = 100)
    private  String menuTypeName;

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private MenuItem parent;


    @Column(name = "SERIAL_NO")
    private  Integer serialNo;


    @Column(name = "URL" )
    private  String url;
    @Column(name = "ICON")
    private  String icon;
}
