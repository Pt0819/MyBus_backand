package com.example.MyBus_backand.Mapper;

import com.example.MyBus_backand.entity.Teachers;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/12/3 15:19
 * @detail Teachers类Mapper接口
 **/
@Repository
public interface TeachersMapper {
    /**
     * 根据Teacher_Name查询Teacher列表
     * @param Teacher_Name
     * @return
     * */
    List<Teachers> SelectTeacherBy_TeacherName(@Param("Teacher_Name") String Teacher_Name);
    /**
     * 根据Movie_Name查询参演的Teacher列表
     * @param Movie_Name
     * @return
     * */
    List<Teachers> SelectTeacherBy_MovieName(@Param("Movie_Name")String Movie_Name);

}
