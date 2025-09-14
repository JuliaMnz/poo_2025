package Lista02.q1;

public class Cat extends Animal{
    
    public Cat(long id, int age, double weight) {
        super(id, "Whiskers", age, weight);
        this.abilities.add("agility");
    }

    @Override
    public String sound() {
        return name + " says meow ";
    }

}
