package fight.model.gladiator;

import fight.model.item.armor.Armor;
import fight.model.gladiator.properties.CalculatedProperties;
import fight.model.gladiator.properties.Experience;
import fight.model.gladiator.properties.ImprovedProperties;
import fight.model.gladiator.properties.InnateProperties;
import fight.model.item.armor.Shield;
import fight.model.item.weapon.Weapon;

/**
 * @author Сергей
 */
public class Gladiator {

    private Double cost;
    private Integer age;
    private String alias;
    private String name;

    private Experience experience;

    private ImprovedProperties improvedProperties;
    private InnateProperties innateProperties;
    private CalculatedProperties calculatedProperties;

    private Weapon weapon;
    private Armor armor;
    private Shield shield;

    private Integer morality;
    private Integer reputation;
    private Integer complacency;
    private Integer nationality;

}
