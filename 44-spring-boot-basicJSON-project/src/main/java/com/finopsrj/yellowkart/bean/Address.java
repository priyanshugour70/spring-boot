package com.finopsrj.yellowkart.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String cityName;
    private String stateName;
    private String countryName;
}