package src.bousso;
import src.bousso.*;
import src.bousso.Animal;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Mouton("ovni"));
        animals.add(new Serpent("ovni"));
        for (Animal a: animals){
            a.marcher();
        }
    }
}
