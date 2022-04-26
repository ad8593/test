import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class HealthCheckController {
   private HealthCheckModel hcModel;
   private HealthCheckView hcView;
   
   public HealthCheckController(HealthCheckView _hcView, HealthCheckModel _hcModel){
      hcView = _hcView;
      hcModel = _hcModel;
   
      hcView.setButtonActionEvent(new ButtonActionEvent());
   }
   
   class ButtonActionEvent implements EventHandler<ActionEvent> {
   
      public void handle(ActionEvent evt) {
      // Get the button that was clicked
         Button btn = (Button)evt.getSource();
                
      // Switch on its name
         switch(btn.getText()) {
            case "Yes":
               hcView.yesButtonClicked(hcModel.yesButtonClicked());
               break;
            case "Save Rec/Food":  
               hcModel.sfClicked(hcView.sfClicked());  
               System.out.println(hcView.sfClicked()); 
               break;
            case "Yes Delete":  
              // hcView.buttonDeleteFoodClicked(hcModel.buttonDeleteFoodClicked());  
               break;                
            default:
               System.exit(0);
         }
      }   
   }
}