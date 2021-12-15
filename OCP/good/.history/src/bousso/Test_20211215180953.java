package src.bousso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        ColorState abg = new ColorStateGreen();
        ColorState abr = new CorlorStateRed();
        ColorState aby = new ColorStateYellow();
        Light red = new Light();
        red.setMb(ab);
        System.out.println(red.raiseBarrier());
        List<ColorState> listCol = new ArrayList<ColorState>();

        feux.add("red");
        feux.add("green");
        feux.add("yellow");

        while (true) {
            red.setFeux(feux.get(new Random().nextInt(feux.size())));
            System.out.println(red.raiseBarrier());
        }
    }
    
}
