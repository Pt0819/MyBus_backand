package com.example.MyBus_backand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Peter Huang
 * @date 2022/11/23 17:53
 * @detail 影片的图片类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class MoviesPicture {
    private Integer MoviesPicture_Id;           //影片的图片id
    private String MoviesPicture_Path;          //影片的图片路径
    private String MoviePicture_Noid;                  //所属电影的番号
}
