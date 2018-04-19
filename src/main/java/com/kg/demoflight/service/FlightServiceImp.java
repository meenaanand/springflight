package com.kg.demoflight.service;

import java.util.List;

import com.kg.demoflight.model.Flightt;
import com.kg.demoflight.repository.FlightRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImp implements FlightService{

    @Autowired 
    private FlightRepository flightrepository;

    @Override
    public List<Flightt> findAll(){
        return flightrepository.findAll();
    }
    @Override
    public void saveFlight(Flightt flight){

     flightrepository.save(flight);
    }
    @Override
    public void updateFlight(Flightt flight , long id){
        flight.setFlightId(id);
        flightrepository.saveAndFlush(flight);
        
    }

    @Override
    public Flightt findOne(long id){
        return flightrepository.findOne(id);
    }

	@Override
	public void delete(long id) {
        flightrepository.delete(id);
        
	}
}