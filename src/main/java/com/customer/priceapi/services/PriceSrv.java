package com.customer.priceapi.services;

import com.customer.priceapi.entities.PriceEnt;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;
import java.util.Date;

public interface PriceSrv {

    PriceEnt findPrice(Long productId, Long brandId, LocalDateTime date);

}
