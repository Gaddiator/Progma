package Java.Game.Magician;

//File Management.

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

//Error Management.
import java.util.InputMismatchException;
import java.io.IOException;

//Player Management.
import Java.Logic.PlayerInventory;
import Java.Logic.PlayerSkills;
import Java.Logic.Character;
import Java.Logic.Stats;


public class Awakening {
    //Initializing character data storage.
    private static java.util.ArrayList<Integer> PlayerStats = null;
    private static java.util.ArrayList<Integer> WightsStats = null;

    //Initializing character objects
    private static Character Magician = new Character();
    private static Character Wight = new Character();

    //Initializing input control.
    private static Scanner scan = new Scanner(System.in);
    private static int userInput = 0;

    //Initializing battle and loot scene controls.
    private static int WightBattleSceneControl = 0;
    private static int WightLootSceneControl = 0;

    //Initialize scene.
    public static void main(String[] args) throws IOException {
        first();
    }

    public static void first() throws IOException {
        //Scene description.
        readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\SceneDescription.txt");

        while (true) {
            try {
                userInput = scan.nextInt();
                if (userInput == 1) {
                    //Summon magical light.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\1 - SummonMagicalLight.txt");

                    //Adding spells to players inventory.
                    PlayerInventory.setSpellCastingMagic(false, false, false, false, true, false);

                    //Summon magical light.
                    SummonMagicalLightOutcome();
                } else if (userInput == 2) {
                    //Leave through the main door.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\2 - LeaveThroughTheMainDoor.txt");

                    //Leave through the main door.
                    LeaveThroughTheMainDoorOutcome();
                } else if (userInput == 3) {
                    //Leave through the other door.
                    if (WightBattleSceneControl == 0) {
                        readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\3 - LeaveThroughTheOtherDoor1.txt");
                    } else if (WightBattleSceneControl == 1) {
                        readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\3 - LeaveThroughTheOtherDoor2.txt");
                    }

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
        while (true) {
            try {
                userInput = scan.nextInt();
                if (userInput == 1) {
                    //Direct the light into their eyes.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\SummonMagicalLightResult\\1 - DirectTheLightIntoTheirEyes.txt");

                    //Increasing player skills.
                    PlayerSkills.ElementalMagic++;
                    PlayerSkills.SpellCasting++;
                    WightBattleSceneControl++;

                    while (true) {
                        try {
                            userInput = scan.nextInt();
                            if (userInput == 1) {
                                //Leave through the main door.
                                LeaveThroughTheMainDoorOutcome();
                            } else if (userInput == 2) {
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
                    WightBattleSceneControl++;

                    while (true) {
                        try {
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

                    while (true) {
                        try {
                            userInput = scan.nextInt();
                            if (userInput == 1) {
                                //First.
                                first();
                            } else if (userInput == 2) {
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

                    while (true) {
                        try {
                            userInput = scan.nextInt();
                            if (userInput == 1) {
                                //The western steeps.
                                TheWesternSteeps.first();
                            } else if (userInput == 2) {
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
        if (WightBattleSceneControl == 1) {
            //The western steeps.
            TheWesternSteeps.first();
        }

        while (true) {
            try {
                userInput = scan.nextInt();
                if (userInput == 1) {
                    //Blast them with air.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\LeaveThroughTheMainDoorResult\\1 - BlastThemWithAir.txt");

                    //Adding spells to players inventory.
                    PlayerInventory.setElementalMagic(true, false, false, false, false, false, false, false);

                    //Increasing player skills.
                    PlayerSkills.ElementalMagic++;

                    //The western steeps.
                    TheWesternSteeps.first();
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

                    //Updating stats.
                    Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), CurrentHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));
                    System.out.println("Your health is " + CurrentHealth + "/" + PlayerStats.get(0));

                    //Adding spells to players inventory.
                    PlayerInventory.setElementalMagic(false, false, false, false, false, false, true, false);
                    PlayerInventory.setSpellCastingMagic(true, false, false, false, false, false);

                    //Increasing player skills.
                    PlayerSkills.ElementalMagic++;
                    PlayerSkills.SpellCasting++;

                    //The western steeps.
                    TheWesternSteeps.first();
                } else if (userInput == 3) {
                    //Implode one with magic.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\LeaveThroughTheMainDoorResult\\3 - ImplodeOneWithMagic.txt");

                    //Adding spells to players inventory.
                    PlayerInventory.setDarkMagic(false, true, true);

                    //Increasing player skills.
                    PlayerSkills.DarkMagic++;

                    //The western steeps.
                    TheWesternSteeps.first();
                } else if (userInput == 4) {
                    //Cast a magical shield.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\LeaveThroughTheMainDoorResult\\4 - CastAMagicalShield.txt");

                    //Adding spells to players inventory.
                    PlayerInventory.setSpellCastingMagic(false, true, false, false, false, true);

                    //Increasing player skills.
                    PlayerSkills.SpellCasting++;
                    PlayerSkills.DarkMagic++;

                    //The western steeps.
                    TheWesternSteeps.first();
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

    private static void LeaveThroughTheOtherDoorOutcome() throws IOException {
        //Handling outcome
        if (WightBattleSceneControl == 0) {
            //Leave through the other door one.
            readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\3 - LeaveThroughTheOtherDoor1.txt");

            //Getting character stats.
            WightsStats = Wight.getStats(Stats.GroupOfWightsStats);
            PlayerStats = Magician.getStats(Stats.PlayerStats);
        } else if (WightBattleSceneControl == 1) {
            //Leave through the other door two.
            readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\3 - LeaveThroughTheOtherDoor2.txt");

            //Getting character stats.
            WightsStats = Wight.getStats(Stats.TrioOfWightsStats);
            PlayerStats = Magician.getStats(Stats.PlayerStats);
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

        while (true) {
            System.out.println("Continue... - (Press 1)");
            userInput = scan.nextInt();
            try {
                if (userInput == 1) {

                    while (true) {
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
                        }

                        if (EnemyCurrentHealth <= 0) {
                            Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), CurrentHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));
                            playerVictory();
                        } else if (CurrentHealth <= 0) {
                            System.out.println();
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
    private static void CastDetectLifeSpellOutcome() throws IOException {
        while (true) {
            try {
                userInput = scan.nextInt();
                if (userInput == 1) {
                    //Turn and run.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\CastDetectLifeSpellResult\\1 - TurnAndRun.txt");

                    userInput = scan.nextInt();
                    if (userInput == 1) {
                        first();
                    } else if (userInput == 2) {
                        System.exit(0);
                    }

                } else if (userInput == 2) {
                    //Blast one with a fireball.
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\CastDetectLifeSpellResult\\2 - BlastOneWithAFireball.txt");

                    java.util.ArrayList<Integer> PlayerStats;
                    Character Magician = new Character();

                    PlayerStats = Magician.getStats(Stats.PlayerStats);

                    int CurrentHealth = PlayerStats.get(1);
                    CurrentHealth = CurrentHealth - 4;

                    System.out.println("Your health is " + CurrentHealth + "/" + PlayerStats.get(0));
                    System.out.println("You have gained an experience level in Elemental Magic.\n");

                    System.out.println("You feel slightly shaken after the fight, its not everyday that you get to fight some wights.");
                    System.out.println("However after a few moments of uncertainty you decide that you need to get back on the move you make toward the...\n");

                    System.out.println("Main door. - (Press 1)");
                    System.out.println("Door to the magistrum. - (Press 2)");
                    Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), CurrentHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));

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
                        }
                    }
                } else if (userInput == 3) {
                    WightBattleSceneControl++;
                    readFromTextFile("TextFiles\\Magician\\Scenes\\Awakening\\CastDetectLifeSpellResult\\3 - ExplodeOneWithMagic.txt");

                    //Getting player stats
                    Character Magician = new Character();
                    java.util.ArrayList<Integer> PlayerStats;
                    PlayerStats = Magician.getStats(Stats.PlayerStats);

                    //Reducing player health by damage amount taken
                    int CurrentHealth = PlayerStats.get(1);
                    CurrentHealth = CurrentHealth - 4;
                    System.out.println("Your health is " + CurrentHealth + "/" + PlayerStats.get(0));
                    Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), CurrentHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));

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
                } else {
                    System.out.println("Invalid entry");
                    System.out.println("Please enter '1', '2' or '3'!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1', '2', '3' or '4'.");
            }
        }
    }

    private static void playerVictory() {
        //Getting player stats
        PlayerStats = Magician.getStats(Stats.PlayerStats);

        //Adding spells to players inventory.
        PlayerInventory.setElementalMagic(false, false, false, false, true, false, false, false);

        //Increasing player skills.
        PlayerSkills.ElementalMagic++;

        System.out.println("\nYou defeated the Wight's!");
        if (WightBattleSceneControl == 0) {
            System.out.println("You have gained a experience level in Elemental Magic!");
            System.out.println("You gained 143 experience points!");
            PlayerSkills.experience = PlayerSkills.experience + 143;
        } else if (WightBattleSceneControl == 1) {
            System.out.println("You have gained a experience level in Elemental Magic!");
            System.out.println("You gained 87 experience points!");
            PlayerSkills.experience = PlayerSkills.experience + 87;
        }
        System.out.println("Your health is " + PlayerStats.get(1) + "/" + PlayerStats.get(0));
        System.out.println("Development...");
    }

    private static void enemyVictory() {
        System.out.println("You died!\n");
        System.out.println("Would you like to revert to checkpoint? - (press 1)");
        System.out.println("Would you like to quit? - (press 2)");
        WightBattleSceneControl = 0;

        PlayerStats = Magician.getStats(Stats.PlayerStats);

        //Resetting Health
        int MaxHealth = PlayerStats.get(0);
        Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), MaxHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));

        while (true) {
            try {
                userInput = scan.nextInt();
                if (userInput == 1) {
                    try {
                        //Restart.
                        Awakening.first();
                    } catch (IOException e) {
                        e.printStackTrace();
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