package agh.po.symulator;

public class Position {
    double x;
    double y;

    public void updatePosition(double deltaX, double deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }

    public String getPozycja() {
        return  "Position = (" +  x + " , " + y + ")";
    }


}
