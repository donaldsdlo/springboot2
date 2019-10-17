package com.donald.sb2.configuration;

import com.donald.sb2.exceptionhandle.JsonResult;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class ValidatorHandlerAdvice extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleBindException(
            BindException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String message = "";
        JsonResult jsonResult = new JsonResult();
        for(ObjectError error:ex.getBindingResult().getAllErrors()){
            jsonResult.setCode(11);
            jsonResult.setMsg(error.getDefaultMessage());
        }
        return new ResponseEntity<Object>(jsonResult, status);
    }
}
