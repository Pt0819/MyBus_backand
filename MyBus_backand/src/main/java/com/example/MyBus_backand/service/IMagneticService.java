package com.example.MyBus_backand.service;

import com.example.MyBus_backand.entity.Magnetic;

/**
 * @author Peter Huang
 * @date 2022/11/29 18:06
 * @detail 磁力链接服务类接口
 **/
public interface IMagneticService extends IBaseService{
    /**
     * @detail 通过爬虫爬下来的信息进行影片磁力链接的更新
     * @param Magnetic_New
     * @return Magnetic_New
     * */
    void updateMagnetic_Detail(Magnetic Magnetic_New);
}
