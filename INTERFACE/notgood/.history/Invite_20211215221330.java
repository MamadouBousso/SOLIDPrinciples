class Animal{

  private String espece;

  public Animal(String espece) {
    this.espece = espece;
    
  }

  public void marcher(){
    System.out.println("je marche");
  }
  public void ramper(){
    System.out.println("je rampe");
  }
  public void voler(){
    System.out.println("je vole");
  }
}