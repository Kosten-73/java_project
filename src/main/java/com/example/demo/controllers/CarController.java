package com.example.demo.controllers;

import com.example.demo.models.Car;
import com.example.demo.repo.CarRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/")
    public String getAllCars(Model model) {
        model.addAttribute("cars", carRepository.findAll());
        return "carList";
    }

    @GetMapping("/car/{id}")
    public String getCarDetails(@PathVariable Long id, Model model) {
        Car car = carRepository.findById(id).orElse(null);
        if (car == null) {
            return "redirect:/";
        }
        model.addAttribute("car", car);
        return "carDetails";
    }

    @GetMapping("/car/add")
    public String showAddCarForm(Model model) {
        model.addAttribute("car", new Car());
        return "addCarForm";
    }

    @PostMapping("/")
    public String addCar(@ModelAttribute Car car) {
        carRepository.save(car);
        return "redirect:/";
    }

    @PostMapping("/car/delete/{id}")
    public String deleteCar(@PathVariable Long id) {
        carRepository.deleteById(id);
        return "redirect:/";
    }
}
