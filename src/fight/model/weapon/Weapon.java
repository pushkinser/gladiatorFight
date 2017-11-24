package fight.model.weapon;

/**
 * @author Сергей
 */
public class Weapon {

    private WeaponType TYPE;
    private String title;
    private Double mass;

    public Weapon(WeaponType TYPE) {
        this.TYPE = TYPE;
    }

    public WeaponType getTYPE() {
        return this.TYPE;
    }

    public String getTitle() {
        return this.title;
    }

    public Double getMass() {
        return this.mass;
    }
}
