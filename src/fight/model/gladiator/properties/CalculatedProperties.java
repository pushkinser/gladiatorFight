package fight.model.gladiator.properties;

/**
 * @author Сергей
 */
public class CalculatedProperties {

    private Integer health;
    private Integer parry;
    private Integer impactForce;
    private Integer critical;
    private Integer learnability;

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getParry() {
        return parry;
    }

    public void setParry(Integer parry) {
        this.parry = parry;
    }

    public Integer getImpactForce() {
        return impactForce;
    }

    public void setImpactForce(Integer impactForce) {
        this.impactForce = impactForce;
    }

    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public Integer getLearnability() {
        return learnability;
    }

    public void setLearnability(Integer learnability) {
        this.learnability = learnability;
    }
}
