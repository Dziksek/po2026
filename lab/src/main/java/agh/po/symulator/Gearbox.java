package agh.po.symulator;

public class Gearbox extends Component {


    int currentgear;
    int gearcount;

    public void gearup() {
        if (currentgear < gearcount) {
                currentgear = currentgear + 1;
        }
    }
    public void geardown() {
        if(currentgear > 0) {
            currentgear = currentgear - 1;
        }
    }



}

