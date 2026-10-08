package org.SEbushra;

public class TurnOnTheTv extends Command {
    private TV tv;

    TurnOnTheTv(TV tv){
        this.tv=tv;
    }

    public void execute(){
        tv.turnOn();
    }
}
