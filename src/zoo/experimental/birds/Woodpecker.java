package zoo.experimental.birds;

public class Woodpecker extends Bird {
    private double lucky = 0.05;
    static final double MIN_LUCK = 0.001;
    static final double MAX_LUCK = 0.999;

    public Woodpecker() {
        System.out.println("������� ����������� Woodpecker ��� ����������");
        this.species = "�����";
        this.flyable = true;
    }
    public Woodpecker(String name, int age, double weight) {
        super("�����", name, age, weight,true);
        System.out.println("������� ����������� Woodpecker � �����������");
/*        this.species = "�����";
        this.flyable = true;
        this.name = name;
        this.age = age;
        this.weight = weight;*/
    }

    @Override
    public void move() {

    }

    public Woodpecker( String name, int age, double weight,  double lucky) {
        super("�����", name, age, weight, true);
        System.out.println("������� ����������� Woodpecker � ����������� � ������");
        setLucky(lucky);
    }

    public void knocks() {
        try {
            while (true) {
                if (Math.random() < 1 - lucky) {
                    System.out.println("����� ���������� �������!");
                } else {
                    System.out.println("����� ������� ������� � ���������� �� ������ ������");
                    break;
                }
                Thread.sleep(444);
            }
        }
        catch (Exception e) {
            System.out.println("����� ����������");
        }
    }

    public void setLucky(double luck) {
        if (luck < MIN_LUCK)
            luck = MIN_LUCK;
        if (luck >MAX_LUCK)
            luck = MAX_LUCK;
        this.lucky = luck;
    }

    //    ��� �����:
//    public static void main (String[] args) {
//        Woodpecker woody = new Woodpecker("Woody",32,1.8);
//        woody.knocks();
//    }
}
