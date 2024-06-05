package com.azadi.crypto.api;

import com.azadi.common.dto.ResponseDto;
import com.azadi.crypto.service.CryptoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@RestController
@RequestMapping("/crypto")
@Api(value = "token operations")
@Slf4j
public class CryptoController {


    private final CryptoService cryptoService;

    public CryptoController(CryptoService cryptoService) {
        this.cryptoService = cryptoService;
    }

    @GetMapping(value = "/calculate")
    @ApiOperation(value = "قیمت لازم خرید", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDto<Double>> getAllBusinessTypes(@RequestParam("amount") @Valid @NotNull double amount, @RequestParam("price") @Valid @NotNull double price, @RequestParam("wage") @Valid @NotNull double wage) {
        Double result = cryptoService.calculate(amount, price, wage);
//               log.debug("the BusinessTypeDto for sending is {}", lstDtoResponse);
        return new ResponseEntity<ResponseDto<Double>>(ResponseDto.success(result), HttpStatus.OK);
    }
}
