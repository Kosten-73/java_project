
package com.example.demo;

import com.example.demo.models.Car;
import com.example.demo.repo.CarRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

	@Bean
	public ApplicationRunner init(CarRepository carRepository) {
		return args -> {
			Car new_car = new Car();
			new_car.setOwner("Konstantin rudenko");
			new_car.setCar("Audi A5");
			new_car.setNumber("O492YO161");
			new_car.setAge_car(11);
			new_car.setCost(1200000);
			new_car.setMileage(149231);
			new_car.setFine(2);
			new_car.setAccidents(3);
			new_car.setSearch(false);
			carRepository.save(new_car);

			System.out.println("Cars saved: " + carRepository.count());
		};
	}
}
