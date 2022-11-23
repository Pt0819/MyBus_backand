package com.example.MyBus_backand.service;

import com.example.MyBus_backand.entity.Teachers;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/11/23 15:25
 * @detail 演员类服务层接口
 **/
public interface ITeachersService extends IBaseService{
    /**
     * @detail
     * @param
     * @return
     *
     * */
    List<Teachers> findTeacherBy_Name(String Teacher_Name);
}
