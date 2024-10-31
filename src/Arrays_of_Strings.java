public class Arrays_of_Strings {
  public static void main(String[] args) {
    int[] numbers = new int[5];
    numbers[0] = 10;
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);

    Strings[] strings = new Strings[3];
    strings[0] = "Hello";
    strings[1] = "Bye";
    strings[2] = "Java";

    System.out.println(strings[0]);
    System.out.println(strings[2]);

    for(int i = 0; i<strings.length; i++){
      System.out.println(strings[i]);
    }
  } 
}
