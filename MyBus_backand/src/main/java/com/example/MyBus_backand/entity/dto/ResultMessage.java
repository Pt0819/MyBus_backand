package com.example.MyBus_backand.entity.dto;

import com.example.MyBus_backand.Enum.ResultCode;

import java.io.Serializable;
import java.util.List;

/**
 * @author Peter Huang
 * @date 2023/1/26 14:14
 **/
public class ResultMessage implements Serializable {
    private List<Object> Result;
    private ResultCode resultCode;
}
