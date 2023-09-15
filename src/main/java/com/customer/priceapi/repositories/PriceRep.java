package com.customer.priceapi.repositories;

import com.customer.priceapi.entities.PriceEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceRep extends JpaRepository<PriceEnt,Long> {

    @Query("SELECT p FROM PriceEnt p WHERE p.productId = :productId AND p.brandId = :brandId AND p.startDate <= :date AND p.endDate >= :date ORDER BY p.priority DESC LIMIT 1")
    PriceEnt findTopByProductIdAndBrandIdAndDateOrderByPriorityDesc(@Param("productId") Long productId,@Param("brandId") Long brandId,@Param("date") LocalDateTime date);

}
