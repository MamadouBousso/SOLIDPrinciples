package src.bousso;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight {

  private List<String> feux;

  public List<String> getFeux() {
    return feux;
  }

  public void setFeux(List<String> feux) {
    this.feux = feux;
  }

  public TrafficLight() {
    feux = new ArrayList<String>();
  }
  /**
     * Cette methode n'est pas fermee pour la modification
     * S'il y a un autre type feux on est oblige de modifier le code
     * @param feux
     * @return
  */
    public String raiseBarrier(String feux) {
        if (feux == "red") {
            return "up";
        }
        if (feux == "green") {
            return "down";
        }
        if (feux == "yellow") {
            return "middle";
        }

    }

}