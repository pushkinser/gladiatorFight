package fight.calculator.properties;

import fight.model.gladiator.properties.ImprovedProperties;

/**
 * @author Сергей
 */
public class Learnability {

    private static final Double INTELLIGENCE_COEFFICIENT = 0.3;
    private static final Double TALENT_COEFFICIENT = 0.4;
    private static final Double EXPERIENCE_COEFFICIENT = 0.3;

    public static Double calculate(ImprovedProperties properties, Integer talent, Integer expirience) {
        return properties.getIntelligence() * INTELLIGENCE_COEFFICIENT
                + talent*TALENT_COEFFICIENT
                + expirience * EXPERIENCE_COEFFICIENT;
    }
}
