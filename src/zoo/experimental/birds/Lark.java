package zoo.experimental.birds;

public class Lark extends Bird{
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

}
