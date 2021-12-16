package bousso;

public class Mouton extends Animal{
    
    public Mouton(String espece){
        super(espece);
        
    }
    /**
     * This method breaks ISP
     */
    public void ramper(){
        
    }
    public void marcher(){
        System.out.println("je marche");
    }
    /**
     * This method breaks ISP
     */
    public void voler(){
        
    }
}
