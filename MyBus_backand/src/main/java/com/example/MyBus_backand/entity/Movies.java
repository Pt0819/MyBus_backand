package com.example.MyBus_backand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/11/23 14:10
 * @detail 影片实体类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Movies {
    private Integer Movie_ID;           //电影ID
    private String Movie_Name;          //电影名称
    private Date Movie_Date;            //影片上映（发行）时间
    private Integer Movie_Duration;         //电影时长（分钟）
    private String Movie_Director;          //电影导演
    private List<Category> Movie_CategoryList;              //电影类别，一部影片包含多种类别
    private String Movie_Publisher;             //电影发行商
    private String Movie_Producer;              //电影制作商
    private List<Teachers> Movie_TeachersList;              //电影出演演员List

}
