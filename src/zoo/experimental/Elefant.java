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

    void eatGrass(weight) {

        weight++;
    }

    void askhisWeightAge(weight, age) {
        System.out.println("введите вес и возраст слона " + this);
        Scanner scan = new Scanner(System.in);
        weight = scan.nextFloat();
        age = scan.nextFloat();
    }
}
