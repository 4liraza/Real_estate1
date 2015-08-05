/*
 * N_Model_Edit.java
 *
 * Created on February 20, 2009, 3:38 AM
 */

package gui;

import database.DataTable;
import database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author  Administrator
 */
public class N_Model_Edit extends javax.swing.JInternalFrame implements DataTable {
    Database db;
    int exce=1;
    int table;
    long totalsize;
    String broker1;
    int price1;
    String name1,propadd,addr,phone1 ;
    String street1;
    String city1 ;
    String state1;
    String pin1 ;
    String mobile1 ;
    String location1 ;
    
    String sql_query;
    String features1 ;
    String information1;
    String dates ;
    String available1 ;
    String facing1;
    int Id;
    String type1,purpose1;
    /** Creates new form N_Model_Edit */
    public N_Model_Edit(ResultSet rss,int id,String typest,String purposef) {
       super(" "+purposef+" "+typest,false,true,false,true);
        Id=id;
        System.out.println("id ==="+Id);
        initComponents();
        int i=0;
        //this.setSize(this.getToolkit().getScreenSize());
         db = new Database();
        try {
           
            ResultSet rs = rss;
           
            System.out.println("in view rss "+rs+"\n");
             //boolean b=rs.next();
             //System.out.println(b);
            if(rs!=null)
            {
                String a=rs.getString("name");
             System.out.println(" in view rss "+a);
             setVisible(true);
             i++;
            name.setText(a);
            i++;
            propertyAdd.setText(rs.getString("propertyAdd"));
            i++;
            phoneno.setText(rs.getString("phoneno"));
            i++;
            address.setText(rs.getString("address"));
            i++;
            
            
            mobile.setText(rs.getString("mobile"));
            i++;
            size.setText(""+rs.getLong("spb"));
            i++;
            price.setText("" + rs.getInt("price"));
            i++;
            facing.setText(rs.getString("facing"));
            i++;
           if(rs.getString("available").equals("AVAILABLE"))
            {
                status.setSelected(true);
                System.out.println("true");
            }
            else{
                status.setSelected(false);
                System.out.println("false");
            }

            i++;
            location.setText(rs.getString("location"));
            i++;
            feature.setText(rs.getString("features"));
            i++;
            information.setText(rs.getString("information"));
            i++;
            date.setText(rs.getString("dateT"));
            type1=typest;//rs.getString("type");
            i++;
          
            purpose1= purposef;//rs.getString("purpose");
            i++;
            System.out.println(type1+purpose1);  
            //setTitle(purpose1+" "+type1);
            System.out.println("abc");
            i++;
            
            }
            else
            {
                JOptionPane.showMessageDialog(this,"........Threre is NO Record Concerning ID\n\n      ID:"+id,"No Record Found!",JOptionPane.ERROR_MESSAGE);
            }
            
            
            
        } catch (SQLException ex) {
            //Logger.getLogger(Model_Frame.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this,"Threre is NO Record Concerning ID\n\n      ID: "+id,"No Record Found!",JOptionPane.ERROR_MESSAGE);
        }
         finally{
         db.close();
         System.out.println("isfasdfafa ===="+i);
         }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        propertyAdd = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        size = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        location = new javax.swing.JTextArea();
        price = new javax.swing.JTextField();
        facing = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        broker = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        feature = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        information = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        status = new javax.swing.JRadioButton();
        update = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Century", 1, 17));
        jLabel1.setText("Name");

        name.setFont(new java.awt.Font("Century", 0, 16));

        phoneno.setFont(new java.awt.Font("Century", 0, 16));

        jLabel5.setFont(new java.awt.Font("Century", 1, 17));
        jLabel5.setText("Phone No.");

        mobile.setFont(new java.awt.Font("Century", 0, 16));

        jLabel6.setFont(new java.awt.Font("Century", 1, 17));
        jLabel6.setText("Mobile No.");

        jLabel7.setFont(new java.awt.Font("Century", 1, 17));
        jLabel7.setText("Address");

        jLabel2.setFont(new java.awt.Font("Century", 1, 17));
        jLabel2.setText("Property Address");

        propertyAdd.setFont(new java.awt.Font("Century", 0, 16));

        address.setColumns(20);
        address.setFont(new java.awt.Font("Century", 0, 16));
        address.setLineWrap(true);
        address.setRows(5);
        jScrollPane3.setViewportView(address);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addGap(32, 32, 32))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addGap(51, 51, 51)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(propertyAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(mobile, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(propertyAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Century", 1, 17));
        jLabel8.setText("Size");

        size.setFont(new java.awt.Font("Century", 0, 16));

        jLabel9.setFont(new java.awt.Font("Century", 1, 17));
        jLabel9.setText("Price");

        jLabel10.setFont(new java.awt.Font("Century", 1, 17));
        jLabel10.setText("Facing");

        jLabel11.setFont(new java.awt.Font("Century", 1, 17));
        jLabel11.setText("Location");

        location.setColumns(20);
        location.setFont(new java.awt.Font("Century", 0, 16));
        location.setLineWrap(true);
        location.setRows(5);
        jScrollPane1.setViewportView(location);

        price.setFont(new java.awt.Font("Century", 0, 16));

        facing.setFont(new java.awt.Font("Century", 0, 16));

        jLabel14.setFont(new java.awt.Font("Century", 1, 17));
        jLabel14.setText("Broker");

        broker.setFont(new java.awt.Font("Century", 0, 16));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facing, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(broker, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(size, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(facing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(broker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel12.setFont(new java.awt.Font("Century", 1, 17));
        jLabel12.setText("Special Features");

        jLabel13.setFont(new java.awt.Font("Century", 1, 17));
        jLabel13.setText("Information");

        feature.setFont(new java.awt.Font("Century", 0, 16));

        information.setColumns(20);
        information.setFont(new java.awt.Font("Century", 0, 16));
        information.setLineWrap(true);
        information.setRows(5);
        jScrollPane2.setViewportView(information);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE)
                    .addComponent(feature, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        status.setBackground(new java.awt.Color(204, 204, 255));
        status.setFont(new java.awt.Font("Century", 1, 17));
        status.setText("Available");

        update.setBackground(new java.awt.Color(153, 153, 153));
        update.setFont(new java.awt.Font("Century", 0, 16));
        update.setText("  Save  ");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(153, 153, 153));
        cancel.setFont(new java.awt.Font("Century", 0, 16));
        cancel.setText("Close ");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(153, 153, 153));
        delete.setFont(new java.awt.Font("Century", 0, 16));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century", 1, 17));
        jLabel3.setText("Date ");

        date.setFont(new java.awt.Font("Century", 0, 16));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(status)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(update)
                        .addGap(41, 41, 41)
                        .addComponent(delete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(cancel)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(cancel)
                    .addComponent(delete))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        db = new Database();
        int i=0;
    if(table==SELL_PLOT)
    {type1="PLOT";
        purpose1="SELL";}
            else if(table==SELL_OFFICE)
            {type1="OFFICE";
        purpose1="SELL";}
            else if(table==SELL_FLAT)
            {type1="FLAT";
        purpose1="SELL";
            }
        else if(table == SELL_BUNGALOW)
             {type1="BUNGALOW";
        purpose1="SELL";}
        
            else if(table==PURCHASE_PLOT)
            {   type1="PLOT";
        purpose1="PURCHASE";}
            else if(table==PURCHASE_OFFICE)
            {type1="OFFICE";
        purpose1="PURCHASE";}
            else if(table==PURCHASE_FLAT)
            {type1="FLAT";
        purpose1="PURCHASE";}
        else if(table == PURCHASE_BUNGALOW)
             {type1="BUNGALOW";
        purpose1="PURCHASE";}
            
            else if(table == RENTAL_PLOT)
            {type1="PLOT";
        purpose1="RENTAL";}
             else if(table == RENTAL_OFFICE)
             {type1="OFFICE";
        purpose1="RENTAL";}
             else if(table == RENTAL_FLAT)
             {type1="FLAT";
        purpose1="RENTAL";}
        else if(table == RENTAL_BUNGALOW)
             {type1="BUNGALOW";
        purpose1="RENTAL";}
     try{
         i++;
    name1 =name.getText();
     i++;
    propadd= propertyAdd.getText();
     i++;
    addr = address.getText();
     i++;
    phone1 = phoneno.getText();
     i++;
   
    mobile1 = mobile.getText();
     i++;
    facing1=facing.getText();
     i++;
    location1 = location.getText();
     i++;
    features1 = feature.getText();
     i++;
    information1 = information.getText();
     i++;
    dates = date.getText();//((Calendar.getInstance()).getTime()).toString();
    broker1=broker.getText();
     i++;
    totalsize=Long.parseLong(size.getText());
    
    price1=Integer.parseInt(price.getText());
     i++;
    String msg="Either Following Fields are Empty or Incorrect data is entered";
    available1 ="NOT AVAILABLE";
    if(status.isSelected())
        available1="AVAILABLE";
    else
        available1="NOT AVAILABLE";
    
     i++;
   
       //JOptionPane.showMessageDialog(this,"Length Field is Empty \nPlease enter data","Empty Field",JOptionPane.ERROR_MESSAGE);
  
    
  
  sql_query = "UPDATE   globaldata SET name='"+name1+
                                    "', propertyAdd='"+propadd+"', address='"+addr+"', phoneno='"+phone1+
                                    "', mobile='"+mobile1+"', price="+price1+
                                    ", facing='"+facing1+"', location='"+
                                    location1+"', features='"+features1+"', information='"+information1+
                                    "', available ='"+available1+"', broker='"+
                                    broker1+"', spb= "+totalsize+", dateT='"+dates+"' where ID="+Id;
   db.update(sql_query); 
   setVisible(false);
     }
    /*else
    {
          JOptionPane.showMessageDialog(this,msg,"Data Error",JOptionPane.INFORMATION_MESSAGE);
    }*/
     catch(Exception e){
        JOptionPane.showMessageDialog(this,"Incorrect Data \nPlease enter correct data","Incorrect data",JOptionPane.ERROR_MESSAGE);
        
    }
    finally{
            db.close();
            System.out.println("iiiii"+i);
            //date.setText("");

    
    }
     
}//GEN-LAST:event_updateActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        // TODO add your handling code here:
       // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        db.close();
        setVisible(false);
        
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        db.close();
        setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        db=new Database();
        sql_query = "DELETE FROM globaldata WHERE ID="+Id;
   db.delete(sql_query); 
   db.close();
   setVisible(false);
}//GEN-LAST:event_deleteActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextField broker;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField date;
    private javax.swing.JButton delete;
    private javax.swing.JTextField facing;
    private javax.swing.JTextField feature;
    private javax.swing.JTextArea information;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea location;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField price;
    private javax.swing.JTextField propertyAdd;
    private javax.swing.JTextField size;
    private javax.swing.JRadioButton status;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
    
}