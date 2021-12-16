package src.bousso;

public class Human extends Animal{

    public Human(String espece){
        super(espece);
        
    }
    public void eatmeat(){
        System.out.println("je rampe");
    }
    
    public void eatgrass(){
        System.out.println("je marche");
        
    }
    
    
}
