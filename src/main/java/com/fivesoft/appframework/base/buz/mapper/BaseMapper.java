package com.fivesoft.appframework.base.buz.mapper;

/**
 * base mapper 抽象方法 base service 的注入层
 * @param <T>
 */
public interface BaseMapper<T> {

    int deleteByPrimaryKey(Long id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
