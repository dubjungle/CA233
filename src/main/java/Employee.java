/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Employee {
    public static void main(String[] args) {
   
    private static int nextu;
private String name;
private String email;
private int empNum;
private static int nextEmpNum =1;
 
    // Constructor with default values
      public Employee () { 
          this.name = "employee name";
          this.email = "default@email.com";
          this.empNum = 0;
          nextEmpNum++;
      }
      // Constructor with parameters
          public Employee (String name, String email, int empnum){
           this.name = name;
           this.email = email;
           this.empNum = empNum;
           nextEmpNum++; // increment for the next object
          }
          
          // acessor methods
          public String getName(){
          return name;
          }
          
          
          public String getEmail(){
          return email;}
          
          public int getEmpNum(){
          return empNum;}
          
          public void setEmail(String email){
          if (email.length() > 3){
          this.email = email;
          } else{
              System.out.println("Email lenght must be greater than 3");}
          
          }
          
           
 public static int getNextEmpNum(){
    return nextEmpNum;
    
 }
  
}
 

          
      
    

