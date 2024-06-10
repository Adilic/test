package com.example.demo.controller;

import com.example.demo.model.Zaiko;
import com.example.demo.service.ZaikoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zaiko")
public class ZaikoController {

    @Autowired
    private ZaikoService zaikoService;

    @PostMapping("/add")
    public Zaiko addZaiko(@RequestBody Zaiko zaiko) {
        return zaikoService.saveZaiko(zaiko);
    }

    @GetMapping("/all")
    public List<Zaiko> getAllZaiko() {
        return zaikoService.getAllZaiko();
    }

    @GetMapping("/{id}")
    public Zaiko getZaikoById(@PathVariable Integer id) {
        return zaikoService.getZaikoById(id);
    }
}