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
    person2.calculate
    //System.out.println("My name is "+person2.name+", "+"I am "+person2.age+"years old");
    // person2.speak();
    
    int year1 = person1.calculateYearsToRetirement();
    int year2 = person2.calculateYearsToRetirement();
    System.out.println("The person 1 has this number of years until retirement: " + year1 + "years.");
    System.out.println("The person 2 has this number of years until retirement: " + year2 + "years.");
    
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

  int calculateYearsToRetirement(){
    int years = 65-age;
    return years;
  }
  
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
