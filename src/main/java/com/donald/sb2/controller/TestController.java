package com.donald.sb2.controller;

import com.donald.sb2.apiversion.ApiVersion;
import com.donald.sb2.dto.OrderDTO;
import com.donald.sb2.exceptionhandle.UTF8Control;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

@Slf4j
@ApiVersion
@RestController
@RequestMapping("api/{version}/test")
@Validated
public class TestController {
    @GetMapping()
    public List<String> test01(@PathVariable String version) throws UnsupportedEncodingException {
        Locale locale = LocaleContextHolder.getLocale();
        System.out.println(locale);
        System.out.println(this.getClass().getName());
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this.getClass().getPackage());

        ResourceBundle resourceBundle = ResourceBundle.getBundle(this.getClass().getName(),new UTF8Control());
        System.out.println(resourceBundle.getString("t1"));
        String tmp = "test01 : " + resourceBundle.getString("t1");
        System.out.println(tmp);
        List<String> t1 = new ArrayList<>();
        t1.add("我的匡啊");
        t1.add(tmp);
        return t1;
    }
    @GetMapping
    @ApiVersion(2)
    public String test02(@PathVariable String version) {
        return "test02 : " + version;
    }
    @ApiVersion(1)
    @PostMapping(value = "/test03")
    public String test03(@Valid  @RequestBody OrderDTO orderDTO, BindingResult bindingResult){
        System.out.println(orderDTO);
        return "true";
    }
}