/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupon;

import java.io.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane; 

/**
 *
 * @author aks
 */
public class AddUsers extends javax.swing.JFrame {

    static boolean isGrpValid=false;
    static boolean isGrpValidRec=false;
    /**
     * Creates new form NewGrupInterface
     */
    String grpName="";
       
    public AddUsers(String grpName) {
        initComponents();
        this.grpName=grpName;
    }

    private AddUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAllUsers = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSelectedUsers = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCreateGroup = new javax.swing.JButton();
        lblGrpName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create a new Group");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Group Name : ");

        listAllUsers.setModel(new DefaultListModel());
        listAllUsers.setToolTipText("Click to add User");
        listAllUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listAllUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listAllUsers);

        listSelectedUsers.setModel(new DefaultListModel());
        listSelectedUsers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listSelectedUsers.setToolTipText("Click to remove user");
        listSelectedUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSelectedUsersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listSelectedUsers);

        jLabel2.setText("All Users");

        jLabel3.setText("Selected Users");

        btnCreateGroup.setText("Add Users");
        btnCreateGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateGroupActionPerformed(evt);
            }
        });

        lblGrpName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGrpName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(btnCreateGroup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblGrpName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateGroupActionPerformed
              
             try
             {
                 int size=listSelectedUsers.getModel().getSize();
                 System.out.println("Size sent "+size);
                 if(size>0)
                 {
                    GroupStreams.dout.writeUTF("\\#Add[@]Add#\\");
                    System.out.println("flag sent \\#Add[@]Add#\\");
                    GroupStreams.dout.writeUTF(grpName);
                    System.out.println("GroupName sent "+grpName);
                    GroupStreams.dout.writeInt(size);
                    int i=0;
                    while( i<size)
                    {
                        GroupStreams.dout.writeUTF(String.valueOf(listSelectedUsers.getModel().getElementAt(i)));
                        System.out.println(""+String.valueOf(listSelectedUsers.getModel().getElementAt(i)));
                        i++;
                    }
                    this.dispose();
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null, "Nothing selected to add !!");
                 }
             }
             catch(Exception e)
             {
                 e.printStackTrace();
                 System.out.println("Some error");
             }
    }//GEN-LAST:event_btnCreateGroupActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        setTitle("GroupOn - "+grpName);
        lblGrpName.setText(grpName);
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home")+"/GroupOn/allUserLog.txt"));
            
            String s="";
            DefaultListModel d1=(DefaultListModel)listAllUsers.getModel();
            
            while((s=br.readLine())!=null)
            {   
                if(!(s.equals(Messenger.username)))
                    d1.addElement(s);
            }
           br.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void listAllUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAllUsersMouseClicked
        String selectedUser="";
        int index=0;
        try{    
            
            selectedUser=listAllUsers.getSelectedValue();
            index=listAllUsers.getSelectedIndex();

            ((DefaultListModel)listSelectedUsers.getModel()).addElement(selectedUser);
            ((DefaultListModel) listAllUsers.getModel()).remove(index);
        }
        catch(Exception e)
        {
            System.out.println("no users");
            JOptionPane.showMessageDialog(null, "No More Users");
            e.printStackTrace();
        }
       
        //listSelectedUsers.add(selectedUser);
        
    }//GEN-LAST:event_listAllUsersMouseClicked

    private void listSelectedUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSelectedUsersMouseClicked
        String selectedUser="";
        int index=0;
        try{
            
            selectedUser=listSelectedUsers.getSelectedValue();
            index=listSelectedUsers.getSelectedIndex();
            ((DefaultListModel) listSelectedUsers.getModel()).remove(index);
            ((DefaultListModel)listAllUsers.getModel()).addElement(selectedUser);
            
             
        }
        catch(Exception e)
        {
            System.out.println("no users");
            JOptionPane.showMessageDialog(null, "No More Users");
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_listSelectedUsersMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGrpName;
    private javax.swing.JList<String> listAllUsers;
    private javax.swing.JList<String> listSelectedUsers;
    // End of variables declaration//GEN-END:variables

//        void updateList(String[] user){
//            listAllUsers.setModel(new javax.swing.AbstractListModel<String>() {
//            public int getSize() { return user.length; }
//            public String getElementAt(int i) { return user[i]; }
//        });
//        }

}
