/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cs2212.westerngis;

import javax.swing.JDialog;

/**
 * This class is for user to a new POI with the POI information window
 * @author Kevin
 */
public class NewPOIWindow extends javax.swing.JFrame {
    private int x;
    private int y;
    private String buildName;
    private String buildFloor;
    private String cat;
    
    /**
     * Getter method for x coordinate.
     * @return x
     */
    public int getThisX(){
        return this.x;
    }
    
    /**
     * Getter method for y coordinate.
     * @return 
     */
    public int getThisY(){
        return this.y;
    }
    
        public String getThisBuildName(){
            return this.buildName;
        }
        public String getThisBuildFloor(){
            return this.buildFloor;
        }
        public String getThisCat(){
            return this.cat;
        }
    
    /**
    * This method will generate a new POI window
    * @param x This is the x coordinate of the POI
    * @param y This is the Y coordinate of the POI
    * @param buildName This is the building name of the POI
    * @param buildFloor This is the floor of the building of the POI
    */
    public NewPOIWindow(int x, int y, String buildName, String buildFloor) {
        this.x = x;
        this.y = y;
        this.buildName = buildName;
        this.buildFloor = buildFloor;
        initComponents();
        //Focuses the main JFrame instead of the first component
        getContentPane().requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancel = new javax.swing.JButton();
        save = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        nameTextBox = new javax.swing.JTextField();
        roomNumTextBox = new javax.swing.JTextField();
        descScrollPane = new javax.swing.JScrollPane();
        descTextPane = new javax.swing.JTextPane();
        categoryBox = new javax.swing.JComboBox<>();

        cancel.setText("Cancel");
        cancel.setMaximumSize(new java.awt.Dimension(72, 28));
        cancel.setMinimumSize(new java.awt.Dimension(72, 28));
        cancel.setPreferredSize(new java.awt.Dimension(72, 28));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.setMaximumSize(new java.awt.Dimension(72, 28));
        save.setMinimumSize(new java.awt.Dimension(72, 28));
        save.setPreferredSize(new java.awt.Dimension(72, 28));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        title.setText("Save a new Point of Interest");

        inputPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 37, 37), 2));
        inputPanel.setMaximumSize(new java.awt.Dimension(382, 154));
        inputPanel.setMinimumSize(new java.awt.Dimension(382, 154));

        nameTextBox.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        nameTextBox.setForeground(new java.awt.Color(102, 102, 102));
        nameTextBox.setText("Name of Point of Interest...");
        nameTextBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTextBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextBoxFocusLost(evt);
            }
        });
        nameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextBoxActionPerformed(evt);
            }
        });

        roomNumTextBox.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        roomNumTextBox.setForeground(new java.awt.Color(102, 102, 102));
        roomNumTextBox.setText("Room Number...");
        roomNumTextBox.setToolTipText("");
        roomNumTextBox.setMinimumSize(new java.awt.Dimension(99, 22));
        roomNumTextBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                roomNumTextBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                roomNumTextBoxFocusLost(evt);
            }
        });

        descTextPane.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        descTextPane.setForeground(new java.awt.Color(102, 102, 102));
        descTextPane.setText("Description...");
        descTextPane.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descTextPaneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descTextPaneFocusLost(evt);
            }
        });
        descScrollPane.setViewportView(descTextPane);

        categoryBox.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        categoryBox.setForeground(new java.awt.Color(102, 102, 102));
        categoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category", "Classroom", "Bathroom", "Restaurant", "Labs", "Navigation", "Computers" }));
        categoryBox.setMaximumSize(new java.awt.Dimension(285, 22));
        categoryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(descScrollPane)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(roomNumTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameTextBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(nameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomNumTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(title)
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(17, 17, 17)
                .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method closes the New POI window when the user clicks on the 'x' button.
     * @param evt 
     */
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        //Close window on cancel button click
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    /**
     * This method replaces the placeholdder text in the text box with blank space when
     * the text box is clicked on.
     * @param evt 
     */
    private void nameTextBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextBoxFocusGained
        if (nameTextBox.getText().equals("Name of Point of Interest...")) {
            nameTextBox.setText("");
            nameTextBox.setFont(new java.awt.Font("Segoe UI", 0, 12));
            nameTextBox.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_nameTextBoxFocusGained

    /**
     * This method replaces the blank space with placeholder text 
     * when the text box is unclicked on.
     * @param evt 
     */
    private void nameTextBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextBoxFocusLost
        if (nameTextBox.getText().equals("")) {
            nameTextBox.setText("Name of Point of Interest...");
            nameTextBox.setFont(new java.awt.Font("segoe UI", 2, 12));
            nameTextBox.setForeground(new java.awt.Color(102, 102, 102));
        }
    }//GEN-LAST:event_nameTextBoxFocusLost

    private void nameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextBoxActionPerformed

    /**
     * This method replaces the placeholdder text in the text box with blank
     * space when the text box is clicked on.
     * @param evt 
     */
    private void roomNumTextBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roomNumTextBoxFocusGained
        if (roomNumTextBox.getText().equals("Room Number...")) {
            roomNumTextBox.setText("");
            roomNumTextBox.setFont(new java.awt.Font("Segoe UI", 0, 12));
            roomNumTextBox.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_roomNumTextBoxFocusGained

    /**
     * This method replaces the blank space with placeholder 
     * text when the text box is unclicked on.
     * @param evt 
     */
    private void roomNumTextBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roomNumTextBoxFocusLost
        if (roomNumTextBox.getText().equals("")) {
            roomNumTextBox.setText("Room Number...");
            roomNumTextBox.setFont(new java.awt.Font("segoe UI", 2, 12));
            roomNumTextBox.setForeground(new java.awt.Color(102, 102, 102));
        }
    }//GEN-LAST:event_roomNumTextBoxFocusLost

    /**
     * This method replaces the placeholdder text in the text box with blank space 
     * when the text box is clicked on.
     * @param evt 
     */
    private void descTextPaneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descTextPaneFocusGained
        if (descTextPane.getText().equals("Description...")) {
            descTextPane.setText("");
            descTextPane.setFont(new java.awt.Font("Segoe UI", 0, 12));
            descTextPane.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_descTextPaneFocusGained

    /**
     * This method Replaces the placeholdder text in the text box with blank space when 
     * the text box is clicked on.
     * @param evt 
     */
    private void descTextPaneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descTextPaneFocusLost
        if (descTextPane.getText().equals("")) {
            descTextPane.setText("Description...");
            descTextPane.setFont(new java.awt.Font("segoe UI", 2, 12));
            descTextPane.setForeground(new java.awt.Color(102, 102, 102));
        }
    }//GEN-LAST:event_descTextPaneFocusLost

    /**
     * This method is responsible for saving the POI in the POI folder as a JSON file when the
     * user clicks on the 'save' button.
     * @param evt 
     */
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String pName = nameTextBox.getText();
        String room = roomNumTextBox.getText();
        String desc = descTextPane.getText();
        cat = (String) categoryBox.getSelectedItem();
        POI poi = new POI(room, buildFloor, buildName, cat, pName, desc, x, y, false, false);
        poi.save();
        this.dispose();
    }//GEN-LAST:event_saveActionPerformed
 
    private void categoryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryBoxActionPerformed

    }//GEN-LAST:event_categoryBoxActionPerformed
   
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
            java.util.logging.Logger.getLogger(NewPOIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPOIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPOIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPOIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPOIWindow(0,0,"","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> categoryBox;
    private javax.swing.JScrollPane descScrollPane;
    private javax.swing.JTextPane descTextPane;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JTextField nameTextBox;
    private javax.swing.JTextField roomNumTextBox;
    private javax.swing.JButton save;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
