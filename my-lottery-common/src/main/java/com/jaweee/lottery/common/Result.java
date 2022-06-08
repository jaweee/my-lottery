package com.jaweee.lottery.common;

import java.io.Serializable;

/**
 * @author: me
 * @title: Result
 * @description:
 * @date: 2022/6/8 16:08
 */
public class Result implements Serializable {

    public static final long serialVersionUID = -3826891916021780628L;
    private String code;
    private String info;

    public static Result buildResult(String code, String info){
        return new Result(code, info);
    }

    // 利用constant中定义的枚举类来初始化code，解耦了，后面配置code直接在constant中添加或者修改就好了
    public static Result buildSuccessResult(){
        return new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo());
    }

    public static Result buildErrorResult(){
        return new Result(Constants.ResponseCode.UN_ERROR.getCode(), Constants.ResponseCode.UN_ERROR.getInfo());
    }

    public Result() {
    }

    public Result(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
