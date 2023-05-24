package com.example.demo.validator;

import com.example.demo.common.Errors;
import com.example.demo.models.Registration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class NameValidator {

    public List<Errors> validateName(Registration regi) {

        List<Errors> er=new ArrayList<>();

        if(regi.getName()==null){
            Errors error=new Errors("name","Student name is  not null");
            er.add(error);
        }

        if(regi.getAge()>80)
        {
            Errors error=new Errors("age","age is not grater than 80");
                    er.add(error);
        }

        return er;
    }
}
