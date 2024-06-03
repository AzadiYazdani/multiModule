package com.azadi.crypto.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CryptoServiceImplTest {

    @Autowired
    CryptoService cryptoService;

    @Test
    void calculate() {
        System.out.println("result" + cryptoService.calculate(12, 12, 13));
    }
}
