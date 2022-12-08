package zoo.experimental;

abstract public class Animal {
    public String name;
    public int age;
    protected double weight;

    public Animal() {
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        setAge(age);
        setWeight(weight);
    }

    public abstract void move();

    public void setAge(int age) {
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
}
