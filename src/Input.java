// String in package java.lang => all classes java.lang are imported in advance
// Scanner is in java.util
// System.in - standard flow input data

import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    String s = "string";
    String new = new String("default way of object initialization");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter some number");
    //String string = scanner.nextLine();    // reads strings of one line until enter is entered
    int x = scanner.nextInt();
    System.out.println("You entered: "+x);
  }
}
