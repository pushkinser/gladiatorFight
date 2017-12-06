package fight.calculator.properties;

import fight.model.gladiator.properties.ImprovedProperties;

/**
 * @author Сергей
 */
public class Critical {

    private static final Double INTELLIGENCE_COEFFICIENT = 0.25;
    private static final Double REACTION_COEFFICIENT = 0.25;
    private static final Double TALENT_COEFFICIENT = 0.25;
    private static final Double EXPERIENCE_COEFFICIENT = 0.25;

    public static Double calculate(ImprovedProperties properties, Integer talent, Integer expirience) {
        return properties.getIntelligence() * INTELLIGENCE_COEFFICIENT
                + properties.getReaction() * REACTION_COEFFICIENT
                + talent*TALENT_COEFFICIENT
                + expirience * EXPERIENCE_COEFFICIENT;
    }
}
