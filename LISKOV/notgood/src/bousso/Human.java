package src.bousso;

public class Human extends Animal{

    public Human(String espece){
        super(espece);
        
    }
    public void eatmeat(){
        System.out.println("je mange de la viande");
    }
    
    public void eatgrass(){
        System.out.println("je mange de lherbe");
        
    }
    
    
}
