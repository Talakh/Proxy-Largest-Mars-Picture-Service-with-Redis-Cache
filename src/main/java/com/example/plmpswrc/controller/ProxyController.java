package com.example.plmpswrc.controller;

import com.example.plmpswrc.service.ProxyClient;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProxyController {
    private final ProxyClient proxyClient;

    @GetMapping(value = "/proxy", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> getLargestNasaPicture(@RequestParam Integer sol, @RequestParam(required = false) String camera) {
        return ResponseEntity.ok(proxyClient.getLargestPicture(sol, camera));
    }
}
