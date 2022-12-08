package zoo.experimental.birds;

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

    public Bird(String species, String name, int age, double weight, boolean flyable) {
        System.out.println("запущен конструктор Bird с параметрами");
        this.species = species;
        this.name = name;
        if (age<0)
            this.age =0;
        else
            this.age = age;
        if(weight <0)
            this.weight=0;
        else
            this.weight = weight;
        this.flyable = flyable;
    }

    public Bird() {
        System.out.println("запущен конструктор Bird без параметров");
    }
}
