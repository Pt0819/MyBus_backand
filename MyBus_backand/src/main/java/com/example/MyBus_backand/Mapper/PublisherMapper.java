package com.example.MyBus_backand.Mapper;

import com.example.MyBus_backand.entity.Publisher;
import lombok.Data;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/12/5 14:05
 * @detail Publisher类Mapper接口
 **/
@Repository
public interface PublisherMapper {
    /**
     * 根据Publisher_Name查询Publisher列表
     * @param Publisher_Name
     * @return
     * */
    List<Publisher> SelectPublisherBy_PublisherName(@Param("Publisher_Name")String Publisher_Name);
    /**
     * 更新新的Publisher信息
     * @param Publisher_New
     * @return
     * */
    Publisher InsertPublish_New(@Param("Publisher_New")Publisher Publisher_New);
}
