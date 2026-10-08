package org.SEbushra;

public class TurnOnTheAirConditioner extends Command{
    private AirConditioner airConditioner ;

    TurnOnTheAirConditioner (AirConditioner airConditioner){
        this.airConditioner=airConditioner;
    }

    public void execute(){
        airConditioner.turnOn();
    }
}
