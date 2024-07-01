package com.mia.orderservice.controller;

import com.mia.orderservice.feign.client.ProductClient;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
@Getter
@Setter
public class OrdersController {
    private final ProductClient productClient;



    @GetMapping()
    public String get() {
        String responseFromProductClient = productClient.get("Halit");
        return responseFromProductClient;
    }
}
