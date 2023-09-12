package com.customer.priceapi.repositories;

import com.customer.priceapi.entities.PriceEnt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceRep extends JpaRepository<PriceEnt,Long> {

    List<PriceEnt> findByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(Long productId, Long brandId, LocalDateTime startDate, LocalDateTime endDate);

}
