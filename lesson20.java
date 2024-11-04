public class lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 22);
        System.out.println(human1);
        // // human1.setName("Tom");
        // // human1.setAge(12);
        // human1.getInfo();

        // Human.description = "Nice";
        // human1.getAllFields();
        // Human.getDescription();
        // Human.description = "Not nice";
        Human human2 = new Human("Tom", 24);
        human1.getNumberOfPeople();
        

        // System.out.println(Math.pow(2, 4));
        // System.out.println(Math.PI);
    }
}

class Human {
    // public Human(){
    //     System.out.println("Hello from first constructor!");
    // }
    private String name;
    private int age;
    public static String description;
    private static int countPeople;
    public static int x;
    // public Human(String name){
    //     System.out.println("Hello from the second constructor");
    //     this.name = name;
    // }

    // public Human(){
    //     this.name = "Default name";
    //     this.age = 0;
    // }

    public Human(String name, int age) {
        System.out.println("Hello from the third constructor");
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void getInfo(){
        System.out.println(name+", "+age);
    }
    public void setName(String name) {this.name = name; }
    public void setAge(int age) {this.age = age;}

    public static void getDescription() {
        System.out.println(description);
    }

    public void getAllFields(){
        System.out.println(name+", "+age+", "+description);
    }

    public static void printAllFields(){
        System.out.println(description);
    }

    public void getNumberOfPeople(){
        System.out.println(countPeople);
    }

    public String toString(){
        return name+", "+age;
    }
}