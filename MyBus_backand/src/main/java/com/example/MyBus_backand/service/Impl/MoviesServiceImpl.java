package com.example.MyBus_backand.service.Impl;

import com.example.MyBus_backand.entity.Category;
import com.example.MyBus_backand.entity.Movies;
import com.example.MyBus_backand.entity.Teachers;
import com.example.MyBus_backand.service.IMoviesService;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/12/12 16:19
 * MoviesService实现类,实现接口层中的方法
 **/
public class MoviesServiceImpl implements IMoviesService {
    @Override
    public List<Movies> findMovieBy_MovieName(String Movie_Name) {
        return null;
    }

    @Override
    public List<Movies> findMovieBy_MovieId(String Movie_Noid) {
        return null;
    }

    @Override
    public List<Movies> findMovieBy_MovieCategory(Category... Movie_Category) {
        return null;
    }

    @Override
    public List<Movies> findMovieBy_MoviePublisher(String Movie_Publisher) {
        return null;
    }

    @Override
    public List<Movies> findMovieBy_MovieProducer(String Movie_Producer) {
        return null;
    }

    @Override
    public List<Teachers> findMovieBy_MovieTeacher(Teachers... Teacher_Name) {
        return null;
    }

    @Override
    public void updateMovie_Detail(Movies Movie_New) {

    }
}
