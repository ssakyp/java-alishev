package src.Interfaces;

public class Test {
    public static void main(String[] args){
        Animal animal1 = new Animal(12);
        Person person1 = new Person("Bob");
        animal1.sleep();
        animal1.showInfo();
        person1.sayHello();
        person1.showInfo();

        Info info1 = new Animal(2);
        Info info2 = new Person("Tom");
        info1.showInfo();
        info2.showInfo();

        outputInfo(info1);
        outputInfo(info2);
        outputInfo(animal1);
        outputInfo(person1);
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
