package com.example.plmpswrc.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "picture-service", url = "http://localhost:8080")
public interface ProxyClient {

    @GetMapping("/mars/pictures/largest")
    @Cacheable("picture")
    byte[] getLargestPicture(@RequestParam Integer sol, @RequestParam(required = false) String camera);
}
