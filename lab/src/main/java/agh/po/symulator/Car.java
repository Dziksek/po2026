package agh.po.symulator;

public class Car {
    boolean onstate;
    String carid;
    String carmodel;
    int vmax;

    Engine engine;
    Gearbox gearbox;




    public void turnON() {
        engine.start();
    }
    public void turnOFF() {
        engine.stop();
    }


}
