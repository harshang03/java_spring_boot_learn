package com.hg.spring_practice.order_ex;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ThreeStar implements OrderExInterface{
    @Override
    public int getRating() {
        return 3;
    }
}
