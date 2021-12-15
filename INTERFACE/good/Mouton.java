public class Mouton extends Animal implements Marcheur {
    public Mouton(String espece){
        super(espece);

    }
    @Override
    public void marcher(){
        System.out.println("je marche");
    }
}
