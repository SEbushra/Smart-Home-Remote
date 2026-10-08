package org.SEbushra;

public class TurnOffTheAirConditioner extends Command{
    private AirConditioner airConditioner;

    TurnOffTheAirConditioner(AirConditioner airConditioner){
        this.airConditioner=airConditioner;
    }
    public void execute(){
        airConditioner.turnOff();
    }
}
