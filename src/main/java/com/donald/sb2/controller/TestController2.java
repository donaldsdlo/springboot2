package com.donald.sb2.controller;

import com.donald.sb2.apiversion.ApiVersion;
import com.donald.sb2.dto.CountryBo;
import com.donald.sb2.dto.CountryListDTO;
import com.donald.sb2.exceptionhandle.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@ApiVersion
@RestController
@RequestMapping("api/{version}/test1")
@Validated
public class TestController2 {

    @GetMapping("/testsql")
    public JsonResult test(@Valid CountryBo contry){
        JsonResult jsonResult = new JsonResult();
        try{
            //jsonResult.setData(testService.test(contry));

            return jsonResult;
        }catch (Exception e){
            log.error("excute failed :{}",e.getMessage());
            jsonResult.setCode(10);
            jsonResult.setMsg("处理失败");
            return jsonResult;
        }
    }

    @PostMapping("/testsq2")
    public JsonResult test2(@RequestBody CountryListDTO contries){
        System.out.println("/testsq2");

        JsonResult jsonResult = new JsonResult();
//        if(errors.hasErrors()){
//
//        }
        try{
            //jsonResult.setData(testService.test(contry));

            return jsonResult;
        }catch (Exception e){
            log.error("excute failed :{}",e.getMessage());
            jsonResult.setCode(10);
            jsonResult.setMsg("处理失败");
            return jsonResult;
        }
    }
}
