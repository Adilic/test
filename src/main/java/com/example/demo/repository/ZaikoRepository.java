package com.example.demo.repository;

import com.example.demo.model.Zaiko;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ZaikoRepository extends JpaRepository<Zaiko, Integer>, QuerydslPredicateExecutor<Zaiko> {
}

