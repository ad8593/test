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

public class HealthCheckModel {

   public String yesButtonClicked(){
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss\n");  
      LocalDateTime now = LocalDateTime.now();  
      
      String dati = dtf.format(now);
      
      System.out.print(dati);
      
      try (PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter("log.csv", true)))) {
         out.println(dati);
      } catch (IOException ioe) {
         ioe.printStackTrace();
      }
      
      return dati;
   }
     
   public void sfClicked(String a) {    
         
      try (PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter("food.csv", true)))) {
         System.out.println(a); 
      
         out.println(a);
         out.close(); 
      } catch (IOException ioe) {
         ioe.printStackTrace();
      }      
   }
   
   public void buttonDeleteFoodClicked(String c){ 
   
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