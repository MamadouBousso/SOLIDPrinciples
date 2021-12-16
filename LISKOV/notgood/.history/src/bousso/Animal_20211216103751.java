package src.bousso;

public abstract class Animal{

  private String espece;

  public Animal(String espece) {
    this.espece = espece;
    
  }

  public abstract void eatmeat();
    
  public abstract void eatgrass(); 
  


}