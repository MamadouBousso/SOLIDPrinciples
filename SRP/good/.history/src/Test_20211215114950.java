import src.bousso.Animal;

public class Test {

    public static void main(String[] args) {

        Animal an = new Animal("Horse",4,"blanc",2);
        float quant = an.calculateEatingQuantity();
        System.out.println("The quantity eaten is "+quant);
        
    }
    
}
