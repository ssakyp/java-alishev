package src5;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog(); // upcasting восходящее преобразование

        Dog dog = new Dog();
        // Upcasting - восходящее преобразование
        Animal animal2 = dog;

        // Downcasting - нисходящее преобразование not safe
        Dog dog2 = (Dog) animal2;
        dog2.bark();


        Animal animal3 = new Animal();
        Dog dog3 = (Dog) animal3;
        dog3.bark();
    }
}
