public class Mouton  implements Herbivore {
    
    private String espece;

    public Mouton(String espece){
        this.espece = espece;

    }
    
    @Override
    public void eatgrass() {
        // TODO Auto-generated method stub
        System.out.println("je mange de lherbe");
    }
}
