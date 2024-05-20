package io.tutorial.garage.spring.garageApp.controller;

import io.tutorial.garage.spring.garageApp.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarageController {

    @RequestMapping("/car")
    public Car getCar() {
        Car myCar = new Car("Laguna", "Renault", 2004, Car.Color.RED);
        return myCar;
    }
}
