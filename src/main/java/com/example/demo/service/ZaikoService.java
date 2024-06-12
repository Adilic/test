package com.example.demo.service;


import com.example.demo.model.QZaiko;
import com.example.demo.model.Zaiko;
import com.example.demo.repository.ZaikoRepository;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZaikoService {

    @Autowired
    private ZaikoRepository zaikoRepository;
    @Autowired
    private JPAQueryFactory queryFactory;

    public Zaiko saveZaiko(Zaiko zaiko) {
        return zaikoRepository.save(zaiko);
    }

    public Zaiko updateZaiko(Zaiko zaiko) {
        return zaikoRepository.save(zaiko);
    }

    public void deleteZaiko(Integer id) {
        zaikoRepository.deleteById(id);
    }

    public List<Zaiko> findAllZaiko() {
        QZaiko qZaiko = QZaiko.zaiko;
        return queryFactory.selectFrom(qZaiko).fetch();
    }


    public List<Zaiko> findByProductName(String productName) {
        QZaiko qZaiko = QZaiko.zaiko;
        BooleanExpression predicate = qZaiko.productName.eq(productName);
        return (List<Zaiko>) zaikoRepository.findAll(predicate);
    }
}