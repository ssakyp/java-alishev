public class ClassesAndObjects {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Roman";
    person1.age = 50;
    System.out.println("My name is "+person1.name+", "+"I am "+person1.age+"years old");
    
    Person person2 = new Person();
    person2.name = "Vova";
    person2.age = 20;
     System.out.println("My name is "+person2.name+", "+"I am "+person2.age+"years old");
    
  }
}

class Person{
  //Classes can have:
  // 1. Data (fields)
  // 2. Actions, which he can perform (functions)
  String name;
  int age;
}


// class test{
// }
// class test2{
// }
