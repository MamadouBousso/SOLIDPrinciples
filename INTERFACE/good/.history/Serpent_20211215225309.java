public class Serpent extends Animal, implements Rampant {
    public Serpent(String espece){
        super(espece);
    }
    @Override
    public void ramper(){
        System.out.println("je rampe");
    }
}
