package com.chilque.MonedaApp.controllers;


import com.chilque.MonedaApp.models.dto.ChangeDTO;
import com.chilque.MonedaApp.models.service.IChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/currency")
@CrossOrigin("*")
public class ChangeController {

    @Autowired
    private IChangeService serviceChange;

    @PostMapping("/dolares")
    public ResponseEntity<?> cambiarADolares(@Valid @RequestBody ChangeDTO oldCurrency) throws NoSuchFieldException {
        return serviceChange.changeToUSD(oldCurrency);
    }

    @PostMapping("/soles")
    public ResponseEntity<?> cambiarASoles(@Valid @RequestBody ChangeDTO oldCurrency) throws NoSuchFieldException {
        return serviceChange.changeToPEN(oldCurrency);
    }
}
