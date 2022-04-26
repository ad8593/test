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


public class HealthCheckView extends Stage {

   // save stage as an attribute
   public Scene scene; 

   StackPane pane = new StackPane();

   ImageView iv = new ImageView("p.jpg");
   Label inftx = new Label("Welcome to our application!");
   Label l1 = new Label("Would you like to continue with today's date?");
   Button btnYes = new Button("Yes");
   Label dateL = new Label();
   Label question2 = new Label("Enter food or recipe in the text box:");
   Label question3 = new Label("Enter date in format: day/month/year, save it, and choose below:");
   Label question4 = new Label("Enter food name, calorie, fat, carbohydrates and protein. EX: Hot Dog,147.0,13.6,1.1,5.1");
   public TextField tfFood = new TextField();
   Button btnRec = new Button("Recipe");
   Button btnFod = new Button("Food");
   Button btnSD = new Button("Save Date");
   Button btnSF = new Button("Save Rec/Food");
   Label question5 = new Label("Do you need to delete any food?");
   Button btnYesDelete = new Button("Yes Delete");
   Button btnNoDelete = new Button("No");
   
   public HealthCheckView() {
      pane.setMinWidth(900);
      pane.setMinHeight(600);
               
      pane.getChildren().add(iv);
      pane.getChildren().add(inftx);
      pane.getChildren().add(btnYes);
      pane.getChildren().add(l1);
      pane.getChildren().add(question2);
      pane.getChildren().add(question3);
      pane.getChildren().add(dateL);
      pane.getChildren().add(btnRec);
      pane.getChildren().add(btnFod);
      pane.getChildren().add(btnSD);
      pane.getChildren().add(tfFood);
      pane.getChildren().add(question4);
      pane.getChildren().add(btnSF);
      pane.getChildren().add(question5);
      pane.getChildren().add(btnYesDelete);
      pane.getChildren().add(btnNoDelete);
      
      StackPane.setAlignment(inftx, Pos.TOP_CENTER);
      
      System.out.println("aaa"); 
         
      pane.setMargin(l1, new Insets(10, 200, 500, -200));  
      pane.setMargin(btnYes, new Insets(10, 400, 400, -250));  
      pane.setMargin(dateL, new Insets(80, 345, 400, -300));  
      pane.setMargin(question3, new Insets(160, 200, 500, -200)); 
      pane.setMargin(btnSD, new Insets(300, 600, 500, 130));
      pane.setMargin(question2, new Insets(360, 200, 500, -200)); 
      pane.setMargin(btnRec, new Insets(420, 600, 500, 130));
      pane.setMargin(btnFod, new Insets(420, 600, 500, 250));  
      pane.setMargin(question4, new Insets(480, 300, 500, 100));  
      pane.setMargin(tfFood, new Insets(550, 600, 500, 130)); 
      pane.setMargin(btnSF, new Insets(600, 600, 500, 130));
      pane.setMargin(question5, new Insets(200, 600, 50, 130));
      pane.setMargin(btnYesDelete, new Insets(200, 600, -40, 130));
      pane.setMargin(btnNoDelete, new Insets(200, 300, -40, 130));    
      
      question2.setVisible(false);
      question3.setVisible(false);  
      btnSD.setVisible(false); 
      btnRec.setVisible(false); 
      btnFod.setVisible(false); 
      question4.setVisible(false);
      tfFood.setVisible(false);
      btnSF.setVisible(false);
      question5.setVisible(false);
      btnYesDelete.setVisible(false); 
      btnNoDelete.setVisible(false); 
      
      tfFood.setStyle("-fx-border-color: #81c483;\r\n" +
         "    -fx-border-width: 3px;\r\n" +
         "    -fx-border-style: solid;");
   
      btnYes.setStyle("-fx-border-color: #81c483;\r\n" +
         "    -fx-border-width: 3px;\r\n" +
          "    -fx-position: absolute;\r\n" +
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
         
      btnYesDelete.setStyle("-fx-border-color: #81c483;\r\n" +
         "    -fx-border-width: 3px;\r\n" +
         "    -fx-border-style: solid;");
         
      btnNoDelete.setStyle("-fx-border-color: #81c483;\r\n" +
         "    -fx-border-width: 3px;\r\n" +
         "    -fx-border-style: solid;"); 
      
      pane.setBackground(new Background(new BackgroundFill(Color.web("#81c483"), CornerRadii.EMPTY, Insets.EMPTY))); 
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
      
      question5.setFont(new Font("Arial", 15));
      question5.setTextFill(Color.web("#3b6941"));
      question5.setAlignment(Pos.TOP_LEFT);     
      
      Scene scene = new Scene(pane, 1000, 700);  
      this.setTitle("Health Check App");  
      this.setScene(scene);
      //this.setFill(Color.web("#81c483"));
   }  
   
   public void setButtonActionEvent(EventHandler<ActionEvent> buttonEvent) {
      btnYes.setOnAction(buttonEvent);
      btnSF.setOnAction(buttonEvent);
      btnYesDelete.setOnAction(buttonEvent);
   }
   
   public void yesButtonClicked(String dati) { 
      dateL.setText(dati);
      
      question2.setVisible(true); 
      question3.setVisible(false); 
      dateL.setVisible(true);    
      btnSD.setVisible(false);  
      btnRec.setVisible(true); 
      btnFod.setVisible(true);
      
      tfFood.setVisible(true); 
      btnSF.setVisible(true);    
   }
   
   public String sfClicked(){
   
    String  a =  tfFood.getText();    
   
      question5.setVisible(true);
      btnYesDelete.setVisible(true); 
      btnNoDelete.setVisible(true); 
      
      return a;   
   }
   
   public String buttonDeleteFoodClicked(){   
   return "a"; 
   }    
}