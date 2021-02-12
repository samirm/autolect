package com.dwp.autolect.repository;

import com.dwp.autolect.model.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Integer> {
    Optional<CarEntity> findByMakeAndModelAndYear(String make, String model, int year);
}
