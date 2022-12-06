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
        System.out.println("���-���-���");
    }

    public void guideSheeps()
    {
        if(breed.equals("�������") || breed.equals("�����")||breed.equals("��������"))
            System.out.println(name+" ����� ����� ����, ��� �����?");
        else
            System.out.println(name + " �� ����� ����� ����, ����� � ��� "+breed);
    }
}
