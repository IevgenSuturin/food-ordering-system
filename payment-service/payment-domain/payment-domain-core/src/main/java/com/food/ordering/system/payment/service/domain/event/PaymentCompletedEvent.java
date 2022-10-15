package com.food.ordering.system.payment.service.domain.event;

import com.food.ordering.system.payment.service.domain.entity.Payment;

import java.time.ZonedDateTime;

import static java.util.Collections.emptyList;

public class PaymentCompletedEvent extends PaymentEvent{
    public PaymentCompletedEvent(Payment payment, ZonedDateTime createdAt) {
        super(payment, createdAt, emptyList());
    }
}
