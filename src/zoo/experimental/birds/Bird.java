package zoo.experimental.birds;

import zoo.experimental.Animal;

import java.util.Scanner;

public abstract class Bird extends Animal {
    public String species;
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
        super(name,age,weight);
        System.out.println("запущен конструктор Bird с параметрами");
        this.species = species;
        this.flyable = flyable;
    }

    public Bird() {
        System.out.println("запущен конструктор Bird без параметров");
    }

    public  void fromString(String str)
    {
        str = str.replace(';', ' ').replace('.', ',');
        Scanner scanner = new Scanner(str);
        name = scanner.next();
        setAge( scanner.nextInt());
        setWeight( scanner.nextDouble());
    }
}
