package com.fivesoft.appframework.base.buz.service.impl;

import com.fivesoft.appframework.base.buz.mapper.BaseMapper;
import com.fivesoft.appframework.base.buz.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public abstract class BaseServiceImpl<M extends BaseMapper<T>, T> implements BaseService<T> {

    @Autowired
    protected M mapper;

    public abstract int add(T record);

    public abstract int delete(Long id);

    public abstract void edit(T record);

    public abstract Long getUserId(HttpServletRequest request);

    @Override
    public int deleteByPrimaryKey(Long id){
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(T record){
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(T record){
        return mapper.insertSelective(record);
    }

    @Override
    public T selectByPrimaryKey(Long id){
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T record){
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(T record){
        return mapper.updateByPrimaryKey(record);
    }
}
