package com.lencho.restfull.comm;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Lencho
 * @create 2021-07-31 10:17
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 6308315887056661996L;
    private Integer code;
    private String message;
    private T data;

    public Result setResult(ResultCode resultCode){
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        return this;
    }

    public Result setResult(ResultCode resultCode,T data){
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.setData(data);
        return this;
    }
}
