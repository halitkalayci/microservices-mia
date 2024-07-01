package com.mia.productservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsService {

    @GetMapping
    public String get(@RequestParam String name) throws InterruptedException {
        System.out.println("İstek işleniyor");
        Thread.sleep(3000);
        return "Product Service Working " + name;
    }
}
