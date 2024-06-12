package com.example.demo.controller;

import com.example.demo.model.Zaiko;
import com.example.demo.service.ZaikoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zaiko")
public class ZaikoController {

    @Autowired
    private ZaikoService zaikoService;

    @GetMapping
    public ResponseEntity<List<Zaiko>> getAllZaiko() {
        List<Zaiko> zaikoList = zaikoService.findAllZaiko();
        return ResponseEntity.ok(zaikoList);
    }

    @GetMapping("/{productName}")
    public ResponseEntity<List<Zaiko>> getZaikoByProductName(@PathVariable String productName) {
        List<Zaiko> zaikoList = zaikoService.findByProductName(productName);
        return ResponseEntity.ok(zaikoList);
    }

    @PostMapping
    public ResponseEntity<Zaiko> createZaiko(@RequestBody Zaiko zaiko) {
        Zaiko createdZaiko = zaikoService.saveZaiko(zaiko);
        return ResponseEntity.ok(createdZaiko);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Zaiko> updateZaiko(@PathVariable Integer id, @RequestBody Zaiko zaiko) {
        zaiko.setId(id);
        Zaiko updatedZaiko = zaikoService.updateZaiko(zaiko);
        return ResponseEntity.ok(updatedZaiko);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteZaiko(@PathVariable Integer id) {
        zaikoService.deleteZaiko(id);
        return ResponseEntity.noContent().build();
    }
}