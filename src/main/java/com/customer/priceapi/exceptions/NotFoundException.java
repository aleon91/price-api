package com.customer.priceapi.exceptions;

public class NotFoundException  extends RuntimeException {

    private static final long serialVersionUID = -5095573633236355025L;

    public NotFoundException(String message) {
        super(message);
    }

}