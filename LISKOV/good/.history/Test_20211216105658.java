import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animals  = new ArrayList<Animal>();
        animals.add(new Human("humain"));
        animals.add(new Human("humain"));
        
        for(Omnivore march: animals){
            march.eatmeat();;
        }
    }
}
