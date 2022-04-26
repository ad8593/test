import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HealthCheck extends Application {
   HealthCheckView hv;
   HealthCheckModel hm;   
   HealthCheckController hcc;
   
   public static void main(String[] args){
      launch(args);
   }
   
   public HealthCheck() {
      hv = new HealthCheckView();
      hm = new HealthCheckModel();
      
      hcc = new HealthCheckController(hv, hm);
   }
   
   public void start(Stage _stage) throws Exception{
      hv.show();
   }
} 
