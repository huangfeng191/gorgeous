package com.fengfeng.quartz.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {

    Integer code;

    String message;

    T result;

    public Response (String message,T result){
        this.code = 200;
        this.message = message;
        this.result = result;
    }

}