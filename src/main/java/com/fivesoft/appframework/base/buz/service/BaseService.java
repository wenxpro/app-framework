package com.fivesoft.appframework.base.buz.service;

import javax.servlet.http.HttpServletRequest;


public interface BaseService<T> {

    int deleteByPrimaryKey(Long id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
