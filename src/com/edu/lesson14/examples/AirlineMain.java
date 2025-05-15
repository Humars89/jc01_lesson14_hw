package com.edu.lesson14.examples;

import java.util.List;

public class AirlineMain {
    public static void main(String[] args) {
        AirlineSchedule schedule = new AirlineSchedule();

        schedule.addFlight(new Airline("Париж", "A123", "Боинг 737", "14:00", List.of("Понедельник", "Среда", "Пятница")));
        schedule.addFlight(new Airline("Лондон", "B456", "Аэробус A320", "10:30", List.of("Вторник", "Четверг")));
        schedule.addFlight(new Airline("Нью-Йорк", "C789", "Боинг 777", "18:00", List.of("Понедельник", "Суббота")));

        System.out.println("Рейсы в Париж:");
        schedule.printFlights(schedule.getFlightsByDestination("Париж"));

        System.out.println("\nРейсы на понедельник:");
        schedule.printFlights(schedule.getFlightsByDay("Понедельник"));

        System.out.println("\nРейсы на понедельник после 15:00:");
        schedule.printFlights(schedule.getFlightsByDayAndTime("Понедельник", "15:00"));
    }
}

