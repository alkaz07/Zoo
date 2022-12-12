package zoo.experimental.birds;

import java.util.Scanner;

public class Woodpecker extends Bird {
    private double luck = 0.05;
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
    }

    public Woodpecker( String name, int age, double weight, double luck) {
        super("ƒ€тел", name, age, weight, true);
        System.out.println("запущен конструктор Woodpecker с параметрами и удачей");
        setLuck(luck);
    }

    @Override
    public void move() {
        if (name == null) {
            System.out.println(species + " взлетает");
        }
        else {System.out.println(name + " взлетает");}
    }

    @Override
    public void fromString(String str) {
        Scanner scanner = new Scanner(str.replace(';',' ').replace('.', ','));
        super.fromString(str);
        scanner.next(); scanner.next(); scanner.next();
        if(scanner.hasNextDouble())
           setLuck(scanner.nextDouble());
    }

    public void knocks() {
        try {
            while (true) {
                if (Math.random() < 1 - luck) {
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

    public void setLuck(double luck) {
        if (luck < MIN_LUCK)
            luck = MIN_LUCK;
        if (luck >MAX_LUCK)
            luck = MAX_LUCK;
        this.luck = luck;
    }

    public double getLuck() {
        return luck;
    }

    //    public static void main(String[] args) {
//        String str = "ƒ€тел; 5; 0,9";
//        Woodpecker wp1 = new Woodpecker();
//        wp1.fromString(str);
//        wp1.luck = 0.15;
//        wp1.knocks();
//        wp1.move();
//        System.out.println(wp1.name+"; "+wp1.age+"; "+wp1.weight);
//    }
}
