package com.example.MyBus_backand.service;

import com.example.MyBus_backand.entity.Movies;

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
     * @detail 描述:通过影片名称进行查询
     * @param Movie_Id
     * @return
     *
     * */
    List<Movies> findMovieBy_MovieId(String Movie_Id);
}
