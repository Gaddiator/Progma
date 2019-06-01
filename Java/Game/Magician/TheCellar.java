package Java.Game.Magician;

import Java.Logic.Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TheCellar {

    public static void main(String[]args) throws IOException{
        first();
    }

    public static void first() throws IOException {
        readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheCellar\\SceneDescription.txt");

        int i = 0;
        while(i == 0){
            Utilities.UserInput = Utilities.scan.nextInt();

            if (Utilities.UserInput == 1) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheCellar\\1 - SummonAMagicalLight.txt");
                i++;
                SummonAMagicalLightResult();
            } else if (Utilities.UserInput == 2) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheCellar\\2 - CastAFireballForLight.txt");
                i++;
                CastAFireballForLightResult();
            } else {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1' or '2'.");
            }
        }
    }

    public static void SummonAMagicalLightResult() throws IOException{

        int i = 0;
        while(i == 0) {
            Utilities.UserInput = Utilities.scan.nextInt();

            if (Utilities.UserInput == 1) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheCellar\\CastALightSpellResult\\1 - GrabTheBackpack.txt");
            } else if (Utilities.UserInput == 2) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheCellar\\CastALightSpellResult\\2 - LootTheArea.txt");
            } else if (Utilities.UserInput == 3) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheCellar\\CastALightSpellResult\\3 - LeaveTheCellar.txt");
            } else {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1', '2' or '3'.");
            }
        }
    }

    public static void CastAFireballForLightResult() throws IOException{

        int i = 0;
        while(i == 0) {
            Utilities.UserInput = Utilities.scan.nextInt();

            if (Utilities.UserInput == 1) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheCellar\\CastAFireballForLightResult\\1 - GrabTheBackpack.txt");
            } else if (Utilities.UserInput == 2) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheCellar\\CastAFireballForLightResult\\2 - LootTheArea.txt");
            } else if (Utilities.UserInput == 3) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheCellar\\CastAFireballForLightResult\\3 - LeaveTheCellar.txt");
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