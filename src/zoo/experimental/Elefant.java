package zoo.experimental;

import java.util.Scanner;

public class Elefant {
    private int weight, age;
    public Elefant(int weight, int a) {
        this.weight = weight;
        if(a<0)
            this.age = 0;
        else
            age = a;
    }

    void askhisWeightAge() {
        System.out.println("введите вес и возраст слона " + this);
        Scanner scan = new Scanner(System.in);
        this.weight = scan.nextInt();
        this.age = scan.nextInt();
    }
    void eatGrass(int weight1) {

        weight = weight + weight1;
    }
}
