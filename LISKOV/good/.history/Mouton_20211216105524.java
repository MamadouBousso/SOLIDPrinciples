public class Mouton  implements Herbivore {
    
    public Mouton(String espece){
        this.espece = espece;

    }
    
    @Override
    public void eatgrass() {
        // TODO Auto-generated method stub
        System.out.println("je mange de lherbe");
    }
}
