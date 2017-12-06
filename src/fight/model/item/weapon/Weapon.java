package fight.model.item.weapon;

import fight.model.item.Item;

/**
 * @author Сергей
 */
public class Weapon extends Item {

    private WeaponType TYPE;
    private Integer damage;

    public WeaponType getTYPE() {
        return TYPE;
    }

    public void setTYPE(WeaponType TYPE) {
        this.TYPE = TYPE;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }
}
