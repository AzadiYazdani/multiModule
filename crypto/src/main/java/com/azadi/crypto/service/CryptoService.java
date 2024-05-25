package com.azadi.crypto.service;

import org.springframework.stereotype.Service;

@Service
public interface CryptoService {
    Double calculate(double amount, double price, double wage);
}
