package com.example.MyBus_backand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Peter Huang
 * @date 2022/11/23 14:38
 * @detail 影片类型
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Category {
    private Integer Category_Uid;            //影片类型码（大类码）
    private Integer Category_UUid;              //影片类型码（小类码）

}
