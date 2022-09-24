package com.chilque.MonedaApp.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChangeDTO {
    @NotEmpty
    @Size(min = 3, max = 3, message = "El tipo de moneda debe ser una sigla de 3 digitos, example: USD")
    private String currency;

    @NotNull
    @Positive(message = "La cantidad debe ser un valor positivo")
    private Double amount;
}
