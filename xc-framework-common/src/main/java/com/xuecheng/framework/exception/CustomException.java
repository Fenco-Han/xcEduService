package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
 * @Auther: 韩朋飞
 * @Date: 2021/02/15/17:33
 * @Description: 自定义异常类
 */
public class CustomException extends RuntimeException{

    /**
     * 错误代码
     */
    ResultCode resultCode;

    public CustomException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
