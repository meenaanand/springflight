package com.kg.demoflight.controller;

import java.util.List;

import com.kg.demoflight.model.Flightt;
import com.kg.demoflight.service.FlightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")

@RequestMapping("/flight")
public class FlightController {

    @Autowired 
    public FlightService flightService;
    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<?> saveFlight(@RequestBody Flightt flight){
        flightService.saveFlight(flight);
        return new ResponseEntity<Flightt>(flight,HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method =RequestMethod.DELETE)
    public void deleteFlight(@PathVariable Long id ){
         flightService.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Flightt> getflight() {
        return flightService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Flightt getFlight(@PathVariable Long id) {
        return flightService.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)

    public ResponseEntity<?> updateFlight(@RequestBody Flightt flight, @PathVariable("id") Long id) {
        Flightt f1 = flight;
        flightService.updateFlight(f1, id);
        return new ResponseEntity<Flightt>(HttpStatus.OK);

    }
}