package Java.Game.Magician;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TheCellar {
    private static Scanner scan = new Scanner(System.in);
    private static int UserInput;

    public static void main(String[]args) throws IOException{
        first();
    }

    public static void first() throws IOException {
        readFromTextFile("TextFiles\\Magician\\Scenes\\TheCellar\\SceneDescription1.txt");

        int i = 0;
        while(i == 0){
            scan.nextLine();
            UserInput = scan.nextInt();

            if (UserInput == 1) {
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheCellar\\1 - SummonAMagicalLight.txt");
                i++;
                SummonAMagicalLightResult();
            } else if (UserInput == 2) {
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheCellar\\2 - CastAFireballForLight.txt");
                i++;
                CastAFireballForLightResult();
            } else {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1' or '2'.");
            }
        }
    }

    public static void SummonAMagicalLightResult() throws IOException{
        while(true) {
            scan.nextLine();
            UserInput = scan.nextInt();

            if (UserInput == 1) {
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheCellar\\CastALightSpellResult\\1 - GrabTheBackpack.txt");
            } else if (UserInput == 2) {
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheCellar\\CastALightSpellResult\\2 - LootTheArea.txt");
            } else if (UserInput == 3) {
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheCellar\\CastALightSpellResult\\3 - LeaveTheCellar.txt");
            } else {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1', '2' or '3'.");
            }
        }
    }

    public static void CastAFireballForLightResult() throws IOException{


        while(true) {
            scan.nextLine();
            UserInput = scan.nextInt();

            if (UserInput == 1) {
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheCellar\\CastAFireballForLightResult\\1 - GrabTheBackpack.txt");
            } else if (UserInput == 2) {
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheCellar\\CastAFireballForLightResult\\2 - LootTheArea.txt");
            } else if (UserInput == 3) {
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheCellar\\CastAFireballForLightResult\\3 - LeaveTheCellar.txt");
            } else {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1', '2' or '3'.");
            }
        }
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
