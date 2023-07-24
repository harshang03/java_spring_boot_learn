package com.hg.spring_practice.order_ex;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class OneStar implements OrderExInterface {
    @Override
    public int getRating() {
        return 1;
    }
}
