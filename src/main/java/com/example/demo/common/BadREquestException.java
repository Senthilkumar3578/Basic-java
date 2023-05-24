package com.example.demo.common;

import java.util.List;

public class BadREquestException extends  RuntimeException{

    private List<Errors> error;

    public List<Errors> getError() {
        return error;
    }

    public void setError(List<Errors> error) {
        this.error = error;
    }

    public BadREquestException(String message,List<Errors> error) {
        super(message);
        this.error = error;
    }
}
