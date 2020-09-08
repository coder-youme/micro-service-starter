package com.guoke.restful.spec;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果基类
 *
 * @author Chao Ma
 * @date 2020-08-12 13:53
 */
@Data
@ApiModel(value = "BasePageResult", description = "分页结果基类")
public class BasePageResult<T extends java.io.Serializable> implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(notes = "总记录数", dataType = "Integer", required = true, example = "103")
    private int totalRecords;

    @ApiModelProperty(notes = "数据集合")
    private List<T> dataList;
}
