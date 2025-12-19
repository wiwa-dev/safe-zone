package com.buy01.product.dto;

import lombok.AllArgsConstructor;
import java.util.concurrent.atomic.AtomicLong;
import lombok.Data;
import lombok.NoArgsConstructor;
//
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDeleteEvent {
    private String productId;
    private String eventType;

}
