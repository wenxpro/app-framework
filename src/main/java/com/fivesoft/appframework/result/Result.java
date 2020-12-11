package com.fivesoft.appframework.result;

import lombok.Data;

@Data
public class Result {

    private Integer code;

    private String msg;
    private Object data;

    public Result() {
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result error(){
        return this.render(ResultEnum.error.getCode(),"error");
    }

    public Result error(String msg){
        return this.render(ResultEnum.error.getCode(),msg);
    }

    public Result fail(String msg){
        return this.render(ResultEnum.fail.getCode(),msg);
    }

    public Result fail(){
        return this.render(ResultEnum.fail.getCode(),"fail");
    }

    public Result fail(Object data){
        return this.render(ResultEnum.fail.getCode(),"fail",data);
    }

    public Result success(){
        return this.render(ResultEnum.success.getCode(),"success");
    }
    public Result success(Object data){
        return this.render(ResultEnum.success.getCode(),"success",data);
    }
    public Result success(String msg){
       return this.render(ResultEnum.success.getCode(),msg);
    }

    public Result render(Integer code, String msg){
        this.code = code;
        this.msg = msg;
        return this;
    }

    public Result render(Integer ret, String msg, Object data){
        this.code = ret;
        this.msg = msg;
        this.data = data;
        return this;
    }
}
