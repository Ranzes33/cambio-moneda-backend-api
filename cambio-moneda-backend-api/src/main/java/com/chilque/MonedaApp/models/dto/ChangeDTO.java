package com.chilque.MonedaApp.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.PositiveOrZero;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChangeDTO {
    private String currency;
    @PositiveOrZero
    private Double amount;
}
