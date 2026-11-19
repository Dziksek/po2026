package agh.po.symulator;

public class Clutch extends Component{
    boolean clutchstate;

    public void press() {
        clutchstate = true;
    }

    public  void slowdown() {
        clutchstate = false;
    }

}