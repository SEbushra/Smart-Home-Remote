package org.SEbushra;

public class TurnOnTheLight extends Command{
    private Light light ;

    TurnOnTheLight (Light light){
        this.light=light;
    }

    public void execute(){
        light.turnOn();
    }
}
