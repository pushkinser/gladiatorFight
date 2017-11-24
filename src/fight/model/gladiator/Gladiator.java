package fight.model.gladiator;

import fight.model.armor.Armor;
import fight.model.gladiator.parameter.Spirit;
import fight.model.human.Human;
import fight.model.gladiator.parameter.Skill;
import fight.model.weapon.Weapon;

import java.util.List;

/**
 * @author Сергей
 */
public class Gladiator extends Human {

    private Weapon weapon;
    private Armor armor;
    private List<Skill> skillList;
    private Spirit spirit;
    private int countSpirit;

    public Gladiator() {
    }

    public Gladiator(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public int getCountSpirit() {
        return countSpirit;
    }

    public void setCountSpirit(int countSpirit) {
        this.countSpirit = countSpirit;
    }
}
