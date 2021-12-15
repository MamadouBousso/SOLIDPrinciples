package src.bousso;

public class ColorStateGreen implements ColorState{

    @Override
    public String raiseBarrier(Light li) {
        // TODO Auto-generated method stub
        li.setMb(this);
        return "down";
    }
    
}
