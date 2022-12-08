package zoo.experimental.birds;

public class Chiken extends Bird {
    static final String[] allColors = {"желтая", "красная", "черная", "коричневая"};
    String color;
    static final String[] allBreeds = {"несушка", "декоративная", "мясная", "бойцовская"};
    String breed;
    //String name;
    //int age;

    public Chiken(String color, String breed, String name, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.name = name;
        this.flyable=false;
    }

    public void say() {
        System.out.println("ко-ко-ко");
    }

    public void KFClunch() {
        if (breed.equals("мясная") || breed.equals("бойцовская"))
            System.out.println(breed + " " + "курочка была вкусной");
        else
            System.out.println(breed + " " + "курочка не входит в наше меню");
    }

    void feed(String GiveToEgg) {
        if (GiveToEgg.equals("снеси яйцо") || GiveToEgg.equals("хочу яичницу"))
            System.out.println(this.name + "несушка" + GiveToEgg);
    }

}

