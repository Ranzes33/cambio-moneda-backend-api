package com.chilque.MonedaApp.models.service;

import com.chilque.MonedaApp.models.dto.ChangeDTO;
import org.springframework.http.ResponseEntity;

public interface IChangeService {
    ResponseEntity<?> changeCurrency(ChangeDTO oldCurrency);
}
