package Java.Game.Warrior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class  WarriorAwakening {
    public static void main(String[]args) throws IOException {
        first();
    }

    static int SceneControl = 0;
    static int UserInput;
    private static Scanner scan = new Scanner(System.in);

    public static void first () throws IOException{

        int UserInput;


        //BufferReader for SceneDescription1.txt
        try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("TextFiles\\Warrior\\Awakening\\SceneDescription1.txt"))) {
            String line;
            while ((line = ClassInfoReader.readLine()) != null) {
                System.out.println(line);
            }
        }
        Scanner scan = new Scanner(System.in);
        UserInput = scan.nextInt();

        //BufferReader for RunAway.txt
        if(UserInput == 1){
            try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("TextFiles\\Warrior\\Awakening\\SceneEventResults\\1 - RunAway.txt"))) {
                String line;
                while ((line = ClassInfoReader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            //When player dies option here to reload from checkpoint or quit.
            UserInput = scan.nextInt();
            if (UserInput == 1) {
                System.out.println("Try, try and try until you succeed.");
                first();
            }
            else if (UserInput == 2) {
                Thread.currentThread().stop();
            }
            else{
                System.out.println("Invalid entry. Please enter 1 or 2!");
            }
        }

        //BufferReader for ShoutForHelp.txt
        else if(UserInput == 2){
            try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("TextFiles\\Warrior\\Awakening\\SceneEventResults\\2 - ShoutForHelp.txt"))) {
                String line;
                while ((line = ClassInfoReader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            //When player dies option here to reload from checkpoint or quit.
            UserInput = scan.nextInt();
            if (UserInput == 1) {
                System.out.println("Try, try and try until you succeed.");
                first();
            }
            else if (UserInput == 2) {
                System.exit(0);
            }
            else{
                System.out.println("Invalid entry. Please enter 1 or 2!");
            }
        }
        else if(UserInput == 3){
            try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("TextFiles\\Warrior\\Awakening\\SceneEventResults\\3 - DrawYourSword.txt"))) {
                String line;
                while ((line = ClassInfoReader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        }

        //BufferReader for ChargeTheBeast.txt
        else if(UserInput == 4){
            try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("TextFiles\\Warrior\\Awakening\\SceneEventResults\\4 - ChargeTheBeast.txt"))) {
                String line;
                while ((line = ClassInfoReader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            //When player dies option here to reload from checkpoint or quit.
            UserInput = scan.nextInt();
            if (UserInput == 1) {
                System.out.println("Try, try and try until you succeed.");
                first();
            }
            else if (UserInput == 2) {
                System.exit(0);
            }
            else{
                System.out.println("Invalid entry. Please enter 1 or 2!");
            }

        }
        else{
            System.out.println("Invalid entry");
            System.out.println("Please enter '1', '2', '3' or '4'.");
        }

    }
    ////////////////////////////
    ////Charge Beast Outcome////
    ////////////////////////////

    public static void chargeBeastOutcome () throws IOException {

        //Declaring variables

        //Ints
        int UserInput;

        Scanner scan = new Scanner(System.in);
        UserInput = scan.nextInt();

        //BufferReader for JumpToTheLeft.txt
        if(UserInput == 1){
            try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("TextFiles\\Warrior\\Awakening\\ChargeBeastOutcome\\1 - JumpToTheLeft.txt"))) {
                String line;
                while ((line = ClassInfoReader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            UserInput = scan.nextInt();
            if (UserInput == 1) {
                System.out.println("Try, try and try until you succeed.");
                chargeBeastOutcome();
            }
            else if (UserInput == 2) {
                Thread.currentThread().stop();
            }
            else{
                System.out.println("Invalid entry. Please enter 1 or 2!");
            }
        }

        //BufferReader for RoarAtTheBeast.txt
        else if(UserInput == 2){
            try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("TextFiles\\Warrior\\Awakening\\SceneEventResults\\2 - RoarAtTheBeast.txt"))) {
                String line;
                while ((line = ClassInfoReader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            UserInput = scan.nextInt();
            if (UserInput == 1) {
                System.out.println("Try, try and try until you succeed.");
                chargeBeastOutcome();
            }
            else if (UserInput == 2) {
                Thread.currentThread().stop();
            }
            else{
                System.out.println("Invalid entry. Please enter 1 or 2!");
            }
        }

        //BufferReader for DropToTheFloor.txt
        else if(UserInput == 3){
            try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("TextFiles\\Warrior\\Awakening\\SceneEventResults\\3 - DropToTheFloor.txt"))) {
                String line;
                while ((line = ClassInfoReader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        }

        //BufferReader for DrawYourSword.txt
        else if(UserInput == 4){
            try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("TextFiles\\Warrior\\Awakening\\SceneEventResults\\4 - DrawYourSword.txt"))) {
                String line;
                while ((line = ClassInfoReader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            UserInput = scan.nextInt();
            if (UserInput == 1) {
                System.out.println("Try, try and try until you succeed.");
                chargeBeastOutcome();
            }
            else if (UserInput == 2) {
                Thread.currentThread().stop();
            }
            else{
                System.out.println("Invalid entry. Please enter 1 or 2!");
            }

        }
        else{
            System.out.println("Invalid entry");
            System.out.println("Please enter '1', '2', '3' or '4'.");
        }

    }

}

