package src7;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(12));
        listOfAnimals.add(new Animal(34));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimals);
        test(listOfDogs);


        /*
        Object
        <- super Animal extends->
        Dog
         */
    }

    private static void test(List<? extends Animal> list){
        for(Animal animal : list){
            animal.eat();
        }
    }
}
