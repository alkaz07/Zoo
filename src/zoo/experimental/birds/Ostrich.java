package zoo.experimental.birds;

public class Ostrich extends Bird {
    public double egg = 0.01;
    static final double MIN_EGG = 0.001;
    static final double MAX_EGG = 0.999;

    public Ostrich(String name, int age, double weight) {
        super("??????", name, age, weight, false);
        System.out.println("??????? ??????????? Ostrich ? ???????????");
        /*this.species = "??????";
        this.flyable = false;
        this.name = name;
        this.weight = weight;
        if (age < 0)
            this.age = 0;
        else
            this.age = age;*/
    }

    @Override
    public void move() {
        run();
    }

    public void fatality() {
        System.out.println("?????? ???????????? ?????????? ????????");
    }
    public void run() {
        System.out.println("?????? ??????");
    }
    public void layEgg() {
        try {
            while (true) {
                if (Math.random() < 1 - egg) {
                    System.out.println("??????? ????? ?????");
                } else {
                    System.out.println("Egg is downloading now");
                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println("??????? ?? ????");
        }

    }


}
