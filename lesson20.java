public class lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 22);
        // human1.setName("Tom");
        // human1.setAge(12);
        human1.getInfo();
    }
}

class Human {
    // public Human(){
    //     System.out.println("Hello from first constructor!");
    // }
    private String name;
    private int age;

    // public Human(String name){
    //     System.out.println("Hello from the second constructor");
    //     this.name = name;
    // }

    public Human(){
        this.name = "Default name";
        this.age = 0;
    }

    public Human(String name, int age) {
        System.out.println("Hello from the third constructor");
        this.name = name;
        this.age = age;
    }
    public void getInfo(){
        System.out.println(name+", "+age);
    }
    public void setName(String name) {this.name = name; }
    public void setAge(int age) {this.age = age;}
}