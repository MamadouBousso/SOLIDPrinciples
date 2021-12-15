package bousso;

import src.bousso.EatingCalculator;

public class EatingCalculatorImpl implements EatingCalculator {
    public float calculateEatingQuantity(String espece, int age) {
        if (espece == "Mouton")
            return age / 2;
        else
            return age / 3;
    }
}
