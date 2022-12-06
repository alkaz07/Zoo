package zoo;

public class Monkey {
    String species;
    String gender;
    String name;

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

    void wave() {
        System.out.println(nameOfMonkey() + " машет вам рукой");
    }

    void feed(String whatToGive) {
        if (whatToGive.equals("Банан")||whatToGive.equals("банан")||whatToGive.equals("banana")) {
            System.out.println(nameOfMonkey()+" съедает "+ whatToGive+ " и просит еще");
        }
        else {
            System.out.println(nameOfMonkey() + " убегает");
        }
    }

    private String nameOfMonkey() {
        if (species == null && name != null) return "Обезъянка " + name;
        if (species != null && name == null) return species;
        if (species == null && name == null) return "";
        if (species != null && name != null) return species + " " + name;
        else return "Обезъянка ";
    }
    // Код для теста
//    Monkey kapucin = new Monkey("kapucin","male");
//        kapucin.wave();
//        kapucin.feed("banana");
}
