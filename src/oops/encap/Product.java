package oops.encap;

public class Product {
    private int id;
    private String name;
    private float mrp;
    private String description;
    private boolean isGDP;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMrp() {
        return mrp;
    }

    public void setMrp(float mrp) {
        this.mrp = mrp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isGDP() {
        return isGDP;
    }

    public void setGDP(boolean GDP) {
        isGDP = GDP;
    }
}
