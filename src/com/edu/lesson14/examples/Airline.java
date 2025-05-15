package com.edu.lesson14.examples;

import java.util.List;

public class Airline {
	private String destination;
	private String flightNumber;
	private String airplaneType;
	private String departureTime;
	private List<String> daysOfWeek;

	public Airline(String destination, String flightNumber, String airplaneType, String departureTime,
			List<String> daysOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airplaneType = airplaneType;
		this.departureTime = departureTime;
		this.daysOfWeek = daysOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public List<String> getDaysOfWeek() {
		return daysOfWeek;
	}

	@Override
	public String toString() {
		return "Рейс " + flightNumber + " в " + destination + ", " + airplaneType + ", отправляется в " + departureTime
				+ " в дни: " + daysOfWeek;
	}
}
