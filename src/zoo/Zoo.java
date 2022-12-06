package zoo;
import zoo.experimental.Bear;
import zoo.experimental.Beaver;
import zoo.experimental.Dog;
import zoo.experimental.Elefant;

import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {
        example2();
    }

    static void example1(){
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        int a;
        System.out.println("введите имя, породу и возраст собачки");
        s1 = sc.next();
        s2=sc.next();
        a=sc.nextInt();
        Dog firstDog = new Dog(s1, s2, a);
        firstDog.guideSheeps();
    }
    static void example2(){
        Beaver b1, b2;
        b1 = new Beaver("Машка","речной","черный");
        b2 = new Beaver("Сашка", "речной", "белый");
        Elefant e1, e2;
        e1 = new Elefant(125, 90);
        e2 = new Elefant(200, 35);
        b1.action();
        b2.action();
        e1.eatGrass(10);
        e2.eatGrass(7);
        System.out.println("1 слон сейчас весит "+e1.getWeight());
        e1.age = 99;
        e2.becomeOlder();
    }

}


