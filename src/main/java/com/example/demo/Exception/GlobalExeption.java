package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExeption {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String,Object>> resourceNotFound(ResourceNotFoundException ex){

        Map<String,Object> mp=new HashMap<>();
        String mes=ex.getMessage();
        mp.put("Mesaage",mes);
        mp.put("Status", HttpStatus.OK);
        mp.put("Sucess",true);

        return  new ResponseEntity<Map<String, Object>>(mp,HttpStatus.OK);
    }
}
