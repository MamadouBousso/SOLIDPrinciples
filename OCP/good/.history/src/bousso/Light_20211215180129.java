package src.bousso;

import java.util.ArrayList;
import java.util.List;

public class Light {

  private String feux;

  private ColorState mb;

  public ColorState getMb() {
    return mb;
  }

  public void setMb(ColorState mb) {
    this.mb = mb;
  }

  

  public String getFeux() {
    return feux;
  }

  public void setFeux(String feux) {
    this.feux = feux;
  }

  

  public Light(String feux) {
    this.feux = feux;
    
}

public String raiseBarrier(){
  return mb.raiseBarrier(this);
}


}