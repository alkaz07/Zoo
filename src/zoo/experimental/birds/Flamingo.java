package zoo.experimental.birds;

import java.util.Scanner;

public class Flamingo extends Bird {

      public Flamingo (String name, int age, double weight) {
          super ("‘ламинго", name, age, weight, true);
          System.out.println("запущен конструктор flamingo без параментов");
      }

    @Override
    public void move() {

    }


}
