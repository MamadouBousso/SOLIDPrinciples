package src.bousso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        ActionBarrier ab = new ActionBarrierRed();
        Light red = new Light("red");
        red.setMb(ab);
        System.out.println(red.raiseBarrier());
        List<String> feux = new ArrayList<String>();

        feux.add("red");
        feux.add("green");
        feux.add("yellow");

        while (true) {
            red.setFeux(feux.get(new Random().nextInt(feux.size())));
            System.out.println(red.raiseBarrier());
        }
    }
    
}
