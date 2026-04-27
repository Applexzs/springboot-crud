package com.applexzs.springboot.app.validation;

import com.applexzs.springboot.app.services.IProductService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class IsExistsDbValidation implements ConstraintValidator<IsExistsDb, String> {

    @Autowired
    private IProductService service;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(service == null){
            return true;
        }
        return !service.existsBySku(value);
    }
}
