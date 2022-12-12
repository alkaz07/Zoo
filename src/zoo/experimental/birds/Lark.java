package zoo.experimental.birds;

import java.util.ArrayList;

abstract public class Lark extends Bird{
  String  Sing;


 public Lark (String name,String Fly,String Sing,int age,double weight){
     super("Жаворонок",name, age, weight, false);
     /*this.weight = weight;
     this.name=name;
     //преобразовать String в boolean
     this.Sing=Sing;
     if (age<0)
         this.age=0;
     else
         this.age=age;*/

 }
 public void Fly (){
     System.out.println("Улетает на юг");
 }
 public  void Sing(){
     System.out.println("Чрик-чрик-чрик");

 }
 public void move(){
     System.out.println("Передвигается прыжками ");
 }

    @Override
    public  void move() {

            if(age<0)
                this.age=0;
            else
                this.age = age;

    }
    public void setWeight(double weight) {
        if(weight<0)
            this.weight =0;
        else
            this.weight = weight;
    }
    public void _Lark()
        {
        ArrayList<String> Lark = new ArrayList<String>();
        Lark.add("name");
        Lark.add("age");
        Lark.add("weight");
        Lark.add("fly");
        Lark.add("sing");


        System.out.println(Lark.get(1));
    }
}
