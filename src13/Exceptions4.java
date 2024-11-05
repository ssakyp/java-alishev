package src13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) { // IOException | ParseException e
            throw new RuntimeException(e);
        }
    }

    public static void run() throws IOException, FileNotFoundException, IllegalArgumentException, ParseException {

    }
}
