package com.example.MyBus_backand.service;

import com.example.MyBus_backand.entity.Producer;
import com.example.MyBus_backand.entity.Publisher;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/11/29 17:31
 * @detail 影片制作商服务类接口
 **/
public interface IProducerService extends IBaseService{
    /**
     * @detail 通过制作商名称查询制作商
     * @param Producer_Name
     * @return Producer_Name
     * */
    List<Producer> findProducerBy_ProducerName(String Producer_Name);
    /**
     * @detail 通过爬虫爬下来的信息进行制作商信息的更新，主要用于更新新的制作商信息
     * @param Producer_New
     * @return Producer_New
     * */
    void updatePublisher_Detail(Producer Producer_New);
}
