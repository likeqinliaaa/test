package org.qin.model;

import lombok.Data;

@Data
public class R<T> {
    private Integer code;    // 响应码：200成功，500失败
    private String message;  // 响应消息
    private T data;          // 响应数据

    public static <T> R<T> success(T data) {
        R<T> r = new R<>();
        r.setCode(200);
        r.setMessage("success");
        r.setData(data);
        return r;
    }

    public static <T> R<T> error(String message) {
        R<T> r = new R<>();
        r.setCode(500);
        r.setMessage(message);
        return r;
    }
}
