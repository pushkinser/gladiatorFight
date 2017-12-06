package fight.model.item.armor;

import fight.model.item.Item;

/**
 * @author Сергей
 */
public class Armor extends Item {

    private ArmorType armorType;
    private Integer protection;

    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }

    public Integer getProtection() {
        return protection;
    }

    public void setProtection(Integer protection) {
        this.protection = protection;
    }
}
