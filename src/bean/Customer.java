/*
 * Customer.java
 *
 * Created on March 4, 2009, 8:58 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author student
 */
public class Customer {
    
    /** Creates a new instance of Customer */
    private String broker,cname,cadd,creq,features,ptype;
    
    public void setBroker(String broker)
    {
        this.broker=broker;
    }
    public void setCname(String cname)
    {
        this.cname=cname;
    }
    public void setCadd(String cadd)
    {
        this.cadd=cadd;
    }
    public void setCreq(String creq)
    {
        this.creq=creq;
    }
    public void setFeatures(String features)
    {
        this.features=features;
    }
    public void setPtype(String ptype)
    {
        this.ptype=ptype;
    }
    
    public String getBroker(){return broker;}
    public String getCname(){return cname;}
    public String getCadd(){return cadd;}
    public String getCreq(){return creq;}
    public String getFeatures(){return features;}
    public String getPtype(){return ptype;}
    
}
