public class Animal {

  private String espece;
  private int nbrpieds;
  private String couleur;
  /**
   * Constructor class Animal.
   * @param espece
   * @param np
   * @param coul
   */
  public Animal(String espece,int np,String coul) {
    this.espece = espece;
        this.nbrpieds = np;
        this.couleur = coul;
    }

    public String toString(){
        return this.espece + " "+this.nbrpieds+" "+this.couleur;
    }

}