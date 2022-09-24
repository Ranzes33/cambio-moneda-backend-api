package com.chilque.MonedaApp.models.service.impl;

import com.chilque.MonedaApp.models.entity.Exchange;
import com.chilque.MonedaApp.models.service.ICurrencyExchange;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyExchangeImpl implements ICurrencyExchange {
    @Override
    public Double getCurrencyExchange(String type) throws NoSuchFieldException {
        String urlBase = "https://api.apis.net.pe/v1/tipo-cambio-sunat";
        RestTemplate restTemplate = new RestTemplate();
        Object object = restTemplate.getForObject(urlBase, Object.class);

        ObjectMapper mapper = new ObjectMapper();
        Exchange exchange = mapper.convertValue(object, Exchange.class);
        if (type.equalsIgnoreCase(Exchange.penToUSD)) return exchange.getVenta();
        else return exchange.getCompra();
    }
}
