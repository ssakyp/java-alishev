package src1;

import src1.Package1.Person;

public class Test extends Person{
    public int id;
    String name;
    protected int age;

    public static void main(String[] args) {
        // public
        // private
        // default - available across this package
        // protected - available across one package, available to all sub classes, even
        // if they are out of the package
        // java file class needs to be public
        // there cannot be two public classes
        // classes cannot be private or protected
        Person person1 = new Person();
        person1.surname = "John";
        System.out.println(Person.CONSTANT);
    }

    private void technicalMethod() {
    }
    public Test(){
        address = "Astana";
    }
}

class Test2{

}
