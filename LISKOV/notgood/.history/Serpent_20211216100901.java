package bousso;

public class Serpent {

    public Serpent(String espece){
        super(espece);
        
    }
    public void ramper(){
        System.out.println("je rampe");
    }
    /**
     * This method breaks ISP
     */
    public void marcher(){
        System.out.println("je marche");
        
    }
    /**
     * This method breaks ISP
     */
    public void voler(){
        
    }
    
}
