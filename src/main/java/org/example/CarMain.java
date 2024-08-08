package org.example;

public class CarMain {
    public static void main(String[] args) {
        Car car=new Car();
        car.start();
        System.out.println("Current speed: "+car.getSpeed()+" km/h.");
        car.stop();
    }
}








