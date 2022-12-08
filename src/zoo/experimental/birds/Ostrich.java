package zoo.experimental.birds;

public class Ostrich extends Bird {
    public double egg = 0.01;
    public Ostrich(String name, int age, double weight) {
        this.species = "Страус";
        this.flyable = false;
        this.name = name;
        this.weight = weight;
        if (age < 0)
            this.age = 0;
        else
            this.age = age;
    }
    public void fatality() {
        System.out.println("Страус нокаутировал смотрителя зоопарка");
    }
    public void run() {
        System.out.println("Страус убежал");
    }
    public void layEgg() {
        try {
            while (true) {
                if (Math.random() < 1 - egg) {
                    System.out.println("Яичница скоро будет");
                } else {
                    System.out.println("Egg is downloading now");
                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println("Страуса на мясо");
        }

    }
}
