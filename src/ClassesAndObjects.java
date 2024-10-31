public class ClassesAndObjects {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Roman";
    person1.age = 50;
    //System.out.println("My name is "+person1.name+", "+"I am "+person1.age+"years old");
    person1.sayHello();
    person1.speak();
  
    Person person2 = new Person();
    person2.name = "Vova";
    person2.age = 20;
    //System.out.println("My name is "+person2.name+", "+"I am "+person2.age+"years old");
    // person2.speak();
    
  }
}

// methods start with lowercase
// classes start with uppercase
class Person{
  //Classes can have:
  // 1. Data (fields)
  // 2. Actions, which he can perform (functions)
  String name;
  int age;
  void speak(){
    for(int i = 0; i<3; i++){
     System.out.println("My name is "+name+", I am "+age+" years old."); 
    }
  }
  void sayHell(){
    System.out.println("Hello");
  }
}


// class test{
// }
// class test2{
// }
