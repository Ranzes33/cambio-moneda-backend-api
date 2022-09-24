package com.chilque.MonedaApp.models.service.impl;

import com.chilque.MonedaApp.models.dto.ChangeDTO;
import com.chilque.MonedaApp.models.entity.Exchange;
import com.chilque.MonedaApp.models.service.IChangeService;
import com.chilque.MonedaApp.models.service.ICurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ChangeServiceImpl implements IChangeService {

    @Autowired
    private ICurrencyExchange serviceCurrency;

    @Override
    public ResponseEntity<?> changeCurrency(ChangeDTO oldCurrency) throws NoSuchFieldException {
        Double currency = 0.0;
        try {
            Double exchange = serviceCurrency.getCurrencyExchange(Exchange.USDToPen);
            if (oldCurrency.getCurrency().equalsIgnoreCase("PEN")){
                currency = oldCurrency.getAmount() * exchange;
            }
            else if (oldCurrency.getCurrency().equalsIgnoreCase("USD")){
                currency = oldCurrency.getAmount() / exchange;
            }
            else return new ResponseEntity<>("Incorrect currency", HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(currency, HttpStatus.OK);
    }
}
