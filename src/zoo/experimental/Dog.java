package zoo.experimental;

public class Dog{
    String name;
    String breed;
    int age;
    public Dog(String name, String breed, int age)     {
        this.name = name;
        this.breed = breed;
        if(age<0)
            this.age = 0;
        else
            this.age=age;
    }

    public void getVoice(){
        System.out.println(name);
        bark();
    }

    private void bark()
    {
        System.out.println("гав-гав-гав");
    }

    public void guideSheeps()
    {
        if(breed.equals("овчарка") || breed.equals("лайка")||breed.equals("дворн€га"))
            System.out.println(name+" может пасти овец, где стадо?");
        else
            System.out.println(name + " не может пасти овец, потом у что "+breed);
    }
}
