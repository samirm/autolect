package com.dwp.autolect.controller;

import com.dwp.autolect.model.CarDTO;
import com.dwp.autolect.model.Make;
import com.dwp.autolect.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars/{make}/{model}/{year}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CarDTO> getCarByMakeAndModelAndYear(final @PathVariable(name = "make") String make, final @PathVariable(name = "model") String model, final @PathVariable(name = "year") int year) {
        return ResponseEntity.ok(this.carService.getCarByMakeModelAndYear(make, model, year));
    }
}
