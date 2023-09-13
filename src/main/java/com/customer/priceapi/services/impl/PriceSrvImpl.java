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
        List<PriceEnt> prices = priceRep.findByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(productId,brandId,date,date);
        if(prices.size()==1){
            return prices.get(0);
        }
        return prices.stream().max(Comparator.comparing(PriceEnt::getPriority)).orElseThrow(() -> new NotFoundException("Producto no encontrado"));
    }
}
