package com.example.demo.common;

public class Errors {
    private String ntarget;
    private String message;
    public String getNtarget() {
        return ntarget;
    }

    public void setNtarget(String ntarget) {
        this.ntarget = ntarget;
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Errors(String ntarget, String message) {
        this.ntarget = ntarget;
        this.message = message;
    }

}
