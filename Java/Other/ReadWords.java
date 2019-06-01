package Java.Other;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadWords {
    public static void main(String[] args) {
        int numberOFWords = 0;

        File file = new File("path\\to\\file.txt");
        try (
                Scanner scan = new Scanner(file)) {
            while (scan.hasNext()) {
                scan.next();
                numberOFWords++;
            }
            System.out.println("Number of words: " + numberOFWords);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}