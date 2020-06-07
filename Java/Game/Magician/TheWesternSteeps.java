package Java.Game.Magician;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TheWesternSteeps {
    public static void main(String[] args) {
        first();
    }

    public static void first() {
        readFromTextFile("TextFiles\\Magician\\Scenes\\TheWesternSteeps\\EndDemo.txt");
    }

    private static void readFromTextFile(String pathToFile) {
        try (BufferedReader FileReader = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = FileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error file not found\n" + e);
        }
    }
}
