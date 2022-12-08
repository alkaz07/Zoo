package zoo.experimental.mammals;

public class Giraffe {
    String run;
    String eat;
    int height;
    int  age;
    public Giraffe(String run, String eat, int height,int age) {
        this.run = run;
        this.eat = eat;
        if (height < 0)
            this.height = 0;
        else
            this.height = age;
        if (age < 0)
            this.age = 0;
        else
            this.age = age;
    }
    public void eat(){
        System.out.println("Питается зеленью");
        ;}
    public void run(){
        System.out.println("бежит голопом");
    }
}
