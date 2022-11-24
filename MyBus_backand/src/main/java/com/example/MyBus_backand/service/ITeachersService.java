package com.example.MyBus_backand.service;

import com.example.MyBus_backand.entity.Teachers;
import com.example.MyBus_backand.entity.TeachersPicture;

import java.util.Date;
import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/11/23 15:25
 * @detail 演员类服务层接口
 **/
public interface ITeachersService extends IBaseService{
    /**
     * @detail 描述:通过演员名称进行查询
     * @param Teacher_Name
     * @return
     *
     * */
    List<Teachers> findTeacherBy_TeacherName(String Teacher_Name);
    /**
     * @detail 描述:通过女演员所属片商名称进行查询
     * @param Factory_Name
     * @return
     *
     * */
    List<Teachers> findTeacherBy_FactoryName(String Factory_Name);
    /**
     * @detail 描述:每日更新爬虫，添加新演员信息，新建一个演员，添加到List<Teacher>中，更新Teacher实体类中所有的信息
     * @param Teacher_Id,Teacher_Name,Factory_Id,Factory_Name,Teacher_BirthDay,Teacher_Age,Teacher_Cup,Teacher_Height,Teacher_Waist,
     * Teacher_Hipline,Teacher_Bust,Teacher_Habby,Teacher_picture
     * @return
     *
     * */
    void updateTeacher(Integer Teacher_Id, String Teacher_Name, Integer Factory_Id, String Factory_Name, Date BirthDay, Integer Age,
                       Integer Cup, Integer Height, Integer Waist, Integer Hipline, Integer Bust, Integer Habby, TeachersPicture picture);


}
