package src.bousso;

import java.util.ArrayList;
import java.util.List;

public class Light {

  private String feux;

  private ActionBarrier mb;

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



}