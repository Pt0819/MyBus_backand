package com.example.MyBus_backand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.thymeleaf.spring5.processor.SpringUErrorsTagProcessor;

import java.util.Date;

/**
 * @author Peter Huang
 * @date 2022/11/22 17:12
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Teachers {
    private Integer Teacher_Id;             //老师id
    private Integer Factory_Id;              //厂商id
    private String Teacher_Name;             //老师名称
    private String Factory_Name;            //厂商名称
    private Date BirthDay;                  //老师生日
    private Integer Teacher_Age;            //老师年龄
    private Integer Teacher_Cup;            //老师cup
    private Integer Teacher_Height;             //身高
    private Integer Teacher_Waist;              //腰围
    private Integer Teacher_Hipline;            //臀围
    private Integer Teacher_Bust;               //胸围
    private Integer Teacher_Habby;              //爱好
    private TeachersPicture Teacher_picture;        //老师图片


}