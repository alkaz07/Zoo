package zoo;
import zoo.experimental.Dog;
import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {
        exemple1();
    }

    static void exemple1(){
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        int a;
        System.out.println("введите имя, породу и возраст собачки");
        s1 = sc.next();
        s2=sc.next();
        a=sc.nextInt();
        Dog firstDog = new Dog(s1, s2, a);
    }
}


