package zoo.experimental;

public class Bird {
    public String species;
    public String name;
    public int age;
    protected double weight;
    boolean flyable;
    final boolean FEATHERS = true;
    final boolean BEAK = true;

    public boolean hasFeathers() {
        return FEATHERS;
    }

    public boolean hasBeak() {
        return BEAK;
    }
    public void setFlyable(boolean f) {
        flyable = f;
    }
    public boolean isFlyable() {
        return flyable;
    }
}
