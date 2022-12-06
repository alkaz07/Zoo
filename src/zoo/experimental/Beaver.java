package zoo.experimental;

public class Beaver {
    String name;
    String breed;
    static final String [] allColors = { "черный", "желтый" , "коричневый", "белый", "полосатый" }; //общий для всех бобров и не изменный
    String color;

    public Beaver (String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;

    }

    public void action() {
        System.out.println(name + "маши хвостом");
    }

    public void getVoice() { //
        System.out.println(name);
        say();
    }

    public void say() {
        System.out.println("Где мое бревно?");
    }
    public void buildPlotina  ()
    {
        if(color.equals("черный") || color.equals("коричневый")||color.equals("оранжевый"))
            System.out.println(color + " " + name +"может построить плотину");
        else
            System.out.println(name + " не может строить плотины "+ breed);
    }
}




