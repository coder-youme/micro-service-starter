package com.guoke.restful.spec;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * RESTFUL API 响应基类
 *
 * @author Chao Ma
 * @date 2020-08-12 11:31
 */
@Data
@ApiModel(description = "RESTFUL API 响应基类")
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(notes = "响应代码", dataType = "String", required = true, example = "0000")
    private String errorCode;

    @ApiModelProperty(notes = "响应消息", dataType = "String", required = true, example = "处理成功！")
    private String message;

    @ApiModelProperty(notes = "响应结果")
    private T result;
}
