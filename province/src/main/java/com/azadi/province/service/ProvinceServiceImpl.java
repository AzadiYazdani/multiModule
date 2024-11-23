package com.azadi.province.service;

import org.springframework.stereotype.Component;

@Component
public class ProvinceServiceImpl implements ProvinceService {

    @Override
    public Double calculate(double number, double price, double wage) {
        double currentVal = number * price;
        double left = currentVal - (2 * wage);
        return left/number;
    }
}
