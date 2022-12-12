package zoo.experimental.birds;

import zoo.experimental.Animal;

public abstract class Bird extends Animal {
    public String species;
    boolean flyable;
    final boolean FEATHERS = true;
    final boolean BEAK = true;

    public boolean hasFeathers() {
        return FEATHERS;
    }

    public boolean hasBeak() {
        return BEAK;
    }
    public void setFlyable(boolean f) {
        flyable = f;
    }
    public boolean isFlyable() {
        return flyable;
    }

    public Bird(String species, String name, int age, double weight, boolean flyable) {
        super(name,age,weight);
        System.out.println("������� ����������� Bird � �����������");
        this.species = species;
        this.flyable = flyable;
    }

    public Bird() {
        System.out.println("������� ����������� Bird ��� ����������");
    }

    public abstract void fromString(String str);    //TODO: ���� ������� ����� �����������
                                                    //"����������" �� ������ ����������,
                                                    //����������� ;
    //        str.replace(';', ' ');
    //        Scanner scanner = new Scanner(str);
    //        name = scanner.next();
    //        age = scanner.nextInt();
    //        weight = scanner.nextDouble();

}
