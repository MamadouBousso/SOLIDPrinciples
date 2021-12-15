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
        red.setMb(abg);
        System.out.println(red.raiseBarrier());
        List<ColorState> listCol = new ArrayList<ColorState>();

        listCol.add(abg);
        listCol.add(abr);
        listCol.add(aby);

        while (true) {
            red.setFeux(listCol.get(new Random().nextInt(listCol.size())));
            System.out.println(red.raiseBarrier());
        }
    }
    
}
