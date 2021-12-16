package src.bousso;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Human("homme"));
        animals.add(new Mouton("ovin"));
        animals.add(new Oiseaux("ovin"));
        for (Animal a: animals){
            /* Probleme: un mouton ne mange pas de la viande */
            a.eatmeat();
        }
    }
}
