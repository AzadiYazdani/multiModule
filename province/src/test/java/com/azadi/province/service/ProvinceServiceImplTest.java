package com.azadi.province.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProvinceServiceImplTest {

    @Autowired
    ProvinceService provinceService;

    @Test
    void calculate() {
        System.out.println("result" + provinceService.calculate(12, 12, 13));
    }
}
