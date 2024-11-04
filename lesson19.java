public class lesson19 {
    public static void main(String[] args) {
        MyHuman human1 = new MyHuman();
        human1.setName("Tim");
        human1.setAge(18);
        human1.getInfo();

        MyHuman human2 = new MyHuman();
        human2.setName("Tom");
        human2.setAge(10);
        human2.getInfo();
    }
    

}

class MyHuman{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo(){
        System.out.println(name+", "+age);
    }
}
