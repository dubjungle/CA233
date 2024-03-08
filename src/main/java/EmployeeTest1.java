/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class EmployeeTest1 {
    public static void main(String[] args){
    //Create 3 employee objescts with the specified details
    
        System.out.println("Print your email: ");
        Employee employee1 = new Employee ("Adams Smith", "jb@gmail.com", Employee.getNextEmpNum());
        Employee employee2 = new Employee ("Anna Banana", "jvc@gmail.com", Employee.getNextEmpNum());
        Employee employee3 = new Employee("Tom Thumb", "tt@gmail.com", Employee.getNextEmpNum());
        
        //Declare an array called projectGroup to store the Employee objects
        Employee[] projectGroup = {employee1, employee2, employee3};
        System.out.println("Value of nextEmpNum" + Employee.getNextEmpNum());
        
        
        for (Employee employee : projectGroup){
            System.out.println("\nEmployee Details:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Email: " +employee.getEmail());
            System.out.println("Employee Number: " + employee.getEmpNum());
        }
    }
}
