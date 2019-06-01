package Java.GraphicalUserInterface;

//Importing external library's
import Java.Game.CharacterCreation;
import javafx.application.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

public class MainMenu extends Application {

    private Stage window;
    private Scene PrimaryMenu, HelpMenu;


    @Override
    public void start(Stage primaryStage) {

        //Setting the primary stage
        window = primaryStage;


        /////////////////////////////
        /////////New Layout//////////
        /////////////////////////////

        //MainMenu Layout...
        ///////
        /////

        //Main Text of MainMenu
        Text Intro = new Text("Welcome to the lands of Progma!\n" +
                "But be wary, many danger's lurk...\n");

        //Positioning label
        Intro.setTranslateY(30);
        Intro.setTranslateX(450);
        Intro.setFill(Color.LIGHTSLATEGRAY);

        //NewGame Button
        //
        Button NewGame = new Button("New Game");
        NewGame.setTranslateY(40);
        NewGame.setTranslateX(450);
        NewGame.setMaxWidth(120);
        NewGame.setMaxHeight(30);
        NewGame.setOnAction(e -> NewGame());

        //Help Button
        //
        Button Help = new Button("Help");
        Help.setTranslateY(35);
        Help.setTranslateX(450);
        Help.setOnAction(e -> window.setScene(HelpMenu));
        Help.setMaxWidth(120);
        Help.setMaxHeight(30);

        //Exit Button
        //
        Button Exit = new Button("Exit");
        Exit.setTranslateY(35);
        Exit.setTranslateX(450);
        Exit.setOnAction(e -> Platform.exit());
        Exit.setMaxWidth(120);
        Exit.setMaxHeight(30);

        //LayoutMainMenu...
        VBox LayoutMainMenu = new VBox(20);

        //Setting the background image of the scene MainMenu...
        LayoutMainMenu.setBackground(new Background(new BackgroundImage(new
                Image("Images/Art/MainMenu.gif"), null, null, null, new BackgroundSize(100,
                100, true, true, true, false))));

        //Adding items to the layout-LayoutMainMenu
        LayoutMainMenu.getChildren().addAll(Intro, NewGame, Help, Exit);
        PrimaryMenu = new Scene(LayoutMainMenu, 960, 576);
        /////
        ///////
        //End of MainMenu Layout...

        /////////////////////////////
        /////////New Layout//////////
        /////////////////////////////

        //HelpMenu Layout...
        ///////
        /////

        //Main label of Help Menu
        Text HelpInfo = new Text("When prompted a question enter a highlighted \n" +
                "choice, such as 'Yes' or 'No'. \n" + "\n" +

                "Highlighted choices are any text or number \n" +
                "that is contained between the two symbols \n" +
                "this arrow here is pointing to --->  ''\n" + "\n" +

                "What case you enter the highlighted \n" +
                "choices does not matter. \n" +
                "The spelling of the words however does.\n" + "\n" +

                "This game is not a walk in the park\n" +
                "You must come prepared and think things through,\n" +
                "Or be ruthlessly crushed again and again.\n" + "\n" +

                "This game is very through with many stats,\n" +
                "abilities, outcomes, items, locations, enemies and more.\n" +
                "So explore the world and enjoy its many surprises.\n"
        );


        //Positioning and Editing Text
        HelpInfo.setTranslateY(-120);
        HelpInfo.setTranslateX(300);
        HelpInfo.setFill(Color.LIGHTSLATEGRAY);

        //Return Button
        //
        Button Return = new Button("Return");
        Return.setTranslateY(260);
        Return.setTranslateX(0);
        Return.setOnAction(e -> window.setScene(PrimaryMenu));
        Return.setMaxWidth(120);
        Return.setMaxHeight(30);

        //LayoutHelp
        StackPane LayoutHelp = new StackPane();

        //Setting the background image of the scene MainMenu...
        LayoutHelp.setBackground(new Background(new BackgroundImage(new
                Image("Images/Art/HelpMenu.gif"), null, null, null, new BackgroundSize(100,
                100, true, true, true, true))));


        //Adding items to the layout-LayoutHelp
        LayoutHelp.getChildren().addAll(Return, HelpInfo);
        HelpMenu = new Scene(LayoutHelp, 960, 576);
        /////
        ///////
        //End of HelpMenu Layout...


        //Scene Control
        //Display scene one at first
        window.setScene(PrimaryMenu);
        window.setTitle("Progma");
        window.show();
    }

    private static void NewGame() {
        CharacterCreation.Initialize();
    }
}
