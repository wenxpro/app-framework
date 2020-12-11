package com.fivesoft.appframework.base.buz.controller;

import com.fivesoft.appframework.base.buz.service.BaseService;
import com.fivesoft.appframework.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

public abstract class BaseController <S extends BaseService,B>{

    @Autowired
    S service;

    protected abstract Result add(@RequestBody B body, HttpServletRequest request) ;

    protected abstract Result delete(@PathVariable Long id);

    protected abstract Result edit(@RequestBody B body) ;

    protected abstract Result list(B body);

    protected abstract Result get(@PathVariable Long id);

}
