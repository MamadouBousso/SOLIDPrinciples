public class Serpent {

    public Serpent(String espece){
        super(espece);
        
    }
    public void ramper(){
        System.out.println("je rampe");
    }
    public void marcher(){
        
    }
    /**
     * This method breaks ISP
     */
    public void voler(){
        
    }
    
}