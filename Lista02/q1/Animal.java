package Lista02.q1;

import java. util. ArrayList;

public abstract class Animal {
    long id;
    String name;
    int age;
    double weight;

    ArrayList <String> abilities;

    public Animal(long id, String name, int age, double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.abilities = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract String sound();

    String performAbility(String ability) {
        if (abilities.contains(ability)) {
            return name + " can " + ability;
        } else {
            return name + " can't " + ability;
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + name + " | Idade: " + age + " | Peso: " + weight;
    }

}
