package src15;

public class Test {
    public static void main(String[] args){
        int x = 1;
        int y = 1;
        System.out.println(x==y);

        //    animal ->          {1}
        //    animal1 ->          {1}
        Animal animal = new Animal(1);
        Animal animal1 = animal;
        System.out.println(animal1 == animal);
        System.out.println(animal.equals(animal1));
//        Object object = new Object();
//        object.equals();

        String string1 = "Hello";           // string1  &  string2   ->      {"Hello"}
        String string2 = "Hello";
        System.out.println(string1.equals(string2));

        String string3 = new String("Hello");
        String string4 = new String("Hello");
        System.out.println(string3==string4);

        String string5 = "Hello";
        String string6 = "Hello543".substring(0,5);
        System.out.println(string5==string6);
    }
}

class Animal{
    private int id;

    public Animal(int id){
        this.id = id;
    }

    public boolean equals(Object obj){
        // downcasting
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
