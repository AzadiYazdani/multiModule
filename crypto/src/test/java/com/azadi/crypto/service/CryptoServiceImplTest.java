package com.azadi.crypto.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
class CryptoServiceImplTest {

    @Autowired
    CryptoService cryptoService;

    @Test
    void calculate() {
        System.out.println("result" + cryptoService.calculate(12, 12, 13));
    }
}