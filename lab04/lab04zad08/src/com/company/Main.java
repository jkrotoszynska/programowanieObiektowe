package com.company;

import javax.imageio.stream.MemoryCacheImageOutputStream;

public class Main {

    public static void main(String[] args) {
        Motorbike motor1 = new Motorbike("Yamaha", "FZ1");
        System.out.println(motor1);
        MotorbikeSold motor2 = new MotorbikeSold("Guzzi", "Stelvio");
        System.out.println(motor2);

    }
}

class Motorbike{
    String brand;
    String model;
    double maxspeed = 200;
    boolean antitheft = false;

    public Motorbike(String brand, String model, double maxspeed, boolean antitheft) {
        this.brand = brand;
        this.model = model;
        this.maxspeed = maxspeed;
        this.antitheft = antitheft;
    }

    public Motorbike(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Motorbike(double maxspeed) {
        this.maxspeed = maxspeed;
    }

    public boolean isAntitheft(){
        return antitheft;
    }

    public void setAntitheft(boolean antitheft) {
        this.antitheft = antitheft;
    }

    @Override
    public String toString() {
        return "Motorbike [brand = " + brand + ", model = " + model + ", maxspeed = " + maxspeed + ", anititheft = " + antitheft + "]";
    }

}

class MotorbikeSold extends Motorbike{
    double speed = 0.0;
    String licencePlate = "JohnDoe";

    public MotorbikeSold(String brand, String model, double maxspeed, boolean antitheft, double speed, String licencePlate) {
        super(brand, model, maxspeed, antitheft);
        this.speed = speed;
        this.licencePlate = licencePlate;
    }

    public MotorbikeSold(String brand, String model) {
        super(brand, model);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    @Override
    public String toString() {
        return "Motorbike [brand = " + brand + ", model = " + model + ", maxspeed = " + maxspeed + ", anititheft = " + antitheft + ", speed = " + speed + ", licencePlate = " + licencePlate + "]";
    }

}