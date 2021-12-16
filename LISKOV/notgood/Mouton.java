public class Mouton extends Animal{
    
    public Mouton(String espece){
        super(espece);
        
    }
    public void ramper(){
        System.out.println("je rampe");
    }
    public void marcher(){
        System.out.println("je marche");
    }
    public void voler(){
        System.out.println("je vole");
    }
}
