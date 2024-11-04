package src2;

public class Test {
    public static void main(String[] args){
//        Animal animal = new Animal();
//        Dog dog = new Dog();
//
//        Animal animal1 = new Dog();
//        Dog dog1 = new Dog();
//
//        animal1.eat();
//
//        dog1.bark();
//        dog1.bark();
//
//        animal.eat();
//        dog.eat();
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal){
        animal.eat();
    }
}
