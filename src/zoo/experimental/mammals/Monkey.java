package zoo.experimental.mammals;

public class Monkey extends Mammal {
    String species;
    String gender;


    public Monkey(String species) {
        this.species = species;
    }

    public Monkey(String species, String gender) {
        this.species = species;
        this.gender = gender;
    }

    public Monkey(String species, String gender, String name) {
        this.species = species;
        this.gender = gender;
        this.name = name;
    }

    public void wave() {
        System.out.println(nameOfMonkey() + " ????? ??? ?????");
    }

    public void feed(String whatToGive) {
        if (whatToGive.equals("?????")||whatToGive.equals("?????")||whatToGive.equals("banana")) {
            System.out.println(nameOfMonkey()+" ??????? "+ whatToGive+ " ? ?????? ???");
        }
        else {
            System.out.println(nameOfMonkey() + " ???????");
        }
    }

    private String nameOfMonkey() {
        if (species == null && name != null) return "????????? " + name;
        if (species != null && name == null) return species;
        if (species == null && name == null) return "";
        if (species != null && name != null) return species + " " + name;
        else return "????????? ";
    }

    @Override
    public void move() {
        System.out.println("??????");
        wave();
    }


    // ??? ??? ?????
//    Monkey kapucin = new Monkey("kapucin","male");
//        kapucin.wave();
//        kapucin.feed("banana");
}
