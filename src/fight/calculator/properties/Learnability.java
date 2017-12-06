package fight.calculator.properties;

import fight.model.gladiator.properties.ImprovedProperties;

/**
 * @author Сергей
 */
public class Learnability {

    private static final Double INTELLIGENCE_COEFFICIENT = 0.4;
    private static final Double TALENT_COEFFICIENT = 0.6;

    public static Double calculate(ImprovedProperties properties, Integer talent) {
        return properties.getIntelligence() * INTELLIGENCE_COEFFICIENT
                + talent*TALENT_COEFFICIENT;
    }
}
