package com.example.MyBus_backand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Peter Huang
 * @date 2022/11/24 17:41
 * @detail 影片制作商实体类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Producer {
    private String Producer_Name;           //制作商名称
    private Integer Producer_Id;            //制作商id

}
