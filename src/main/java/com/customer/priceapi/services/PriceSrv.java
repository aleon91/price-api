package com.customer.priceapi.services;

import com.customer.priceapi.entities.PriceEnt;

import java.time.LocalDateTime;

public interface PriceSrv {

    PriceEnt findPrice(Long productId, Long brandId, LocalDateTime date);

}
