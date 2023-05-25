/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cs2212.westerngis;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 * This class represents the user help window.
 * @author Chahb
 */
public class helpWindow extends javax.swing.JFrame {

    /**
     * Creates new form helpWindow1
     */
    public helpWindow() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        helpInfoPane = new javax.swing.JScrollPane();
        helpInfoTabbedPane = new javax.swing.JTabbedPane();
        generalScrollPane = new javax.swing.JScrollPane();
        generalHelpPane = new javax.swing.JTextPane();
        poiScrollPane = new javax.swing.JScrollPane();
        poiHelpPane = new javax.swing.JTextPane();
        favScrollPane = new javax.swing.JScrollPane();
        favHelpPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Help");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        generalHelpPane.setText("All functionality of this application can be reached via the main page.\n\nThis application only holds information for the 3 buildings: Alumni Hall, Physics and Astronomy, and Middlesex College. \n\nThere are multiple ways to find a room you are looking for:\n\n\tSearch Bar: This can be used to search for buildings and room\n\tnumbers. Upon submitting the information, the maps of the\n\tfloors associated with what you searched will be listed in the\n\tpane to the right.\n\n\tBuilding drop-down menu: Using this, you can filter the maps of\n\tfloors displayed by building.\n\n\tCheckboxes: Checking each category box will exclusively display\n\tall the maps of floors with one or more of the selected categories\n\tincluded in them. Note that this works with the building drop-down\n\tmenu, so if “Alumni Hall” is selected, only the maps in that building\n\twith one or more of the selected categories will be displayed.\n");
        generalScrollPane.setViewportView(generalHelpPane);

        helpInfoTabbedPane.addTab("General", generalScrollPane);

        poiHelpPane.setText("Points of Interests are rooms from a group of categories. From this group, you will be able to create a maximum number of 5 Points of Interest that you wish to highlight.\n\nTo begin creating a point of interest, use your cursor to click on the specified location you would like to save it on. This will open a pop-up window with a number of boxes to fill in. Depending on the location clicked, the ‘Room Number’ and ‘Category’ boxes will be filled out for you. \n\nTo view your newly created point of interest, navigate to the building and floor it is located on. An icon depending on the category selected when creating a point of interest will have been added. Furthermore, you can view your point of interest information saved by clicking on this icon.\n");
        poiScrollPane.setViewportView(poiHelpPane);

        helpInfoTabbedPane.addTab("POI", poiScrollPane);

        favHelpPane.setText("Favourites can be any point of interest that you may find extra important. A maximum of 10 favourites can be saved at a time.\n\nTo save a favourite, navigate to the point of interest you want to save as one and click on it to display its information. Along with the info, a button will also appear, giving you the option to sav the point of interest selected as a favourite. Once clicked, simply fill out the empty text boxes and save.\n\nTo view favourites, use the drop-down menu on the left. Clicking on each favourite will display the map of the floor it is associated with.\n");
        favScrollPane.setViewportView(favHelpPane);

        helpInfoTabbedPane.addTab("Favourites", favScrollPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(okButton)
                        .addGap(0, 277, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(helpInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(helpInfoTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(helpInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(helpInfoTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(okButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        MainPage poiPage = new MainPage();
        poiPage.setVisible(true);
        poiPage.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

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
            java.util.logging.Logger.getLogger(helpWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(helpWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(helpWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(helpWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new helpWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane favHelpPane;
    private javax.swing.JScrollPane favScrollPane;
    private javax.swing.JTextPane generalHelpPane;
    private javax.swing.JScrollPane generalScrollPane;
    private javax.swing.JScrollPane helpInfoPane;
    private javax.swing.JTabbedPane helpInfoTabbedPane;
    private javax.swing.JButton okButton;
    private javax.swing.JTextPane poiHelpPane;
    private javax.swing.JScrollPane poiScrollPane;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
