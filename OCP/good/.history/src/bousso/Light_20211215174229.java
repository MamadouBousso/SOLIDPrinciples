package src.bousso;

import java.util.ArrayList;
import java.util.List;

public class Light {

  private String feux;

  private ActionBarrier mb;

  public ActionBarrier getMb() {
    return mb;
  }

  public void setMb(ActionBarrier mb) {
    this.mb = mb;
  }

  

  public String getFeux() {
    return feux;
  }

  public void setFeux(String feux) {
    this.feux = feux;
  }

  

  public Light(String feux,ActionBarrier mb) {
    this.feux = feux;
    this.mb = mb;
}

public String raiseBarrier(){
  return mb.raiseBarrier(this);
}


}