public class Test {
    public static void main(String[] args) {
        List<Animal> animals  = new ArrayList<Animal>();
        animals.add(new Serpent("reptile"));
        animals.add(new Mouton("ovin"));
        animals.add(new Serpent("reptile"));
        for(Marcheur march: Animals){
            march.marcher();
        }
    }
}
