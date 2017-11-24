package fight.calculator;

import fight.model.gladiator.Gladiator;

/**
 * @author Сергей
 */
public class FightResult {


    public static String result (Gladiator a, Gladiator b) {
        String name = ((DamageCalculator.getCount(a) > DamageCalculator.getCount(b)) ? a.getName() : b.getName());
        return name;
    }
}
