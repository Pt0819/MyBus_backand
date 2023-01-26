package com.example.MyBus_backand.controller;

import com.example.MyBus_backand.entity.Movies;
import com.example.MyBus_backand.service.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Peter Huang
 * @date 2023/1/7 10:19
 **/
@RestController
@RequestMapping("/Movies")
public class MoviesController {
    @Autowired
    private IMoviesService iMoviesService;

    @PostMapping("/insertMovie")
    public void insertMovie_New(Movies movies){

    }
}
