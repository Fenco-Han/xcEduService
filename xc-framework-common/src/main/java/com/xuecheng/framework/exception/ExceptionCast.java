package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
 * @Auther: 韩朋飞
 * @Date: 2021/02/15/17:40
 * @Description: 抛出自定义异常的静态方法
 */
public class ExceptionCast {
    /**
     * 使用此静态方法抛出自定义异常
     * @param resultCode
     */
    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }
}
