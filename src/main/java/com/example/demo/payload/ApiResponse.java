package com.example.demo.payload;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ApiResponse {

    private  String message;
    private  String status;
    private boolean success;
    private Date timestamp;


}
