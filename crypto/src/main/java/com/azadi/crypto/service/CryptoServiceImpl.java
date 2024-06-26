package com.azadi.crypto.service;

import org.springframework.stereotype.Component;

@Component
public class CryptoServiceImpl implements CryptoService {

    @Override
    public Double calculate(double number, double price, double wage) {
        double currentVal = number * price;
        double left = currentVal - (2 * wage);
        return left/number;
    }
}
