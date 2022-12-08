package zoo.experimental.birds;

public class Woodpecker extends Bird {
    private double lucky = 0.05;
    static final double MIN_LUCK = 0.001;
    static final double MAX_LUCK = 0.999;

    public Woodpecker() {
        System.out.println("запущен конструктор Woodpecker без параметров");
        this.species = "ƒ€тел";
        this.flyable = true;
    }
    public Woodpecker(String name, int age, double weight) {
        super("ƒ€тел", name, age, weight,true);
        System.out.println("запущен конструктор Woodpecker с параметрами");
/*        this.species = "ƒ€тел";
        this.flyable = true;
        this.name = name;
        this.age = age;
        this.weight = weight;*/
    }

    @Override
    public void move() {

    }

    public Woodpecker( String name, int age, double weight,  double lucky) {
        super("ƒ€тел", name, age, weight, true);
        System.out.println("запущен конструктор Woodpecker с параметрами и удачей");
        setLucky(lucky);
    }

    public void knocks() {
        try {
            while (true) {
                if (Math.random() < 1 - lucky) {
                    System.out.println("ƒ€тел продолжает стучать!");
                } else {
                    System.out.println("ƒ€тел находит черв€ка и перелетает на другое дерево");
                    break;
                }
                Thread.sleep(444);
            }
        }
        catch (Exception e) {
            System.out.println("ƒ€тел достучалс€");
        }
    }

    public void setLucky(double luck) {
        if (luck < MIN_LUCK)
            luck = MIN_LUCK;
        if (luck >MAX_LUCK)
            luck = MAX_LUCK;
        this.lucky = luck;
    }

    //    ƒл€ теста:
//    public static void main (String[] args) {
//        Woodpecker woody = new Woodpecker("Woody",32,1.8);
//        woody.knocks();
//    }
}
