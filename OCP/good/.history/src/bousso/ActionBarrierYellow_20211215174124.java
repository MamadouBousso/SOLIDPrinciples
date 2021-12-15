package src.bousso;

public class ActionBarrierYellow implements ActionBarrier {

    @Override
    public String raiseBarrier(Light li) {
        // TODO Auto-generated method stub
        li.setMb(this);
        return "middle";
    }
    
}
