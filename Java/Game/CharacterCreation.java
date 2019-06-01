package Java.Game;

import Java.Game.Magician.Awakening;
import Java.Game.Rouge.RougeAwakening;
import Java.Game.Warrior.WarriorAwakening;
import Java.Logic.PlayerInventory;

import java.io.*;
import java.util.Scanner;


public class CharacterCreation {

    private static String playerName;
    private static String playerClass;
    private static String userInput;
    private static int i = 0;
    private static int j;


    public static void main(String[]arg){
        Initialize();
    }

    public static void Initialize() {

        //Declaring Scanners
        Scanner scan = new Scanner(System.in);
        readFromTextFile("src\\TextFiles\\intro.txt");

        System.out.println("\nPlease enter your name.");
        playerName = scan.next();
        System.out.println("\nWelcome, " + playerName + " to Progma." );
        System.out.println("\nIn the lands of Progma there are three classes for you to choose from.");
        System.out.println("Each has there own advantages and disadvantages, with your overall play style revolving around your class choice.\n");
        System.out.println("So are you an 'Warrior', 'Rouge', or 'Magician'.");

        while (i == 0) {
            userInput = scan.next();

            //for loop control.
            j = 0;

            /////////////////////////////////////////////////////////////////////////////////
            //////////////////////...CLASS CHOICE MENU...////////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////////
            //////////////////////...Warrior Class Options...////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////////

            if (userInput.equalsIgnoreCase("Warrior")) {
                System.out.println();
                readFromTextFile("src\\TextFiles\\Info\\ClassInfo\\Warrior.txt");

                try {
                    while (j == 0) {
                        userInput = scan.next();
                        if (userInput.equalsIgnoreCase("Yes")) {
                            System.out.println();
                            System.out.println("A fine choice warrior, may your heart stay pure and true...!\n");
                            playerClass = "Warrior";
                            savePlayerInfo();
                            PlayerInventory.setJerkins(false, true, false, false);
                            PlayerInventory.setShortSwords(false, true);
                            PlayerInventory.setMagicRings(true);
                            i++;
                            j++;
                            WarriorAwakening.first();
                        } else if (userInput.equalsIgnoreCase("No")) {
                            System.out.println();
                            System.out.println("Are you an 'Warrior', 'Rouge', or 'Magician'.");
                            j++;
                        } else {
                            System.out.println("Invalid entry");
                            System.out.println("Please enter 'Yes', or 'No'.");
                        }
                    }
                }
                catch (FileNotFoundException e){
                    System.out.println("Error File Not Found Exception Thrown:" + "\n" + e);
                }
                catch (IOException e){
                    System.out.println("Error Input Output Exception Thrown:" + "\n" + e);
                }
            }

            /////////////////////////////////////////////////////////////////////////////////
            //////////////////////...CLASS CHOICE MENU...////////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////////
            //////////////////////...Rouge Class Options...//////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////////

            else if (userInput.equalsIgnoreCase("Rouge")) {
                System.out.println();
                readFromTextFile("src\\TextFiles\\Info\\ClassInfo\\Rouge.txt");

                try {
                    while (j == 0) {
                        userInput = scan.next();
                        if (userInput.equalsIgnoreCase("Yes")) {
                            System.out.println();
                            System.out.println("A peculiar choice Rouge, may your wits stay sharp and dangerous...!\n");
                            playerClass = "Rouge";
                            savePlayerInfo();
                            PlayerInventory.setJerkins(true, false, false, false);
                            PlayerInventory.setBoots(false, false, false, true);
                            PlayerInventory.setGauntlets(false, true);
                            i++;
                            j++;
                            RougeAwakening.first();
                        } else if (userInput.equalsIgnoreCase("No")) {
                            System.out.println();
                            System.out.println("Are you an 'Warrior', 'Rouge', or 'Magician'.");
                            j++;
                        } else {
                            System.out.println("Invalid entry");
                            System.out.println("Please enter 'Yes', or 'No'.");
                        }
                    }
                }
                catch (FileNotFoundException e){
                    System.out.println("Error File Not Found Exception Thrown:" + "\n" + e);
                }
                catch (IOException e){
                    System.out.println("Error Input Output Exception Thrown:" + "\n" + e);
                }
            }

            /////////////////////////////////////////////////////////////////////////////////
            //////////////////////...CLASS CHOICE MENU...////////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////////
            //////////////////////...Magician Class Options...///////////////////////////////
            /////////////////////////////////////////////////////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////////

            else if (userInput.equalsIgnoreCase("Magician")) {
                System.out.println();
                readFromTextFile("src\\TextFiles\\Info\\ClassInfo\\Magician.txt");

                try {
                    while (j == 0) {
                        userInput = scan.next();
                        if (userInput.equalsIgnoreCase("Yes")) {
                            System.out.println();
                            System.out.println("A powerful choice magician, may your magic stay strong and deadly...!\n");
                            playerClass = "Magician";
                            savePlayerInfo();
                            PlayerInventory.setBoots(false, false, false, true);
                            PlayerInventory.setArmouredRobes(false, false, false, true);
                            PlayerInventory.setGauntlets(false, true);
                            i++;
                            j++;
                            Awakening.first();
                        } else if (userInput.equalsIgnoreCase("No")) {
                            System.out.println();
                            System.out.println("Are you an 'Warrior', 'Rouge', or 'Magician'.");
                            j++;
                        } else {
                            System.out.println("Invalid entry");
                            System.out.println("Please enter 'Yes', or 'No'.");
                        }
                    }
                }
                catch (FileNotFoundException e){
                    System.out.println("Error File Not Found Exception Thrown:" + "\n" + e);
                }
                catch (IOException e){
                    System.out.println("Error Input Output Exception Thrown:" + "\n" + e);
                }
            }
            else {
                System.out.println("Please enter 'Warrior', 'Rouge', or 'Magician'.");
            }
        }
    }
    private static void savePlayerInfo() {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String content = playerName + "\n" + playerClass;

            fw = new FileWriter("src\\TextFiles\\Info\\PlayerInfo\\misc.txt");
            bw = new BufferedWriter(fw);
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
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
