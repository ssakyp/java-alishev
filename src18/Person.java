package src18;

import java.io.Serializable;

public class Person implements Serializable {
    //private static final long serialVersionUID = -3722203743604454371;
    private transient int id;
    private String name;

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return id + " : " + name;
    }
}
