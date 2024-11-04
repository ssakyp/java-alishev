package src3;

public class Test {
    public static void main(String[] args) {
        byte x = 123; // -128 - 127 8bits
        long y = 123; // 64bits
        double a = 12.1; // 64bits
        float b = (float)12.3; // 32bits


        float f = 123.3f;
        long l = 123L; // не явное

        int x1 = (int)l; // явное приведение типа

        double d = x1;
        long l1 = Math.round(d);
        System.out.println(x1);


        byte b1 = (byte)130;
        System.out.println(b1);
    }
}
