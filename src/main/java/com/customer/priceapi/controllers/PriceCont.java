package com.customer.priceapi.controllers;

import com.customer.priceapi.entities.PriceEnt;
import com.customer.priceapi.services.PriceSrv;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/price")
public class PriceCont {

    @Autowired
    private PriceSrv priceSrv;

    @GetMapping("/find/{productId}/{brandId}/{date}")
    public ResponseEntity<PriceEnt> findPrice(@PathVariable @NotNull Long productId, @PathVariable @NotNull Long brandId, @PathVariable @NotNull LocalDateTime date){
        return ResponseEntity.ok(priceSrv.findPrice(productId,brandId,date));
    }

}
