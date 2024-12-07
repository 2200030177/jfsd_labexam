package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders") // This maps the base URL
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping // This maps GET requests to /api/orders
    public List<Order> getAllOrders() {
        return orderService.getAllOrders(); // Fetches all orders from the database
    }
}
