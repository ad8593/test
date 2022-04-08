import javafx.event.ActionEvent;
import javafx.event.EventHandler;

// health check controller is extending the view which is the gui 
class HealthCheckController extends HealthCheckView{

   // since the health check model extends the healthc check view, I did an object 
   HealthCheckModel hm = new HealthCheckModel();
   
   public HealthCheckController() {
      super();
   }

   // I put all event handler button actions in a separate methods
   public void btnYes(){
      this.btnYes.setOnAction
            (
         new EventHandler<ActionEvent>() {
            public void handle(ActionEvent evt) {
            // taking the method from the abstract class
               hm.yesButton();
            }});  
   }    
        
   // methods same comment above for all 
   public void btnNo(){ 
      btnNo.setOnAction
            (
         new EventHandler<ActionEvent>() {
            public void handle(ActionEvent evt) {
               hm.noButton(); 
            }
         });            
   }
             
   public void btnFod(){   
      btnFod.setOnAction
            (
         new EventHandler<ActionEvent>() {
            public void handle(ActionEvent evt) {
               hm.buttonFood();
            }
            
         });   
   }      
            
   public void btnRec(){ 
      btnRec.setOnAction
            (
         new EventHandler<ActionEvent>() {
            public void handle(ActionEvent evt) {                         
               hm.buttonRecipe();
            }
         });    
   }
            
   public void btnSF(){   
      btnSF.setOnAction
            (
         new EventHandler<ActionEvent>() {
            public void handle(ActionEvent evt) {               
               hm.foodItem(); 
            }
         });
   }
         
   public void btnSD(){   
      btnSD.setOnAction
            (
         new EventHandler<ActionEvent>() {
            public void handle(ActionEvent evt) {               
               hm.foodRecipe();
            }
         });
   }
         
   public void btnYesDelete(){         
      btnYesDelete.setOnAction
            (
         new EventHandler<ActionEvent>() {
            public void handle(ActionEvent evt) {
               hm.buttonDeleteFood();                       
            }
            
         }); 
   }
         
   // handle method 
   public void handle(ActionEvent evt) {
   }


}