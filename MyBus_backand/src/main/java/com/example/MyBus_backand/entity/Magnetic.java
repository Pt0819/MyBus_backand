package com.example.MyBus_backand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Peter Huang
 * @date 2022/11/23 15:09
 * @detail 磁力链接实体类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Magnetic {
    private String Magnetic_Name;           //电影磁力链接名称
    private Integer Magnetic_Id;            //电影磁力链接Id
    private String Magnetic_large;              //电影磁力链接大小（**GB）
    private Date Magnetic_ReleaseDate;          //电影磁力链接分享时间
    private Movies Movie_Magnetic;              //磁力对应的影片

}
