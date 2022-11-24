package com.example.MyBus_backand.service;

import com.example.MyBus_backand.entity.Category;
import com.example.MyBus_backand.entity.Movies;
import com.example.MyBus_backand.entity.Teachers;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/11/24 14:40
 * @detail 影片服务类接口
 **/
public interface IMoviesService extends IBaseService{
    /**
     * @detail 描述:通过影片名称进行查询
     * @param Movie_Name
     * @return
     *
     * */
    List<Movies> findMovieBy_MovieName(String Movie_Name);
    /**
     * @detail 描述:通过影片番号进行查询,番号和影片的id不同
     * @param Movie_Noid
     * @return
     *
     * */
    List<Movies> findMovieBy_MovieId(String Movie_Noid);
    /**
     * @detail 描述:通过影片小类别进行查询,同一部影片拥有不确定数量的类型，采用Object ... obj的形式
     * @param Movie_Category
     * @return
     *
     * */
    List<Movies> findMovieBy_MovieCategory(Category ... Movie_Category);
    /**
     * @detail 描述:通过影片发行商进行查询
     * @param Movie_Publisher
     * @return
     *
     * */
    List<Movies> findMovieBy_MoviePublisher(String Movie_Publisher);
    /**
     * @detail 描述:通过影片制作商进行查询
     * @param Movie_Producer
     * @return
     *
     * */
    List<Movies> findMovieBy_MovieProducer(String Movie_Producer);
    /**
     * @detail 描述:通过影片的出演人员进行查找，演员数量位置，采用Object ... obj形式
     * @param Teacher_Name
     * @return
     *
     * */
    List<Teachers> findMovieBy_MovieTeacher(Teachers ... Teacher_Name);
}
