//package Java.GraphicalUserInterface;
//
////Importing external library's
//import javafx.application.*;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.stage.*;
//import javafx.scene.*;
//import javafx.scene.layout.*;
//import javafx.scene.text.Text;
//
//public class Terminal extends Application {
//
//    private String inputText = "";
//    private Button next = new Button("Continue");
//    private TextField input = new TextField();
//
//    @Override
//    public void start(Stage primaryStage) {
//        Stage window;
//        Scene Main;
//        String outputText;
//
//
//        outputText = "Game text here!, story stuff here...";
//
//        //Setting the primary stage
//        window = primaryStage;
//        primaryStage.setResizable(false);
//        primaryStage.setTitle("Progma");
//
//        /////////////////////////////
//        /////////New Layout//////////
//        /////////////////////////////
//
//        //Terminal Layout...
//        ///////
//        /////
//
//        //LayoutTerminal...
//        VBox LayoutTerminal = new VBox(20);
//
//        input.setTranslateY(550.5);
//        input.setMaxWidth(880);
//        input.setMinWidth(880);
//
//        Text output = new Text(outputText);
//        output.setTranslateY(-44);
//        output.setFont(Font.font("Verdana"));
//        output.setFill(Color.valueOf("GREY"));
//
//
//        next.setTranslateX(880);
//        next.setTranslateY(469.7);
//        next.setMaxWidth(78.5);
//        next.setMinWidth(78.5);
//
//        next.setOnAction(action -> {
//            inputText = input.getText();
//            System.out.println(inputText);
//        });
//
//        //Setting the background image of the scene MainMenu...
//        LayoutTerminal.setBackground(new Background(new BackgroundImage(new
//                Image("././Images/System/TerminalBackground.jpg"), null, null, null, new BackgroundSize(100,
//                100, true, true, true, false))));
//
//        //Adding items to the layout-LayoutMainMenu
//        LayoutTerminal.getChildren().addAll(input, output, next);
//        Main = new Scene(LayoutTerminal, 960, 576);
//
//
//        //Scene Control
//        //Display scene one at first
//        window.setScene(Main);
//        window.setTitle("Progma");
//        window.show();
//    }
//}