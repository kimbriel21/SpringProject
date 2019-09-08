package com.ciachurch.project.controllers;

import com.ciachurch.project.pojo.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {

    @Autowired
    ResponseData responseData;

    @GetMapping(path = "/member")
    public ResponseEntity<ResponseData> index(){
        responseData.setMessage("Member data");
        responseData.setSuccess(true);

        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @PostMapping(path = "/member/{id}")
    public ResponseEntity<ResponseData> insert(@PathVariable("id") long id){
        responseData.setMessage("");
        responseData.setSuccess(true);

        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @PutMapping(path = "/member/{id}")
    public ResponseEntity<ResponseData> update(@PathVariable("id") long id){
        responseData.setMessage("");
        responseData.setSuccess(true);

        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @DeleteMapping(path = "/member/id")
    public ResponseEntity<ResponseData> delete(@PathVariable("id") long id){

        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @GetMapping(path = "/healthcheck")
    public ResponseEntity<ResponseData> healthCheck(){
        responseData.setMessage("this is healthCheck");
        responseData.setSuccess(true);

        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
