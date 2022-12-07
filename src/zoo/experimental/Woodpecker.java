package zoo.experimental;

public class Woodpecker extends Bird {
    public Woodpecker() {
        this.species = "ƒ€тел";
        this.flyable = true;
    }
    public Woodpecker(String name, int age, double weight) {
        this.species = "ƒ€тел";
        this.flyable = true;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void knocks() {
        while (true) {
            if (Math.random() < 0.95) {
                System.out.println("ƒ€тел продолжает стучать!");
            } else {
                System.out.println("ƒ€тел находит черв€ка и перелетает на другое дерево");
                break;
            }
        }
    }
}
