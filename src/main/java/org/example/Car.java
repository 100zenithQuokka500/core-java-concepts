package org.example;

public class Car implements Vehicle{
     int speed;
     public void start(){
         speed=10;
         System.out.println("Car started . Speed is "+speed+ " km/h.");
     }
     public void stop(){
         speed=0;
         System.out.println("Car stopped.");
     }
     public int getSpeed(){
         return speed;
     }

}
