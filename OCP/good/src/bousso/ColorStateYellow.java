package src.bousso;

public class ColorStateYellow implements ColorState {

    @Override
    public String raiseBarrier(Light li) {
        // TODO Auto-generated method stub
        li.setMb(this);
        li.setFeux("Yellow");
        return "yellow color: "+"go middle";
    }
    
}
