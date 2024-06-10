package com.example.demo.service;


import com.example.demo.model.Zaiko;
import com.example.demo.repository.ZaikoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZaikoService {

    @Autowired
    private ZaikoRepository zaikoRepository;

    public Zaiko saveZaiko(Zaiko zaiko) {
        return zaikoRepository.save(zaiko);
    }

    public List<Zaiko> getAllZaiko() {
        return zaikoRepository.findAll();
    }

    public Zaiko getZaikoById(Integer id) {
        return zaikoRepository.findById(id).orElse(null);
    }
}