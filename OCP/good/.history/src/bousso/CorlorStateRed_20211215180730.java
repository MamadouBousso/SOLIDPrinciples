package src.bousso;

public class CorlorStateRed implements ColorState{

    @Override
    public String raiseBarrier(Light li) {
        // TODO Auto-generated method stub
        li.setMb(this);
        li.setFeux("red");
        return "up";
    }
    
}
