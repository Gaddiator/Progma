package Java.Game.Magician;
//File Management.

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

//Player Management.
import Java.Logic.PlayerInventory;
import Java.Logic.Character;
import Java.Logic.Stats;

//Utility
import java.util.Random;

//Error Management
import java.io.IOException;

public class TheMagistrum {
    //Initializing character data storage.
    private static java.util.ArrayList<Integer> PlayerStats = null;
    private static java.util.ArrayList<Integer> WightsStats = null;

    //Initializing character objects
    private static final Character Magician = new Character();
    private static final Character Bane = new Character();

    //Initializing input control.
    private static final Scanner scan = new Scanner(System.in);
    private static int userInput = 0;

    //Initializing Luck/RnG
    private static final Random rand = new Random();

    public static void main(String[] args) throws IOException {
        first();
    }

    @SuppressWarnings("Duplicates")
    public static void first() throws IOException {
        //Scene Description.
        readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\SceneDescription.txt");

        try {
            while (true) {
                userInput = scan.nextInt();
                if (userInput == 1) {
                    //Enter the novice mages quarters.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\1 - EnterTheNoviceMagesQuarters.txt");
                } else if (userInput == 2) {
                    //Go check the cellar.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\2 - GoCheckTheCellar.txt");
                } else if (userInput == 3) {
                    //Loot the wights.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\3 - LootTheWights.txt");
                    Java.Game.Magician.Awakening.lootTheWights();
                } else if (userInput == 4) {
                    //Rest.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\SceneEventResults\\4 - Rest.txt");
                    RestResult();
                } else {
                    System.out.println("Invalid entry");
                    System.out.println("Please enter '1', '2', '3' or '4'.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry");
            System.out.println("Please enter '1', '2', '3' or '4'.");
        }
    }

    @SuppressWarnings("Duplicates")
    public static void EnterTheNoviceMagesQuartersResult() throws IOException {
        //Enter The Novice Mages Quarters.
        readFromTextFile("TextFiles\\Magician\\TheMagistrum\\1 - EnterTheNoviceMagesQuarters.txt");

        try {
            while (true) {
                userInput = scan.nextInt();
                if (userInput == 1) {
                    readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\");
                } else if (userInput == 2) {
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\");
                } else if (userInput == 3) {
                    readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\");
                    Java.Game.Magician.Awakening.lootTheWights();
                } else if (userInput == 4) {
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\SceneEventResults\\");
                    RestResult();
                } else {
                    System.out.println("Invalid entry");
                    System.out.println("Please enter '1', '2', '3' or '4'.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry");
            System.out.println("Please enter '1', '2', '3' or '4'.");
        }
    }

    @SuppressWarnings("Duplicates")
    public static void RestResult() throws IOException {
        readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\4 - Rest.txt");

        //Getting player stats
        Character Magician = new Character();
        java.util.ArrayList<Integer> PlayerStats;
        PlayerStats = Magician.getStats(Stats.PlayerStats);

        //Increasing player health by rest amount received.
        int CurrentHealth = PlayerStats.get(1);
        CurrentHealth = CurrentHealth + 12;
        System.out.println("Your health is " + CurrentHealth + "/" + PlayerStats.get(0));
        Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), CurrentHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));

        scan.nextLine();
        userInput = scan.nextInt();

        if (userInput == 1) {
            //Enter The Novice Mages Quarters.
            readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\1 - EnterTheNoviceMagesQuarter.txt");
            EnterTheNoviceMagesQuartersResult();
        } else if (userInput == 2) {
            //Go Check The Cellar.
            readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\2 - GoCheckTheCellar.txt");

            try {
                while(true) {
                    scan.nextLine();
                    userInput = scan.nextInt();
                    if (userInput == 1) {
                        TheCellar.first();
                    } else if (userInput == 2) {
                        TheMagistrum.first();
                    } else {
                        System.out.println("Invalid entry!");
                        System.out.println("Please enter '1' or '2'.");
                        scan.next();
                    }
                }
            } catch(InputMismatchException e){
                System.out.println("Invalid entry!");
                System.out.println("Please enter '1' or '2'.");
                scan.next();
            }
        } else if (userInput == 3) {
            //Loot The Wights.
            readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\4 - LootTheWights.txt");
            Java.Game.Magician.Awakening.lootTheWights();
        }
    }

    //Come back to this!
    private static void KickTheDoorIn() throws IOException {
        Character Magician = new Character();

        //Getting player stats
        java.util.ArrayList<Integer> PlayerStats;
        PlayerStats = Magician.getStats(Stats.PlayerStats);

        int Strength = PlayerStats.get(6);

        if (Strength >= 45) {
            readFromTextFile("TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\SuccessfulSkillTest\\KickTheDoorIn\\KickTheDoorInSuccess.txt");
            Strength = Strength + 3;
            Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), PlayerStats.get(1), PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), Strength, PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));
        } else if (Strength <= 45) {
            readFromTextFile("TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\FailedSkillTest\\KickTheDoorIn\\KickTheDoorInFailure.txt");
        }
    }

    private static void SearchForTheKey() throws IOException {

        //Getting player stats
        java.util.ArrayList<Integer> PlayerStats;
        PlayerStats = Magician.getStats(Stats.PlayerStats);

        int Willpower = PlayerStats.get(4);
        int Luck = PlayerStats.get(9);

        if (Willpower >= 30 && Luck >= 30) {
            readFromTextFile("TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\SuccessfulSkillTest\\SearchForTheKey\\SearchForTheKeySuccess.txt");
            Willpower = Willpower + 3;
            Luck = Luck + 2;
            Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), PlayerStats.get(1), PlayerStats.get(2), PlayerStats.get(3), Willpower, PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), Luck);
            PlayerInventory.setPlayerCurrency(3, 2);
        } else if (Willpower <= 30 && Luck >= 30) {
            readFromTextFile("TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\FailedSkillTest\\SearchForTheKey\\InsufficientWillpowerAndSufficientLuck.txt");
            readFromTextFile("TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\FailedSkillTest\\SearchForTheKey\\InsufficientWillpowerAndSufficientLuck.txt");
            PlayerInventory MagicianInventory = new PlayerInventory();
            MagicianInventory.setPlayerCurrency(1, 3);
        } else if (Willpower >= 30 && Luck <= 30) {
            readFromTextFile("TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\FailedSkillTest\\SearchForTheKey\\SufficientWillpowerAndInsufficientLuck.txt");
            Willpower = Willpower + 5;
            Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), PlayerStats.get(1), PlayerStats.get(2), PlayerStats.get(3), Willpower, PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));
        } else if (Willpower <= 30 && Luck <= 30) {
            readFromTextFile("TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\FailedSkillTest\\SearchForTheKey\\InsufficientWillpowerAndInsufficientLuck.txt");
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