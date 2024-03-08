
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Company {
    private String companyName;
    private ArrayList <Employee> staff;

//  Default constructor
public Company(){
this.companyName = "Default Company";
this.staff = new ArrayList<>();
}

// Overload constructor with a name paramter

public Company(String copmpanyName){
this.companyName = companyName;
this.staff = new ArrayList<>();
}

// Method to add a new employee to the staff arrayList
public void addNewStaff(Employee employee){
staff.add(employee);

}
// Method to lost emplyees above a given employee number value
public int getStaffNumber(){
    return staff.size();
}
public void listEmployees (int employeeNumberThreshold){
    System.out.println("Employees with employee number above" + employeeNumberThreshold + ":");
Iterator<Employee> iterator = staff.iterator();

while(iterator.hasNext()){
Employee employee = iterator.next();
if(employee.getEmpNum()> employeeNumberThreshold){
    System.out.println(employee.getName());}
}



}


}



