package org.SEbushra;

public class AirConditioner implements HomeDevice{

    @Override public void turnOn(){
        System.out.println("AirConditioner has been turned on");
    }

    @Override public void turnOff(){
        System.out.println("AirConditioner has been turned off");
    }
}
