package src.bousso;

public class Animal {

  private String espece;
  private int nbrpieds;
  private String couleur;
  private int age;
  private EatingCalculator eatingcalc;

  /**
   * Constructor class Animal.
   * 
   * @param espece represents the spec of an animal
   * @param np     represents the number of legs of an animal
   * @param coul   represents the color of the animal
   */
  public Animal(String espece, int np, String coul, int age) {
    this.espece = espece;
    this.nbrpieds = np;
    this.couleur = coul;
    this.age = age;
    this.eatingcalc = new EatingCalculatorImpl();
  }

  /**
   * Calculate the quantity of food to eat per day.
   * 
   * @return the quantity in Kg
   *         
   *         
   * @implNote This method break the SRP clause that
   *           must be verified by a class
   */
  public float calculateEatingQuantity() {

    return this.eatingcalc.calculateEatingQuantity(this.espece,this.age);

  }

  public String toString() {
    return this.espece + " " + this.nbrpieds + " " + this.couleur;
  }

}