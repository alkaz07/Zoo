package zoo.experimental;

public class Hedgehog {
    String nickname;
    int age;
    int length;
    double weight;

    public Hedgehog(String nickname, int age, int length, double weight) {
        this.nickname = nickname;
        this.age = age;
        this.length=length;
        this.weight=weight;
    }
    public void toStomp() {
        System.out.println("Топ-топ-топ");
    }
    public void toEat() {
        System.out.println("Хрум-хрум");
    }
    public void toSleap() {
        System.out.println("Ежик спит");
    }
}
