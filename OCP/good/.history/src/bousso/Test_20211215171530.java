package src.bousso;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ActionBarrier ab = new ActionBarrierRed();
        Light red = new Light("red",ab);
        System.out.println(red.raiseBarrier());
        List<String> feux = new ArrayList<String>();
        feux.add("red");
        feux.add("green");
        feux.add("yellow");
        while (true) {

        }
    }
    
}
