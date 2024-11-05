package src8;

interface AbleToEat {
    public void eat();
}

class Animal implements AbleToEat{
    public void eat(){
        System.out.println("Animal is eating...");
    }
}

class OtherAnimal extends Animal{
    public void eat(){
        System.out.println("Other animal is eating...");
    }
}

public class Test {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.eat();

        OtherAnimal otherAnimal = new OtherAnimal();
        otherAnimal.eat();


        Animal animal1 = new Animal(){
            public void eat(){
                System.out.println("Other animal is eating...");
            }
        };

        animal1.eat();

        AbleToEat ableToEat = new Animal();
        ableToEat.eat();

        AbleToEat ableToEat1 = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
        ableToEat1.eat();
    }

}
