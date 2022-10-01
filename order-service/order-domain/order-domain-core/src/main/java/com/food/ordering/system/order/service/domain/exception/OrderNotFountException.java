package com.food.ordering.system.order.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

public class OrderNotFountException extends DomainException {
    public OrderNotFountException(String message) {
        super(message);
    }

    public OrderNotFountException(String message, Throwable cause) {
        super(message, cause);
    }
}
