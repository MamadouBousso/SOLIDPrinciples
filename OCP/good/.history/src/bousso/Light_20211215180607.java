package src.bousso;

import java.util.ArrayList;
import java.util.List;

public class Light {

 

  private ColorState mb;

  public ColorState getMb() {
    return mb;
  }

  public void setMb(ColorState mb) {
    this.mb = mb;
  }

  

  
public Light() {
  
    
}

public String raiseBarrier(){
  return mb.raiseBarrier(this);
}


}