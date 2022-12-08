package zoo.experimental.mammals;

public class Bear {
    String color;
    String breed;
    int age;
    public Bear(String color, String breed, int age){
        this.color = color;
        this.breed = breed;
        if(age<0)
            this.age = 0;
        else
            this.age=age;
    }
    public void getVoice(){
        System.out.println(color);
        growl();
}

    private void growl()
    {
        System.out.println("rrrrrrrr");
    }

    public void catchTheFish()
    {
        if(breed.equals("�����") || breed.equals("�����")||breed.equals("������")  )
            System.out.println(color + " ���� � ����");
        if (breed.equals("�����"))
            System.out.println(color + " ���� �� �����"+breed);
    }
}

