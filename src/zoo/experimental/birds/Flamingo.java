package zoo.experimental.birds;

import java.util.Scanner;

public class Flamingo extends Bird {

      public Flamingo (String name, int age, double weight) {
          super ("��������", name, age, weight, false);
          System.out.println("������� ����������� flamingo ��� ����������");
      }

    @Override
    public void move() {

    }

    @Override
    public void fromString(String str) {
        str.replace(';', ' ');
        Scanner scanner = new Scanner(str);
        name = scanner.next();
        age = scanner.nextInt();
        weight = scanner.nextDouble();
    }
}
