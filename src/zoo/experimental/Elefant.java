package zoo.experimental;

import java.util.Scanner;

public class Elefant {
    private int weight, age;
    public Elefant(int weight, int age) {
        this.weight = weight;
        if(age<0)
            this.age = 0;
        else
            this.age = age;
    }

    void askhisWeightAge() {
        System.out.println("������� ��� � ������� ����� " + this);
        Scanner scan = new Scanner(System.in);
        this.weight = scan.nextInt();
        this.age = scan.nextInt();
    }
    void eatGrass(int weight1) {

        weight = weight + weight1;
    }
}
