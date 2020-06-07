package Java.Game.Rouge;

import Java.Logic.PlayerInventory;
import Java.Logic.PlayerSkills;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class RougeAwakening {
    public static void main(String[]args) throws IOException {
        first();
    }

    static int SceneControl = 0;
    static int UserInput;
    private static Scanner scan = new Scanner(System.in);

    public static void first () throws IOException {

        //BufferReader for SceneDescription.txt
        try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("TextFiles\\Magician\\Awakening\\SceneDescription.txt"))) {
            String line;
            while ((line = ClassInfoReader.readLine()) != null) {
                System.out.println(line);
            }
        }
        int i = 0;
        while (i == 0) {

            UserInput = scan.nextInt();

            //BufferReader for SummonMagicalLightResult.txt
            if (UserInput == 1) {
                try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("TextFiles\\Magician\\Awakening\\SceneEventResults\\1 - SummonMagicalLightResult.txt"))) {
                    String line;
                    while ((line = ClassInfoReader.readLine()) != null) {
                        System.out.println(line);
                    }
                }
//                PlayerInventory.ManipulateLight = true;
                //SummonMagicalLightResult();
                i++;
            }

            //BufferReader for LeaveThroughTheMainDoorResult.txt
            else if (UserInput == 2) {
                try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("TextFiles\\Magician\\Awakening\\SceneEventResults\\2 - LeaveThroughTheMainDoor.txt"))) {
                    String line;
                    while ((line = ClassInfoReader.readLine()) != null) {
                        System.out.println(line);
                    }
                }
                //LeaveThroughTheMainDoorResult();
                i++;
            }

            //BufferReader for LeaveThroughTheOtherDoor.txt
            else if (UserInput == 3) {
                //LeaveThroughTheOtherDoorOutcome();
                i++;
            }

            //BufferReader for CastDetectLifeSpellResult.txt
            else if (UserInput == 4) {
                try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("TextFiles\\Magician\\Awakening\\SceneEventResults\\4 - CastDetectLifeSpellResult.txt"))) {
                    String line;
                    while ((line = ClassInfoReader.readLine()) != null) {
                        System.out.println(line);
                    }
                }
//                PlayerInventory.Airburst = true;
//                PlayerInventory.DetectLife = true;
                PlayerSkills.ElementalMagic++;
                PlayerSkills.SpellCasting++;
                //CastDetectLifeSpellResult();
                i++;
            }
            else {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1', '2', '3' or '4'.");
            }
        }
    }
}
