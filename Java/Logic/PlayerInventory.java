package Java.Logic;

import java.io.*;

@SuppressWarnings("SameParameterValue")
public class PlayerInventory {

    public static int getPlayerGold(){
        int Gold = 0;

        try (BufferedReader SilverReader = new BufferedReader(new FileReader("src\\TextFiles\\Magician\\Inventory\\Currency\\GoldAndSilver.txt"))) {
            String line;
            while ((line = SilverReader.readLine()) != null) {
                if (line.charAt(5) == (int) line.charAt(5)) {
                    String amount = line.substring(5,6);
                    Gold = Integer.parseInt(amount);
                } else if (line.charAt(5) == (int) line.charAt(5) && line.charAt(6) == (int) line.charAt(6)) {
                    String amount = line.substring(5,7);
                    Gold = Integer.parseInt(amount);
                } else if (line.charAt(5) == (int) line.charAt(5) && line.charAt(6) == (int) line.charAt(6) && line.charAt(7) == (int) line.charAt(7)) {
                    String amount = line.substring(5, 8);
                    Gold = Integer.parseInt(amount);
                } else if (line.charAt(5) == (int) line.charAt(5) && line.charAt(6) == (int) line.charAt(6) && line.charAt(7) == (int) line.charAt(7) && line.charAt(8) == (int) line.charAt(8)) {
                    String amount = line.substring(5, 9);
                    Gold = Integer.parseInt(amount);
                }
            }
        } catch (IOException e) {
            System.out.println("Error file not found\n" + e);
        }
        return Gold;
    }

/*//    public static int getPlayerSilver(){
//        int Silver = 0;
//
//        try (BufferedReader SilverReader = new BufferedReader(new FileReader("src\\TextFiles\\Magician\\Inventory\\Currency\\GoldAndSilver.txt"))) {
//            String line;
//            while ((line = SilverReader.readLine()) != null) {
//                if (line.charAt(5) == (int) line.charAt(5) && line.charAt(6) != (int) line.charAt(6)) {
//                    String amount = line.substring(0, 1);
//                    Silver = Integer.parseInt(amount);
//                } else if (line.charAt(5) == (int) line.charAt(5) && line.charAt(6) == (int) line.charAt(6)) {
//                    String amount = line.substring(0, 2);
//                    Silver = Integer.parseInt(amount);
//                } else if (line.charAt(5) == (int) line.charAt(5) && line.charAt(6) == (int) line.charAt(6) && line.charAt(7) == (int) line.charAt(7)) {
//                    String amount = line.substring(0, 3);
//                    Silver = Integer.parseInt(amount);
//                } else if (line.charAt(5) == (int) line.charAt(5) && line.charAt(6) == (int) line.charAt(6) && line.charAt(7) == (int) line.charAt(7) && line.charAt(8) == (int) line.charAt(8)) {
//                    String amount = line.substring(0, 4);
//                    Silver = Integer.parseInt(amount);
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Error file not found\n" + e);
//        }
//        return Silver;
//    }*/

    public static void setPlayerCurrency(int Gold, int Silver) {

    }

