package com.example.demo.repo;

import com.example.demo.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    Car findById(long id);
}
