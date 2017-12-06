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

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public ImprovedProperties getImprovedProperties() {
        return improvedProperties;
    }

    public void setImprovedProperties(ImprovedProperties improvedProperties) {
        this.improvedProperties = improvedProperties;
    }

    public InnateProperties getInnateProperties() {
        return innateProperties;
    }

    public void setInnateProperties(InnateProperties innateProperties) {
        this.innateProperties = innateProperties;
    }

    public CalculatedProperties getCalculatedProperties() {
        return calculatedProperties;
    }

    public void setCalculatedProperties(CalculatedProperties calculatedProperties) {
        this.calculatedProperties = calculatedProperties;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public Integer getMorality() {
        return morality;
    }

    public void setMorality(Integer morality) {
        this.morality = morality;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public Integer getComplacency() {
        return complacency;
    }

    public void setComplacency(Integer complacency) {
        this.complacency = complacency;
    }

    public Integer getNationality() {
        return nationality;
    }

    public void setNationality(Integer nationality) {
        this.nationality = nationality;
    }
}
