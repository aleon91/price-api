package com.customer.priceapi.controllers;

import com.customer.priceapi.entities.PriceEnt;
import com.customer.priceapi.services.PriceSrv;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

@SpringBootTest
public class PriceContTest {

    @InjectMocks
    private PriceCont priceCont;
    @Mock
    private PriceSrv priceSrv;
    private Long brandId = 1L;
    private Long productId = 35455L;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findPriceByProductIdAndBrandIdAndDate1(){
        LocalDateTime date = LocalDateTime.parse("2020-06-14T10:00:00");
        PriceEnt value = PriceEnt.builder()
            .id(1L)
            .priority(0)
            .price(35.5F)
            .currency("EUR")
            .startDate(LocalDateTime.parse("2020-06-14T00:00:00"))
            .endDate(LocalDateTime.parse("2020-12-31T23:59:59"))
            .brandId(1L)
            .productId(35455L)
            .build();
        Mockito.when(priceSrv.findPrice(productId,brandId,date))
                .thenReturn(value);
        ResponseEntity<PriceEnt> price = priceCont.findPrice(productId,brandId,date);
        Assert.assertEquals(ResponseEntity.ok(value),price);
    }

    @Test
    public void findPriceByProductIdAndBrandIdAndDate2(){
        LocalDateTime date = LocalDateTime.parse("2020-06-14T16:00:00");
        PriceEnt value = PriceEnt.builder()
            .id(2L)
            .priority(1)
            .price(25.45F)
            .currency("EUR")
            .startDate(LocalDateTime.parse("2020-06-14T15:00:00"))
            .endDate(LocalDateTime.parse("2020-06-14T18:30:00"))
            .brandId(1L)
            .productId(35455L)
            .build();
        Mockito.when(priceSrv.findPrice(productId,brandId,date))
                .thenReturn(value);
        ResponseEntity<PriceEnt> price = priceCont.findPrice(productId,brandId,date);
        Assert.assertEquals(ResponseEntity.ok(value),price);
    }

    @Test
    public void findPriceByProductIdAndBrandIdAndDate3(){
        LocalDateTime date = LocalDateTime.parse("2020-06-14T21:00:00");
        PriceEnt value = PriceEnt.builder()
            .id(1L)
            .priority(0)
            .price(35.5F)
            .currency("EUR")
            .startDate(LocalDateTime.parse("2020-06-14T00:00:00"))
            .endDate(LocalDateTime.parse("2020-12-31T23:59:59"))
            .brandId(1L)
            .productId(35455L)
            .build();
        Mockito.when(priceSrv.findPrice(productId,brandId,date))
                .thenReturn(value);
        ResponseEntity<PriceEnt> price = priceCont.findPrice(productId,brandId,date);
        Assert.assertEquals(ResponseEntity.ok(value),price);
    }

    @Test
    public void findPriceByProductIdAndBrandIdAndDate4(){
        LocalDateTime date = LocalDateTime.parse("2020-06-15T10:00:00");
        PriceEnt value = PriceEnt.builder()
            .id(3L)
            .priority(1)
            .price(30.5F)
            .currency("EUR")
            .startDate(LocalDateTime.parse("2020-06-15T00:00:00"))
            .endDate(LocalDateTime.parse("2020-06-15T11:00:00"))
            .brandId(1L)
            .productId(35455L)
            .build();
        Mockito.when(priceSrv.findPrice(productId,brandId,date))
                .thenReturn(value);
        ResponseEntity<PriceEnt> price = priceCont.findPrice(productId,brandId,date);
        Assert.assertEquals(ResponseEntity.ok(value),price);
    }

    @Test
    public void findPriceByProductIdAndBrandIdAndDate5(){
        LocalDateTime date = LocalDateTime.parse("2020-06-16T21:00:00");
        PriceEnt value = PriceEnt.builder()
            .id(4L)
            .priority(1)
            .price(38.95F)
            .currency("EUR")
            .startDate(LocalDateTime.parse("2020-06-15T16:00:00"))
            .endDate(LocalDateTime.parse("2020-12-31T23:59:59"))
            .brandId(1L)
            .productId(35455L)
            .build();
        Mockito.when(priceSrv.findPrice(productId,brandId,date))
                .thenReturn(value);
        ResponseEntity<PriceEnt> price = priceCont.findPrice(productId,brandId,date);
        Assert.assertEquals(ResponseEntity.ok(value),price);
    }

}
