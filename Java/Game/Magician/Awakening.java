package Java.Game.Magician;

import Java.Logic.*;
import Java.Logic.Character;

import static Java.Logic.Utilities.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class Awakening {

    private static int i = 0;

    public static void main(String[] args) throws IOException {
        first();
    }

    public static void first() throws IOException {

        //Declaring Scanners
        Scanner scan = new Scanner(System.in);
        readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\SceneDescription.txt");

        while (i == 0) {
            UserInput = scan.nextInt();
            if (UserInput == 1) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\1 - SummonMagicalLight.txt");
                PlayerInventory.setSpellCastingMagic(false, false, false, false, true, false);
                SummonMagicalLightOutcome();
                i++;
            } else if (UserInput == 2) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\2 - LeaveThroughTheMainDoor.txt");
                LeaveThroughTheMainDoorOutcome();
                i++;
            } else if (UserInput == 3) {
                if (WightBattleSceneControl == 0) {
                    readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\3 - LeaveThroughTheOtherDoor1.txt");
                    i++;
                } else if (WightBattleSceneControl == 1) {
                    readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\3 - LeaveThroughTheOtherDoor2.txt");
                    i++;
                }

            } else if (UserInput == 4) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\4 - CastDetectLifeSpell.txt");
                //E:\Progma\src\TextFiles\Magician\Scenes\Awakening\4 - CastDetectLifeSpell.txt
                PlayerInventory.setElementalMagic(true, false, false, false, false, false, false, false);
                PlayerInventory.setSpellCastingMagic(false, false, true, false, false, false);
                PlayerSkills.ElementalMagic++;
                PlayerSkills.SpellCasting++;
                CastDetectLifeSpellOutcome();
                i++;
            } else {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1', '2', '3' or '4'.");
            }
        }
    }

    private static void CastDetectLifeSpellOutcome() throws IOException {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while (i == 0) {
            Utilities.UserInput = scan.nextInt();
            if (UserInput == 1) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\CastDetectLifeSpellResult\\1 - TurnAndRun.txt");
                UserInput = scan.nextInt();
                if (UserInput == 1) {
                    first();
                } else if (UserInput == 2) {
                    System.exit(0);
                }
            } else if (UserInput == 2) {
                WightBattleSceneControl++;
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\CastDetectLifeSpellResult\\2 - BlastOneWithAFireball.txt");
                Character Magician = new Character();
                java.util.ArrayList<Integer> PlayerStats;

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
                int j = 0;
                while (j == 0) {
                    UserInput = scan.nextInt();
                    if (UserInput == 1) {
                        j++;
                        i++;
                        TheWesternSteeps.first();
                    } else if (UserInput == 2) {
                        j++;
                        i++;
                        LeaveThroughTheOtherDoorOutcome();
                    } else {
                        System.out.println("Invalid entry");
                        System.out.println("Please enter '1' or '2'.");
                    }
                }
            } else if (UserInput == 3) {
                WightBattleSceneControl++;
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\CastDetectLifeSpellResult\\3 - ExplodeOneWithMagic.txt");
                Character Magician = new Character();

                //Getting player stats
                java.util.ArrayList<Integer> PlayerStats;
                PlayerStats = Magician.getStats(Stats.PlayerStats);

                //Reducing player health by damage amount taken
                int CurrentHealth = PlayerStats.get(1);
                CurrentHealth = CurrentHealth - 4;

                System.out.println("Your health is " + CurrentHealth + "/" + PlayerStats.get(0));

                Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), CurrentHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));
                int j = 0;
                while (j == 0) {
                    UserInput = scan.nextInt();
                    if (UserInput == 1) {
                        j++;
                        i++;
                        TheWesternSteeps.first();
                    } else if (UserInput == 2) {
                        j++;
                        i++;
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
        }
    }

    private static void SummonMagicalLightOutcome() throws IOException {
        Scanner scan = new Scanner(System.in);
        int j = 0;
        while (j == 0) {
            UserInput = scan.nextInt();
            if (UserInput == 1) {
                WightBattleSceneControl++;
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\SummonMagicalLightResult\\1 - DirectTheLightIntoTheirEyes.txt");
                PlayerSkills.ElementalMagic++;
                PlayerSkills.SpellCasting++;
                int i = 0;
                while (i == 0) {
                    UserInput = scan.nextInt();
                    if (UserInput == 1) {
                        j++;
                        i++;
                        LeaveThroughTheMainDoorOutcome();
                    } else if (UserInput == 2) {
                        j++;
                        i++;
                        LeaveThroughTheOtherDoorOutcome();
                    } else {
                        System.out.println("Invalid entry");
                        System.out.println("Please enter '1' or '2'!");
                    }
                }
            } else if (UserInput == 2) {
                WightBattleSceneControl++;
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\SummonMagicalLightResult\\2 - BlastOneWithAFireball.txt");
                PlayerInventory.setElementalMagic(true, false, false, false, true, false, false, false);
                PlayerSkills.ElementalMagic++;

                int i = 0;
                while (i == 0) {
                    UserInput = scan.nextInt();
                    if (UserInput == 1) {
                        j++;
                        i++;
                        TheWesternSteeps.first();
                    } else if (UserInput == 2) {
                        j++;
                        i++;
                        LeaveThroughTheOtherDoorOutcome();
                    } else {
                        System.out.println("Invalid entry");
                        System.out.println("Please enter '1' or '2'!");
                    }
                }
            } else if (UserInput == 3) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\SummonMagicalLightResult\\3 - TurnAndRun.txt");
                int i = 0;
                while (i == 0) {
                    UserInput = scan.nextInt();
                    if (UserInput == 1) {
                        j++;
                        i++;
                        first();
                    } else {
                        System.exit(0);
                    }
                }
            } else if (UserInput == 4) {
                readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\SummonMagicalLightResult\\4 - ExplodeOneWithMagic.txt");
                PlayerSkills.DarkMagic++;
                PlayerSkills.ElementalMagic++;
                int i = 0;
                while (i == 0) {
                    UserInput = scan.nextInt();
                    if (UserInput == 1) {
                        j++;
                        i++;
                        TheWesternSteeps.first();
                    } else if (UserInput == 2) {
                        j++;
                        i++;
                        //LeaveThroughTheOtherDoorOutcome();
                    } else {
                        System.out.println("Invalid entry. Please enter 1 or 2!");
                    }
                }

            } else {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1', '2', '3' or '4'.");
            }
        }
    }

    private static void LeaveThroughTheMainDoorOutcome() throws IOException {
        Scanner scan = new Scanner(System.in);
        if (WightBattleSceneControl == 1) {
            TheWesternSteeps.first();
        } else {
            int i = 0;
            while (i == 0) {
                UserInput = scan.nextInt();
                if (UserInput == 1) {
                    readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\LeaveThroughTheMainDoorResult\\1 - BlastThemWithAir.txt");
                    //Demo complete...
                    PlayerInventory.setElementalMagic(true, false, false, false, false, false, false, false);
                    PlayerSkills.ElementalMagic++;
                    i++;
                    TheWesternSteeps.first();
                } else if (UserInput == 2) {
                    readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\LeaveThroughTheMainDoorResult\\2 - ElectrolyzeYourself.txt");
                    Character Magician = new Character();

                    //Getting player stats
                    java.util.ArrayList<Integer> PlayerStats;
                    PlayerStats = Magician.getStats(Stats.PlayerStats);

                    //Reducing player health by damage amount taken
                    int CurrentHealth = PlayerStats.get(1);
                    CurrentHealth = CurrentHealth - 4;

                    System.out.println("Your health is " + CurrentHealth + "/" + PlayerStats.get(0));

                    Magician.updateStats(Stats.PlayerStats, PlayerStats.get(0), CurrentHealth, PlayerStats.get(2), PlayerStats.get(3), PlayerStats.get(4), PlayerStats.get(5), PlayerStats.get(6), PlayerStats.get(7), PlayerStats.get(8), PlayerStats.get(9));

                    //Demo complete...
                    PlayerInventory.setElementalMagic(false, false, false, false, false, false, true, false);
                    PlayerInventory.setSpellCastingMagic(true, false, false, false, false, false);

                    PlayerSkills.ElementalMagic++;
                    PlayerSkills.SpellCasting++;
                    TheWesternSteeps.first();
                } else if (UserInput == 3) {
                    readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\LeaveThroughTheMainDoorResult\\3 - ImplodeOneWithMagic.txt");
                    PlayerInventory.setDarkMagic(false, true, true);
                    PlayerSkills.DarkMagic++;
                    TheWesternSteeps.first();
                } else if (UserInput == 4) {
                    try (BufferedReader ClassInfoReader = new BufferedReader(new FileReader("src\\TextFiles\\Magician\\Awakening\\SceneEventResults\\LeaveThroughTheMainDoorResult\\4 - CastAMagicalShield.txt"))) {
                        String line;
                        while ((line = ClassInfoReader.readLine()) != null) {
                            System.out.println(line);
                        }
                    }
                    readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\LeaveThroughTheMainDoorResult\\4 - CastAMagicalShield.txt");
                    PlayerInventory.setSpellCastingMagic(false, true, false, false, false, true);
                    PlayerSkills.SpellCasting++;
                    PlayerSkills.DarkMagic++;
                    TheWesternSteeps.first();
                } else {
                    System.out.println("Invalid entry");
                    System.out.println("Please enter '1', '2', '3' or '4'.");
                }
            }
        }
    }

    private static void LeaveThroughTheOtherDoorOutcome() throws IOException {
        Scanner scan = new Scanner(System.in);

        Character Magician = new Character();
        Character Wight = new Character();

        //Getting player stats
        java.util.ArrayList<Integer> PlayerStats;
        PlayerStats = Magician.getStats(Stats.PlayerStats);

        //Getting wights stats
        java.util.ArrayList<Integer> GroupOfWightsStats;
        GroupOfWightsStats = Wight.getStats(Stats.GroupOfWightsStats);

        if (WightBattleSceneControl == 0) {
            readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\3 - LeaveThroughTheOtherDoor1.txt");
            GroupOfWightsStats = Wight.getStats(Stats.GroupOfWightsStats);
        } else if (WightBattleSceneControl == 1) {
            readFromTextFile("src\\TextFiles\\Magician\\Scenes\\Awakening\\3 - LeaveThroughTheOtherDoor2.txt");
            GroupOfWightsStats = Wight.getStats(Stats.TrioOfWightsStats);
        }

        //Player variables
        //Base Stats
        int MaxHealth = PlayerStats.get(0);
        int CurrentHealth = PlayerStats.get(1);

        //Advanced Stats
        int MaxMagicalAttackDamage = Magician.getMaxMagicalAttackDamage(Stats.PlayerStats);
        int MinMagicalAttackDamage = Magician.getMinMagicalAttackDamage(Stats.PlayerStats);
        int PhysicalDefense = Magician.getPhysicalDefense(Stats.PlayerStats);
        //int DodgeChance = Magician.getDodgeChance(Stats.PlayerStats);


        //Enemy variables
        //Base Stats
        int EnemyMaxHealth = GroupOfWightsStats.get(0);
        int EnemyCurrentHealth = GroupOfWightsStats.get(1);

        //Advanced Stats
        int EnemyMaxPhysicalAttackDamage = Wight.getMaxPhysicalAttackDamage(Stats.GroupOfWightsStats);
        int EnemyMinPhysicalAttackDamage = Wight.getMinPhysicalAttackDamage(Stats.GroupOfWightsStats);
        int EnemyMagicalDefense = Wight.getMagicalDefense(Stats.GroupOfWightsStats);
        //int EnemyDodgeChance = Wight.getDodgeChance(Stats.GroupOfWightsStats);

        int i = 0;
        int x = 0;
        boolean isEnemyAlive = true;

        //Combat loop
        while (i == 0) {

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
                i++;
                playerVictory();
            } else if (CurrentHealth <= 0) {
                i++;
                System.out.println();
                enemyVictory();
            }
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void playerVictory() {
        Character Magician = new Character();

        //Getting player stats
        java.util.ArrayList<Integer> PlayerStats;
        PlayerStats = Magician.getStats(Stats.PlayerStats);

        System.out.println("\nYou defeated the Wight's!");
        PlayerInventory.setElementalMagic(false, false, false, false, true, false, false, false);
        PlayerSkills.ElementalMagic++;
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

    }

    private static void enemyVictory() {
        System.out.println("You died!\n");
        System.out.println("Would you like to revert to checkpoint? - (press 1)");
        System.out.println("Would you like to quit? - (press 2)");
        int i = 0;
        while (i == 0) {
            UserInput = scan.nextInt();
            if (UserInput == 1) {
                try {
                    Awakening.first();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                i++;
            } else if (UserInput == 2) {
                System.exit(0);
            } else {
                System.out.println("Invalid entry");
                System.out.println("Please enter '1', '2', '3' or '4'.");
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