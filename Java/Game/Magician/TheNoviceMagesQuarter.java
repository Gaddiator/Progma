package Java.Game.Magician;

import Java.Logic.PlayerInventory;
import Java.Logic.Character;
import Java.Logic.PlayerSkills;
import Java.Logic.Stats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class TheNoviceMagesQuarter {
    public static void main(String[]args) throws IOException {
        first();
    }

    private static int SceneControl = 0;
    private static int UserInput;
    private static Scanner scan = new Scanner(System.in);

    public static void first() throws IOException {
        readFromTextFile("TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\SceneDescription.txt");
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
