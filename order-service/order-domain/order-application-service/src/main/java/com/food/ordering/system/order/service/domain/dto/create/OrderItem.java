package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class OrderItem {
    @NonNull
    private final UUID productId;
    @NotNull
    private final Integer quantity;
    @NonNull
    private final BigDecimal price;
    @NotNull
    private final BigDecimal subTotal;
}
