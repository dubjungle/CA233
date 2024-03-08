/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Manager extends Employee {
    private String username;
    private String password;
    
    public Manager (String name, String email, int empNum, String username, String password){
    
    super(name,email,empNum);
    this.username = username;
    this.password = password;
    
    
    }
    
    
    public String getUsername(){
    return username;
   }
    
    public void setUsername(String username){
    this.username = username;}
    
    
    public String getPassword(){
    return password;}
    
    
    public void setPassword (String password){
    this.password = password;
    }

    void getName(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addNewStaff(Employee newEmployee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}





