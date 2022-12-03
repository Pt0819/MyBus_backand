package com.example.MyBus_backand.Mapper;

import com.example.MyBus_backand.entity.Movies;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/12/3 14:15
 * @detail 影片类Mapper接口，要求和各实体类中的属性名称对应
 **/
@Repository
public interface MoviesMapper {
    /**
     * @detail 根据Movie_Name查询Movie列表
     * @param Movie_Name
     * @return
     * */
    List<Movies> SelectMovieBy_Name(@Param("Movie_Name")String Movie_Name);

}
