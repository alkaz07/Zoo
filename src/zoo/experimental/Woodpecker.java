package zoo.experimental;

public class Woodpecker extends Bird {
    public double lucky = 0.05;
    public Woodpecker() {
        this.species = "�����";
        this.flyable = true;
    }
    public Woodpecker(String name, int age, double weight) {
        this.species = "�����";
        this.flyable = true;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void knocks() {
        try {
            while (true) {
                if (Math.random() < 1 - lucky) {
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
//    ��� �����:
//    Woodpecker woody = new Woodpecker("Woody",32,1.8);
//    woody.knocks();
}
