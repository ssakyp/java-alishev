public class lesson23 {
    public static void main(String[] args){
        String s = "Hello";
        String s2 = s.toUpperCase();
        System.out.println(s + ", " + s2);
        // String s1 = "Hello";
        // String s3 = " my";
        // String s4 = " friend";
        // String stringAll = s1+s3+s4;
        // System.out.println(stringAll);
        StringBuilder sb = new StringBuilder("Hello ");
        System.out.println(sb.toString());
        sb.append("my").append(" friend");
        System.out.println(sb.toString());
    }
}