    public static void setArmouredRobes(boolean LightOakArmouredRobes, boolean LightMahoganyArmouredRobes, boolean LightIronArmouredRobes,boolean LightSteelArmouredRobes){
        int loar = 0;
        int lmar = 0;
        int liar = 0;
        int lsar = 0;

        if(LightOakArmouredRobes){
            loar = 1;
        }else if(!LightOakArmouredRobes){
            loar = 0;
        }
        if(LightMahoganyArmouredRobes){
            lmar = 1;
        }else if(!LightMahoganyArmouredRobes){
            lmar = 0;
        }
        if(LightIronArmouredRobes){
            liar = 1;
        }else if(!LightIronArmouredRobes){
            liar = 0;
        }
        if(LightSteelArmouredRobes){
            lsar = 1;
        }else if(!LightSteelArmouredRobes){
            lsar = 0;
        }

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String items = "LightOakArmouredRobes:" + loar + "\nLightMahoganyArmouredRobes:" + lmar + "\nLightIronArmouredRobes:" + liar + "\nLightSteelArmouredRobes:" + lsar;

            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Armours\\LightArmour\\ArmouredRobe's.txt");
            bw = new BufferedWriter(fw);
            bw.write(items);
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

    public static void setBoots(boolean LightOakBoots, boolean LightMahoganyBoots, boolean LightIronBoots,boolean LightSteelBoots){

        int lob = 0;
        int lmb = 0;
        int lib = 0;
        int lsb = 0;

        if(LightOakBoots){
            lob = 1;
        }else{
            lob = 0;
        }
        if(LightMahoganyBoots){
            lmb = 1;
        }else{
            lmb = 0;
        }
        if(LightIronBoots){
            lib = 1;
        }else {
            lib = 0;
        }
        if(LightSteelBoots){
            lsb = 1;
        } else {
            lsb = 0;
        }

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String items = "LightOakBoots:" + lob + "\nLightMahoganyBoots:" + lmb + "\nLightIronBoots:" + lib + "\nLightSteelBoots:" + lsb;

            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Armours\\LightArmour\\Boot's.txt");
            bw = new BufferedWriter(fw);
            bw.write(items);
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

    public static void setGauntlets(boolean LightIronGauntlets, boolean LightSteelGauntlets){

        int lig = 0;
        int lsg = 0;

        if(LightIronGauntlets){
            lig = 1;
        }else{
            lig = 0;
        }
        if(LightSteelGauntlets){
            lsg = 1;
        }else{
            lsg = 0;
        }

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String items = "LightIronGauntlets:" + lig + "\nLightSteelGauntlets:" + lsg;

            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Armours\\LightArmour\\Gauntlets.txt");
            bw = new BufferedWriter(fw);
            bw.write(items);
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

    public static void setJerkins(boolean FlexibleMediumLeatherArmour, boolean ToughMediumLeatherArmour, boolean FlexibleMediumFurArmour,boolean ToughMediumFurArmour){
        int fmla = 0;
        int tmla = 0;
        int fmfa = 0;
        int tmfa = 0;

        if(FlexibleMediumLeatherArmour){
            fmla = 1;
        }else{
            fmla = 0;
        }
        if(ToughMediumLeatherArmour){
            tmla = 1;
        }else{
            tmla = 0;
        }
        if(FlexibleMediumFurArmour){
            fmfa = 1;
        }else{
            fmfa = 0;
        }
        if(ToughMediumFurArmour){
            tmfa = 1;
        }else{
            tmfa = 0;
        }

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String items = "FlexibleMediumLeatherArmour:" + fmla + "\nToughMediumLeatherArmour:" + tmla + "\nFlexibleMediumFurArmour:" + fmfa + "\nToughMediumFurArmour:" + tmfa;

            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Armours\\MediumArmour\\Jerkin's.txt");
            bw = new BufferedWriter(fw);
            bw.write(items);
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

    public void setChestPlates(boolean HeavyIronPlate, boolean HeavySteelPlate, boolean HeavyIronChain,boolean HeavySteelChain){
        int hip = 0;
        int hsp = 0;
        int hic = 0;
        int hsc = 0;

        if(HeavyIronPlate){
            hip = 1;
        }else{
            hip = 0;
        }
        if(HeavySteelPlate){
            hsp = 1;
        }else{
            hsp = 0;
        }
        if(HeavyIronChain){
            hic = 1;
        }else{
            hic = 0;
        }
        if(HeavySteelChain){
            hsc = 1;
        }else{
            hsc = 0;
        }

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String items = "HeavyIronPlate:" + hip + "\nHeavySteelPlate:" + hsp + "\nHeavyIronChain:" + hic + "\nHeavySteelChain:" + hsc;

            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Armours\\HeavyArmour\\ChestPlate's.txt");
            bw = new BufferedWriter(fw);
            bw.write(items);
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

    public static void setDarkMagic(boolean Rupture, boolean Implode, boolean ShadowBlast) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        int rupture = 0;
        int implode = 0;
        int shadowBlast = 0;

        if(Rupture){
            rupture = 1;
        }else{
            rupture = 0;
        }
        if(Implode){
            implode = 1;
        }else{
            implode = 0;
        }
        if(ShadowBlast){
            shadowBlast = 1;
        }else {
            shadowBlast = 0;
        }

        try {
            String content = "Rupture:" + rupture + "\nImplode:" + implode;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Spells\\DarkMagic.txt\\OffensiveMagic.txt");
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

        try {
            String content = "ShadowBlast:" + shadowBlast;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Spells\\DarkMagic.txt\\ShadowMagic.txt");
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

    public static void setDeathMagic(boolean DrainLife, boolean ResurrectBoneWarrior) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        int drainLife = 0;
        int resurrectBoneWarrior = 0;

        if(DrainLife){
            drainLife = 1;
        }else{
            drainLife = 0;
        }
        if(ResurrectBoneWarrior){
            resurrectBoneWarrior = 1;
        }else{
            resurrectBoneWarrior = 0;
        }

        try {
            String content = "DrainLife:" + drainLife;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Spells\\DeathMagic\\LeechMagic.txt");
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

        try {
            String content = "ResurrectBoneWarrior:" + resurrectBoneWarrior;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Spells\\DeathMagic\\ResurrectionMagic.txt");
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

    public static void setElementalMagic(boolean Airburst, boolean DetectMovement, boolean RockBlast, boolean RockWall, boolean Fireball, boolean Incinerate, boolean IceCone, boolean Freeze) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        int airburst = 0;
        int detectMovement = 0;
        int rockBlast = 0;
        int rockWall = 0;
        int fireball = 0;
        int incinerate = 0;
        int iceCone = 0;
        int freeze = 0;

        if(Airburst){
            airburst = 1;
        }else{
            airburst = 0;
        }
        if(DetectMovement){
            detectMovement = 1;
        }else{
            detectMovement = 0;
        }
        if(RockBlast){
            rockBlast = 1;
        }else{
            rockBlast = 0;
        }
        if(RockWall){
            rockWall = 1;
        }else{
            rockWall = 0;
        }
        if(Fireball){
            fireball = 1;
        }else{
            fireball = 0;
        }
        if(Incinerate){
            incinerate = 1;
        }else{
            incinerate = 0;
        }
        if(IceCone){
            iceCone = 1;
        }else{
            iceCone = 0;
        }
        if(Freeze){
            freeze = 1;
        }else{
            freeze = 0;
        }

        try {
            String content = "Airburst:" + airburst + "\nDetectMovement:" + detectMovement;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Spells\\ElementalMagic\\Air.txt");
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

        try {
            String content = "RockBlast:" + rockBlast + "\nRockWall:" + rockWall;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Spells\\ElementalMagic\\Earth.txt");
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
        try {
            String content = "Fireball:" + fireball + "\nIncinerate:" + incinerate;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Spells\\ElementalMagic\\Fire.txt");
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

        try {
            String content = "IceCone:" + iceCone + "\nFreeze:" + freeze;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Spells\\ElementalMagic\\Water.txt");
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

    public static void setSpellCastingMagic(boolean ElectricityShield, boolean EnergyShield, boolean DetectLife, boolean DetectDeath, boolean ManipulateLight, boolean TransmuteLiquidToAcid) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        int electricityShield = 0;
        int energyShield = 0;
        int detectLife = 0;
        int detectDeath = 0;
        int manipulateLight = 0;
        int transmuteLiquidToAcid = 0;

        if(ElectricityShield){
            electricityShield = 1;
        }else{
            electricityShield = 0;
        }
        if(EnergyShield){
            energyShield = 1;
        }else{
            energyShield = 0;
        }
        if(DetectLife){
            detectLife = 1;
        }else{
            detectLife = 0;
        }
        if(DetectDeath){
            detectDeath = 1;
        }else{
            detectDeath = 0;
        }
        if(ManipulateLight){
            manipulateLight = 1;
        }else{
            manipulateLight = 0;
        }
        if(TransmuteLiquidToAcid){
            transmuteLiquidToAcid = 1;
        }else{
            transmuteLiquidToAcid = 0;
        }

        try {
            String content = "ElectricityShield:" + electricityShield + "\nEnergyShield:" + energyShield;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Spells\\SpellCasting\\DefensiveMagic.txt");
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

        try {
            String content = "DetectLife:" + detectLife + "\nDetectDeath:" + detectDeath;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Spells\\SpellCasting\\DetectionMagic.txt");
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

        try {
            String content = "ManipulateLight:" + manipulateLight;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Spells\\SpellCasting\\EnergyManipulationMagic.txt");
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

        try {
            String content = "TransmuteLiquidToAcid:" + transmuteLiquidToAcid;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Spells\\SpellCasting\\TransmutationMagic.txt");
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

    public static void setShortSwords(boolean IronShortsword, boolean SteelShortsword) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        int ironShortsword = 0;
        int steelShortsword = 0;

        if (IronShortsword) {
            steelShortsword = 1;
        } else {
            steelShortsword = 0;
        }
        if (SteelShortsword) {
            steelShortsword = 1;
        } else {
            steelShortsword = 0;
        }


        try {
            String content = "Iron Shortsword:" + ironShortsword + "\nSteel Shortsword:" + steelShortsword;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Weapons\\OneHanded\\ShortSwords.txt");
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

    public static void setMagicRings(boolean RingOfHealth) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        int ringOfHealth = 0;


        if (RingOfHealth) {
            ringOfHealth = 1;
        } else {
            ringOfHealth = 0;
        }

        try {
            String content = "RingOfHealth:" + RingOfHealth;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Armours\\Rings\\MagicRings.txt");
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

    public static void setDaggers(boolean IronDagger, boolean SteelDagger) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        int ironDagger = 0;
        int steelDagger = 0;

        if (IronDagger) {
            ironDagger = 1;
        } else {
            ironDagger = 0;
        }
        if (SteelDagger) {
            steelDagger = 1;
        } else {
            steelDagger = 0;
        }

        try {
            String content = "IronDagger:" + ironDagger+ "\nSteelDagger:" + steelDagger;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Weapons\\OneHanded\\Daggers.txt");
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

    public static void setMagicBooks(boolean ACompleteIntroductionToElementalMagic) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        int aCompleteIntroductionToElementalMagic = 0;

        if (ACompleteIntroductionToElementalMagic) {
            aCompleteIntroductionToElementalMagic = 1;
        } else {
            aCompleteIntroductionToElementalMagic = 0;
        }

        try {
            String content = "IronDagger:" + aCompleteIntroductionToElementalMagic;
            fw = new FileWriter("src\\TextFiles\\Magician\\Inventory\\Books\\MagicBooks.txt");
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
}