package src16;

public class Electrocar {
    private int id;
    public static int test;

    // вложенный не статический класс
    private class Motor{
        public void startMotor(){
            System.out.println("Engine " + id + " is starting...");
        }
    }

    // статические вложенные класс
    public static class Battery{
        public void chargeBatter(){
            System.out.println("Batter is charging..."+test);
        }
    }
    public Electrocar(int id){
        this.id = id;
    }

    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar "+id+" is starting...");

        final int x = 1;
        // вложенный класс внутри методов
        class SomeClass {
            public void someMethod(){
                System.out.println(x+id);
            }
        }
        SomeClass someClass = new SomeClass();
        test(someClass);
    }

    private void test(Object obj){

    }
}
