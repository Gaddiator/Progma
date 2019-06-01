package Java.Logic;

//import javax.management.Attribute;?

public class Stats {

    //Location of txt files holding information of player and enemy stats.
    public static String PlayerStats = "src//TextFiles//Magician//Stats//PlayerStats.txt";
    public static String TrioOfWightsStats = "src//TextFiles//Magician//EnemyStats//Bane.txt";
    public static String GroupOfWightsStats = "src//TextFiles//Magician//EnemyStats//GroupOfWightsStats.txt";
    public static String BaneStats = "src//TextFiles//Magician//EnemyStats//TrioOfWights.txt";

    //Player Level
    public static int attributePoints = 0;
    public static int learningPoints = 0;
    public static int experience = 0;

    //Level-1                       //Level-6
    static int level1 = 150;        static int level6 = 1750;

    //Level-2                       //Level-7
    static int level2 = 375;        static int level7 = 2250;

    //Level-3                       //Level-8
    static int level3 = 600;        static int level8 = 2450;

    //Level-4                       //Level-9
    static int level4 = 1000;       static int level9 = 3000;

    //Level-5                       //Level-10
    static int level5 = 1200;       static int level10 = 3700;

    public void LevelUp(int lvl1, int lvl2, int lvl3, int lvl4,  int lvl5, int lvl6, int lvl7, int lvl8, int lvl9, int lvl10, int exp) {
        lvl1 = level1;
        lvl2 = level2;
        lvl3 = level3;
        lvl4 = level4;
        lvl5 = level5;
        lvl6 = level6;
        lvl7 = level7;
        lvl8 = level8;
        lvl9 = level9;
        lvl10 = level10;
        exp = experience;

        if(exp >= lvl1) {
            System.out.println("Through blood and guts. - You've reached level 1!");
            System.out.println("You have gained 3 attribute points, spend them wisely");
            attributePoints = attributePoints + 3;
        }
        if(exp >= lvl2) {
            System.out.println("You've reached level 2!");
            System.out.println("You have gained 4 attribute points, spend them wisely");
            attributePoints = attributePoints + 4;
        }
        if(exp >= lvl3) {
            System.out.println("You've reached level 3!");
            System.out.println("You have gained 5 attribute points, spend them wisely");
            attributePoints = attributePoints + 4;
        }
        if(exp >= lvl4) {
            System.out.println("You've reached level 4!");
            System.out.println("You have gained 2 attribute points, spend them wisely");
            attributePoints = attributePoints + 2;
        }
        if(exp >= lvl5) {
            System.out.println("Learning slowly, yet slowly learning. - You've reached level 5!");
            System.out.println("You have gained 4 attribute points, spend them wisely");
            attributePoints = attributePoints + 4;
        }
        if(exp >= lvl6) {
            System.out.println("You've reached level 6!");
            System.out.println("You have gained 4 attribute points, spend them wisely");
            attributePoints = attributePoints + 4;
        }
        if(exp >= lvl7) {
            System.out.println("Things are starting to become clearer. - You've reached level 7!");
            System.out.println("You have gained 3 attribute points, spend them wisely");
            attributePoints = attributePoints + 3;

        }
        if(exp >= lvl8) {
            System.out.println("You've reached level 8!");
            System.out.println("You have gained 5 attribute points, spend them wisely");
            attributePoints = attributePoints + 5;

        }
        if(exp >= lvl9) {
            System.out.println("You've reached level 9!");
            System.out.println("You have gained 3 attribute points, spend them wisely");
            attributePoints = attributePoints + 4;

        }
        if(exp >= lvl10) {
            System.out.println("Still alive then I see, impressive. - you've reached level 10!");
            System.out.println("You have gained 10 attribute points, spend them wisely");
            attributePoints = attributePoints + 4;
        }
    }

    public void spendLearningPoints() {
        System.out.println("You are overcome from a sudden wave of dizziness and before you know what has happened you are sucked into what seems to be an alternate reality");
        System.out.println("When your head clears you open you eyes and see...");

        //SkillPoint system
        System.out.println("This is the SkillPoint system. When you level up every now and again you will earn skill points.");
        System.out.println("When you spend these skill points you will be asked to choose a skill to advance and by how many skill points to advance it.");
        System.out.println("Depending on the skills you decided to advance you will pulled into a related visions and gain experience from the visions toward your skill");
        System.out.println("Your character does not understand what is happening to them and this becomes a quest in itself to uncover your magical learning powers");

        //Make learning outcome class for all skills.
    }
}





