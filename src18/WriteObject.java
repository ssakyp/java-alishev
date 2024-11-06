package src18;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Jack")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

//            oos.writeInt(people.length);
//            for(Person person : people){
//                oos.writeObject(person);
//            }
            oos.writeObject(people);
//            oos.writeObject(person1);
//            oos.writeObject(person2);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
