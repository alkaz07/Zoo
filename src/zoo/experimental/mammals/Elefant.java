package zoo.experimental.mammals;

import java.util.Scanner;

public class Elefant extends Mammal{
    //private int weight;
    //public int age;
    public Elefant(int weight, int a) {
        this.weight = weight;
        if(a<0)
            this.age = 0;
        else
            age = a;
    }

    public int getWeight() {
        return (int) weight;
    }

    public void becomeOlder()
    {
        age++;
    }

    void askhisWeightAge() {
        System.out.println("введите вес и возраст слона " + this);
        Scanner scan = new Scanner(System.in);
        this.weight = scan.nextInt();
        this.age = scan.nextInt();
    }
    public void eatGrass(int weight1) {

        weight = weight + weight1;
    }
}
