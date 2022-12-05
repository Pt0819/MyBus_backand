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
    /**
     * @detail 根据Movie_Noid查询Movie列表(电影番号)
     * @param Movie_Noid
     * @return
     * */
    List<Movies> SelectMovieBy_Noid(@Param("Movie_Noid")String Movie_Noid);
    /**
     * @detail 根据Movie_SeriesName查询Movie列表(电影系列名称)
     * @param Movie_SeriesName
     * @return
     * */
    List<Movies> SelectMovieby_Series(@Param("Movie_SeriesList")String Movie_SeriesName);
    /**
     * @detail 根据参演人员查询影片（参演人员>=1）
     * @param Teacher_Name
     * @return
     * */
    List<Movies> SelectMovieBy_TeacherName(@Param("Teacher_Name")String ... Teacher_Name);
    /**
     * @detail 根据Publisher的名称查询影片
     * @param Publisher_Name
     * @return
     * */
    List<Movies> SelectMovieBy_PublisherName(@Param("Publisher_Name")String Publisher_Name);
    /**
     * @detail 根据Producer的名称查询影片
     * @param Producer_Name
     * @return
     * */
    List<Movies> SelectMovieBy_ProducerName(@Param("Producer_Name")String Producer_Name);
    /**
     * 更新新影片
     * @param Movie_New
     * @return
     * */
    Movies InsertMovie_New(@Param("Movie_New")Movies Movie_New);

}
