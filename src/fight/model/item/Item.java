package fight.model.item;

/**
 * @author Сергей
 */
public class Item {

    private String title;
    private int level;
    private Double weight;
    // wear - износ.
    private Double wear;
    private Double cost;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWear() {
        return wear;
    }

    public void setWear(Double wear) {
        this.wear = wear;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
