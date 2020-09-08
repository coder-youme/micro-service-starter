package com.guoke.restful.spec;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * RESTFUL API 请求基类
 *
 * @author Chao Ma
 * @date 2020-08-12 11:05
 */
@Data
@ApiModel(description = "RESTFUL API 请求基类")
public class BaseRequest<T extends java.io.Serializable> implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotEmpty
    @ApiModelProperty(notes = "接口调用凭证", dataType = "String", required = true)
    private String accessToken;

    @NotNull
    @Valid
    @ApiModelProperty(notes = "其它请求参数", required = true)
    private T reqParam;
}
