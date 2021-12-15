package src.bousso;

public class Animal {

  private String espece;
  private int nbrpieds;
  private String couleur;

  /**
   * Constructor class Animal.
   * @param espece represents the spec of an animal
   * @param np represents the number of legs of an animal
   * @param coul represents the color of the animal
   */
  public Animal(String espece,int np,String coul) {
    this.espece = espece;
    this.nbrpieds = np;
    this.couleur = coul;
  }

  public String toString() {
    return this.espece + " " + this.nbrpieds + " " + this.couleur;
  }

}