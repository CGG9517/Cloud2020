package com.jiangchao.springcloud.pojo.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommonResult<T> {

    private String code = "SUC0000";

    private String msg = "成功";

    private T data;

    public CommonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CommonResult(T data) {
        this.data = data;
    }
}
