package com.guoke.restful.spec;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import io.swagger.annotations.ApiModel;

/**
 * Rest Controller基类
 *
 * @author Chao Ma
 * @date 2020-08-12 14:01
 */
@ApiModel(description = "Rest Controller基类")
public class BaseRestController {

    /** 统一的日志格式 */
    protected static final String LOG_FORMAT = "==> invoke {} by {} response is {}.";

    /**
     * 统一处理参数校验失败的响应结果
     *
     * @param validResult 参数校验结果
     * @return 参数校验失败统一处理
     */
    @SuppressWarnings("rawtypes")
    protected ResponseEntity validateFailed(BindingResult validResult) {
        StringBuilder message = new StringBuilder("{");
        List<FieldError> errorList = validResult.getFieldErrors();
        for (FieldError error : errorList) {
            message.append("'").append(error.getField()).append("':'")
                    .append(error.getDefaultMessage()).append("',");
        }
        message.deleteCharAt(message.length() - 1).append("}");
        BaseResponse response = ResponseFactory.failure(message.toString());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
