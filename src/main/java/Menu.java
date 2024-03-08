
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Menu {
    //Main method for the console menu system
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Create a Manager object
        Manager manager = new Manager ("Manager Name", "manager@email.com",1,"Gnomeo", "smurf");
        
        //Login
        System.out.println("Enter username:");
        String enteredUsername = scanner.nextLine();
        
        System.out.println("Enter password:");
        String enteredPassword = scanner.nextLine();
        
        
        if (manager.getUsername().equals(enteredUsername) && manager.getPassword().equals(enteredPassword)){
            System.out.println("Login succesful!");}
        
        //display menu option
        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1.View current staff");
            System.out.println("2.Add new staff");
            System.out.println("3.Exit");
            
        int choice = scanner.nextInt();
        scanner.nextInt(); // consume the newline character
        
        
        switch (choice){
            case 1:
                //view current staff
                manager.getName(0);
                break;
                
            case 2:
                //add new staff
                Employee newEmployee = new Employee();
                System.out.println("Enter name for the new employee:");
                newEmployee.getName(scanner.nextLine());
                
                System.out.println("Enter email for the new employee:");
                newEmployee.setEmail(scanner.nextLine());
                manager.addNewStaff(newEmployee);
                System.out.println("New employee added!");
                break;
                
            case 3:
                //Exit
                System.out.println("Exiting");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice.");
        
        
        }
        
        }
        
    }
    
}
