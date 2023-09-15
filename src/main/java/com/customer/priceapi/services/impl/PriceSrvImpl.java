package com.customer.priceapi.services.impl;

import com.customer.priceapi.entities.PriceEnt;
import com.customer.priceapi.exceptions.NotFoundException;
import com.customer.priceapi.repositories.PriceRep;
import com.customer.priceapi.services.PriceSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

@Service
public class PriceSrvImpl implements PriceSrv {

    @Autowired
    private PriceRep priceRep;

    @Override
    public PriceEnt findPrice(Long productId, Long brandId, LocalDateTime date) {
        PriceEnt price = priceRep.findTopByProductIdAndBrandIdAndDateOrderByPriorityDesc(productId,brandId,date);
        return price;
    }
}
