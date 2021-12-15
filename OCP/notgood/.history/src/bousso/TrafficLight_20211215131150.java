package src.bousso;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight {

    private List<String> feux;

    public List<String> getFeux() {
        return feux;
    }

    public void setFeux(List<String> feux) {
        this.feux = feux;
    }

    public TrafficLight() {
        feux = new ArrayList<String>();
    }

    public String raiseBarrier(String feux) {
        if (feux == "red")
            return "up";
        if (feux == "green")
            return "down";
        if (feux == "yellow")
            return "middle";

    }

}