package fight.calculator.properties;

import fight.model.gladiator.properties.ImprovedProperties;

/**
 * @author Сергей
 */
public class Health {

    private static final Double STRENGTH_COEFFICIENT = 0.7;
    private static final Double STAMINA_COEFFICIENT = 0.3;

    public static Double calculate(ImprovedProperties properties) {
        return properties.getStrength() * STRENGTH_COEFFICIENT + properties.getStamina() * STAMINA_COEFFICIENT * 10;
    }
}
