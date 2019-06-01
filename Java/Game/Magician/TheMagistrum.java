package Java.Game.Magician;

import Java.Logic.Character;
import Java.Logic.PlayerInventory;
import Java.Logic.Stats;
import static Java.Logic.Utilities.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;



public class TheMagistrum {
    public static void main(String[] args) throws IOException {
        first();
    }

    public static void first() throws IOException {
        readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\SceneDescription.txt");

        int i = 0;
        while (i == 0) {
            UserInput = scan.nextInt();
            if (UserInput == 1) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\1 - EnterTheNoviceMagesQuarters.txt");
                i++;
            } else if (UserInput == 2) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\2 - GoCheckTheCellar.txt");
                i++;
            } else if (UserInput == 3) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\3 - LootTheWights.txt");
                i++;
                LootTheWightsResult();
            } else if (UserInput == 4) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\SceneEventResults\\4 - Rest.txt");
                i++;
                RestResult();
            } else {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1', '2', '3' or '4'.");
            }
        }
    }

    /*This is going to be complicated...*/
    public static void EnterTheNoviceMagesQuartersResult() throws IOException {
        readFromTextFile("src\\TextFiles\\Magician\\TheMagistrum\\1 - EnterTheNoviceMagesQuarters.txt");

        int i = 0;
        while (i == 0) {
            UserInput = scan.nextInt();
            if (UserInput == 1) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\");
                i++;
            } else if (UserInput == 2) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\");
                i++;
            } else if (UserInput == 3) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\");
                i++;
                LootTheWightsResult();
            } else if (UserInput == 4) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\SceneEventResults\\");
                i++;
                RestResult();
            } else {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1', '2', '3' or '4'.");
            }
        }
    }

    public static void LootTheWightsResult() throws IOException {
        int i;
        i = rand.nextInt((3 - 1) + 1) + 1;

        if(WightBattleSceneControl == 1) {
            if (i == 1) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\LootTheWightsResult\\DefeatedTrioOfWightsLoot\\3 - LootTheWights1.txt");
                PlayerInventory.setPlayerCurrency(1, 12);
                PlayerInventory.setGauntlets(false, true);

                UserInput = scan.nextInt();
                if(UserInput == 1){
                    TheMagistrum.first();
                } else if(UserInput == 2){
                    TheWesternSteeps.first();
                }
            } else if (i == 2) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\LootTheWightsResult\\DefeatedTrioOfWightsLoot\\3 - LootTheWights2.txt");
                PlayerInventory.setPlayerCurrency(0, 8);
                PlayerInventory.setShortSwords(false, true);

                UserInput = scan.nextInt();
                if(UserInput == 1){
                    TheMagistrum.first();
                } else if(UserInput == 2){
                    TheWesternSteeps.first();
                }
            } else if (i == 3) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\LootTheWightsResult\\DefeatedTrioOfWightsLoot\\3 - LootTheWights3.txt");
                PlayerInventory.setPlayerCurrency(4, 3);
                PlayerInventory.setMagicRings(true);

                UserInput = scan.nextInt();
                if(UserInput == 1){
                    TheMagistrum.first();
                } else if(UserInput == 2){
                    TheWesternSteeps.first();
                }
            }
        } else if(WightBattleSceneControl == 0) {
            if (i == 1) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\LootTheWightsResult\\DefeatedGroupOfWightsLoot\\3 - LootTheWights1.txt");
                PlayerInventory.setPlayerCurrency(1, 3);
                PlayerInventory.setDaggers(false, true);

                UserInput = scan.nextInt();
                if(UserInput == 1){
                    TheMagistrum.first();
                } else if(UserInput == 2){
                    TheWesternSteeps.first();
                }
            } else if (i == 2) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\LootTheWightsResult\\DefeatedGroupOfWightsLoot\\3 - LootTheWights2.txt");
                PlayerInventory.setPlayerCurrency(0, 3);
                PlayerInventory.setGauntlets(false, true);

                UserInput = scan.nextInt();
                if(UserInput == 1){
                    TheMagistrum.first();
                } else if(UserInput == 2){
                    TheWesternSteeps.first();
                }
            } else if (i == 3) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\LootTheWightsResult\\DefeatedGroupOfWightsLoot\\3 - LootTheWights3.txt");

                UserInput = scan.nextInt();
                if(UserInput == 1){
                    TheMagistrum.first();
                } else if(UserInput == 2){
                    TheWesternSteeps.first();
                }
            }
        }
    }

    public static void RestResult() throws IOException {
        readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\4 - Rest.txt");

        //Getting player stats
        Character Magician = new Character();
        java.util.ArrayList<Integer> PlayerStats;
        PlayerStats = Magician.getStats(Stats.PlayerStats);

        //Adding player health by rest amount received.
        int CurrentHealth = PlayerStats.get(1);
        CurrentHealth = CurrentHealth + 12;
        System.out.println("Your health is " + CurrentHealth + "/" + PlayerStats.get(0));
        Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), CurrentHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));

        UserInput = scan.nextInt();

        if(UserInput == 1){
            readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\1 - EnterTheNoviceMagesQuarter.txt");
            EnterTheNoviceMagesQuartersResult();
        } else if(UserInput == 2){
            readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\2 - GoCheckTheCellar.txt");
            UserInput = scan.nextInt();
            if(UserInput == 1){
                TheCellar.first();
            } else if(UserInput == 2){
                TheMagistrum.first();
            }
        } else if(UserInput == 3) {
            readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheMagistrum\\4 - LootTheWights.txt");
            LootTheWightsResult();
        }
    }

    private static void KickTheDoorIn() throws IOException {
        Character Magician = new Character();

        //Getting player stats
        java.util.ArrayList<Integer> PlayerStats;
        PlayerStats = Magician.getStats(Stats.PlayerStats);

        int Strength = PlayerStats.get(6);

        if(Strength >= 45){
            readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\SuccessfulSkillTest\\KickTheDoorIn\\KickTheDoorInSuccess.txt");
            Strength = Strength + 3;
            Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), PlayerStats.get(1), PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), Strength, PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));
        } else if(Strength <= 45){
            readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\FailedSkillTest\\KickTheDoorIn\\KickTheDoorInFailure.txt");
        }
    }

    private static void SearchForTheKey() throws IOException {

        //Getting player stats
        java.util.ArrayList<Integer> PlayerStats;
        PlayerStats = Magician.getStats(Stats.PlayerStats);

        int Willpower = PlayerStats.get(4);
        int Luck = PlayerStats.get(9);

        if(Willpower >= 30 && Luck >= 30){
            readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\SuccessfulSkillTest\\SearchForTheKey\\SearchForTheKeySuccess.txt");
            Willpower = Willpower + 3;
            Luck = Luck + 2;
            Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), PlayerStats.get(1), PlayerStats.get(2), PlayerStats.get(3), Willpower, PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), Luck);
            PlayerInventory.setPlayerCurrency(3, 2);
        } else if(Willpower <= 30 && Luck >= 30){
            readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\FailedSkillTest\\SearchForTheKey\\InsufficientWillpowerAndSufficientLuck.txt");
            PlayerInventory MagicianInventory = new PlayerInventory();
            MagicianInventory.setPlayerCurrency(1, 3);
        } else if(Willpower >= 30 && Luck <= 30){
            readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\FailedSkillTest\\SearchForTheKey\\SufficientWillpowerAndInsufficientLuck.txt");
            Willpower = Willpower + 5;
            Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), PlayerStats.get(1), PlayerStats.get(2), PlayerStats.get(3), Willpower, PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));
        } else if(Willpower <= 30 && Luck <= 30){
            readFromTextFile("src\\TextFiles\\Magician\\Scenes\\TheNoviceMagesQuarter\\FailedSkillTest\\SearchForTheKey\\InsufficientWillpowerAndInsufficientLuck.txt");
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