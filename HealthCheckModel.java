import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter; 
import java.time.LocalDateTime;

abstract class HealthCheckModelAbstract extends HealthCheckView{  // abstraction

   // abstract methods 
   abstract public void yesButton();
   abstract public void noButton();
   abstract public void buttonFood();
   abstract public void buttonRecipe();
   abstract public void foodItem();
   abstract public void foodRecipe();
   abstract public void buttonDeleteFood();
}

public class HealthCheckModel extends HealthCheckModelAbstract{

   // where everything is saved or deleted so model is like a database 
   public void yesButton(){
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
      LocalDateTime now = LocalDateTime.now();  
      System.out.println(dtf.format(now));  
      dateL.setText(dtf.format(now)); 
               
      String dati = dateL.getText(); 
               
      try (PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter("log.csv", true)))) {
         out.println(dati);
      } catch (IOException ioe) {
         ioe.printStackTrace();
      }
               
      question2.setVisible(true); 
      question3.setVisible(false); 
      dateL.setVisible(true);    
      tfDate.setVisible(false);  
      btnSD.setVisible(false);  
      btnRec.setVisible(true); 
      btnFod.setVisible(true);        
   }
   
         // no button
   public void noButton() {
      question3.setVisible(true); 
      question2.setVisible(false);                
      dateL.setVisible(false);
      tfDate.setVisible(true); 
      btnSD.setVisible(true); 
      btnRec.setVisible(true); 
      btnFod.setVisible(true); 
      question2.setVisible(true);      
   }
      
            // button for choosing to add food
   public void buttonFood() {
      question4.setVisible(true); 
      tfFood.setVisible(true);    
      btnSF.setVisible(true);  
   }
      
            // button for choosing to add recipe
   public void buttonRecipe() {
    try (PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter("recipe.csv", true)))) {
         out.println(tfFood.getText());
         out.close(); 
      } catch (IOException ioe) {
         ioe.printStackTrace();
      }
        
   }
      
            // add food
   public void foodItem() {
      try (PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter("food.csv", true)))) {
         out.println(tfFood.getText());
         out.close(); 
      } catch (IOException ioe) {
         ioe.printStackTrace();
      }
         
      question5.setVisible(true);
      btnYesDelete.setVisible(true); 
      btnNoDelete.setVisible(true); 
   }
      
            // food recipe 
   public void foodRecipe() {
      try (PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter("food.csv", true)))) {
         out.println(tfFood.getText());
         out.close(); 
      } catch (IOException ioe) {
         ioe.printStackTrace();
      }
      
      question5.setVisible(true);
      btnYesDelete.setVisible(true); 
      btnNoDelete.setVisible(true); 
   } 
      
            // button for deleting food
   public void buttonDeleteFood() {
      try{
               // It deletes all file CONTENT 
         PrintWriter writer = new PrintWriter("food.csv");
         writer.print("");
         writer.close();   
      }catch(Exception e){
         System.out.println(e); 
      }
   }
}