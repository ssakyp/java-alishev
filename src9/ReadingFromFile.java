package src9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        //String separator = File.separator;
        //String path = separator + "Users" + separator + "mac" + separator+ "Desktop" + separator +"test";
        File file = new File("test2");


        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for(String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
//        while(scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }

        scanner.close();
    }
}
