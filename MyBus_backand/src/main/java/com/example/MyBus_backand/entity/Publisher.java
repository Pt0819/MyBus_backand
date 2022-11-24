package com.example.MyBus_backand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Peter Huang
 * @date 2022/11/24 17:40
 * @detail 影片发行商实体类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Publisher {
    private String Publisher_Name;              //发行商名称
    private Integer Publisher_Id;               //发行商id

}
