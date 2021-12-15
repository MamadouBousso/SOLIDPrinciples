package src.bousso;

public class Animal {

  private String espece;
  private int nbrpieds;
  private String couleur;
  private int age;

  /**
   * Constructor class Animal.
   * @param espece represents the spec of an animal
   * @param np represents the number of legs of an animal
   * @param coul represents the color of the animal
   */
  public Animal(String espece,int np,String coul,int age) {
    this.espece = espece;
    this.nbrpieds = np;
    this.couleur = coul;
    this.age = age;
  }
    /**
     * Calculate the quantity of food to eat per day.
     * @return the quantity in Kg
     * This method break the SRP clause that 
     * must be verified by a class
     */
  public float calculateEatingQuantity(){
    if (espece == "Mouton") {
        return age/2;
    } else {
        return age/3;
    }

  }

  public String toString() {
    return this.espece + " " + this.nbrpieds + " " + this.couleur;
  }

}