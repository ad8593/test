import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// connecting all together
class HealthCheck extends HealthCheckView{
   
   public static void main(String[] args){
   
   HealthCheckView hc = new HealthCheckView(); 
    
    // try catch block to start the stage 
    try{
    hc.start(stage);
    }catch(Exception e){
     System.out.println(e); 
    }                
   }    
} 



