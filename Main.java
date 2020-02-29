import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;


public class Main extends Application {

    Stage window;

    public static void main(String[] args)  {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        //Stage creation

        this.window = primaryStage;

        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btnDot = new Button(".");
        Button btnPlus = new Button("+");
        Button btnMin = new Button("-");
        Button btnMult = new Button("x");
        Button btnDiv = new Button("\u00F7");
        Button btnEqual = new Button("=");
        Button btnDEL = new Button("Del");
        Button btnC = new Button("C");

        TextField numDisplay = new TextField("0");

        VBox mainBox = new VBox();

        HBox firstRow = new HBox();
        HBox secondRow = new HBox();
        HBox thirdRow = new HBox();
        HBox fourthRow = new HBox();
        HBox fifthRow = new HBox();
        HBox sixthRow = new HBox();

        //Create handlers
        ButtonHandler bh0 = new ButtonHandler("0", numDisplay);
        ButtonHandler bh1 = new ButtonHandler("1", numDisplay);
        ButtonHandler bh2 = new ButtonHandler("2", numDisplay);
        ButtonHandler bh3 = new ButtonHandler("3", numDisplay);
        ButtonHandler bh4 = new ButtonHandler("4", numDisplay);
        ButtonHandler bh5 = new ButtonHandler("5", numDisplay);
        ButtonHandler bh6 = new ButtonHandler("6", numDisplay);
        ButtonHandler bh7 = new ButtonHandler("7", numDisplay);
        ButtonHandler bh8 = new ButtonHandler("8", numDisplay);
        ButtonHandler bh9 = new ButtonHandler("9", numDisplay);
        ButtonHandler bhDot = new ButtonHandler(".", numDisplay);
        ButtonHandler bhPlus = new ButtonHandler("+", numDisplay);
        ButtonHandler bhMin = new ButtonHandler("-", numDisplay);
        ButtonHandler bhMult = new ButtonHandler("*", numDisplay);
        ButtonHandler bhDiv = new ButtonHandler("/", numDisplay);

        DeleteHandler dh = new DeleteHandler(numDisplay);
        ClearHandler ch = new ClearHandler(numDisplay);

        SubmitHandler sh = new SubmitHandler(numDisplay);

        //Add handlers


        btn0.setOnAction(bh0);
        btn1.setOnAction(bh1);
        btn2.setOnAction(bh2);
        btn3.setOnAction(bh3);
        btn4.setOnAction(bh4);
        btn5.setOnAction(bh5);
        btn6.setOnAction(bh6);
        btn7.setOnAction(bh7);
        btn8.setOnAction(bh8);
        btn9.setOnAction(bh9);
        btnDot.setOnAction(bhDot);
        btnPlus.setOnAction(bhPlus);
        btnMin.setOnAction(bhMin);
        btnMult.setOnAction(bhMult);
        btnDiv.setOnAction(bhDiv);
        btnDEL.setOnAction(dh);
        btnC.setOnAction(ch);
        btnEqual.setOnAction(sh);

        //Add styles


        mainBox.getStyleClass().add("mainWindow");
        mainBox.setAlignment(Pos.CENTER);

        for(HBox b : Arrays.asList(firstRow, secondRow, thirdRow, fourthRow, fifthRow, sixthRow)) {
            b.setAlignment(Pos.CENTER);
        }

        numDisplay.setEditable(false);
        numDisplay.setDisable(true);
        firstRow.setPadding(new Insets(0, 5, 10, 5));
        sixthRow.setPadding(new Insets(10, 0, 0, 0));


        //Add items to grid

        firstRow.getChildren().addAll(new Node[]{numDisplay});
        secondRow.getChildren().addAll(new Node[]{btn7, btn8, btn9, btnDiv});
        thirdRow.getChildren().addAll(new Node[]{ btn4, btn5, btn6, btnMult});
        fourthRow.getChildren().addAll(new Node[]{btn1, btn2, btn3, btnMin});
        fifthRow.getChildren().addAll(new Node[] {btn0, btnDot, btnEqual, btnPlus});
        sixthRow.getChildren().addAll(new Node[] {btnDEL, btnC});

        mainBox.getChildren().addAll(new Node[]{firstRow, secondRow, thirdRow, fourthRow, fifthRow, sixthRow});


        //Display stage

        Scene mainStage = new Scene(mainBox, 350,350);
        mainStage.getStylesheets().add("styles.css");


        window.setScene(mainStage);
        window.setTitle("Module 3B");
        window.show();
    }
}
