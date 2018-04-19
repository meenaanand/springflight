package com.kg.demoflight.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flightt{

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long flightId;

    @Column
    private String flightName;

    @Column
    private String departure;
    
    @Column
    private String arrival;
    
    @Column
    private String availability;
    
    @Column
    private double fare;

    /**
     * @return the arrival
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * @return the availability
     */
    public String getAvailability() {
        return availability;
    }
    /**
     * @return the departure
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * @return the fare
     */
    public double getFare() {
        return fare;
    }
    /**
     * @return the flightId
     */
    public long getFlightId() {
        return flightId;
    }
    /**
     * @return the flightName
     */
    public String getFlightName() {
        return flightName;
    }
    /**
     * @param arrival the arrival to set
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
    /**
     * @param availability the availability to set
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }
    /**
     * @param departure the departure to set
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    /**
     * @param flightId the flightId to set
     */
    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    /**
     * @param flightName the flightName to set
     */
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    /**
     * @param fare the fare to set
     */
    public void setFare(double fare) {
        this.fare = fare;
    }
  
    @Override
    public String toString()
    {
        return flightId +"  " + flightName + " " + departure +"  " + arrival + " " +availability+" "+fare;
    }
    

    
}