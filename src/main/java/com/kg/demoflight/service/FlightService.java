
package com.kg.demoflight.service;

import java.util.List;

import com.kg.demoflight.model.Flightt;

public interface FlightService {
    public List<Flightt> findAll();
    public void saveFlight (Flightt flight);
   public void updateFlight (Flightt flight , long id);
   public Flightt findOne(long id);
   public void delete (long id);
}