package src10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Handling exception in main.");;
        }
//        File file = new File("test2");
//        try {
//            Scanner scanner = new Scanner(file);
//            System.out.println("After scanner.");
//        } catch (FileNotFoundException e) {
//            //throw new RuntimeException(e);
//            System.out.println("File was not found.");
//        }
//
//        System.out.println("After try catch");
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("test2");
        Scanner scanner = new Scanner(file);
    }
}
