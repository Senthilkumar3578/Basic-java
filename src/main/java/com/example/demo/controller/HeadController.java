package com.example.demo.controller;

import com.example.demo.models.Registration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
@RestController
public class HeadController {

    @PostMapping("/header")
    public ResponseEntity<Registration> save(@RequestBody Registration regi, HttpServletRequest request) {
        String country;
        country = request.getHeader("Country");
        String ip=request.getHeader("IP");
        ResponseEntity<Registration> res=new ResponseEntity<>(regi, HttpStatus.CREATED);
        return res;
    }

}