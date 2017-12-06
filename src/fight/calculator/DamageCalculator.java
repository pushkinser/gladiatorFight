package fight.calculator;

import fight.model.gladiator.Gladiator;
import fight.model.item.weapon.Weapon;

/**
 * @author Сергей
 */
public class DamageCalculator { // для боя 1 на 1

    private static final Double DAMAGE_COEFFICIENT=0.4;
    private static final Double POWER_COEFFICIENT=0.6;

    public double damageOnHit(Weapon weaponDefense, Gladiator gladiatorAttack,double criticalDamage, double armor, double wearArmor){
        double dmg=damage(weaponDefense,gladiatorAttack);
        return dmg+dmg*criticalDamage - armor*wearArmor;
    }
    public double damage(Weapon weaponDefense, Gladiator gladiatorAttack){

        return DAMAGE_COEFFICIENT*weaponDefense.getDamage()+POWER_COEFFICIENT*gladiatorAttack.getCalculatedProperties().getImpactForce();
    }
}
