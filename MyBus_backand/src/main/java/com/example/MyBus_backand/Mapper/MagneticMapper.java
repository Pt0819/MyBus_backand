package com.example.MyBus_backand.Mapper;

import com.example.MyBus_backand.entity.Magnetic;
import com.example.MyBus_backand.service.IBaseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/12/5 15:35
 * 磁力链接Mapper接口,每个磁力链接仅在电影下出现，无法直接搜素哦磁力链接
 **/
@Repository
public interface MagneticMapper extends IBaseService {
    /**
     * 每部电影下方的磁力链接显示,根据电影名称和番号检索
     * @param Movie_Name
     * @param Movie_Noid
     * @return
     */
    List<Magnetic> SelectMagnetic(@Param("Movie_Name")String Movie_Name , @Param("Movie_Noid")String Movie_Noid);
}
