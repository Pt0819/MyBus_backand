package com.example.MyBus_backand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Peter Huang
 * @date 2022/11/22 17:40
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class TeachersPicture {
    private Integer Picture_Id;         //图片
    private String Picture_Path;        //图片路径

}
