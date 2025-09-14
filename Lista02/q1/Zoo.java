package Lista02.q1;

import java. util. ArrayList;

public class Zoo {

    ArrayList <Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public ArrayList<Animal> listAnimals() {
        return animals;
    }

    public boolean removeAnimal(Long id) {
        return animals.removeIf(a -> a.getId() == id);
    }

    public Animal getAnimalById(long id) {
        for (Animal a : animals) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

}
