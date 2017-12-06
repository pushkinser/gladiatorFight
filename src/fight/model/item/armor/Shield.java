package fight.model.item.armor;

import fight.model.item.Item;

/**
 * @author Сергей
 */
public class Shield extends Item {

    private ShieldType shieldType;
    private Integer protection;

    public ShieldType getShieldType() {
        return shieldType;
    }

    public void setShieldType(ShieldType shieldType) {
        this.shieldType = shieldType;
    }

    public Integer getProtection() {
        return protection;
    }

    public void setProtection(Integer protection) {
        this.protection = protection;
    }
}
