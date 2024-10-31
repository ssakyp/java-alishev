public class Arrays {
  public static void main(String[] args) {
    // char c = 'q';  // primitive data type
    // String s = "Hello";
    // String s1 = new String("Hello");
    int num = 10;  // [10]  primitive data type bool, char, int, short, long
    int[] numbers = new int[5];     // size of array  //numbers -> [array] refernce data type
    for(i = 0; i<numbers.length; i++){
      numbers[i] = i*10
    }
    for(i = 0; i<numbers.length; i++){
      System.out.println(numbers[i]);
    }
    System.out.println();
    int[] numbers1 = {1, 2, 3};
    for(i = 0; i<numbers1.length; i++){
      System.out.println(numbers1[i])
    }
  }
}
