package org.SEbushra;

public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV();
        AirConditioner airConditioner1 = new AirConditioner();
        Light light1 = new Light();


        Command turnOnTheTv1 = new TurnOnTheTv(tv1);
        Command turnOnTheLight1 = new TurnOnTheLight(light1);
        Command turnOnTheAirConditioner1 = new TurnOnTheAirConditioner(airConditioner1);

        Command turnOffTheTv1 = new TurnOffTheTv(tv1);
        Command turnOffTheLight1 = new TurnOffTheLight(light1);
        Command turnOffTheAirConditioner1 = new TurnOffTheAirConditioner(airConditioner1);


        Remote remote = new Remote();

        //first , turn on all of the devices
        remote.execute(turnOnTheTv1);
        remote.execute(turnOnTheLight1);
        remote.execute(turnOnTheAirConditioner1);

        //then , turn off all of the devices
        remote.execute(turnOffTheTv1);
        remote.execute(turnOffTheLight1);
        remote.execute(turnOffTheAirConditioner1);

    }
}
