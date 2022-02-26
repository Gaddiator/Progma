package Java.Game.Magician;

//File Management.

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

//Player Management.
import Java.Logic.PlayerInventory;
import Java.Logic.PlayerSkills;
import Java.Logic.Character;
import Java.Logic.Stats;

//Error Management.
import java.util.InputMismatchException;
import java.io.IOException;

//Utility
import java.util.Random;

public class Awakening {
    //Initializing character data storage.
    private static java.util.ArrayList<Integer> PlayerStats = null;
    private static java.util.ArrayList<Integer> WightsStats = null;

    //Initializing character objects
    private static final Character Magician = new Character();
    private static final Character Wight = new Character();

    //Initializing input control.
    private static final Scanner scan = new Scanner(System.in);
    private static int userInput = 0;

    //Initializing battle and loot scene controls.
    public static int WightBattleSceneControl;
    private static int WightLootSceneControl = 1;

    //Initializing Luck/RnG
    private static final Random rand = new Random();

    //Initialize scene.
    public static void main(String[] args) throws IOException {
        first();
    }

    public static void first() throws IOException {
        WightBattleSceneControl = 1;
        //Scene Description Part 1
        readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\SceneDescription1.txt");
        boolean iterate = true;
        while (iterate) {
            try {
                userInput = scan.nextInt();
                if(userInput == 1){
                    //Terminating.
                    iterate = false;

                    //Scene description Part 2.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\SceneDescription2.txt");
                } else {
                    System.out.println("Invalid entry!");
                    System.out.println("Please enter '1' to continue.");
                    scan.nextLine();
                }
            } catch(InputMismatchException e) {
                System.out.println("Invalid entry!");
                System.out.println("Please enter '1' to continue.");
                scan.nextLine();
            }
        }

        boolean loop = true;
        while (loop) {
            try {
                userInput = scan.nextInt();
                if (userInput == 1) {
                    //Summon magical light.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\1 - SummonMagicalLight.txt");

                    boolean iterator = true;
                    while (iterator) {
                        try {
                            userInput = scan.nextInt();
                            if(userInput == 1){
                                //Terminating.
                                iterator = false;

                                //Scene description Part 2.
                                readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\1 - SummonMagicalLightContinued.txt");
                            } else {
                                System.out.println("Invalid entry!");
                                System.out.println("Please enter '1' to continue.");
                                scan.nextLine();
                            }
                        } catch(InputMismatchException e) {
                            System.out.println("Invalid entry!");
                            System.out.println("Please enter '1' to continue.");
                            scan.nextLine();
                        }
                    }

                    //Adding spells to players inventory.
                    PlayerInventory.setSpellCastingMagic(false, false, false, false, true, false);

                    //Terminating
                    loop = false;


                    //Summon magical light.
                    SummonMagicalLightOutcome();
                } else if (userInput == 2) {
                    //Leave through the main door.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\2 - LeaveThroughTheMainDoor.txt");

                    //Terminating
                    loop = false;

                    //Leave through the main door.
                    LeaveThroughTheMainDoorOutcome();
                } else if (userInput == 3) {
                    //Terminating
                    loop = false;

                    //Leave through the other door.
                    LeaveThroughTheOtherDoorOutcome();
                } else if (userInput == 4) {
                    //Cast detect life spell.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\4 - CastDetectLifeSpell.txt");

                    //Adding spells to players inventory.
                    PlayerInventory.setElementalMagic(true, false, false, false, false, false, false, false);
                    PlayerInventory.setSpellCastingMagic(false, false, true, false, false, false);

                    //Increasing player skills.
                    PlayerSkills.ElementalMagic++;
                    PlayerSkills.SpellCasting++;

                    //Terminating
                    loop = false;

                    //Cast detect life spell.
                    CastDetectLifeSpellOutcome();
                } else {
                    System.out.println("Invalid entry!");
                    System.out.println("Please enter '1', '2', '3' or '4'.");
                    scan.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry!");
                System.out.println("Please enter '1', '2', '3' or '4'.");
                scan.nextLine();
            }
        }
    }

    @SuppressWarnings("Duplicates")
    private static void SummonMagicalLightOutcome() throws IOException {
        boolean loop = true;
        while (loop) {
            try {
                userInput = scan.nextInt();
                if (userInput == 1) {
                    //Direct the light into their eyes.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\SummonMagicalLightResult\\1 - DirectTheLightIntoTheirEyes.txt");

                    //Increasing player skills.
                    PlayerSkills.ElementalMagic++;
                    PlayerSkills.SpellCasting++;

                    //Killed two wights in library.
                    WightBattleSceneControl = 2;

                    boolean looping = true;
                    while (looping) {
                        try {
                            userInput = scan.nextInt();
                            if (userInput == 1) {
                                //Terminating.
                                looping = false;
                                loop = false;

                                //Leave through the main door.
                                LeaveThroughTheMainDoorOutcome();
                            } else if (userInput == 2) {
                                //Terminating.
                                looping = false;
                                loop = false;

                                //Leave through the other door.
                                LeaveThroughTheOtherDoorOutcome();
                            } else {
                                System.out.println("Invalid entry");
                                System.out.println("Please enter '1' or '2'!");
                                scan.nextLine();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid entry");
                            System.out.println("Please enter '1' or '2'!");
                            scan.nextLine();
                        }
                    }
                } else if (userInput == 2) {
                    //Blast one with a fireball.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\SummonMagicalLightResult\\2 - BlastOneWithAFireball.txt");

                    //Adding spells to players inventory.
                    PlayerInventory.setElementalMagic(true, false, false, false, true, false, false, false);

                    //Increasing player skills.
                    PlayerSkills.ElementalMagic++;

                    //Killed two wights in library.
                    WightBattleSceneControl = 2;

                    boolean looping = true;
                    while (looping) {
                        try {
                            userInput = scan.nextInt();
                            if (userInput == 1) {
                                //Terminating.
                                looping = false;
                                loop = false;

                                //The western steeps.
                                TheWesternSteeps.first();
                            } else if (userInput == 2) {
                                //Terminating.
                                looping = false;
                                loop = false;

                                //Leave through the other door.
                                LeaveThroughTheOtherDoorOutcome();
                            } else {
                                System.out.println("Invalid entry");
                                System.out.println("Please enter '1' or '2'!");
                                scan.nextLine();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid entry");
                            System.out.println("Please enter '1' or '2'!");
                            scan.nextLine();
                        }
                    }
                } else if (userInput == 3) {
                    //Turn and run.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\SummonMagicalLightResult\\3 - TurnAndRun.txt");

                    boolean looping = true;
                    while (looping) {
                        try {
                            userInput = scan.nextInt();
                            if (userInput == 1) {
                                //Terminating.
                                looping = false;
                                loop = false;

                                //First.
                                first();
                            } else if (userInput == 2) {
                                //Terminating.
                                looping = false;
                                loop = false;

                                //Exit.
                                System.exit(0);
                            } else {
                                System.out.println("Invalid entry");
                                System.out.println("Please enter '1' or '2'!");
                                scan.nextLine();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid entry!");
                            System.out.println("Please enter '1' or '2'.");
                            scan.nextLine();
                        }
                    }
                } else if (userInput == 4) {
                    //Explode one with magic.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\SummonMagicalLightResult\\4 - ExplodeOneWithMagic.txt");

                    //Increasing player skills.
                    PlayerSkills.DarkMagic++;
                    PlayerSkills.ElementalMagic++;

                    //Killed two wights in library.
                    WightBattleSceneControl = 2;

                    boolean looping = true;
                    while (looping) {
                        try {
                            userInput = scan.nextInt();
                            if (userInput == 1) {
                                //Terminating.
                                looping = false;
                                loop = false;

                                //The western steeps.
                                TheWesternSteeps.first();
                            } else if (userInput == 2) {
                                //Terminating.
                                looping = false;
                                loop = false;

                                //Leave through the other door.
                                LeaveThroughTheOtherDoorOutcome();
                            } else {
                                System.out.println("Invalid entry!");
                                System.out.println("Please enter '1' or '2'.");
                                scan.nextLine();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid entry!");
                            System.out.println("Please enter '1' or '2'.");
                            scan.nextLine();
                        }
                    }
                } else {
                    System.out.println("Invalid entry!");
                    System.out.println("Please enter '1', '2', '3' or '4'.");
                    scan.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry!");
                System.out.println("Please enter '1', '2', '3' or '4'.");
                scan.nextLine();
            }
        }
    }

    @SuppressWarnings("Duplicates")
    private static void LeaveThroughTheMainDoorOutcome() throws IOException {
        boolean loop = true;
        while (loop) {
            try {
                userInput = scan.nextInt();
                if (userInput == 1) {
                    //Blast them with air.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\LeaveThroughTheMainDoorResult\\1 - BlastThemWithAir.txt");

                    //Adding spells to players inventory.
                    PlayerInventory.setElementalMagic(true, false, false, false, false, false, false, false);

                    //Increasing player skills.
                    PlayerSkills.ElementalMagic++;

                    //Killed two wights in library.
                    WightBattleSceneControl = 2;

                    //Terminating.
                    loop = false;

                    //Handling Scene Transition.
                    boolean execute = true;
                    while (execute) {
                        try {
                            userInput = scan.nextInt();
                            if(userInput == 1) {
                                //Terminating.
                                execute = false;

                                //The Western steeps.
                                TheWesternSteeps.first();
                            } else if (userInput == 2){
                                //Terminating.
                                execute = false;

                                //The Magistrum.
                                TheMagistrum.first();
                            } else {
                                System.out.println("Invalid entry");
                                System.out.println("Please enter '1', '2', '3' or '4'.");
                                scan.nextLine();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid entry");
                            System.out.println("Please enter '1', '2', '3' or '4'.");
                            scan.nextLine();
                        }
                    }
                } else if (userInput == 2) {
                    //Electrolyze yourself.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\LeaveThroughTheMainDoorResult\\2 - ElectrolyzeYourself.txt");

                    //Initializing character objects.
                    Character Magician = new Character();

                    //Getting character stats.
                    PlayerStats = Magician.getStats(Stats.PlayerStats);

                    //Reducing player health by damage amount taken
                    int CurrentHealth = PlayerStats.get(1);
                    CurrentHealth = CurrentHealth - 4;

                    if(CurrentHealth <= 0){
                        playerDeath();
                    } else if(CurrentHealth >= 1) {
                        //Updating stats.
                        Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), CurrentHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));

                        System.out.println("\nYour health is " + CurrentHealth + "/" + PlayerStats.get(0));

                        System.out.println("\nMain door. - (Press 1)");
                        System.out.println("Door to the magistrum. - (Press 2)");

                        //Adding spells to players inventory.
                        PlayerInventory.setElementalMagic(false, false, false, false, false, false, true, false);
                        PlayerInventory.setSpellCastingMagic(true, false, false, false, false, false);

                        //Increasing player skills.
                        PlayerSkills.ElementalMagic++;
                        PlayerSkills.SpellCasting++;

                        //Killed two wights in library.
                        WightBattleSceneControl = 2;

                        //Terminating.
                        loop = false;

                        //Handling Scene Transition.
                        boolean execute = true;
                        while (execute) {
                            try {
                                userInput = scan.nextInt();
                                if(userInput == 1) {
                                    //Terminating.
                                    execute = false;

                                    //The Western steeps.
                                    TheWesternSteeps.first();
                                } else if (userInput == 2){
                                    //Terminating.
                                    execute = false;

                                    //The Magistrum.
                                    TheMagistrum.first();
                                } else {
                                    System.out.println("Invalid entry");
                                    System.out.println("Please enter '1', '2', '3' or '4'.");
                                    scan.nextLine();
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid entry");
                                System.out.println("Please enter '1', '2', '3' or '4'.");
                                scan.nextLine();
                            }
                        }
                    }
                } else if (userInput == 3) {
                    //Implode one with magic.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\LeaveThroughTheMainDoorResult\\3 - ImplodeOneWithMagic.txt");

                    //Adding spells to players inventory.
                    PlayerInventory.setDarkMagic(false, true, true);

                    //Increasing player skills.
                    PlayerSkills.DarkMagic++;

                    //Killed two wights in library.
                    WightBattleSceneControl = 2;

                    //Terminating.
                    loop = false;

                    //Handling Scene Transition.
                    boolean execute = true;
                    while (execute) {
                        try {
                            userInput = scan.nextInt();
                            if(userInput == 1) {
                                //Terminating.
                                execute = false;

                                //The Western steeps.
                                TheWesternSteeps.first();
                            } else if (userInput == 2){
                                //Terminating.
                                execute = false;

                                //The Magistrum.
                                TheMagistrum.first();
                            } else {
                                System.out.println("Invalid entry");
                                System.out.println("Please enter '1', '2', '3' or '4'.");
                                scan.nextLine();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid entry");
                            System.out.println("Please enter '1', '2', '3' or '4'.");
                            scan.nextLine();
                        }
                    }
                } else if (userInput == 4) {
                    //Cast a magical shield.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\LeaveThroughTheMainDoorResult\\4 - CastAMagicalShield.txt");

                    //Adding spells to players inventory.
                    PlayerInventory.setSpellCastingMagic(false, true, false, false, false, true);

                    //Increasing player skills.
                    PlayerSkills.SpellCasting++;
                    PlayerSkills.DarkMagic++;

                    //Killed two wights in library.
                    WightBattleSceneControl = 2;

                    //Terminating.
                    loop = false;

                    //Handling Scene Transition.
                    boolean execute = true;
                    while (execute) {
                        try {
                            userInput = scan.nextInt();
                            if(userInput == 1) {
                                //Terminating.
                                execute = false;

                                //The Western steeps.
                                TheWesternSteeps.first();
                            } else if (userInput == 2){
                                //Terminating.
                                execute = false;

                                //The Magistrum.
                                TheMagistrum.first();
                            } else {
                                System.out.println("Invalid entry");
                                System.out.println("Please enter '1', '2', '3' or '4'.");
                                scan.nextLine();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid entry");
                            System.out.println("Please enter '1', '2', '3' or '4'.");
                            scan.nextLine();
                        }
                    }
                } else {
                    System.out.println("Invalid entry");
                    System.out.println("Please enter '1', '2', '3' or '4'.");
                    scan.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1', '2', '3' or '4'.");
                scan.nextLine();
            }
        }
    }

    @SuppressWarnings("Duplicates")
    public static void LeaveThroughTheOtherDoorOutcome() throws IOException {

        //Handling wight scene.
        if (WightBattleSceneControl == 0) {
            System.out.println("Theres nothing left but the looted corpses of the wights.");
        } else if (WightBattleSceneControl == 1) {
            //Leave through the other door one.
            readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\3 - LeaveThroughTheOtherDoor1.txt");

            //Getting character stats.
            WightsStats = Wight.getStats(Stats.GroupOfWightsStats);
            PlayerStats = Magician.getStats(Stats.PlayerStats);

            WightBattleSceneControl = 1;
        } else if(WightBattleSceneControl == 2) {
            //Leave through the other door two.
            readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\3 - LeaveThroughTheOtherDoor2.txt");

            //Getting character stats. - Error Needs Reviewing!
            WightsStats = Wight.getStats(Stats.TrioOfWightsStats);
            PlayerStats = Magician.getStats(Stats.PlayerStats);

            WightBattleSceneControl = 2;
        }

        //Player variables//
        //Base Stats
        int MaxHealth = PlayerStats.get(0);
        int CurrentHealth = PlayerStats.get(1);

        //Advanced Stats
        int MaxMagicalAttackDamage = Magician.getMaxMagicalAttackDamage(Stats.PlayerStats);
        int MinMagicalAttackDamage = Magician.getMinMagicalAttackDamage(Stats.PlayerStats);
        int PhysicalDefense = Magician.getPhysicalDefense(Stats.PlayerStats);
        int DodgeChance = Magician.getDodgeChance(Stats.PlayerStats);


        //Enemy variables
        //Base Stats
        int EnemyMaxHealth = WightsStats.get(0);
        int EnemyCurrentHealth = WightsStats.get(1);

        //Advanced Stats
        int EnemyMaxPhysicalAttackDamage = Wight.getMaxPhysicalAttackDamage(Stats.GroupOfWightsStats);
        int EnemyMinPhysicalAttackDamage = Wight.getMinPhysicalAttackDamage(Stats.GroupOfWightsStats);
        int EnemyMagicalDefense = Wight.getMagicalDefense(Stats.GroupOfWightsStats);
        int EnemyDodgeChance = Wight.getDodgeChance(Stats.GroupOfWightsStats);

        int x = 0;
        boolean isEnemyAlive = true;

        System.out.println("Continue... - (Press 1)");

        boolean loop = true;
        while (loop) {
            try {
                userInput = scan.nextInt();
                if (userInput == 1) {
                    boolean looping = true;
                    while (looping) {
                        //Player turn
                        int PlayerTurnDamage = (int) (Math.random() * MaxMagicalAttackDamage + MinMagicalAttackDamage) - (EnemyMagicalDefense);
                        if (x == 0) {
                            x = 1;
                        } else {
                            System.out.println("\n");
                        }
                        System.out.println("Your current health is " + CurrentHealth + "/" + MaxHealth);
                        System.out.println("You attack the Wights for " + PlayerTurnDamage + " Health");
                        EnemyCurrentHealth = EnemyCurrentHealth - PlayerTurnDamage;
                        if (EnemyCurrentHealth <= 0) {
                            isEnemyAlive = false;
                        }

                        //Enemy turn
                        int EnemyTurnDamage = (int) (Math.random() * EnemyMaxPhysicalAttackDamage + EnemyMinPhysicalAttackDamage) - (PhysicalDefense);
                        System.out.println("The Wights current health is " + EnemyCurrentHealth + "/" + EnemyMaxHealth);
                        if (isEnemyAlive) {
                            System.out.println("The Wights attacks you for " + EnemyTurnDamage + " Health");
                            CurrentHealth = CurrentHealth - EnemyTurnDamage;
                        } else {
                            System.out.println("The Wights died!");
                        }

                        if (EnemyCurrentHealth <= 0) {
                            //Updating Player Stats.
                            Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), CurrentHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));

                            //Terminating.
                            looping = false;
                            loop = false;

                            playerVictory();
                        } else if (CurrentHealth <= 0) {
                            //Br
                            System.out.println();

                            //Terminating.
                            looping = false;
                            loop = false;

                            //enemyVictory();
                            enemyVictory();
                        }
                        try {
                            Thread.sleep(2500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    System.out.println("Invalid entry!");
                    System.out.println("Please enter '1' to continue.");
                    scan.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry!");
                System.out.println("Please enter '1' to continue.");
                scan.nextLine();
            }
        }
    }

    @SuppressWarnings("Duplicates")
    private static void CastDetectLifeSpellOutcome() throws IOException {
        while (true) {
            try {
                while (true) {
                    userInput = scan.nextInt();
                    if (userInput == 1) {
                        //Turn and run.
                        readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\CastDetectLifeSpellResult\\1 - TurnAndRun.txt");

                        try {
                            while (true) {
                                scan.nextLine();
                                userInput = scan.nextInt();
                                if (userInput == 1) {
                                    first();
                                } else if (userInput == 2) {
                                    System.exit(0);
                                } else {
                                    System.out.println("Invalid entry");
                                    System.out.println("Please enter '1' or '2'.");
                                    scan.next();
                                }
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid entry");
                            System.out.println("Please enter '1' or '2'.");
                            scan.next();
                        }
                    } else if (userInput == 2) {
                        //Blast one with a fireball.
                        readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\CastDetectLifeSpellResult\\2 - BlastOneWithAFireball.txt");

                        //Getting Player Stats.
                        PlayerStats = Magician.getStats(Stats.PlayerStats);

                        //Reducing player health by damage amount taken.
                        int CurrentHealth = PlayerStats.get(1);
                        CurrentHealth = CurrentHealth - 4;

                        if(CurrentHealth <= 0){
                            playerDeath();
                        } else if(CurrentHealth >= 1) {

                            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                System.out.println("\nYour health is " + CurrentHealth + "/" + PlayerStats.get(0));
                                System.out.println("\nYou have gained an experience level in Elemental Magic.\n");

                                System.out.println("You feel slightly shaken after the fight, its not everyday that you get to fight some wights.");
                                System.out.println("However after a few moments of uncertainty you decide that you need to get back on the move you make toward the...\n");

                                System.out.println("Main door. - (Press 1)");
                                System.out.println("Door to the magistrum. - (Press 2)");
                            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                            Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), CurrentHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));

                            //Killed two wights in library.
                            WightBattleSceneControl = 2;

                            try {
                                while (true) {
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        TheWesternSteeps.first();
                                    } else if (userInput == 2) {
                                        LeaveThroughTheOtherDoorOutcome();
                                    } else {
                                        scan.nextLine();
                                        System.out.println("Invalid entry");
                                        System.out.println("Please enter '1' or '2'.");
                                        scan.next();
                                    }
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid entry");
                                System.out.println("Please enter '1' or '2'.");
                                scan.next();
                            }
                        }
                    } else if (userInput == 3) {
                        //Explode One With Magic.
                        readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\CastDetectLifeSpellResult\\3 - ExplodeOneWithMagic.txt");

                        //Getting player stats.
                        Character Magician = new Character();
                        java.util.ArrayList<Integer> PlayerStats;
                        PlayerStats = Magician.getStats(Stats.PlayerStats);

                        //Reducing player health by damage amount taken.
                        int CurrentHealth = PlayerStats.get(1);
                        CurrentHealth = CurrentHealth - 4;

                        if(CurrentHealth <= 0){
                            playerDeath();
                        } else if(CurrentHealth >= 1) {
                            System.out.println("Your health is " + CurrentHealth + "/" + PlayerStats.get(0));
                            Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), CurrentHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));

                            //Killed two wights in library.
                            WightBattleSceneControl = 2;

                            while (true) {
                                scan.nextLine();
                                userInput = scan.nextInt();
                                if (userInput == 1) {
                                    //The western steeps.
                                    TheWesternSteeps.first();
                                } else if (userInput == 2) {
                                    //Leave through the other door.
                                    LeaveThroughTheOtherDoorOutcome();
                                } else {
                                    System.out.println("Invalid entry");
                                    System.out.println("Please enter '1' or '2'!");
                                }
                            }
                        }
                    } else {
                        System.out.println("Invalid entry");
                        System.out.println("Please enter '1', '2' or '3'!");
                        scan.next();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1', '2', '3' or '4'.");
            }
        }
    }

    @SuppressWarnings("Duplicates")
    public static void lootTheWights() throws IOException {
        WightLootSceneControl++;

        //Initializing Luck/RnG.
        int i;
        i = rand.nextInt((3 - 1) + 1) + 1;

        //Defeated Group Of Wights
        if (WightBattleSceneControl == 0) {
            if (i == 1) {
                //Loot The Wights One - Light Steel Gauntlets, 1 Gold Coin and 12 Silver Coins. Sweet!
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\LootTheWightsResult\\DefeatedGroupOfWightsLoot\\3 - LootTheWights1.txt");

                //Adding items to players inventory.
                PlayerInventory.setPlayerCurrency(1, 3);
                PlayerInventory.setDaggers(false, true);

                try {
                    while (true) {
                        scan.nextLine();
                        userInput = scan.nextInt();
                        if (userInput == 1) {
                            Java.Game.Magician.TheMagistrum.first();
                        } else if (userInput == 2) {
                            TheWesternSteeps.first();
                        } else {
                            System.out.println("Invalid entry");
                            System.out.println("Please enter '1' or '2'!");
                            scan.nextLine();
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid entry");
                    System.out.println("Please enter '1' or '2'!");
                    scan.nextLine();
                }
            } else if (i == 2) {
                //Loot The Wight Two - Steel Short Sword and 12 silver coins. Not bad for a rookie!
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\LootTheWightsResult\\DefeatedGroupOfWightsLoot\\3 - LootTheWights2.txt");

                //Adding items to players inventory.
                PlayerInventory.setPlayerCurrency(0, 3);
                PlayerInventory.setGauntlets(false, true);

                try {
                    while (true) {
                        scan.nextLine();
                        userInput = scan.nextInt();
                        if (userInput == 1) {
                            Java.Game.Magician.TheMagistrum.first();
                        } else if (userInput == 2) {
                            TheWesternSteeps.first();
                        } else {
                            System.out.println("Invalid entry");
                            System.out.println("Please enter '1' or '2'!");
                            scan.nextLine();
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid entry");
                    System.out.println("Please enter '1' or '2'!");
                    scan.nextLine();
                }
            } else if (i == 3) {
                //Loot The Wight Three - Red Gemstone Ring, 4 Gold Coins and 3 Silver Coins. Its your lucky day, huh!
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\LootTheWightsResult\\DefeatedGroupOfWightsLoot\\3 - LootTheWights3.txt");
                try {
                    while (true) {
                        scan.nextLine();
                        userInput = scan.nextInt();
                        if (userInput == 1) {
                            Java.Game.Magician.TheMagistrum.first();
                        } else if (userInput == 2) {
                            TheWesternSteeps.first();
                        } else {
                            System.out.println("Invalid entry");
                            System.out.println("Please enter '1' or '2'!");
                            scan.nextLine();
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid entry");
                    System.out.println("Please enter '1' or '2'!");
                    scan.nextLine();
                }
            }
        }

        //Defeated Trio Of Wights
        if (WightBattleSceneControl == 1) {
            if (i == 1) {
                //Loot The Wights One - One Red and Blue Jeweled Dagger, One Gold Coin and 3 Silver Coins. Wow, shiny knife!
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\LootTheWightsResult\\DefeatedTrioOfWightsLoot\\3 - LootTheWights1.txt");

                //Adding items to players inventory.
                PlayerInventory.setPlayerCurrency(1, 12);
                PlayerInventory.setGauntlets(false, true);

                try {
                    while (true) {
                        scan.nextLine();
                        userInput = scan.nextInt();
                        if (userInput == 1) {
                            Java.Game.Magician.TheMagistrum.first();
                        } else if (userInput == 2) {
                            TheWesternSteeps.first();
                        } else {
                            System.out.println("Invalid entry");
                            System.out.println("Please enter '1' or '2'!");
                            scan.nextLine();
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid entry");
                    System.out.println("Please enter '1' or '2'!");
                    scan.nextLine();
                }
            } else if (i == 2) {
                //Loot The Wights Two - One destruction magic book - Tier one -  "A complete introduction to elemental magic" and 3 silver coins. A great find, if your a magician!
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\LootTheWightsResult\\DefeatedTrioOfWightsLoot\\3 - LootTheWights2.txt");

                //Adding items to players inventory.
                PlayerInventory.setPlayerCurrency(0, 8);
                PlayerInventory.setShortSwords(false, true);

                try {
                    while (true) {
                        scan.nextLine();
                        userInput = scan.nextInt();
                        if (userInput == 1) {
                            Java.Game.Magician.TheMagistrum.first();
                        } else if (userInput == 2) {
                            TheWesternSteeps.first();
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid entry");
                    System.out.println("Please enter '1' or '2'!");
                    scan.nextLine();
                }
            } else if (i == 3) {
                //Loot The Wights Three - Nothing but rags and crumbs. Unlucky!
                readFromTextFile("TextFiles\\Magician\\Scenes\\TheMagistrum\\LootTheWightsResult\\DefeatedTrioOfWightsLoot\\3 - LootTheWights3.txt");

                //Adding items to players inventory.
                PlayerInventory.setPlayerCurrency(4, 3);
                PlayerInventory.setMagicRings(true);

                try {
                    while (true) {
                        scan.nextLine();
                        userInput = scan.nextInt();
                        if (userInput == 1) {
                            Java.Game.Magician.TheMagistrum.first();
                        } else if (userInput == 2) {
                            TheWesternSteeps.first();
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid entry");
                    System.out.println("Please enter '1' or '2'!");
                    scan.nextLine();
                }
            }

        }
    }

    private static void playerVictory() throws IOException {
        if (WightBattleSceneControl == 2) {
            //Description of combat and health.
            System.out.println("You defeated the Wight's!");
            System.out.println("Your health is " + PlayerStats.get(1) + "/" + PlayerStats.get(0));

            //Increasing players Experience.
            PlayerSkills.experience = PlayerSkills.experience + 87;

            //Increasing player skills.
            PlayerSkills.ElementalMagic++;

            WightBattleSceneControl = 3;

            //Defeated Trio of wights.
            readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\LeaveThroughTheOtherDoorResult\\DefeatedTrioOfWights.txt");
        } else if (WightBattleSceneControl == 1) {
            //Description of combat and health.
            System.out.println("You defeated the Wight's!");
            System.out.println("Your health is " + PlayerStats.get(1) + "/" + PlayerStats.get(0));

            //Increasing players Experience.
            PlayerSkills.experience = PlayerSkills.experience + 247;

            PlayerStats = Magician.getStats(Stats.PlayerStats);

            WightBattleSceneControl = 3;

            //Resetting Health
            int Luck = PlayerStats.get(9);
            Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), PlayerStats.get(1), PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), Luck);

            //Reducing player health by damage amount taken.
            int CurrentHealth = PlayerStats.get(1);
            CurrentHealth = CurrentHealth - 4;

            //Defeated group of wights.
            readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\LeaveThroughTheOtherDoorResult\\DefeatedGroupOfWights.txt");
        }

        while (true) {
            try {
                scan.nextLine();
                userInput = scan.nextInt();
                if (userInput == 1) {
                    //Enter The Magistrum.
                    Java.Game.Magician.TheMagistrum.first();
                } else if (userInput == 2) {
                    //Loot THe Wights.
                    lootTheWights();
                } else {
                    System.out.println("Invalid entry!");
                    System.out.println("Please enter '1', '2', '3' or '4'.");
                    scan.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry!");
                System.out.println("Please enter '1', '2', '3' or '4'.");
                scan.nextLine();
            }
        }
    }

    private static void enemyVictory() {
        System.out.println("You died!\n");
        System.out.println("Would you like to revert to checkpoint? - (press 1)");
        System.out.println("Would you like to quit? - (press 2)");

        //Died Reset Trigger.
        WightBattleSceneControl = 1;

        PlayerStats = Magician.getStats(Stats.PlayerStats);

        //Resetting Health
        int MaxHealth = PlayerStats.get(0);
        Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), MaxHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));

        while (true) {
            try {
                scan.nextLine();
                userInput = scan.nextInt();
                if (userInput == 1) {
                    try {
                        //Restart.
                        Awakening.first();
                    } catch (IOException e) {

                    }
                } else if (userInput == 2) {
                    //Exit
                    System.exit(0);
                } else {
                    System.out.println("Invalid entry");
                    System.out.println("Please enter '1', '2', '3' or '4'.");
                    scan.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry!");
                System.out.println("Please enter '1', '2', '3' or '4'.");
                scan.nextLine();
            }
        }
    }

    private static void playerDeath() {
        System.out.println("You died!\n");
        System.out.println("Would you like to revert to checkpoint? - (press 1)");
        System.out.println("Would you like to quit? - (press 2)");

        //Died Reset Trigger.
        WightBattleSceneControl = 1;

        PlayerStats = Magician.getStats(Stats.PlayerStats);

        //Resetting Health
        int MaxHealth = PlayerStats.get(0);
        Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), MaxHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));

        while (true) {
            try {
                scan.nextLine();
                userInput = scan.nextInt();
                if (userInput == 1) {
                    try {
                        //Restart.
                        Awakening.first();
                    } catch (IOException e) {

                    }
                } else if (userInput == 2) {
                    //Exit
                    System.exit(0);
                } else {
                    System.out.println("Invalid entry");
                    System.out.println("Please enter '1', '2', '3' or '4'.");
                    scan.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry!");
                System.out.println("Please enter '1', '2', '3' or '4'.");
                scan.nextLine();
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