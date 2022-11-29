package com.example.MyBus_backand.service;

import com.example.MyBus_backand.entity.Publisher;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/11/29 16:54
 * @detail 发行商服务类接口
 **/
public interface IPublisherService extends IBaseService{
    /**
     * @detail 通过发行商名称查询发行商
     * @param Publisher_Name
     * @return Publisher_Name
     * */
    List<Publisher> findPublisherBy_PublisherName(String Publisher_Name);
    /**
     * @detail 通过爬虫爬下来的信息进行发行商信息的更新，主要用于更新新的发行商信息
     * @param Publisher_New
     * @return Publisher_New
     * */
    void updatePublisher_Detail(Publisher Publisher_New);
}
