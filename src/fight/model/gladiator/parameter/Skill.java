package fight.model.gladiator.parameter;

import fight.model.weapon.WeaponType;

/**
 * @author Сергей
 */
public class Skill {

    private WeaponType weaponType;
    private int hourOfTraining;
    private int countOfAttack;
    private int countOfBlock;
    private int kills;

    // TODO: добавить параметры: количество успешных атак, блоков; количество контратак; день последний тренировки; день последнего боя;


    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getHourOfTraining() {
        return hourOfTraining;
    }

    public void setHourOfTraining(int hourOfTraining) {
        this.hourOfTraining = hourOfTraining;
    }

    public int getCountOfAttack() {
        return countOfAttack;
    }

    public void setCountOfAttack(int countOfAttack) {
        this.countOfAttack = countOfAttack;
    }

    public int getCountOfBlock() {
        return countOfBlock;
    }

    public void setCountOfBlock(int countOfBlock) {
        this.countOfBlock = countOfBlock;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }
}
