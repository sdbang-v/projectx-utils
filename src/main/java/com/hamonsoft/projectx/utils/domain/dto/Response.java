package com.hamonsoft.projectx.utils.domain.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@Builder
public class Response<T> {
    private boolean error;
    private String message;
    private T response;

    public static <T> Response<T> setSuccess(String message, T data) {
        return Response.of(false, message, data);
    }

    public static <T> Response<T> setFail(String message) {
        return Response.of(true, message, null);
    }
}
