package zoo.experimental.birds;

public class Woodpecker extends Bird {
    public double lucky = 0.05;
    public Woodpecker() {
        this.species = "Дятел";
        this.flyable = true;
    }
    public Woodpecker(String name, int age, double weight) {
        this.species = "Дятел";
        this.flyable = true;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void knocks() {
        try {
            while (true) {
                if (Math.random() < 1 - lucky) {
                    System.out.println("Дятел продолжает стучать!");
                } else {
                    System.out.println("Дятел находит червяка и перелетает на другое дерево");
                    break;
                }
                Thread.sleep(444);
            }
        }
        catch (Exception e) {
            System.out.println("Дятел достучался");
        }
    }
//    Для теста:
//    public static void main (String[] args) {
//        Woodpecker woody = new Woodpecker("Woody",32,1.8);
//        woody.knocks();
//    }
}
