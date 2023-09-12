package com.customer.priceapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="prices")
public class PriceEnt implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private Integer priority;
    @Column(nullable=false)
    private Float price;
    @Column(nullable=false)
    private String currency;
    @Column(nullable=false)
    private LocalDateTime startDate;
    @Column(nullable=false)
    private LocalDateTime endDate;
    /*@ManyToOne(optional=false,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="brand_id")
    private BrandEnt brand;
    @ManyToOne(optional=false,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="product_id")
    private ProductEnt product;*/
    private Long brandId;
    private Long productId;


}
