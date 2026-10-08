package org.SEbushra;

public class TurnOffTheLight extends Command{
    private Light light ;

    TurnOffTheLight (Light light){
        this.light=light;
    }

    public void execute(){
        light.turnOff();
    }
}
