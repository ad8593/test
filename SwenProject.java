/*
Aleksa Doda
GUI Design

fACTORY dESIGN pATTERNS - youtube 
*/

import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  
import javafx.stage.Stage;  
import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.event.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.stage.FileChooser.*;
import javafx.geometry.*;
import java.util.*;
import java.io.*;

import javafx.scene.text.Text.*;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

import static javafx.application.Application.launch;

public class SwenProject extends Application implements EventHandler<ActionEvent>{ 

   public static Scanner scanner = new Scanner(System.in);
   public static ArrayList<String> food = new ArrayList<>();
   public static ArrayList<Double> foodcalo = new ArrayList<>();
   public static ArrayList<Double> foodpax = new ArrayList<>();
   public static ArrayList<Double> foodcarbo = new ArrayList<>();
   public static ArrayList<Double> foodfats = new ArrayList<>();
   public static ArrayList<Double> foodpro = new ArrayList<>();
   public static ArrayList<String> foodname = new ArrayList<>();

   public static String foodCSVPath = "food.csv";
   public static String dailyCSV = "src/SWENkostur/daily.csv";
   public static String excreciseCSV = "src/SWENkostur/exercise.csv";

   // save stage as an attribute
   private Stage stage; 
   private Scene scene; 

   StackPane pane = new StackPane();

   private  ImageView iv = new ImageView("p.jpg");
   private Label inftx = new Label("Welcome to our application!");
   private  Label l1 = new Label("Would you like to continue with today's date?");
   private Button btnYes = new Button("Yes");
   private  Button btnNo = new Button("No, I will put another");
   private  TextField tfDate = new TextField();
   private  Label dateL = new Label();
   private  Label question2 = new Label("What would you like to add?");
   private  Label question3 = new Label("Enter date in format: day/month/year, save it, and choose below:");
   private  Label question4 = new Label("Enter food name, calorie, fat, carbohydrates and protein. EX: Hot Dog,147.0,13.6,1.1,5.1");
   private  TextField tfFood = new TextField();
   private Button btnRec = new Button("Recipe");
   private Button btnFod = new Button("Food");
   private Button btnSD = new Button("Save Date");
   private Button btnSF = new Button("Save Food");
   
   public static void main(String[] args) {
      launch(args);
   }
   
