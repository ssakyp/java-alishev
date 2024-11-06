package src20;

public class Test {
    public static void main(String[] args) {
        //someMethod();
        // counter(3);
        // 4! = 4 * 3 * 2 * 1
        // 1! = 1
        // 0! = 1
        System.out.println(fac(4));
        // fac(4)
        // 4 * fac(3) = return 24;
        // 3 * fac(2) = return 6;
        // 2 * fac(1) = return 2;
        // fac(1) = return 1;

    }
    // Stack overflow
    // Methods are stored in Stack
    // someMethod(3) -> someMethod(2) -> someMethod(1)
    // someMethod(3)
    // someMethod(2)
    // someMethod(1)

//    private static void counter(int n){
//        //System.out.println("Hello!");
//        //someMethod();
//        if(n == 0)
//            return;
//        System.out.println("Hello: "+n);
//
//        counter(n-1);
//    }

    private static int fac(int n){
        if(n == 1)
            return 1;
        return n * fac(n-1);

    }
}
