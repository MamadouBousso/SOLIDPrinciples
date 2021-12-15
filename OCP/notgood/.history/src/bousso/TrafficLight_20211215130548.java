package src.bousso;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight{

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

    
    
}