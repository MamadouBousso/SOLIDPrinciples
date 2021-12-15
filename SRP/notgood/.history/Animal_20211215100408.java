public class Animal{

    private String espece;
    private int nbrpieds;
    private String couleur;

    public Animal(String espece,int np,String coul){
        this.espece = espece;
        this.nbrpieds = np;
        this.couleur = coul;
    }

    public toString(){
        return this.espece + " "+this.nbrpieds+" "+this.coul;
    }

}