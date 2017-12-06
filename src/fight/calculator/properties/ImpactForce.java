package fight.calculator.properties;

import fight.model.gladiator.properties.ImprovedProperties;

/**
 * @author Сергей
 */
public class ImpactForce {

    private static final Double STRENGTH_COEFFICIENT = 0.8;
    private static final Double POSSESSION_OF_ARMS_COEFFICIENT = 0.2;

    public static Double calculate(ImprovedProperties properties) {
        return properties.getStrength() * STRENGTH_COEFFICIENT + properties.getPossessionOfArms() * POSSESSION_OF_ARMS_COEFFICIENT;
    }

}
