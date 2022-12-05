package com.example.MyBus_backand.Mapper;

import com.example.MyBus_backand.entity.Producer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/12/5 14:04
 * @detail Producer类Mapper接口
 **/
@Repository
public interface ProducerMapper {
    /**
     * 根据Producer_Name查询Producer列表
     * @param Producer_Name
     * @return
     * */
    List<Producer> SelectProducerBy_ProducerName(@Param("Producer_Name")String Producer_Name);
    /**
     * 更新新的Producer的信息
     * @param Producer_New
     * @return
     * */
    Producer InsertProducer_New(@Param("Producer_New")Producer Producer_New);
}
