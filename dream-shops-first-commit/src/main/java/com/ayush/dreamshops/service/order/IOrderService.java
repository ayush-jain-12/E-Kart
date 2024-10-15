package com.ayush.dreamshops.service.order;

import com.ayush.dreamshops.dto.OrderDto;
import com.ayush.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
