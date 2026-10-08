package org.SEbushra;

public class TV implements HomeDevice{

        @Override public void turnOn(){
            System.out.println("TV has been turned on");
        }

        @Override public void turnOff(){
            System.out.println("TV has been turned off");
        }
}
