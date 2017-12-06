package fight.calculator;

import fight.model.gladiator.Gladiator;
import fight.model.item.weapon.Weapon;

/**
 * @author Сергей
 */
public class DamageCalculator { // для боя 1 на 1

    private static final Double DAMAGE_COEFFICIENT=0.4;
    private static final Double POWER_COEFFICIENT=0.6;
    private double learnability;
    public DamageCalculator(double learnability){
        this.learnability=learnability;
    }

    public double damageOnHit(Gladiator gladiatorDefense, Gladiator gladiatorAttack){
        double dmg=damage(gladiatorAttack.getWeapon(),gladiatorAttack.getCalculatedProperties().getImpactForce(),gladiatorAttack.getImprovedProperties().getPossessionOfArms());
        return dmg+dmg*gladiatorAttack.getCalculatedProperties().getCritical()
                - gladiatorDefense.getArmor().getProtection()*gladiatorDefense.getArmor().getWear();
    }
    public double damage(Weapon weapon, Integer force,Integer possessionOfArms){
        double damageWeapon=damageWeapon(weapon);
        double impactForce=impactForce(force,possessionOfArms);
        return DAMAGE_COEFFICIENT*damageWeapon+POWER_COEFFICIENT*impactForce;
    }
    public double damageWeapon(Weapon weapon){
        return weapon.getDamage()*(weapon.getWear()+learnability/100);
    }
    public double impactForce(Integer damage,Integer skill){
        return damage*(skill/100+learnability/100);
    }
}
