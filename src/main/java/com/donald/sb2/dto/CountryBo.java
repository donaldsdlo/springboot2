package com.donald.sb2.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
@Setter
@Getter
public class CountryBo {

    @NotNull(message = "{region.error.null}")
    @Digits(integer = 9,fraction = 0)
    private int region;
    @NotNull(message = "{countryCode.error.null}")
    @Length(max = 10,message = "{countryCode.error.length}")
    private String countryCode;
}
