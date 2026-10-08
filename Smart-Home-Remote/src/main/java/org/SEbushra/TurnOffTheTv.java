package org.SEbushra;

public class TurnOffTheTv extends Command{
    private TV tv ;

    TurnOffTheTv(TV tv){
        this.tv=tv;
    }

    public void execute(){
        tv.turnOff();
    }

}
