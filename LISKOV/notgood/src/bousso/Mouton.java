package src.bousso;

public class Mouton extends Animal{
    
    public Mouton(String espece){
        super(espece);
        
    }
    /**
     * This method breaks ISP
     */
    public void eatmeat(){
        
    }
    public void eatgrass(){
        System.out.println("I eat grass");
    }
    
}
