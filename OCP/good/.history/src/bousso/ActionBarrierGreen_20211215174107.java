package src.bousso;

public class ActionBarrierGreen implements ActionBarrier{

    @Override
    public String raiseBarrier(Light li) {
        // TODO Auto-generated method stub
        li.setMb(this);
        return "down";
    }
    
}
