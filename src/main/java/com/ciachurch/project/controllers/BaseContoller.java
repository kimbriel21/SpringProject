package com.ciachurch.project.controllers;

import com.ciachurch.project.pojo.ResponseData;
import org.springframework.http.HttpStatus;

import java.util.Map;

public abstract class BaseContoller {
    public ResponseData response(String message, Boolean success, Map<String,Object> data){
        ResponseData responseData = new ResponseData(message,success,data);
        return responseData;
    }
}
