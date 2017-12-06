package fight.calculator;

import fight.calculator.properties.Health;
import fight.model.gladiator.Gladiator;
import fight.model.gladiator.properties.CalculatedProperties;
import fight.model.gladiator.properties.ImprovedProperties;

/**
 * @author Сергей
 */
public class ProbabilityOfHitting {

    public static double probality(Gladiator gladiator) {
        ImprovedProperties improvedProperties = gladiator.getImprovedProperties();
        CalculatedProperties calculatedProperties = gladiator.getCalculatedProperties();


        double result = 0;

        // Мастерство попадания.
        double hittingSkil = improvedProperties.getPossessionOfArms() * calculatedProperties.getParry() / 100;

        // Физическое состояние.
        double physicalState = calculatedProperties.getHealth() / Health.calculate(improvedProperties);

        // Выносливость.
        double stamina = improvedProperties.getStamina() * physicalState / 100;




        return result;
    }
}
