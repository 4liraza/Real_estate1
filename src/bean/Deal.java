/*
 * Deal.java
 *
 * Created on March 4, 2009, 9:06 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author student
 */
public class Deal {
    
    /** Creates a new instance of Deal */
   private String ownername,owneradd,tenantname,tenantadd,propadd,broker,information;
   private String checkno,ptype,purpose,paidvia,dealdate;
   private int brokerage,price_paid,prop_price;
   
   public void setOwnername(String ownername){this.ownername=ownername;}
   public void setOwneradd(String owneradd){this.owneradd=owneradd;}
   public void setTenantname(String tenantname){this.tenantname=tenantname;}
   public void setTenantadd(String tenantadd){this.tenantadd=tenantadd;}
   public void setBroker(String broker){this.broker=broker;}
   public void setPropadd(String propadd){this.propadd=propadd;}
   public void setInformation(String information){this.information=information;}
   public void setCheckno(String checkno){this.checkno=checkno;}
   public void setPtype(String ptype){this.ptype=ptype;}
   public void setPurpose(String purpose){this.purpose=purpose;}
   public void setPaidvia(String paidvia){this.paidvia=paidvia;}
   public void setDealdate(String dealdate){this.dealdate=dealdate;}
   
   public String getOwnername(){return ownername;}
   public String getOwneradd(){return owneradd;}
   public String getTenantname(){return tenantname;}
   public String getTenantadd(){return tenantadd;}
   public String getBroker(){return broker;}
   public String getPropadd(){return propadd;}
   public String getInformation(){return information;}
   public String getCheckno(){return checkno;}
   public String getPtype(){return ptype;}
   public String getPurpose(){return purpose;}
   public String getPaidvia(){return paidvia;}
   public String getDealdate(){return dealdate;}
   
   public void setBrokerage(int brokerage){this.brokerage= brokerage;}
   public void setPrice_paid(int price_paid){this.price_paid=price_paid;}
   public void setProp_price(int prop_price){this.prop_price=prop_price;}
   
   public int getBrokerage(){return brokerage;}
   public int getPrice_paid(){return price_paid;}
   public int getProp_price(){return prop_price;}
   
   
   
   
    
}
