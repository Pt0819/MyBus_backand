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
    private String Movie_Id;           //电影Id，数据库中的显示id，在搜素一般使用番号或名称搜素
    private String Movie_Noid;          //电影番号 使用String类型，例如ipx-111
    private String Movie_Name;          //电影名称
    private Date Movie_Date;            //影片上映（发行）时间
    private Integer Movie_Duration;         //电影时长（分钟）
    private String Movie_Director;          //电影导演
    private List<Category> Movie_CategoryList;             //电影类别，一部影片包含多种类别
    private Publisher Movie_Publisher;             //电影发行商
    private Producer Movie_Producer;              //电影制作商
    private List<Teachers> Movie_TeachersList;              //电影出演演员List
    private List<TeachersPicture> Movie_TeachersPicture;        //所有参演人员的图片
    private List<MoviesPicture> Movie_PictureList;          //电影的预览图List
    private List<Magnetic> Movie_MagneticList;              //电影的磁力链接List
    private Series Movie_SeriesName;                  //电影的系列,每一步影片至多属于一个系列

}
