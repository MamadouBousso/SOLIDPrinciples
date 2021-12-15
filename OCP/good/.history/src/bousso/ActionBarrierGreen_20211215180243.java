package src.bousso;

public class ColorStateGreen implements ActionBarrier{

    @Override
    public String raiseBarrier(Light li) {
        // TODO Auto-generated method stub
        li.setMb(this);
        return "down";
    }
    
}
