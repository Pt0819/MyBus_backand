package com.example.MyBus_backand.Mapper;

import com.example.MyBus_backand.entity.Series;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/12/5 14:17
 * @detail 系列类Series的Mapper接口
 **/
@Repository
public interface SeriesMapper {
    /**
     * 根据Series_Name查询Series列表
     * @param Series_Name
     * @return
     * */
    List<Series> SelectSeriesBy_SeriesName(@Param("Series_Name")String Series_Name);
    /**
     * 更新新系列
     * @param Series_New
     * @return
     * */
    Series InsertSeries_New(@Param("Series_New")Series Series_New);
}
