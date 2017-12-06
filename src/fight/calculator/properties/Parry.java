package fight.calculator.properties;

import fight.model.gladiator.properties.ImprovedProperties;

/**
 * @author Сергей
 */
public class Parry {

    private static final Double RAPIDITY_COEFFICIENT = 0.4;
    private static final Double REACTION_COEFFICIENT = 0.6;

    public static Double calculate (ImprovedProperties properties) {
        return properties.getRapidity()*RAPIDITY_COEFFICIENT+properties.getReaction()*REACTION_COEFFICIENT;
    }

}
