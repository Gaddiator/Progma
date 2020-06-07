//package Java.GraphicalUserInterface;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.image.Image;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class Inventory extends Application{
//
//    private Stage window;
//    private Scene PrimaryMenu, PlayerStats, PlayerSkills, PlayerArmour, PlayerWeapons, PlayerSpells;
//
//    @Override
//    public void start(Stage primaryStage) {
//
//        //Setting the primary stage
//        window = primaryStage;
//
//        /////////New Layout//////////
//        /////////////////////////////
//
//        //PrimaryMenu Layout...
//        ///////
//        /////
//
//        //Main Text of MainMenu
//        Text Intro = new Text("Inventory");
//
//        //Positioning labels
//        Intro.setTranslateY(30);
//        Intro.setTranslateX(450);
//        Intro.setFill(Color.LIGHTSLATEGRAY);
//        Intro.setFont(Font.font("Times New Roman", 30));
//
//        //StatsMenu Button
//        //
//        Button StatsMenu = new Button("Player Stats");
//        StatsMenu.setTranslateY(40);
//        StatsMenu.setTranslateX(450);
//        StatsMenu.setMaxWidth(120);
//        StatsMenu.setMaxHeight(30);
//        StatsMenu.setOnAction(e -> window.setScene(PlayerStats));
//
//        //SkillsMenu Button
//        //
//        Button SkillsMenu = new Button("Player Skills");
//        SkillsMenu.setTranslateY(50);
//        SkillsMenu.setTranslateX(450);
//        SkillsMenu.setMaxWidth(120);
//        SkillsMenu.setMaxHeight(30);
//        SkillsMenu.setOnAction(e -> window.setScene(PlayerSkills));
//
//        //ArmourMenu Button
//        //
//        Button ArmourMenu = new Button("Player Armour");
//        ArmourMenu.setTranslateY(60);
//        ArmourMenu.setTranslateX(450);
//        ArmourMenu.setMaxWidth(120);
//        ArmourMenu.setMaxHeight(30);
//        ArmourMenu.setOnAction(e -> window.setScene(PlayerArmour));
//
//        //WeaponsMenu Button
//        //
//        Button WeaponsMenu = new Button("Player Weapons");
//        WeaponsMenu.setTranslateY(70);
//        WeaponsMenu.setTranslateX(450);
//        WeaponsMenu.setMaxWidth(120);
//        WeaponsMenu.setMaxHeight(30);
//        WeaponsMenu.setOnAction(e -> window.setScene(PlayerWeapons));
//
//        //SpellsMenu Button
//        //
//        Button SpellsMenu = new Button("Player Spells");
//        SpellsMenu.setTranslateY(80);
//        SpellsMenu.setTranslateX(450);
//        SpellsMenu.setMaxWidth(120);
//        SpellsMenu.setMaxHeight(30);
//        SpellsMenu.setOnAction(e -> window.setScene(PlayerSpells));
//
//        //LayoutPrimaryMenu...
//        VBox LayoutPrimaryMenu = new VBox(20);
//        //Setting the background image of the scene MainMenu...
//        LayoutPrimaryMenu.setBackground(new Background(new BackgroundImage(new
//                Image("Images/Art/DarkFantasy3.gif"), null, null, null, new BackgroundSize(100,
//                100, true, true, true, false))));
//
//        //Adding items to the layout-LayoutMainMenu
//        LayoutPrimaryMenu.getChildren().addAll(Intro, StatsMenu, SkillsMenu, ArmourMenu, WeaponsMenu, SpellsMenu);
//        PrimaryMenu = new Scene(LayoutPrimaryMenu, 960, 576);
//        /////
//        ///////
//        //End of PrimaryMenu Layout...
//
//
//        /////////////////////////////
//        /////////New Layout//////////
//        /////////////////////////////
//
//        //PlayerStats Layout...
//        ///////
//        /////
//
//        //Main Text of MainMenu
//        Text MenuName = new Text("Player Stats");
//
//        //Positioning label
//        MenuName.setTranslateY(30);
//        MenuName.setTranslateX(437);
//        MenuName.setFill(Color.LIGHTSLATEGRAY);
//        MenuName.setFont(Font.font("Times New Roman", 30));
//
//        //returnToPrimaryMenu Button
//        //
//        Button returnToPrimaryMenu = new Button("Main Menu");
//        returnToPrimaryMenu.setTranslateY(40);
//        returnToPrimaryMenu.setTranslateX(450);
//        returnToPrimaryMenu.setMaxWidth(120);
//        returnToPrimaryMenu.setMaxHeight(30);
//        returnToPrimaryMenu.setOnAction(e -> window.setScene(PrimaryMenu));
//
//        //LayoutStatsMenu...
//        VBox LayoutStatsMenu = new VBox(20);
//        //Setting the background image of the scene PlayerStats...
//        LayoutStatsMenu.setBackground(new Background(new BackgroundImage(new
//                Image("Images/Art/DarkFantasy.gif"), null, null, null, new BackgroundSize(100,
//                100, true, true, true, true))));
//
//        //Adding items to the layout-LayoutMainMenu
//        LayoutStatsMenu.getChildren().addAll(MenuName, returnToPrimaryMenu);
//        PlayerStats = new Scene(LayoutStatsMenu, 960, 576);
//        /////
//        ///////
//        //End of PlayerStats Layout...
//
//
//        /////////////////////////////
//        /////////New Layout//////////
//        /////////////////////////////
//
//        //PlayerSkills Layout...
//        ///////
//        /////
//
//        //Main Text of MainMenu
//        Text MenuName1 = new Text("Player Skills");
//
//        //Positioning label
//        MenuName1.setTranslateY(30);
//        MenuName1.setTranslateX(437);
//        MenuName1.setFill(Color.LIGHTSLATEGRAY);
//        MenuName1.setFont(Font.font("Times New Roman", 30));
//
//        //returnToPrimaryMenu Button
//        //
//        Button returnToPrimaryMenu1 = new Button("Main Menu");
//        returnToPrimaryMenu1.setTranslateY(40);
//        returnToPrimaryMenu1.setTranslateX(450);
//        returnToPrimaryMenu1.setMaxWidth(120);
//        returnToPrimaryMenu1.setMaxHeight(30);
//        returnToPrimaryMenu1.setOnAction(e -> window.setScene(PrimaryMenu));
//
//        //LayoutSkillsMenu...
//        VBox LayoutSkillsMenu = new VBox(20);
//        //Setting the background image of the scene PlayerSkills...
//        LayoutSkillsMenu.setBackground(new Background(new BackgroundImage(new
//                Image("Images/Art/DarkFantasy2.gif"), null, null, null, new BackgroundSize(100,
//                100, true, true, true, false))));
//
//        //Adding items to the layout-LayoutMainMenu
//        LayoutSkillsMenu.getChildren().addAll(MenuName1, returnToPrimaryMenu1);
//        PlayerSkills = new Scene(LayoutSkillsMenu, 960, 576);
//        /////
//        ///////
//        //End of PlayerSkills Layout...
//
//
//        /////////////////////////////
//        /////////New Layout//////////
//        /////////////////////////////
//
//        //PlayerArmour Layout...
//        ///////
//        /////
//
//        //Main Text of MainMenu
//        Text MenuName2 = new Text("Player Armour");
//
//        //Positioning label
//        MenuName2.setTranslateY(30);
//        MenuName2.setTranslateX(422);
//        MenuName2.setFill(Color.LIGHTSLATEGRAY);
//        MenuName2.setFont(Font.font("Times New Roman", 30));
//
//        //returnToPrimaryMenu Button
//        //
//        Button returnToPrimaryMenu2 = new Button("Main Menu");
//        returnToPrimaryMenu2.setTranslateY(40);
//        returnToPrimaryMenu2.setTranslateX(450);
//        returnToPrimaryMenu2.setMaxWidth(120);
//        returnToPrimaryMenu2.setMaxHeight(30);
//        returnToPrimaryMenu2.setOnAction(e -> window.setScene(PrimaryMenu));
//
//        //LayoutSkillsMenu...
//        VBox LayoutArmourMenu = new VBox(20);
//        //Setting the background image of the scene PlayerSkills...
//        LayoutArmourMenu.setBackground(new Background(new BackgroundImage(new
//                Image("Images/Art/HelpMenu.gif"), null, null, null, new BackgroundSize(100,
//                100, true, true, true, false))));
//
//        //Adding items to the layout-LayoutMainMenu
//        LayoutArmourMenu.getChildren().addAll(MenuName2, returnToPrimaryMenu2);
//        PlayerArmour = new Scene(LayoutArmourMenu, 960, 576);
//        /////
//        ///////
//        //End of PlayerArmour Layout...
//
//
//        /////////////////////////////
//        /////////New Layout//////////
//        /////////////////////////////
//
//        //PlayerWeapons Layout...
//        ///////
//        /////
//
//        //Main Text of MainMenu
//        Text MenuName3 = new Text("Player Weapons");
//
//        //Positioning label
//        MenuName3.setTranslateY(30);
//        MenuName3.setTranslateX(413);
//        MenuName3.setFill(Color.LIGHTSLATEGRAY);
//        MenuName3.setFont(Font.font("Times New Roman", 30));
//
//        //returnToPrimaryMenu Button
//        //
//        Button returnToPrimaryMenu3 = new Button("Main Menu");
//        returnToPrimaryMenu3.setTranslateY(40);
//        returnToPrimaryMenu3.setTranslateX(450);
//        returnToPrimaryMenu3.setMaxWidth(120);
//        returnToPrimaryMenu3.setMaxHeight(30);
//        returnToPrimaryMenu3.setOnAction(e -> window.setScene(PrimaryMenu));
//
//        //LayoutSkillsMenu...
//        VBox LayoutWeaponsMenu = new VBox(20);
//        //Setting the background image of the scene PlayerSkills...
//        LayoutWeaponsMenu.setBackground(new Background(new BackgroundImage(new
//                Image("Images/Art/DarkFantasy1.gif"), null, null, null, new BackgroundSize(100,
//                100, true, true, true, false))));
//
//        //Adding items to the layout-LayoutMainMenu
//        LayoutWeaponsMenu.getChildren().addAll(MenuName3, returnToPrimaryMenu3);
//        PlayerWeapons = new Scene(LayoutWeaponsMenu, 960, 576);
//        /////
//        ///////
//        //End of PlayerWeapons Layout...
//
//
//        /////////////////////////////
//        /////////New Layout//////////
//        /////////////////////////////
//
//        //PlayerSpells Layout...
//        ///////
//        /////
//
//        //Main Text of MainMenu
//        Text MenuName4 = new Text("Player Spells");
//
//        //Positioning label
//        MenuName4.setTranslateY(30);
//        MenuName4.setTranslateX(430);
//        MenuName4.setFill(Color.LIGHTSLATEGRAY);
//        MenuName4.setFont(Font.font("Times New Roman", 30));
//
//        //returnToPrimaryMenu Button
//        //
//        Button returnToPrimaryMenu4 = new Button("Main Menu");
//        returnToPrimaryMenu4.setTranslateY(40);
//        returnToPrimaryMenu4.setTranslateX(450);
//        returnToPrimaryMenu4.setMaxWidth(120);
//        returnToPrimaryMenu4.setMaxHeight(30);
//        returnToPrimaryMenu4.setOnAction(e -> window.setScene(PrimaryMenu));
//
//        //LayoutSkillsMenu...
//        VBox LayoutSpellsMenu = new VBox(20);
//        //Setting the background image of the scene PlayerSkills...
//        LayoutSpellsMenu.setBackground(new Background(new BackgroundImage(new
//                Image("Images/Art/DarkFantasy4.gif"), null, null, null, new BackgroundSize(100,
//                100, true, true, true, false))));
//
//        //Adding items to the layout-LayoutMainMenu
//        LayoutSpellsMenu.getChildren().addAll(MenuName4, returnToPrimaryMenu4);
//        PlayerSpells = new Scene(LayoutSpellsMenu, 960, 576);
//        /////
//        ///////
//        //End of PlayerSpells Layout...
//
//        //Scene Control
//        //Display scene one at first
//        window.setScene(PrimaryMenu);
//        window.setTitle("Inventory");
//        window.show();
//    }
//}