package com.example.MyBus_backand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/12/2 19:19
 * @detail 影片系列的实体类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Series {
    private String Series_Name;         //系列的名称
    private Integer Series_Id;          //系列的Id
    private List<Movies> Series_Movies;             //该系列的所有影片
}
