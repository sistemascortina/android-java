package com.example.list_cars_two;

public class CarFields {
    public String name;
    public String price;
    public String brand;
    public String year;
    public String motor;
    public String kilometer;
    public String guaranty;



    public CarFields(String name, String price, String brand,String year, String motor, String kilometer, String guaranty) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.year = year;
        this.motor = motor;
        this.kilometer = kilometer;
        this.guaranty = guaranty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String brand) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getKilometer() {
        return kilometer;
    }

    public void setKilometer(String kilometer) {
        this.kilometer = kilometer;
    }

    public String getGuaranty() {
        return guaranty;
    }

    public void setGuaranty(String guaranty) {
        this.guaranty = guaranty;
    }
}
