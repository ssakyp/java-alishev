package src6;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /////// Java 5 //////
        Animal ourAnimal = new Animal();
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(1);
        System.out.println(animal);

        /////// Creation of Generics ///////
        List<String> animals1 = new ArrayList<String>();
        animals1.add("cat");
        animals1.add("dog");
        animals1.add("frog");

        String animal2 = animals1.get(0);


        ////// Java 7 //////
        List<String> animals3 = new ArrayList<>();
    }
}

class Animal {

}