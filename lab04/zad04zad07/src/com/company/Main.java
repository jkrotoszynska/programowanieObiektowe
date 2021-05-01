package com.company;

public class Main {

    public static void main(String[] args) {
        Car[] garage = new Car[3];
        garage[0] = new Car("AA456YY");
        garage[1] = new Car("YY555WW");
        garage[2] = new SDCar("TT543EE");

        // The following example outputs all elements in the cars array, using a "for-each" loop
        for (Car c : garage) {
            System.out.println(c);
        }
    }
}

class Car{
    boolean isOn = false;
    String licensePlate = "JohnDoe";

    public Car() {
    }

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        System.out.println("new Car");
    }

    void turnOn(){
        isOn = true;
    }

    void turnOff(){
        isOn = false;
    }

    @Override
    public String toString() {
        return "Car [isOn=" + isOn + ", licensePlate=" + licensePlate + "]";
    }
}

class SDCar extends Car{
    boolean isSelfDriving = false;

    public SDCar(String licensePlate) {
        super(licensePlate);
        System.out.println("new SDCar");
    }

    @Override
    void turnOn(){
        isSelfDriving = false;
        super.turnOn();
    }

    @Override
    void turnOff(){
        isSelfDriving = false;
        super.turnOff();
    }

    void turnSDOn(){
        isSelfDriving = true;
    }

    void turnSDOff(){
        isSelfDriving = false;
    }

    @Override
    public String toString() {
        return "Car [isSelfDriving = "+ isSelfDriving + ", isOn = " + isOn + ", licensePlate = " + licensePlate + "]";
    }

}