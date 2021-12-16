public class Mouton  implements Herbivore {
    
    public Mouton(String espece){
        super(espece);

    }
    
    @Override
    public void eatgrass() {
        // TODO Auto-generated method stub
        System.out.println("je mange de lherbe");
    }
}
