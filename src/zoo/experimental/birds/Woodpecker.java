package zoo.experimental.birds;

import java.util.Scanner;

public class Woodpecker extends Bird {
    private double luck = 0.05;
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
    }

    public Woodpecker( String name, int age, double weight, double luck) {
        super("�����", name, age, weight, true);
        System.out.println("������� ����������� Woodpecker � ����������� � ������");
        setLuck(luck);
    }

    @Override
    public void move() {
        if (name == null) {
            System.out.println(species + " ��������");
        }
        else {System.out.println(name + " ��������");}
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
//        String str = "�����; 5; 0,9";
//        Woodpecker wp1 = new Woodpecker();
//        wp1.fromString(str);
//        wp1.luck = 0.15;
//        wp1.knocks();
//        wp1.move();
//        System.out.println(wp1.name+"; "+wp1.age+"; "+wp1.weight);
//    }
}
