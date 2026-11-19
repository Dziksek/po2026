package agh.po.symulator;

public class Engine extends Component {
    int maxengspeed;
    int engspeed;
    int defaultengspeed;

    public void start() {
        engspeed = defaultengspeed;
    }
    public void stop() {
        engspeed = 0;
    }



}
