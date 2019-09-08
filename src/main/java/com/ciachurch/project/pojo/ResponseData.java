package com.ciachurch.project.pojo;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ResponseData {
    private String message;
    private Boolean success;
    private Map<String, Object> data;

    public ResponseData(){}

    public ResponseData(String message, Boolean success, Map<String, Object> data) {
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
