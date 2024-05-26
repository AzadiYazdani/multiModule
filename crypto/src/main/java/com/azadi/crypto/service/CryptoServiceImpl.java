package com.azadi.crypto.service;


public class CryptoServiceImpl implements CryptoService {

    @Override
    public Double calculate(double amount, double price, double wage) {
        double currentVal = amount * price;
        double left = currentVal - (2 * wage);
        return left/amount;
    }
}
