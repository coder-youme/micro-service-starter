package com.guoke.restful.spec;

/**
 * 自定义的响应消息工厂
 *
 * @author Chao Ma
 * @date 2020-08-13 16:52
 */
public final class ResponseFactory {
    ResponseFactory() {}

    /** 成功的响应码 */
    public static final String SUCCESS_CODE = "0000";
    /** 失败的响应码 */
    public static final String FAILURE_CODE = "9999";

    public static <T> BaseResponse<T> success(T result) {
        BaseResponse<T> response = new BaseResponse<>();
        response.setErrorCode(SUCCESS_CODE);
        response.setMessage("操作成功。");
        response.setResult(result);
        return response;
    }

    public static <T> BaseResponse<T> success(T result, String message) {
        BaseResponse<T> response = new BaseResponse<>();
        response.setErrorCode(SUCCESS_CODE);
        response.setMessage(message);
        response.setResult(result);
        return response;
    }

    public static <T> BaseResponse<T> failure(String message) {
        BaseResponse<T> response = new BaseResponse<>();
        response.setErrorCode(FAILURE_CODE);
        response.setMessage(message);
        return response;
    }
}
