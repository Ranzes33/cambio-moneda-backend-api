package com.chilque.MonedaApp.models.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Exchange {
    private Double compra;
    private Double venta;
    private String origen;
    private String moneda;
    private String fecha;
    public static final String penToUSD = "PENTOUSD";
    public static final String USDToPen = "USDTOPEN";
}
