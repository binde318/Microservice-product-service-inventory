package com.programmingbinde.orderservice.controller;

import com.programmingbinde.orderservice.dto.OrderLineItemsDto;
import com.programmingbinde.orderservice.dto.OrderRequest;
import com.programmingbinde.orderservice.dto.OrderResponse;
import com.programmingbinde.orderservice.model.Order;
import com.programmingbinde.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);

        return "order place successfully";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<OrderResponse> getAllOrder(@RequestBody OrderLineItemsDto orderLineItemsDto){
        return orderService.getAllOrder;
    }
}
