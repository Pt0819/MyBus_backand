package com.example.MyBus_backand.service;

import com.example.MyBus_backand.entity.Movies;
import com.example.MyBus_backand.entity.Series;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/12/2 20:02
 * @detail 影片系列服务类接口
 **/
public interface ISeriesService extends IBaseService{
    /**
     * @detail 展示该系列所有的影片
     * @param Series_Name
     * @return
     * */
    List<Series> ShowSeries_Movie(String Series_Name);
    /**
     * @detail 更新某一系列的新影片通过系列名称
     * @param Series_Name,Movie_SeriesNew
     * @return
     * */
    void updateSeries_NewMovie(String Series_Name , Movies Movie_SeriesNew);
    /**
     * @detail 更新全新的新系列
     * @param SeriesAdd_New
     * @return
     * */
    void updateSeries_NewSeries(Series SeriesAdd_New);
}
