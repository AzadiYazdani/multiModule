package com.azadi.crypto.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(classes = CryptoController.class)
@AutoConfigureMockMvc
public class CryptoControllerTest {

    @Autowired
    MockMvc mockMvc;


    @Test
    public void getAllBusinessTypes() {
//        MvcResult requestResult =
//                mockMvc.perform(get("/crypto/calculate?amount=120&price=4&wage=5")
//
//                                        .contentType(MediaType.APPLICATION_JSON)
//                                        .accept(MediaType.APPLICATION_JSON)
//                        )
//                        .andExpect(status().isOk())
//                        .andReturn();
//
//        String result = requestResult.getResponse().getContentAsString();
//        System.out.println(result);
//        assertEquals(requestResult.getResponse().getStatus(), 200);
    }
}
