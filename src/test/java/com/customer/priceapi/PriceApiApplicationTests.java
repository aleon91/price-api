package com.customer.priceapi;

import com.customer.priceapi.services.PriceSrv;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

@SpringBootTest
class PriceApiApplicationTests {

	@Autowired
	private PriceSrv priceSrv;

	@Test
	void contextLoads() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		try {
			assertNotNull(priceSrv.findPrice(35455L, 1L, LocalDateTime.parse("2020-06-14 10:00:00", formatter)));
			System.out.println("Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1 (CADENA1)");
			assertNotNull(priceSrv.findPrice(35455L, 1L, LocalDateTime.parse("2020-06-14 16:00:00", formatter)));
			System.out.println("Test 1: petición a las 16:00 del día 14 del producto 35455 para la brand 1 (CADENA1)");
			assertNotNull(priceSrv.findPrice(35455L, 1L, LocalDateTime.parse("2020-06-14 21:00:00", formatter)));
			System.out.println("Test 1: petición a las 21:00 del día 14 del producto 35455 para la brand 1 (CADENA1)");
			assertNotNull(priceSrv.findPrice(35455L, 1L, LocalDateTime.parse("2020-06-15 10:00:00", formatter)));
			System.out.println("Test 1: petición a las 10:00 del día 15 del producto 35455 para la brand 1 (CADENA1)");
			assertNotNull(priceSrv.findPrice(35455L, 1L, LocalDateTime.parse("2020-06-16 21:00:00", formatter)));
			System.out.println("Test 1: petición a las 21:00 del día 16 del producto 35455 para la brand 1 (CADENA1)");
		}catch(Exception e){
			throw e;
		}
	}

}
