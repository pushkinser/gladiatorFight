package fight.model.gladiator;

import fight.model.armor.Armor;
import fight.model.gladiator.properties.CalculatedProperties;
import fight.model.gladiator.properties.Experience;
import fight.model.gladiator.properties.ImprovedProperties;
import fight.model.gladiator.properties.InnateProperties;
import fight.model.weapon.Weapon;

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

    private Integer morality;
    private Integer reputation;
    private Integer complacency;
    private Integer nationality;

}
