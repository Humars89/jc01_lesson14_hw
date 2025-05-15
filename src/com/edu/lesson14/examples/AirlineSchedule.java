package com.edu.lesson14.examples;

import java.util.ArrayList;
import java.util.List;

public class AirlineSchedule {
    private List<Airline> flights;

    public AirlineSchedule() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Airline flight) {
        flights.add(flight);
    }

    public List<Airline> getFlightsByDestination(String destination) {
        List<Airline> result = new ArrayList<>();
        for (Airline flight : flights) {
            if (flight.getDestination().equalsIgnoreCase(destination)) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Airline> getFlightsByDay(String day) {
        List<Airline> result = new ArrayList<>();
        for (Airline flight : flights) {
            if (flight.getDaysOfWeek().contains(day)) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Airline> getFlightsByDayAndTime(String day, String time) {
        List<Airline> result = new ArrayList<>();
        for (Airline flight : flights) {
            if (flight.getDaysOfWeek().contains(day) && flight.getDepartureTime().compareTo(time) > 0) {
                result.add(flight);
            }
        }
        return result;
    }

    public void printFlights(List<Airline> flights) {
        if (flights.isEmpty()) {
            System.out.println("Рейсы не найдены.");
        } else {
            for (Airline flight : flights) {
                System.out.println(flight);
            }
        }
    }
}

