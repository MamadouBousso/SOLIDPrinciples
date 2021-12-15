class Animal{

  private String espece;

  public Animal(String espece) {
    this.espece = espece;
    
  }

  public abstract void marcher(){
    System.out.println("je marche");
  }
  public abstract void ramper(){
    System.out.println("je rampe");
  }
  public abstract void voler(){
    System.out.println("je vole");
  }
}