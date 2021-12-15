package src.bousso;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight {

  private String feux;
  private ManageBarrier mb;

  public String getFeux() {
    return feux;
  }

  public void setFeux(String feux) {
    this.feux = feux;
  }

  

  public TrafficLight(String feux) {
    this.feux = feux;
}

/**
     * Cette methode n'est pas fermee pour la modification
     * S'il y a un autre type feux on est oblige de modifier le code
     * @param feux permet de lever les barrieres.
     * @return a string 
  */

  public String raiseBarrier() {

    if (this.feux == "red") {
      return "up";
    }
    if (this.feux == "green") {
      return "down";
    }
    if (this.feux == "yellow") {
      return "middle";
    }
    return null;

  }

}