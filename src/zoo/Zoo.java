package zoo;
import zoo.experimental.mammals.*;
import zoo.experimental.birds.*;
import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {
        example3();
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

        Object[] massiv = new Object[4];
        massiv[0] = e1;
        massiv[1] = e2;
        massiv[2] = b2;
        massiv[3] = b1;
        for (Object ob: massiv  ) {
            if(ob instanceof Beaver){
                Beaver beaver = (Beaver) ob;
                beaver.buildPlotina();
            }
            if (ob instanceof Elefant){
                ((Elefant) ob).eatGrass(10);
                System.out.println("слон весит "+((Elefant) ob).getWeight());
            }


        }
        Mammal[] group = new Mammal[massiv.length];
        /*for (int i = 0; i < massiv.length ; i++) {
            group[i] = (Mammal) massiv[i];
        }*/
        group[0] = b1;
        group[1] = e2;
        group[2] = b2;
        group[3] = new Monkey("орангутан", "male", "Эдик");
        for (Mammal beast : group){
            System.out.println(beast.name);
            if(beast instanceof Beaver)
                ((Beaver) beast).say();
            if(beast instanceof Monkey)
                ((Monkey) beast).wave();

        }

    }
    static void example3() {
        Bird bird1 = new Bird();
        Bird bird2 = new Ostrich("Паша", 11, 60);
        bird1.setFlyable(true);
        bird2.setFlyable(true);


        ((Ostrich) bird2).fatality();
        Woodpecker bird3 = new Woodpecker("Вуди", 5, 0.7);
     //   ((Ostrich) bird1).fatality();  // ClassCastException
        System.out.println(bird1.name);
        System.out.println(bird2.name);
        System.out.println(bird3.name);
        bird3.setLucky(-32);
        Woodpecker bird4 = new Woodpecker("Голди",6, 0.8, 0.36);
        bird4.knocks();
    }
}


