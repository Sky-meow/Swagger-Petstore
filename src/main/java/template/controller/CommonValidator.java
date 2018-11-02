package template.controller;

import template.entitys.Order;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;

public class CommonValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {

        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        if (o == null) {
            errors.reject(null, "这个对s为空的呢？");
        }

        Order order = (Order) o;
        if (order.getEmail() == null || !Pattern.matches("^[a-zA-Z0-9]", order.getEmail())) {

        }

    }
}
