package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue
    protected Long id;
    protected String owner;
    protected String car;
    protected String number;
    protected int age_car;
    protected int accidents;
    protected double cost;
    protected double mileage;
    protected int fine;
    protected boolean search;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge_car() {
        return age_car;
    }

    public void setAge_car(int age_car) {
        this.age_car = age_car;
    }

    public int getAccidents() {
        return accidents;
    }

    public void setAccidents(int accidents) {
        this.accidents = accidents;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public boolean isSearch() {
        return search;
    }

    public void setSearch(boolean search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", car='" + car + '\'' +
                ", number='" + number + '\'' +
                ", age_car=" + age_car +
                ", accidents=" + accidents +
                ", cost=" + cost +
                ", mileage=" + mileage +
                ", fine=" + fine +
                ", search=" + search +
                '}';
    }

}

