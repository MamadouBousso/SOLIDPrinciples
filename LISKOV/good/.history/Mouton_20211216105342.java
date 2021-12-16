public class Mouton  implements Herbivore {
    public Mouton(String espece){
        super(espece);

    }
    @Override
    public void marcher(){
        System.out.println("je marche");
    }
}
