package com.donald.sb2.dto;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

public class CountryListDTO {
    @Valid
    private List<CountryBo> countries;
    CountryListDTO(){
        countries = new ArrayList<>();
    }

    public List<CountryBo> getCountries() {
        return countries;
    }

    public void setCountries(List<CountryBo> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "CountryListDTO{" +
                "countries=" + countries +
                '}';
    }

}
