package bousso;

package src.bousso;
import src.bousso.*;

public class EatingCalculatorImpl implements EatingCalculator {

    public float calculateEatingQuantity(String espece, int age) {

        if (espece == "Mouton")
            return age / 2;
        else
            return age / 3;
    }
}
