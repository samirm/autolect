package com.dwp.autolect.service;

import com.dwp.autolect.model.CarDTO;
import com.dwp.autolect.model.Make;
import com.dwp.autolect.repository.CarRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@Slf4j
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository repository) {
        this.carRepository = repository;
    }

    public CarDTO getCarByMakeModelAndYear(final String make, final String model, final int year) {
        var carOptional = this.carRepository.findByMakeAndModelAndYear(make, model, year);
        if (carOptional.isEmpty()) throw new NoSuchElementException("Car not found");

        var car = carOptional.get();
        var result = new CarDTO(Make.valueOf(car.getMake()), car.getModel(), car.getYear());
        return result;
    }
}
