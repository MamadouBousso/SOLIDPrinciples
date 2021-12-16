package src.bousso;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Mouton("ovni"));
        animals.add(new Serpent("ovni"));
        for (Animal a: animals){
            /* Problem: a sheep can't walk */
            a.marcher();
        }
    }
}
