package com.example.MyBus_backand.service;

import com.example.MyBus_backand.entity.Category;
import com.example.MyBus_backand.entity.Movies;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/12/1 13:39
 * @detail 影片类别服务类接口
 **/
public interface ICategoryService extends IBaseService{
    /**
     * @detail 通过搜素该类别找到该类别包含的所有影片
     * @param Category_Name
     * @return
     * */
    List<Category> findCategoryBy_CategoryName(String Category_Name);
    /**
     * @detail 更新该类别的新电影
     * @param  Category_UUid,Category_NewMovie
     * @return
     * */
    void updateCategory_NewMovie(Integer Category_UUid, Movies Category_NewMovie);
}
