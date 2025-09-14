package Lista02.q1;

public class Bird extends Animal {

    public Bird(long id, int age, double weight) {
        super(id, "Tweety", age, weight);
        this.abilities.add("fly");
    }

    @Override
    public String sound() {
        return name + " says piu";
    }

}
