/*
 * Customer_iEdit.java
 *
 * Created on March 4, 2009, 3:33 PM
 */

package gui;

import bean.Customer;
import database.Database;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author  student
 */
public class Customer_iEdit extends javax.swing.JInternalFrame {
    int id;
    /** Creates new form Customer_iEdit */
    public Customer_iEdit(JInternalFrame caller,int id) {
        super(" Edit Customer Details ",false,true,false,true);
        
        this.id=id;
        Database db = new Database();
        Customer cust = db.access(id);
        if(cust!=null){
            
        initComponents();
        caller.setVisible(false);
        cname.setText(cust.getCname());
        cadd.setText(cust.getCadd());
        creq.setText(cust.getCreq());
        broker.setText(cust.getBroker());
        ptype.setSelectedItem(cust.getPtype());
        features.setText(cust.getFeatures());
        }
        else
            {
            JOptionPane.showMessageDialog(null,"Please enter valid record ID","Incorrect ID!",JOptionPane.ERROR_MESSAGE);
            this.setVisible(false);
        }
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cadd = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        creq = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        features = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        broker = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        close = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        ptype = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Century", 1, 17));
        jLabel1.setText("Customer Name ");

        cname.setFont(new java.awt.Font("Century", 0, 16));

        jLabel2.setFont(new java.awt.Font("Century", 1, 17));
        jLabel2.setText("Customer Address ");

        cadd.setColumns(20);
        cadd.setFont(new java.awt.Font("Century", 0, 16));
        cadd.setLineWrap(true);
        cadd.setRows(5);
        jScrollPane1.setViewportView(cadd);

        jLabel3.setFont(new java.awt.Font("Century", 1, 17));
        jLabel3.setText("Customer Requirements ");

        creq.setColumns(20);
        creq.setFont(new java.awt.Font("Century", 0, 16));
        creq.setLineWrap(true);
        creq.setRows(5);
        jScrollPane2.setViewportView(creq);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(cname))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setFont(new java.awt.Font("Century", 1, 17));
        jLabel4.setText("Special Features ");

        features.setColumns(20);
        features.setFont(new java.awt.Font("Century", 0, 16));
        features.setLineWrap(true);
        features.setRows(5);
        jScrollPane3.setViewportView(features);

        jLabel5.setFont(new java.awt.Font("Century", 1, 17));
        jLabel5.setText("Broker ");

        broker.setFont(new java.awt.Font("Century", 0, 16));

        jLabel6.setFont(new java.awt.Font("Century", 1, 17));
        jLabel6.setText("Property Type ");

        update.setBackground(new java.awt.Color(153, 153, 153));
        update.setFont(new java.awt.Font("Century", 0, 16));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        close.setBackground(new java.awt.Color(153, 153, 153));
        close.setFont(new java.awt.Font("Century", 0, 16));
        close.setText("  Close  ");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
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

        ptype.setFont(new java.awt.Font("Century", 0, 16));
        ptype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PLOT", "FLAT", "OFFICE", "BUNGALOW" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(broker, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(ptype, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(39, 39, 39)
                .addComponent(close)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(broker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ptype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(close)
                    .addComponent(delete))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        Database db=new Database();
        String sql_query = "DELETE FROM Customer WHERE ID="+id;
   db.delete(sql_query); 
   db.close();
   JOptionPane.showMessageDialog(this,"Operation successfully completed","Successfull",JOptionPane.INFORMATION_MESSAGE);
   setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_closeActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
setVisible(false)  ;      // TODO add your handling code here:
    }//GEN-LAST:event_closeMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        update();        // TODO add your handling code here:
        
    }//GEN-LAST:event_updateActionPerformed
public void update(){
Customer cust = new Customer();

cust.setBroker(broker.getText());
      cust.setCadd(cadd.getText());
      cust.setCname(cname.getText());
      cust.setCreq(creq.getText());
      cust.setFeatures(features.getText());
      cust.setPtype((String)ptype.getSelectedItem());
      if(!cust.getCname().equals("")&&!cust.getCreq().equals("")){
      String sql_query="Update Customer set Customer_Name='"+cust.getCname()+
                                                    "', Customer_Address='"+cust.getCadd()+
                                                    "', Customer_Requirements='"+cust.getCreq()+
                                        "', Special_Features='"+cust.getFeatures()+
                                        "',Broker_Name='"+cust.getBroker()+
                                        "',Property_Type ='"+cust.getPtype()+
                                        "' Where ID="+id;
     
     Database db =new Database();
     System.out.println("query = "+sql_query);
     int i = db.insert(sql_query);
     System.out.println("updates = "+i);
     if(i!=0)
     {
      
      JOptionPane.showMessageDialog(this,"Operation successfully completed","Successfull",JOptionPane.INFORMATION_MESSAGE);
      setVisible(false);
     }
     else
     JOptionPane.showMessageDialog(this,"Due to some connection error data could not be entered properly\nPlease contact your service provider"," Error ",JOptionPane.ERROR_MESSAGE);
}
else
        JOptionPane.showMessageDialog(this,"Please Enter Customer Name and Customer Requirement "," Error ",JOptionPane.ERROR_MESSAGE);
    
}    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField broker;
    private javax.swing.JTextArea cadd;
    private javax.swing.JButton close;
    private javax.swing.JTextField cname;
    private javax.swing.JTextArea creq;
    private javax.swing.JButton delete;
    private javax.swing.JTextArea features;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox ptype;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
    
}
