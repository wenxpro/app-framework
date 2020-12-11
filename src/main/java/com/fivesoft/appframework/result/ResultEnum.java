package com.fivesoft.appframework.result;

import lombok.Getter;

@Getter
public enum ResultEnum {
    //结果
    success(1),fail(0),error(2);

    private Integer code;

    ResultEnum(Integer code) {
        this.code = code;
    }

}
