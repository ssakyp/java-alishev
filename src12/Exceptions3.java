package src12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args){
        // Checked Exception = Compile time exception = исключительные случае в работе программы
        // Unchecked Exception = Runtime exception = ошибка в работе программы

        File file = new File("ss");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("sss");
        }

        //int a = 1 / 0; // unchecked exception
        //String name = null;
        //name.length(); // run time exception
        int[] arr = new int[2];
        //System.out.println(arr[2]); // runtime exception
    }
}
