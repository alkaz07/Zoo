package zoo.experimental.birds;

public class Lark extends Bird{
  String  Sing;


 public Lark (String Name,String Fly,String Sing,int Age){
     this.name=Name;
     //преобразовать String в boolean
     this.Sing=Sing;
     if (Age<0)
         this.age=0;
     else
         this.age=Age;

 }
 public void Fly (){
     System.out.println("Улетает на юг");
 }
 public  void Sing(){
     System.out.println("Чрик-чрик-чрик");

 }

}
