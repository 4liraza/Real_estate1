/*
 * Login.java
 *
 * Created on March 5, 2009, 11:08 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author student
 */
public class Login {
    
    /** Creates a new instance of Login */
    public Login() {
    }
    private String password,user;
    
    public void setPassword(String password){this.password=password;}
    public void setUser(String user){this.user=user;}
    
    public String getPassword(){return password;}
    public String getUser(){return user;}
}
