package com.fivesoft.appframework.base.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasePageDto {

    protected Integer pageSize;
    protected Integer pageNum;
}
