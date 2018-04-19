package com.kg.demoflight.repository;

import com.kg.demoflight.model.Flightt;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flightt, Long> {
    
    }