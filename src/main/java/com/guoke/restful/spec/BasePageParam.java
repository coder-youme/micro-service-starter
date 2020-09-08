package com.guoke.restful.spec;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import java.io.Serializable;

/**
 * 分页查询参数基类
 *
 * @author Chao Ma
 * @date 2020-08-12 13:49
 */
@Data
@ApiModel(value = "BasePageParam", description = "分页查询参数基类")
public class BasePageParam implements Serializable {
    private static final long serialVersionUID = 1L;

    @Range(min = 1, max = 500)
    @ApiModelProperty(notes = "每页数据笔数", allowableValues = "1~500", dataType = "Integer",
            required = true, example = "20")
    private int pageSize = 10;

    @Range(min = 1, max = 99999)
    @ApiModelProperty(notes = "第几页", allowableValues = "1~99999", dataType = "Integer",
            required = true, example = "1")
    private int pageNum = 1;
}
