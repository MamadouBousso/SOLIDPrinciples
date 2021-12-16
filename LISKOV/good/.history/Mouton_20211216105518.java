public class Mouton  implements Herbivore {
    
    public Mouton(String espece){
        self.espece = espece;

    }
    
    @Override
    public void eatgrass() {
        // TODO Auto-generated method stub
        System.out.println("je mange de lherbe");
    }
}
