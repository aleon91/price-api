package com.customer.priceapi.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="products")
public class ProductEnt implements Serializable {

    @Id
    private Long id;
    @Column(nullable=false,length=50)
    private String name;

}
