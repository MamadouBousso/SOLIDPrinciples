public class Human extends Animal {
    public Serpent(String espece){
        super(espece);
    }
    
    @Override
    public void eatgrass() {
        // TODO Auto-generated method stub
        System.out.println("je mange de lherbe");
    }
    @Override
    public void eatmeat() {
        // TODO Auto-generated method stub
        System.out.println("je mange de la viande");
    }
}
