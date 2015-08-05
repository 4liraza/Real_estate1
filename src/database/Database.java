package database;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import bean.*;
/**
 *
 * @author student
 */
public class Database implements DataTable{

    private Connection connection;
    private ResultSet resultset;
    
    private Statement statement;
    private PreparedStatement ps;
    String DBMS_Driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    String DB_Url = "jdbc:odbc:real";
    String typef;
    String purposef;
    public Database()
    {
        try{
        Class.forName(DBMS_Driver);
        connection = DriverManager.getConnection(DB_Url);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        }
        catch(Exception ex){
            System.out.println("Exception occured during connection creation");
            
        }
    }
    
  
    public int login(String password1,String usr) {
        int a = 0;
        try {
            String query="Select * from login where user ='"+usr+"' and password = '"+password1+"'";
            System.out.println(query);
            
           ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                a = 1;
            } else {
                a = 0;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    public int insert(String query)
    {
        int update=0;
        
        try{
            statement = connection.createStatement();
          update = statement.executeUpdate(query);
        }
        catch(Exception ex){System.out.println("Exception occured during Insert operation "+ex);}
        finally{
            close();
         return update; 
        }
    }
    
    
    
     public int update(String query)
    {
        int update=0;
        
    try{
            
        statement = connection.createStatement();
           update= statement.executeUpdate(query);
             
                      }
        catch(Exception ex){System.out.println("Exception occured during Update operation "+ex);}
        finally{
            System.out.println("Updated record :"+update);
         return update; 
        }
    }
    
    
  
    
    public ResultSet accessData( int id)
    {
        
        try{
            
           String operation = "SELECT * FROM   globaldata WHERE ID ="+id+" order by ID";
           Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            resultset = stmt.executeQuery(operation);
            System.out.println("ind database"+resultset);
           resultset.next();
            System.out.println(resultset.getString("type"));
            typef=resultset.getString("type");
            purposef=resultset.getString("purpose");
        }
        catch(Exception ex){System.out.println("Exception occured during accessing database "+ex);}
    finally{
       // close();
            return resultset;
    }
    }
    
    public String type(){
    return typef;
    }
    
    public String purpose(){
    return purposef;
    }
    public ResultSet search(String query)
    {
        try{
            //Statement stmt = connection.createStatement();
           resultset = statement.executeQuery(query);
        }
        catch(Exception ex){System.out.println("Exception occured during Search operation "+ex);}
        finally{
            
        
        return resultset;}
    }
    
    

   
   public void delete(String query)
   {
        int update=0;
        
    try{
            
        statement = connection.createStatement();
        update = statement.executeUpdate(query);
             
                      }
        catch(Exception ex){System.out.println("Exception occured during Update operation "+ex);}
        finally{
            System.out.println("Updated record :"+update);
        // return update; 
        }
     
   }
   
    public void close()
    {
        try{
            statement.close();
            connection.close();
        }
        catch(Exception e){}
    }
    
    public Customer access(int id){
        Customer cust = new Customer();
        try{
            
           String operation = "SELECT * FROM   Customer WHERE ID ="+id;
           Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rst  = stmt.executeQuery(operation);
            System.out.println("ind database"+rst);
            rst.next();
            
            cust.setBroker(rst.getString("Broker_Name"));
            cust.setCadd(rst.getString("Customer_Address"));
            cust.setCname(rst.getString("Customer_Name"));
            cust.setCreq(rst.getString("Customer_Requirements"));
            cust.setFeatures(rst.getString("Special_Features"));
            cust.setPtype(rst.getString("Property_Type"));
            
        }
        catch(Exception ex){
            System.out.println("Exception occured during accessing database "+ex);
        cust=null;
        }
    finally{
        close();
        return cust;
    }
}
    
    public Deal dealAccess(int id)
    {
        Deal deal = new Deal();
        try{
            
           String operation = "SELECT * FROM   Deal WHERE ID ="+id;
           Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rst  = stmt.executeQuery(operation);
            System.out.println("ind database"+rst);
            rst.next();
            
            deal.setBroker(rst.getString("Broker_Name"));
            deal.setBrokerage(rst.getInt("Brokerage"));
            deal.setCheckno(rst.getString("Cheque_Number"));
            deal.setDealdate(rst.getString("Deal_Date"));
            deal.setInformation(rst.getString("Information"));
            deal.setOwneradd(rst.getString("Owner_Address"));
            deal.setOwnername(rst.getString("Owner_Name"));
            deal.setPaidvia(rst.getString("Paid_Via"));
            deal.setPrice_paid(rst.getInt("PricePaid"));
            deal.setProp_price(rst.getInt("Property_Price"));
            deal.setPropadd(rst.getString("Property_Address"));
            deal.setPtype(rst.getString("Property_Type"));
            deal.setPurpose(rst.getString("Purpose"));
            deal.setTenantadd(rst.getString("Tenant_Address"));
            deal.setTenantname(rst.getString("Tenant_Name"));
            
        
        }
        catch(Exception ex){System.out.println("Exception occured during accessing database "+ex);
        deal=null;
        }
    finally{
        close();
        return deal;    
        
    }
    }
    
    public ResultSet cdList(String table)
    {String operation=null;
      try{
            if(table.equals("Customer"))
                operation = "SELECT ID,Customer_Name,Customer_Requirements,Property_Type,Broker_Name FROM Customer order by ID";
            else if(table.equals("Deal"))
            {
                System.out.println("adsfadfafafd");
                operation="SELECT ID,Owner_Name,Tenant_Name,Property_Type,Purpose,Paid_Via,PricePaid,Broker_Name FROM Deal order by ID";
            }
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            resultset = stmt.executeQuery(operation);
            System.out.println("ind database"+resultset);
            resultset.next();
            
            
        }
        catch(Exception ex){System.out.println("Exception occured during accessing database "+ex);}
    finally{
       // close();
            return resultset;
    }  
    }
    
}




    

