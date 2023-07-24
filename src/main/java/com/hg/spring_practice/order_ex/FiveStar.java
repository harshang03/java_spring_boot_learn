package com.hg.spring_practice.order_ex;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class FiveStar implements OrderExInterface {
    @Override
    public int getRating() {
        return 5;
    }
}
