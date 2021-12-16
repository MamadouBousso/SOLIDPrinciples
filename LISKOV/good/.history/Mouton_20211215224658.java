public class Mouton extends Animal implements Marcheur {
    public Mouton(String espece){
        super(espece);

    }
    public void marcher(){
        System.out.println("je marche");
    }
}
