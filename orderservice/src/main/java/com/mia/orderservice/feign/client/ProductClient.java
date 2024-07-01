package com.mia.orderservice.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

// local, docker, kubernetes???
// Service Discovery
@FeignClient(name="product-service")
public interface ProductClient {
    @GetMapping("/api/v1/products")
    String get(@RequestParam String name);
}
