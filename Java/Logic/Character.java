package Java.Logic;

import java.io.*;

@SuppressWarnings("Duplicates")
public class  Character {

    //Player variables
    //Base Stats
    private double CurrentHealth;
    private double MaxHealth;
    private double Intelligence;
    private double Personality;
    private double Willpower;
    private double Endurance;
    private double Strength;
    private double Agility;
    private double Speed;
    private double Luck;

    //Advanced Stats
    private double MaxPhysicalAttackDamage;
    private double MinPhysicalAttackDamage;
    private double MaxMagicalAttackDamage;
    private double MinMagicalAttackDamage;
    private double PhysicalDefense;
    private double MagicalDefense;
    private double ClimbingChance;
    private double DodgeChance;
    private double SneakChance;

    //////////////////////////
    ////Physical Methods/////
    ////////////////////////

    public int getMaxPhysicalAttackDamage(String EnemyOrPlayerStatLocation) {
        try {
            FileInputStream fstream = new FileInputStream(EnemyOrPlayerStatLocation);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            java.util.ArrayList<String> list = new java.util.ArrayList<String>();
            while ((strLine = br.readLine()) != null) {
                if(strLine.charAt(0) == (int)strLine.charAt(0) && strLine.charAt(1) == (int)strLine.charAt(1)) {
                    String number = strLine.substring(0 , 2);
                    list.add(number.replace(" ",""));
                }
            }
            //Setting MaxPhysicalAttackDamage from .txt
            Speed = Integer.parseInt(list.get(6));
            Strength = Integer.parseInt(list.get(8));
            in.close();
            fstream.close();
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        MaxPhysicalAttackDamage = (Speed / 5) * (Strength / 6);
        MaxPhysicalAttackDamage = Math.round(MaxPhysicalAttackDamage);
        return (int)MaxPhysicalAttackDamage;
    }

    public int getMinPhysicalAttackDamage(String EnemyOrPlayerStatLocation) {
        try {
            FileInputStream fstream = new FileInputStream(EnemyOrPlayerStatLocation);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            java.util.ArrayList<String> list = new java.util.ArrayList<>();
            while ((strLine = br.readLine()) != null) {
                if(strLine.charAt(0) == (int)strLine.charAt(0) && strLine.charAt(1) == (int)strLine.charAt(1)) {
                    String number = strLine.substring(0 , 2);
                    list.add(number.replace(" ",""));
                }
            }
            //Setting MinPhysicalAttackDamage from .txt
            Speed = Integer.parseInt(list.get(6));
            Strength = Integer.parseInt(list.get(8));
            in.close();
            fstream.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        MinPhysicalAttackDamage = (Speed / 8) * (Strength / 9);
        MinPhysicalAttackDamage = Math.round(MinPhysicalAttackDamage);
        return (int)MinPhysicalAttackDamage;
    }

    public int getPhysicalDefense(String EnemyOrPlayerStatLocation) {
        try {
            FileInputStream fstream = new FileInputStream(EnemyOrPlayerStatLocation);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            java.util.ArrayList<String> list = new java.util.ArrayList<>();
            while ((strLine = br.readLine()) != null) {
                if(strLine.charAt(0) == (int)strLine.charAt(0) && strLine.charAt(1) == (int)strLine.charAt(1)) {
                    String number = strLine.substring(0 , 2);
                    list.add(number.replace(" ",""));
                }
            }
            //Setting PhysicalDefense from .txt
            Endurance = Integer.parseInt(list.get(5));
            Strength = Integer.parseInt(list.get(6));
            in.close();
            fstream.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        PhysicalDefense = (Strength /10) + (Endurance /4);
        PhysicalDefense = Math.round(PhysicalDefense);
        return (int)PhysicalDefense;
    }

    public int getDodgeChance(String EnemyOrPlayerStatLocation) {
        try {
            FileInputStream fstream = new FileInputStream(EnemyOrPlayerStatLocation);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            java.util.ArrayList<String> list = new java.util.ArrayList<>();
            while ((strLine = br.readLine()) != null) {
                if(strLine.charAt(0) == (int)strLine.charAt(0) && strLine.charAt(1) == (int)strLine.charAt(1)) {
                    String number = strLine.substring(0 , 2);
                    list.add(number.replace(" ",""));
                }
            }
            //Setting DodgeChance from .txt
            Speed = Integer.parseInt(list.get(5));
            Strength = Integer.parseInt(list.get(6));
            in.close();
            fstream.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        DodgeChance = (Speed / 4) + (Agility / 3);
        DodgeChance = Math.round(DodgeChance);
        return (int)DodgeChance;
    }

    /////////////////////////
    ////Magical Methods/////
    ///////////////////////

    public int getMaxMagicalAttackDamage(String EnemyOrPlayerStatLocation) {
        try {
            FileInputStream fstream = new FileInputStream(EnemyOrPlayerStatLocation);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            java.util.ArrayList<String> list = new java.util.ArrayList<>();
            while ((strLine = br.readLine()) != null) {
                if(strLine.charAt(0) == (int)strLine.charAt(0) && strLine.charAt(1) == (int)strLine.charAt(1)) {
                    String number = strLine.substring(0 , 2);
                    list.add(number.replace(" ",""));
                }
            }
            //Setting MaxMagicalAttackDamage from .txt
            Intelligence = Integer.parseInt(list.get(2));
            Personality = Integer.parseInt(list.get(3));
            in.close();
            fstream.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        MaxMagicalAttackDamage = (Intelligence / 3) + (Personality/6);
        MaxMagicalAttackDamage = Math.round(MaxMagicalAttackDamage);
        return (int)MaxMagicalAttackDamage;
    }

    public int getMinMagicalAttackDamage(String EnemyOrPlayerStatLocation) {
        try {
            FileInputStream fstream = new FileInputStream(EnemyOrPlayerStatLocation);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            java.util.ArrayList<String> list = new java.util.ArrayList<>();
            while ((strLine = br.readLine()) != null) {
                if(strLine.charAt(0) == (int)strLine.charAt(0) && strLine.charAt(1) == (int)strLine.charAt(1)) {
                    String number = strLine.substring(0 , 2);
                    list.add(number.replace(" ",""));
                }
            }
            //Setting MinMagicalAttackDamage from .txt
            Intelligence = Integer.parseInt(list.get(2));
            Personality = Integer.parseInt(list.get(3));
            in.close();
            fstream.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        MinMagicalAttackDamage = (Intelligence / 3) + (Personality/6);
        MinMagicalAttackDamage = Math.round(MinMagicalAttackDamage);
        return (int)MinMagicalAttackDamage;
    }

    public int getMagicalDefense(String EnemyOrPlayerStatLocation) {
        try {
            FileInputStream fstream = new FileInputStream(EnemyOrPlayerStatLocation);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            java.util.ArrayList<String> list = new java.util.ArrayList<>();
            while ((strLine = br.readLine()) != null) {
                if(strLine.charAt(0) == (int)strLine.charAt(0) && strLine.charAt(1) == (int)strLine.charAt(1)) {
                    String number = strLine.substring(0 , 2);
                    list.add(number.replace(" ",""));
                }
            }
            //Setting MinMagicalAttackDamage from .txt
            Willpower = Integer.parseInt(list.get(4));
            Luck = Integer.parseInt(list.get(9));
            in.close();
            fstream.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        MagicalDefense = (Luck / 6) * (Willpower / 5);
        MagicalDefense = Math.round(MagicalDefense);
        return (int)MagicalDefense;
    }

    /////////////////////////
    ////Sneak Methods///////
    ///////////////////////

    public int getSneakChance(String EnemyOrPlayerStatLocation) {
        try {
            FileInputStream fstream = new FileInputStream(EnemyOrPlayerStatLocation);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            java.util.ArrayList<String> list = new java.util.ArrayList<>();
            while ((strLine = br.readLine()) != null) {
                if(strLine.charAt(0) == (int)strLine.charAt(0) && strLine.charAt(1) == (int)strLine.charAt(1)) {
                    String number = strLine.substring(0 , 2);
                    list.add(number.replace(" ",""));
                }
            }
            //Setting SneakChance from .txt
            Agility = Integer.parseInt(list.get(7));
            Speed = Integer.parseInt(list.get(8));
            Luck = Integer.parseInt(list.get(9));
            in.close();
            fstream.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        SneakChance = (Luck / 4) * (Agility - (Agility / 2) + (Speed / 4));
        SneakChance = Math.round(SneakChance);
        return (int)SneakChance;
    }

    public int getClimbingChance(String EnemyOrPlayerStatLocation) {
        try {
            FileInputStream fstream = new FileInputStream(EnemyOrPlayerStatLocation);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            java.util.ArrayList<String> list = new java.util.ArrayList<>();
            while ((strLine = br.readLine()) != null) {
                if(strLine.charAt(0) == (int)strLine.charAt(0) && strLine.charAt(1) == (int)strLine.charAt(1)) {
                    String number = strLine.substring(0 , 2);
                    list.add(number.replace(" ",""));
                }
            }
            //Setting ClimbingChance from .txt
            Agility = Integer.parseInt(list.get(6));
            Strength = Integer.parseInt(list.get(7));
            in.close();
            fstream.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        SneakChance = (Agility / 3) + (Strength - (Strength / 2));
        SneakChance = Math.round(SneakChance);
        return (int)SneakChance;
    }

    public java.util.ArrayList<Integer> getStats(String EnemyOrPlayerStatLocation) {
        java.util.ArrayList<Integer> Stats = new java.util.ArrayList<>();
        try {
            FileInputStream fstream = new FileInputStream(EnemyOrPlayerStatLocation);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            java.util.ArrayList<String> list = new java.util.ArrayList<>();
            while ((strLine = br.readLine()) != null) {
                if(strLine.charAt(0) == (int)strLine.charAt(0) && strLine.charAt(1) == (int)strLine.charAt(1)) {
                    String number = strLine.substring(0 , 2);
                    list.add(number.replace(" ",""));
                }
            }
            int x = 0;
            while(x < 10){
                Stats.add(Integer.parseInt(list.get(x)));
                x++;
            }
            in.close();
            fstream.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Stats;
    }

    public void updateStats(String EnemyOrPlayerStatLocation, int MaxHealth, int CurrentHealth, int Intelligence, int Personality, int Willpower, int Endurance, int Strength, int Agility, int Speed, int Luck) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String content = MaxHealth + " - Max Health\n" + CurrentHealth + " - Current Health\n" + Intelligence + " - Intelligence\n" + Personality + " - Personality\n" +
                    Willpower + " - Willpower\n" + Endurance + " - Endurance\n" + Strength + " - Strength\n" + Agility + " - Agility\n" + Speed + " - Speed\n" + Luck + " - Luck";

            fw = new FileWriter(EnemyOrPlayerStatLocation);
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
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void setSkillLevels(int TwoHanded, int OneHanded, int DualWeild, int Block, int Swimming, int Climbing,int Running, int Jumping, int ElementalMagic, int SpellCasting, int DeathMagic, int DarkMagic) {
        PlayerSkills.TwoHanded = TwoHanded;
        PlayerSkills.OneHanded = OneHanded;
        PlayerSkills.DualWield = DualWeild;
        PlayerSkills.Block = Block;
        PlayerSkills.Swimming = Swimming;
        PlayerSkills.Climbing = Climbing;
        PlayerSkills.Running = Running;
        PlayerSkills.Jumping = Jumping;
        PlayerSkills.ElementalMagic = ElementalMagic;
        PlayerSkills.SpellCasting = SpellCasting;
        PlayerSkills.DeathMagic = DeathMagic;
        PlayerSkills.DarkMagic = DarkMagic;
    }
}

