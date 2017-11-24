package fight.calculator;

import fight.model.gladiator.Gladiator;
import fight.model.gladiator.parameter.Skill;

import java.util.Random;

/**
 * @author Сергей
 */
public class DamageCalculator {

    static Double getCount(Gladiator a) {

        boolean isSkill = false;
        Skill activeSkill = new Skill();

        for (Skill skill : a.getSkillList()) {
            if (skill.getWeaponType().equals(a.getWeapon().getTYPE())) {
                isSkill = true;
                activeSkill = skill;
                // TODO: переделать на while.
            }
        }


        Random geniusEngine = new Random();
        Double result;
        int newSpirit = a.getCountSpirit() / 3 + geniusEngine.nextInt(a.getCountSpirit() * 2 / 3);

        if (!isSkill) {
            result = (double) (newSpirit * a.getStamina() + a.getAgility() * a.getStrength());
            return result;
        }


        result = (double) (newSpirit * a.getStrength() / a.getAgility() * activeSkill.getHourOfTraining() / activeSkill.getCountOfAttack() +
                +newSpirit * a.getStamina() / a.getStrength() * activeSkill.getHourOfTraining() / activeSkill.getCountOfBlock() + newSpirit / a.getStamina() * activeSkill.getHourOfTraining() * activeSkill.getKills());

//        System.out.println(a.getName() + ": ( " + result + " )");
        return result;
    }
}