  // @Override 
   public void start(final Stage _stage) throws Exception {    
   
      stage = _stage;
   
   
      pane.setMinWidth(900);
      pane.setMinHeight(600);
         
      pane.getChildren().add(iv);
      pane.getChildren().add(inftx);
      pane.getChildren().add(btnYes);
      pane.getChildren().add(btnNo);
      pane.getChildren().add(l1);
      pane.getChildren().add(question2);
      pane.getChildren().add(question3);
      pane.getChildren().add(tfDate);
      pane.getChildren().add(dateL);
      pane.getChildren().add(btnRec);
      pane.getChildren().add(btnFod);
      pane.getChildren().add(btnSD);
      pane.getChildren().add(tfFood);
      pane.getChildren().add(question4);
      pane.getChildren().add(btnSF);
      
      StackPane.setAlignment(inftx, Pos.TOP_CENTER); 
      //StackPane.setAlignment(l1, Pos.CENTER_LEFT); 
      //l1.setPadding(new Insets(10, 100, 380, 50));
      
      //btnYes.setPadding(new Insets(10, 10, 10, 10));    
     // pane.setMargin(tfield, new Insets(100, 560, 400, 50));  
         
      pane.setMargin(l1, new Insets(10, 200, 500, -200));  
      pane.setMargin(btnYes, new Insets(10, 400, 400, -250));    
      pane.setMargin(btnNo, new Insets(10, 345, 400, -100));  
      pane.setMargin(dateL, new Insets(80, 345, 400, -300));  
      pane.setMargin(question3, new Insets(160, 200, 500, -200));  
      pane.setMargin(tfDate, new Insets(220, 600, 500, 130));  
      pane.setMargin(btnSD, new Insets(300, 600, 500, 130));
      pane.setMargin(question2, new Insets(360, 200, 500, -200)); 
      pane.setMargin(btnRec, new Insets(420, 600, 500, 130));
      pane.setMargin(btnFod, new Insets(420, 600, 500, 250));  
      pane.setMargin(question4, new Insets(480, 300, 500, 100));  
      pane.setMargin(tfFood, new Insets(550, 600, 500, 130)); 
      pane.setMargin(btnSF, new Insets(600, 600, 500, 130));  
      tfDate.setPrefWidth(30);
      
      question2.setVisible(false);
      question3.setVisible(false);  
      tfDate.setVisible(false);
      btnSD.setVisible(false); 
      btnRec.setVisible(false); 
      btnFod.setVisible(false); 
      question4.setVisible(false);
      tfFood.setVisible(false);
      btnSF.setVisible(false);
      
      tfDate.setStyle("-fx-border-color: #81c483;\r\n" +
         "    -fx-border-width: 3px;\r\n" +
         "    -fx-border-style: solid;");
      tfFood.setStyle("-fx-border-color: #81c483;\r\n" +
         "    -fx-border-width: 3px;\r\n" +
         "    -fx-border-style: solid;");
   
      btnYes.setStyle("-fx-border-color: #81c483;\r\n" +
         "    -fx-border-width: 3px;\r\n" +
          "    -fx-position: absolute;\r\n" +
         "    -fx-border-style: solid;");
         
      btnNo.setStyle("-fx-border-color: #81c483;\r\n" +
         "    -fx-border-width: 3px;\r\n" +
         "    -fx-border-style: solid;");
         
      btnRec.setStyle("-fx-border-color: #81c483;\r\n" +
         "    -fx-border-width: 3px;\r\n" +
         "    -fx-border-style: solid;");
         
      btnFod.setStyle("-fx-border-color: #81c483;\r\n" +
         "    -fx-border-width: 3px;\r\n" +
         "    -fx-border-style: solid;");
      
      btnSD.setStyle("-fx-border-color: #81c483;\r\n" +
         "    -fx-border-width: 3px;\r\n" +
         "    -fx-border-style: solid;");
      
      btnSF.setStyle("-fx-border-color: #81c483;\r\n" +
         "    -fx-border-width: 3px;\r\n" +
         "    -fx-border-style: solid;");
      
      pane.setBackground(new Background(new BackgroundFill(Color.web("#81c483"), CornerRadii.EMPTY, Insets.EMPTY)));
      
     // pane.setPadding(new Insets(50, 50, 50, 50));
   
      pane.setAlignment(Pos.CENTER);
   
      //Setting the position of the image 
      iv.setX(25); 
      iv.setY(30); 
      
      //setting the fit height and width of the image view 
      iv.setFitHeight(655); 
      iv.setFitWidth(955); 
      
      inftx.setFont(new Font("Arial", 30));
      inftx.setTextFill(Color.web("#3b6941"));
      
      l1.setFont(new Font("Arial", 15));
      l1.setTextFill(Color.web("#3b6941"));
      l1.setAlignment(Pos.TOP_LEFT);  
      
      question2.setFont(new Font("Arial", 15));
      question2.setTextFill(Color.web("#3b6941"));
      question2.setAlignment(Pos.TOP_LEFT);    
      
      question3.setFont(new Font("Arial", 15));
      question3.setTextFill(Color.web("#3b6941"));
      question3.setAlignment(Pos.TOP_LEFT); 
      
      question4.setFont(new Font("Arial", 15));
      question4.setTextFill(Color.web("#3b6941"));
      question4.setAlignment(Pos.TOP_LEFT);   
     //  
   //       question2.setFont(new Font("Arial", 20));
   //       question2.setTextFill(Color.web("#3b6941"));
   //       question2.setAlignment(Pos.TOP_LEFT);   
   //       
      // inftx.setContentDisplay(ContentDisplay.TOP); 
   
      
      btnYes.setOnAction
            (
         new EventHandler<ActionEvent>() {
            public void handle(ActionEvent evt) {
               DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
               LocalDateTime now = LocalDateTime.now();  
               System.out.println(dtf.format(now));  
               dateL.setText(dtf.format(now)); 
               
               question2.setVisible(true); 
               question3.setVisible(false); 
               dateL.setVisible(true);    
               tfDate.setVisible(false);  
               btnSD.setVisible(false);  
               btnRec.setVisible(true); 
               btnFod.setVisible(true);        
            }
         });
         
      btnNo.setOnAction
            (
         new EventHandler<ActionEvent>() {
            public void handle(ActionEvent evt) {
               question3.setVisible(true); 
               question2.setVisible(false);                
               dateL.setVisible(false);
               tfDate.setVisible(true); 
               btnSD.setVisible(true); 
               btnRec.setVisible(true); 
               btnFod.setVisible(true); 
               question2.setVisible(true);
            }
         });
         
      btnFod.setOnAction
            (
         new EventHandler<ActionEvent>() {
            public void handle(ActionEvent evt) {
               question4.setVisible(true); 
               tfFood.setVisible(true);    
               btnSF.setVisible(true);     
            
            }
         });
         
      btnSF.setOnAction
            (
         new EventHandler<ActionEvent>() {
            public void handle(ActionEvent evt) {               
               
               try (PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter("food.csv", true)))) {
                  out.println(tfFood.getText());
               } catch (IOException ioe) {
                  ioe.printStackTrace();
               }
            }
         });
         
      
      //Creating a scene object 
      Scene scene = new Scene(pane, 1000, 700);  
      
      //Setting title to the Stage 
      stage.setTitle("Loading an image");  
            
      //Adding scene to the stage 
      stage.setScene(scene);
      
      //btnYes.setOnAction(this);
       
      // scene color
      scene.setFill(Color.web("#81c483"));
      
      //Displaying the contents of the stage 
      stage.show(); 
      //this.handle(new ActionEvent());
   }  

   public void handle(ActionEvent evt) {
   
      Button btn = (Button)evt.getSource(); 
   
      switch(btn.getText()) {
         case "Yes":                     
            break;
         case "btnNo":
            btnYes.setVisible(false);
            break; 
      }
   }
}  
  
   	   








