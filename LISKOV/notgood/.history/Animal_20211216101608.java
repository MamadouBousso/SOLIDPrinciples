package src.bousso;

abstract class Animal{

  private String espece;

  public Animal(String espece) {
    this.espece = espece;
    
  }

  public abstract void marcher();
    
  public abstract void ramper(); 
  


}