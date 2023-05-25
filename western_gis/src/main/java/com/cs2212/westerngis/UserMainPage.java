/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cs2212.westerngis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * This class holds all the data for the Points of Interest and Favorites screen.
 * 
 * @author Vladislav
 * @author Kevin
 * @author Darwish
 * @author Jingyao
 */
public class UserMainPage extends javax.swing.JFrame {
    //Importing all building floor image files
    String buildingName = "";
    ImageIcon AH_Page1 = new ImageIcon("AH_Page1.png");
    ImagePanel ah1 = new ImagePanel(AH_Page1.getImage());
    
    ImageIcon AH_Page2 = new ImageIcon("AH_Page2.png");
    ImagePanel ah2 = new ImagePanel(AH_Page2.getImage());
    
    ImageIcon AH_Page3 = new ImageIcon("AH_Page3.png");
    ImagePanel ah3 = new ImagePanel(AH_Page3.getImage());
    
    ImageIcon MC_Page1 = new ImageIcon("MC_Page1.png");
    ImagePanel mc1 = new ImagePanel(MC_Page1.getImage());
    
    ImageIcon MC_Page2 = new ImageIcon("MC_Page2.png");
    ImagePanel mc2 = new ImagePanel(MC_Page2.getImage());
    
    ImageIcon MC_Page3 = new ImageIcon("MC_Page3.png");
    ImagePanel mc3 = new ImagePanel(MC_Page3.getImage());
    
    ImageIcon MC_Page4 = new ImageIcon("MC_Page4.png");
    ImagePanel mc4 = new ImagePanel(MC_Page4.getImage());
    
    ImageIcon MC_Page5 = new ImageIcon("MC_Page5.png");
    ImagePanel mc5 = new ImagePanel(MC_Page5.getImage());
    
    ImageIcon PAB_Page1 = new ImageIcon("PAB_Page1.png");
    ImagePanel pab1 = new ImagePanel(PAB_Page1.getImage());
    
    ImageIcon PAB_Page2 = new ImageIcon("PAB_Page2.png");
    ImagePanel pab2 = new ImagePanel(PAB_Page2.getImage());
    
    ImageIcon PAB_Page3 = new ImageIcon("PAB_Page3.png");
    ImagePanel pab3 = new ImagePanel(PAB_Page3.getImage());
    
    ImageIcon PAB_Page4 = new ImageIcon("PAB_Page4.png");
    ImagePanel pab4 = new ImagePanel(PAB_Page4.getImage());
    
    ImageIcon star = new ImageIcon("star.png");
    ImageIcon mensWashroom = new ImageIcon("mensWashroom.png");
    ImageIcon womensWashroom = new ImageIcon("womensWashroom.png");
    ImageIcon favorite = new ImageIcon("womensWashroom.png");
    ImageIcon computer = new ImageIcon("computer.png");
    ImageIcon lab = new ImageIcon("lab.png");
    ImageIcon classroom = new ImageIcon("classroom.png");
    ImageIcon userCreated = new ImageIcon("userCreated.png");
    ImageIcon elevator = new ImageIcon("elevator.png");
    ImageIcon restaurant = new ImageIcon("restaurant.png");
    ImageIcon squ = new ImageIcon("highlight.png");
    DefaultListModel model = new DefaultListModel();
    
    POI lastPOI = null;
    
    
    static class ImagePanel extends JPanel {
        private Image backgroundImage;

        public ImagePanel(Image backgroundImage) {
            this.backgroundImage = backgroundImage;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, this);
        }
    }
    /**
     * Creates new form PointsOfInterest
     * 
     */
    public UserMainPage() {
        initComponents();
        this.bindData();
        jList1.setVisible(false);
        //Focuses the main JFrame instead of the first component
        getContentPane().requestFocusInWindow();
        
        saveFavButton.hide();
        
        //activate the POI's
        check1.doClick();
        check2.doClick();
        check4.doClick();
        check3.doClick();
        check5.doClick();
        check6.doClick();
        
        favBox.removeItem("Hello");
        
        POIStorage.loadPOIs();
        POIStorage.loadUserPOIs();
        
        for (POI value : POIStorage.poiMap.values()) {
            if(value.getUseFav() == true) {
                favBox.addItem(value.getName());
            }
        }
              
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        sidebarPanel = new javax.swing.JPanel();
        userInfoPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        poiSelectionPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        buildingSearch = new javax.swing.JTextField();
        buildingDropdownMenu = new javax.swing.JComboBox<>();
        favBox = new javax.swing.JComboBox<>();
        check2 = new javax.swing.JCheckBox();
        check1 = new javax.swing.JCheckBox();
        check4 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        check5 = new javax.swing.JCheckBox();
        check6 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        poiBox = new javax.swing.JComboBox<>();
        buttonPanel = new javax.swing.JPanel();
        helpBut = new javax.swing.JButton();
        logOutBut = new javax.swing.JButton();
        userInfoPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mapInfoPanel = new javax.swing.JPanel();
        mapTabbedPane = new javax.swing.JTabbedPane();
        poiInfoPanel = new javax.swing.JPanel();
        poiInfoTitle = new javax.swing.JLabel();
        buildingInfo = new javax.swing.JLabel();
        floorInfo = new javax.swing.JLabel();
        roomNumberInfo = new javax.swing.JLabel();
        nameInfo = new javax.swing.JLabel();
        categoryInfo = new javax.swing.JLabel();
        saveFavButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(825, 640));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jSplitPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        sidebarPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        sidebarPanel.setMaximumSize(new java.awt.Dimension(800, 588));
        sidebarPanel.setMinimumSize(new java.awt.Dimension(245, 588));
        sidebarPanel.setPreferredSize(new java.awt.Dimension(250, 600));

        userInfoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        userInfoPanel.setMinimumSize(new java.awt.Dimension(40, 100));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setText("User");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("WesternUser");

        javax.swing.GroupLayout userInfoPanelLayout = new javax.swing.GroupLayout(userInfoPanel);
        userInfoPanel.setLayout(userInfoPanelLayout);
        userInfoPanelLayout.setHorizontalGroup(
            userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userInfoPanelLayout.setVerticalGroup(
            userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        poiSelectionPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        poiSelectionPanel.setMinimumSize(new java.awt.Dimension(40, 100));
        poiSelectionPanel.setName(""); // NOI18N
        poiSelectionPanel.setLayout(null);

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Points of Interest");
        poiSelectionPanel.add(title);
        title.setBounds(2, 14, 201, 25);

        buildingSearch.setForeground(new java.awt.Color(102, 102, 102));
        buildingSearch.setText("Search for a Location...");
        buildingSearch.setMinimumSize(new java.awt.Dimension(40, 22));
        buildingSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buildingSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                buildingSearchFocusLost(evt);
            }
        });
        buildingSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buildingSearchMouseClicked(evt);
            }
        });
        buildingSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingSearchActionPerformed(evt);
            }
        });
        buildingSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buildingSearchKeyReleased(evt);
            }
        });
        poiSelectionPanel.add(buildingSearch);
        buildingSearch.setBounds(37, 51, 146, 19);

        buildingDropdownMenu.setForeground(new java.awt.Color(102, 102, 102));
        buildingDropdownMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Building...", "Alumni Hall", "Physics and Astronomy", "Middlesex College" }));
        buildingDropdownMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingDropdownMenuActionPerformed(evt);
            }
        });
        poiSelectionPanel.add(buildingDropdownMenu);
        buildingDropdownMenu.setBounds(40, 130, 143, 24);

        favBox.setForeground(new java.awt.Color(102, 102, 102));
        favBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a favourite", "Hello" }));
        favBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favBoxActionPerformed(evt);
            }
        });
        poiSelectionPanel.add(favBox);
        favBox.setBounds(40, 160, 146, 24);

        check2.setText("Bathroom");
        check2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check2ActionPerformed(evt);
            }
        });
        poiSelectionPanel.add(check2);
        check2.setBounds(120, 250, 100, 23);

        check1.setText("Classroom");
        check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check1ActionPerformed(evt);
            }
        });
        poiSelectionPanel.add(check1);
        check1.setBounds(10, 250, 100, 23);

        check4.setText("Labs");
        check4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check4ActionPerformed(evt);
            }
        });
        poiSelectionPanel.add(check4);
        check4.setBounds(120, 280, 90, 23);

        check3.setText("Restaurant");
        check3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check3ActionPerformed(evt);
            }
        });
        poiSelectionPanel.add(check3);
        check3.setBounds(10, 280, 110, 23);

        check5.setText("Navigation");
        check5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check5ActionPerformed(evt);
            }
        });
        poiSelectionPanel.add(check5);
        check5.setBounds(10, 310, 110, 23);

        check6.setText("Computers");
        check6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check6ActionPerformed(evt);
            }
        });
        poiSelectionPanel.add(check6);
        check6.setBounds(120, 310, 100, 23);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        poiSelectionPanel.add(jScrollPane1);
        jScrollPane1.setBounds(40, 70, 140, 40);

        poiBox.setForeground(new java.awt.Color(102, 102, 102));
        poiBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a POI", "Hello" }));
        poiBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poiBoxMouseClicked(evt);
            }
        });
        poiBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poiBoxActionPerformed(evt);
            }
        });
        poiSelectionPanel.add(poiBox);
        poiBox.setBounds(40, 190, 146, 24);

        buttonPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        buttonPanel.setMinimumSize(new java.awt.Dimension(40, 100));

        helpBut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        helpBut.setText("Help");
        helpBut.setMinimumSize(new java.awt.Dimension(15, 23));
        helpBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButActionPerformed(evt);
            }
        });

        logOutBut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logOutBut.setText("Log Out");
        logOutBut.setMinimumSize(new java.awt.Dimension(15, 23));
        logOutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpBut, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutBut, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logOutBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        userInfoPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        userInfoPanel1.setMinimumSize(new java.awt.Dimension(40, 100));

        try {
            WeatherApp weatherData = new WeatherApp("London,CA");
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            double temp = weatherData.getTemperature();
            jLabel5.setText(String.format("Temperature: %.0f°C", temp));
        } catch (Exception e) {
            jLabel5.setText("Weather currently unavailable");
        }

        try {
            WeatherApp weatherData = new WeatherApp("London,CA");
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel6.setText("Weather: " + weatherData.getWeatherCondition());
        } catch (Exception e) {

        }

        javax.swing.GroupLayout userInfoPanel1Layout = new javax.swing.GroupLayout(userInfoPanel1);
        userInfoPanel1.setLayout(userInfoPanel1Layout);
        userInfoPanel1Layout.setHorizontalGroup(
            userInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        userInfoPanel1Layout.setVerticalGroup(
            userInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poiSelectionPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userInfoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userInfoPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userInfoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poiSelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(sidebarPanel);

        mapInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        mapInfoPanel.setMaximumSize(new java.awt.Dimension(582, 588));
        mapInfoPanel.setMinimumSize(new java.awt.Dimension(560, 588));
        mapInfoPanel.setPreferredSize(new java.awt.Dimension(570, 600));
        mapInfoPanel.setLayout(new java.awt.BorderLayout());

        mapTabbedPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        mapInfoPanel.add(mapTabbedPane, java.awt.BorderLayout.CENTER);

        poiInfoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        poiInfoPanel.setPreferredSize(new java.awt.Dimension(560, 170));

        poiInfoTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        poiInfoTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poiInfoTitle.setText("Information");

        buildingInfo.setText("Building: ");

        floorInfo.setText("Floor: ");

        roomNumberInfo.setText("Room Number:");

        nameInfo.setText("Name:");

        categoryInfo.setText("Category:");

        saveFavButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveFavButton.setText("Save as Favourite");
        saveFavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFavButtonActionPerformed(evt);
            }
        });

        descriptionInfo.setMargin(new Insets(0, 0, 0, 0));
        descriptionInfo.setEditable(false);
        descriptionInfo.setColumns(20);
        descriptionInfo.setLineWrap(true);
        descriptionInfo.setRows(5);
        descriptionInfo.setText("Description:");
        descriptionInfo.setMaximumSize(new java.awt.Dimension(100, 2147483647));
        descriptionInfo.setMinimumSize(new java.awt.Dimension(113, 20));
        descriptionInfo.setOpaque(false);
        jScrollPane2.setViewportView(descriptionInfo);

        javax.swing.GroupLayout poiInfoPanelLayout = new javax.swing.GroupLayout(poiInfoPanel);
        poiInfoPanel.setLayout(poiInfoPanelLayout);
        poiInfoPanelLayout.setHorizontalGroup(
            poiInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poiInfoPanelLayout.createSequentialGroup()
                .addGroup(poiInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(poiInfoPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(poiInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(poiInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(floorInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomNumberInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buildingInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(poiInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveFavButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(nameInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(poiInfoPanelLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(poiInfoTitle)))
                .addContainerGap())
        );
        poiInfoPanelLayout.setVerticalGroup(
            poiInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poiInfoPanelLayout.createSequentialGroup()
                .addComponent(poiInfoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(poiInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameInfo)
                    .addComponent(buildingInfo))
                .addGroup(poiInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(poiInfoPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(floorInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roomNumberInfo))
                    .addGroup(poiInfoPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(poiInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryInfo)
                    .addComponent(saveFavButton))
                .addGap(12, 12, 12))
        );

        mapInfoPanel.add(poiInfoPanel, java.awt.BorderLayout.PAGE_START);

        jSplitPane1.setRightComponent(mapInfoPanel);

        getContentPane().add(jSplitPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method is responsible for removing the placeholder text when the building search bar
     * is focused (clicked on).
     * 
     * @param evt 
     */
    private void buildingSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buildingSearchFocusGained
        if (buildingSearch.getText().equals("Search for a Location...")) {
            buildingSearch.setText("");
            buildingSearch.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
            buildingSearch.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_buildingSearchFocusGained

    /**
     * This method is responsible for re-adding the placeholder text when the building search
     * bar is unfocused.
     * 
     * @param evt
     */
    private void buildingSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buildingSearchFocusLost
        if (buildingSearch.getText().equals("")) {
            buildingSearch.setText("Search for a Location...");
            buildingSearch.setFont(new java.awt.Font("segoe UI", 2, 12)); 
            buildingSearch.setForeground(new java.awt.Color(102, 102, 102));
        }
    }//GEN-LAST:event_buildingSearchFocusLost

    /**
     * This method is responsible for closing the current window and replacing it with
     * the log in page to simulate logging out of the application when clicking on the
     * "log out" button.
     * 
     * @param evt 
     */
    private void logOutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButActionPerformed
        Point location = this.getLocation();
        logInPage logPage = new logInPage();
        logPage.setLocation(location);
        logPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutButActionPerformed
  
    /**
     * This method is responsible for changing the maps displayed depending on which
     * building is selected on the building drop-down menu.
     * 
     * @param evt 
     */

    private void buildingDropdownMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingDropdownMenuActionPerformed

        // Create a MouseListener instance
    MouseListener mouseListener = new MouseAdapter() {
            
        @Override
        public void mouseClicked(MouseEvent e) {     
            
            //This represents whether or not the location at which the user clicks is a POI
            Boolean isPOI = false;
            

            
            
            int index = mapTabbedPane.getSelectedIndex();
            if(index == -1) {
                index = 1;
            }
            String buildingFloor = mapTabbedPane.getTitleAt(index);
            JScrollPane selectedScrollPane = (JScrollPane) mapTabbedPane.getComponentAt(index);
            JViewport viewport = selectedScrollPane.getViewport();
            
            Point mousePoint = viewport.getViewPosition();
            
            mousePoint.translate(e.getPoint().x, e.getPoint().y);
            
            /*
             * Comparing each one of the POI coordinates with the user click coordinates 
             * to determine if the user is clicking on a POI or not. This will make it so that
             * the new POI window only appears when the user clicks on an area with no POI. If
             * a POI is clicked on, the info for that POI will be displayed.
            */
            final int[] checking = {0};
            for (POI value : POIStorage.poiMap.values()) {
                if(value.getUseFav() == true) {
                    checking[0]++;
                }
                
                /*
                Making the POI's clickable. These if statements are put in place to make sure
                the correct POI is selected isntead of a POI at the same location of a different map.
                */
                if (value.getX() <= mousePoint.x + 12 && mousePoint.x <= value.getX() + 12) {
                    if (value.getY() <= mousePoint.y + 12 && mousePoint.y <= value.getY() + 12) {
                        if (value.getBuilding().equals(buildingDropdownMenu.getSelectedItem().toString())) {
                            if (value.getFloor().equals(mapTabbedPane.getTitleAt(mapTabbedPane.getSelectedIndex()))) {
                                isPOI = true;
                                final POI clickedPOI = value;
                                
                                //Displaying the POI info for the selected POI
                                displayPOIInfo(clickedPOI);
                                saveFavButton.show();
                                saveFavButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if(checking[0] == 10) {
                                            FavError errorDialog = new FavError(new javax.swing.JFrame(), true);
                                            errorDialog.show();
                                        } else {
                                            if(clickedPOI.getUseFav() == false) {
                                                clickedPOI.setUseFav(true);
                                                favBox.addItem(value.getName());
                                                FavTrue tDialog = new FavTrue(new javax.swing.JFrame(), true);
                                                tDialog.setSize(400,300);
                                                tDialog.setLocationRelativeTo(null);
                                                tDialog.show();
                                            } else if(clickedPOI.getUseFav() == true) {
                                                clickedPOI.setUseFav(false);
                                                checking[0]--;
                                                favBox.removeItem(value.getName());
                                                FavFalse fDialog = new FavFalse(new javax.swing.JFrame(), true);
                                                fDialog.setSize(400,300);
                                                fDialog.setLocationRelativeTo(null);
                                                fDialog.show();
                                            }
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            }          

            if (isPOI == false) {
                clearPOIInfo();
                saveFavButton.hide();
                
                NewPOIWindowUser POIWindow = new NewPOIWindowUser(mousePoint.x, mousePoint.y, buildingName, buildingFloor);
                POIWindow.setVisible(true);
                POIWindow.setLocationRelativeTo(null);
                POIWindow.setAlwaysOnTop(true);
            
                POIWindow.addWindowListener(new WindowAdapter() {
            
                @Override
                public void windowClosed(WindowEvent e) {
                    updateMap();
                }
            });
            }
        }   
    };   
    
    mapTabbedPane.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            updateMap();
        }
    });
            
        //Removing all panes after a different selection is made in the tree pane so that only the floors of the building/layer selected is shown.
        mapTabbedPane.removeAll();
        
        //Changing all the floors displayed in the map tabbed pane based on what is selected in the dropdown menu
        if (buildingDropdownMenu.getSelectedIndex() == 0) {
        } else if (buildingDropdownMenu.getSelectedIndex() == 1){
            ah1.setPreferredSize(new Dimension(AH_Page1.getIconWidth(), AH_Page1.getIconHeight()));
            ah2.setPreferredSize(new Dimension(AH_Page2.getIconWidth(), AH_Page2.getIconHeight()));
            ah3.setPreferredSize(new Dimension(AH_Page3.getIconWidth(), AH_Page3.getIconHeight()));
            ah1.setLayout(null);
            ah2.setLayout(null);
            ah3.setLayout(null);
            buildingName = "Alumni Hall";
          
            mapTabbedPane.addTab("Ground",new javax.swing.JScrollPane(ah1));         
            mapTabbedPane.addTab("Floor 1", new javax.swing.JScrollPane(ah2));
            mapTabbedPane.addTab("Floor 2", new javax.swing.JScrollPane(ah3));
            updateMap();
        }
        else if (buildingDropdownMenu.getSelectedIndex() == 2){
            pab1.setPreferredSize(new Dimension(PAB_Page1.getIconWidth(), PAB_Page1.getIconHeight()));
            pab2.setPreferredSize(new Dimension(PAB_Page2.getIconWidth(), PAB_Page2.getIconHeight()));
            pab3.setPreferredSize(new Dimension(PAB_Page3.getIconWidth(), PAB_Page3.getIconHeight()));
            pab4.setPreferredSize(new Dimension(PAB_Page4.getIconWidth(), PAB_Page4.getIconHeight()));
            pab1.setLayout(null);
            pab2.setLayout(null);
            pab3.setLayout(null);
            pab4.setLayout(null);
            buildingName = "Physics and Astronomy";
            
            mapTabbedPane.addTab("Ground",new javax.swing.JScrollPane(pab1));
            mapTabbedPane.addTab("Floor 1", new javax.swing.JScrollPane(pab2));
            mapTabbedPane.addTab("Floor 2", new javax.swing.JScrollPane(pab3));
            mapTabbedPane.addTab("Floor 3", new javax.swing.JScrollPane(pab4));
            updateMap();
        }
        else if (buildingDropdownMenu.getSelectedIndex() == 3){
            mc1.setPreferredSize(new Dimension(MC_Page1.getIconWidth(), MC_Page1.getIconHeight()));
            mc2.setPreferredSize(new Dimension(MC_Page2.getIconWidth(), MC_Page2.getIconHeight()));
            mc3.setPreferredSize(new Dimension(MC_Page3.getIconWidth(), MC_Page3.getIconHeight()));
            mc4.setPreferredSize(new Dimension(MC_Page4.getIconWidth(), MC_Page4.getIconHeight()));
            mc5.setPreferredSize(new Dimension(MC_Page5.getIconWidth(), MC_Page5.getIconHeight()));
            mc1.setLayout(null);
            mc2.setLayout(null);
            mc3.setLayout(null);
            mc4.setLayout(null);
            mc5.setLayout(null);
            buildingName = "Middlesex College";
            
            mapTabbedPane.addTab("Ground", new javax.swing.JScrollPane(mc1));
            mapTabbedPane.addTab("Floor 1", new javax.swing.JScrollPane(mc2));
            mapTabbedPane.addTab("Floor 2", new javax.swing.JScrollPane(mc3));
            mapTabbedPane.addTab("Floor 3", new javax.swing.JScrollPane(mc4));
            mapTabbedPane.addTab("Floor 4", new javax.swing.JScrollPane(mc5));
            updateMap();
        }
        
    // Loop over the components of the mapTabbedPane
    for (Component component : mapTabbedPane.getComponents()) {
        if (component instanceof JScrollPane) {
            JScrollPane scrollPane = (JScrollPane) component;
            scrollPane.addMouseListener(mouseListener);
        }
    }
    }//GEN-LAST:event_buildingDropdownMenuActionPerformed
    
    /**
     * This method is responsible for displaying POI info when the user clicks on a POI
     * @param userClickedPOI 
     */
private ArrayList<JLabel> iconListSelect = new ArrayList<>();
public void displayPOIInfo(POI userClickedPOI) {
    
        int x = (int) userClickedPOI.getX() - 18;
        int y = (int) userClickedPOI.getY() - 18;
        
        int index = mapTabbedPane.getSelectedIndex();
        if(index == -1) {
            index = 1;
        }
        
        JScrollPane selectedScrollPane = (JScrollPane) mapTabbedPane.getComponentAt(index);
        JViewport viewport = selectedScrollPane.getViewport();            
        UserMainPage.ImagePanel imagePanel = (UserMainPage.ImagePanel) viewport.getView();
    
        if(!iconListSelect.isEmpty()) {
            for (JLabel icon : iconListSelect) { 
                    imagePanel.remove(icon);
                }
            imagePanel.repaint();
        }
        
            JLabel square = new JLabel(squ);
            square.setSize(30, 30);
            square.setLocation(x,y);
            imagePanel.add(square);
            // Repaint the imagePanel to show the new icon
            imagePanel.repaint();
            iconListSelect.add(square);
            
    buildingInfo.setText("Building: " + userClickedPOI.getBuilding());
    floorInfo.setText("Floor: " + userClickedPOI.getFloor());
    roomNumberInfo.setText("Room Number: " + userClickedPOI.getRoomNumber());
    nameInfo.setText("Name: " + userClickedPOI.getName());
    categoryInfo.setText("Category: " + userClickedPOI.getCategory());
    descriptionInfo.setText("Description: " + userClickedPOI.getDescription());
}

/**
 * This method is responsible for clearing the POI info when the user unfocuses
 * on a POI.
 */
public void clearPOIInfo() {
    buildingInfo.setText("Building: ");
    floorInfo.setText("Floor: ");
    roomNumberInfo.setText("Room Number: ");
    nameInfo.setText("Name: ");
    categoryInfo.setText("Category: ");
    descriptionInfo.setText("Description: ");
}
    private ArrayList<JLabel> iconList1 = new ArrayList<>();
    private ArrayList<JLabel> iconList2 = new ArrayList<>();
    private ArrayList<JLabel> iconList3 = new ArrayList<>();
    private ArrayList<JLabel> iconList4 = new ArrayList<>();
    private ArrayList<JLabel> iconList5 = new ArrayList<>();
    private ArrayList<JLabel> iconList6 = new ArrayList<>();

    /**
     * This method is responsible for Updating the map based on what the user clicks on.
     */
public void updateMap() {
    String selectedBuilding = (String) buildingDropdownMenu.getSelectedItem();
    int index = mapTabbedPane.getSelectedIndex();
    if(index == -1) {
        index = 0;
    }
    String currentFloor = mapTabbedPane.getTitleAt(index);   
    for (POI value : POIStorage.poiMap.values()) {
        if (value.getCategory().equals("Classroom") && value.getBuilding().equals(selectedBuilding) && value.getFloor().equals(currentFloor)) {          
            index = mapTabbedPane.getSelectedIndex();           
            if (index == -1) {
                index = 0;
            }
            JScrollPane selectedScrollPane = (JScrollPane) mapTabbedPane.getComponentAt(index);
            
            JViewport viewport = selectedScrollPane.getViewport();
            ImagePanel imagePanel = (ImagePanel) viewport.getView();
            if(check1.isSelected()) {
                JLabel imIcon = new JLabel(classroom);
                imIcon.setSize(20, 20);
                // Set the location of the JLabel based on the x and y coordinates of the POI
                int x = (int) value.getX() - 12;
                int y = (int) value.getY() - 12;
                imIcon.setLocation(x,y);
                imagePanel.add(imIcon);
                // Repaint the imagePanel to show the new icon
                imagePanel.repaint();
                iconList1.add(imIcon);
            } else {
                // Remove the icon if the checkbox is not selected
                int x = (int) value.getX() - 12;
                int y = (int) value.getY() - 12;
                ArrayList<JLabel> labelsToRemove = new ArrayList<>();
                for (JLabel icon : iconList1) {      
                    if (icon.getLocation().x == x && icon.getLocation().y == y) {
                        labelsToRemove.add(icon);
                        imagePanel.remove(icon);
                    }
                }
                iconList1.removeAll(labelsToRemove);
                imagePanel.repaint();
            }
        
        } else if (value.getCategory().equals("Bathroom") && value.getBuilding().equals(selectedBuilding) && value.getFloor().equals(currentFloor)) {
            index = mapTabbedPane.getSelectedIndex();           
            if (index == -1) {
                index = 0;
            }
            JScrollPane selectedScrollPane = (JScrollPane) mapTabbedPane.getComponentAt(index);
            JViewport viewport = selectedScrollPane.getViewport();
            ImagePanel imagePanel = (ImagePanel) viewport.getView();
            if(check2.isSelected()) {
                JLabel imIcon = new JLabel(mensWashroom);
                imIcon.setSize(20, 20);
                // Set the location of the JLabel based on the x and y coordinates of the POI
                int x = (int) value.getX() - 12;
                int y = (int) value.getY() - 12;
                imIcon.setLocation(x,y);
                imagePanel.add(imIcon);
                // Repaint the imagePanel to show the new icon
                imagePanel.repaint();
                iconList2.add(imIcon);
            } else {
                // Remove the icon if the checkbox is not selected
                int x = (int) value.getX() - 12;
                int y = (int) value.getY() - 12;
                ArrayList<JLabel> labelsToRemove = new ArrayList<>();
                for (JLabel icon : iconList2) {      
                    if (icon.getLocation().x == x && icon.getLocation().y == y) {
                        labelsToRemove.add(icon);
                        imagePanel.remove(icon);
                    }
                }
                iconList2.removeAll(labelsToRemove);
                imagePanel.repaint();
            }
        } else if (value.getCategory().equals("Restaurant") && value.getBuilding().equals(selectedBuilding) && value.getFloor().equals(currentFloor)) {
            index = mapTabbedPane.getSelectedIndex();           
            if (index == -1) {
                index = 0;
            }
            JScrollPane selectedScrollPane = (JScrollPane) mapTabbedPane.getComponentAt(index);
            JViewport viewport = selectedScrollPane.getViewport();
            ImagePanel imagePanel = (ImagePanel) viewport.getView();
            if(check3.isSelected()) {
                JLabel imIcon = new JLabel(restaurant);
                imIcon.setSize(20, 20);
                // Set the location of the JLabel based on the x and y coordinates of the POI
                int x = (int) value.getX() - 12;
                int y = (int) value.getY() - 12;
                imIcon.setLocation(x,y);
                imagePanel.add(imIcon);
                // Repaint the imagePanel to show the new icon
                imagePanel.repaint();
                iconList3.add(imIcon);
            } else {
                // Remove the icon if the checkbox is not selected
                int x = (int) value.getX() - 12;
                int y = (int) value.getY() - 12;
                ArrayList<JLabel> labelsToRemove = new ArrayList<>();
                for (JLabel icon : iconList3) {      
                    if (icon.getLocation().x == x && icon.getLocation().y == y) {
                        labelsToRemove.add(icon);
                        imagePanel.remove(icon);
                    }
                }
                iconList3.removeAll(labelsToRemove);
                imagePanel.repaint();
            }
        
        
        } else if (value.getCategory().equals("Labs") && value.getBuilding().equals(selectedBuilding) && value.getFloor().equals(currentFloor)) {
            index = mapTabbedPane.getSelectedIndex();           
            if (index == -1) {
                index = 0;
            }
            JScrollPane selectedScrollPane = (JScrollPane) mapTabbedPane.getComponentAt(index);
            JViewport viewport = selectedScrollPane.getViewport();
            ImagePanel imagePanel = (ImagePanel) viewport.getView();
            if(check4.isSelected()) {
                JLabel imIcon = new JLabel(lab);
                imIcon.setSize(20, 20);
                // Set the location of the JLabel based on the x and y coordinates of the POI
                int x = (int) value.getX() - 12;
                int y = (int) value.getY() - 12;
                imIcon.setLocation(x,y);
                imagePanel.add(imIcon);
                // Repaint the imagePanel to show the new icon
                imagePanel.repaint();
                iconList4.add(imIcon);
            } else {
                // Remove the icon if the checkbox is not selected
                int x = (int) value.getX() - 12;
                int y = (int) value.getY() - 12;
                ArrayList<JLabel> labelsToRemove = new ArrayList<>();
                for (JLabel icon : iconList4) {      
                    if (icon.getLocation().x == x && icon.getLocation().y == y) {
                        labelsToRemove.add(icon);
                        imagePanel.remove(icon);
                    }
                }
                iconList4.removeAll(labelsToRemove);
                imagePanel.repaint();
            }
        
        } else if (value.getCategory().equals("Navigation") && value.getBuilding().equals(selectedBuilding) && value.getFloor().equals(currentFloor)) {
            index = mapTabbedPane.getSelectedIndex();           
            if (index == -1) {
                index = 0;
            }
            JScrollPane selectedScrollPane = (JScrollPane) mapTabbedPane.getComponentAt(index);
            JViewport viewport = selectedScrollPane.getViewport();
            ImagePanel imagePanel = (ImagePanel) viewport.getView();
            if(check5.isSelected()) {
                JLabel imIcon = new JLabel(elevator);
                imIcon.setSize(20, 20);
                // Set the location of the JLabel based on the x and y coordinates of the POI
                int x = (int) value.getX() - 12;
                int y = (int) value.getY() - 12;
                imIcon.setLocation(x,y);
                imagePanel.add(imIcon);
                // Repaint the imagePanel to show the new icon
                imagePanel.repaint();
                iconList5.add(imIcon);
            } else {
                // Remove the icon if the checkbox is not selected
                int x = (int) value.getX() - 12;
                int y = (int) value.getY() - 12;
                ArrayList<JLabel> labelsToRemove = new ArrayList<>();
                for (JLabel icon : iconList5) {      
                    if (icon.getLocation().x == x && icon.getLocation().y == y) {
                        labelsToRemove.add(icon);
                        imagePanel.remove(icon);
                    }
                }
                iconList5.removeAll(labelsToRemove);
                imagePanel.repaint();
            }
        
        } else if (value.getCategory().equals("Computers") && value.getBuilding().equals(selectedBuilding) && value.getFloor().equals(currentFloor)) {
            index = mapTabbedPane.getSelectedIndex();           
            if (index == -1) {
                index = 0;
            }
            JScrollPane selectedScrollPane = (JScrollPane) mapTabbedPane.getComponentAt(index);
            JViewport viewport = selectedScrollPane.getViewport();
            ImagePanel imagePanel = (ImagePanel) viewport.getView();
            if(check6.isSelected()) {
                JLabel imIcon = new JLabel(computer);
                imIcon.setSize(20, 20);
                // Set the location of the JLabel based on the x and y coordinates of the POI
                int x = (int) value.getX() - 12;
                int y = (int) value.getY() - 12;
                imIcon.setLocation(x,y);
                imagePanel.add(imIcon);
                // Repaint the imagePanel to show the new icon
                imagePanel.repaint();
                iconList6.add(imIcon);
            } else {
                // Remove the icon if the checkbox is not selected
                int x = (int) value.getX() - 12;
                int y = (int) value.getY() - 12;
                ArrayList<JLabel> labelsToRemove = new ArrayList<>();
                for (JLabel icon : iconList6) {      
                    if (icon.getLocation().x == x && icon.getLocation().y == y) {
                        labelsToRemove.add(icon);
                        imagePanel.remove(icon);
                    }
                }
                iconList6.removeAll(labelsToRemove);
                imagePanel.repaint();
            }
        
        }  
        
    }
}

    private void favBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favBoxActionPerformed

    }//GEN-LAST:event_favBoxActionPerformed

    private void check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check1ActionPerformed
        if(mapTabbedPane.getSelectedIndex() != -1) {
            updateMap();
        }
    }//GEN-LAST:event_check1ActionPerformed

    private void check2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check2ActionPerformed
        if(mapTabbedPane.getSelectedIndex() != -1) {
            updateMap();
        }
    }//GEN-LAST:event_check2ActionPerformed

    private void check3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check3ActionPerformed
        if(mapTabbedPane.getSelectedIndex() != -1) {
            updateMap();
        }
    }//GEN-LAST:event_check3ActionPerformed

    private void check4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check4ActionPerformed
        if(mapTabbedPane.getSelectedIndex() != -1) {
            updateMap();
        }
    }//GEN-LAST:event_check4ActionPerformed

    private void check5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check5ActionPerformed
        if(mapTabbedPane.getSelectedIndex() != -1) {
            updateMap();
        }
    }//GEN-LAST:event_check5ActionPerformed

    private void check6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check6ActionPerformed
        if(mapTabbedPane.getSelectedIndex() != -1) {
            updateMap();
        }
    }//GEN-LAST:event_check6ActionPerformed

    private void helpButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButActionPerformed
        helpWindow helpScreen = new helpWindow();
        helpScreen.setVisible(true);
        this.dispose();
        helpScreen.setLocationRelativeTo(null);
    }//GEN-LAST:event_helpButActionPerformed

    private void buildingSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingSearchActionPerformed
        
    }//GEN-LAST:event_buildingSearchActionPerformed

    private void check7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check7ActionPerformed

    private void check8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check8ActionPerformed

    private void saveFavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFavButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveFavButtonActionPerformed
    
    /**
     * This private method is responsible for storing all POI's in an arraylist called 'stars'.
     * @return stars
     */
    private ArrayList getStars(){
        POIStorage poi = new POIStorage();
        ArrayList stars = new ArrayList();
        for(Map.Entry<String, POI> entry : poi.poiMap.entrySet()){
            if (buildingName.equals("Alumni Hall")&&entry.getValue().getBuilding().equals("Alumni Hall"))
                stars.add(entry.getValue().getRoomNumber());
            else if (buildingName.equals("Physics and Astronomy")&&entry.getValue().getBuilding().equals("Physics and Astronomy"))
                stars.add(entry.getValue().getRoomNumber());
            else if (buildingName.equals("Middlesex College")&&entry.getValue().getBuilding().equals("Middlesex College"))
                stars.add(entry.getValue().getRoomNumber());
        }
        return stars;
    }
    
    /**
     * This method is responsible for binding the POI data to 'jList1' based on which building
     * is selected.
     */
    private void bindData(){
        getStars().stream().forEach((star) -> {
            model.addElement(star);
        });
        jList1.setModel(model);
        jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    /**
     * This method is responsible for filtering suggested POI's in the search bar
     * based on which building is selected.
     * @param term 
     */
    private void searchFilter(String term){
        DefaultListModel filter = new DefaultListModel();
        ArrayList stars = getStars();
        stars.stream().forEach((star) -> {
            String starName = star.toString().toLowerCase();
            if (starName.contains(term.toLowerCase())){
                filter.addElement(star);
            }
        });
        model = filter;
        jList1.setModel(model);
    }
    
    private void buildingSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buildingSearchKeyReleased
        searchFilter(buildingSearch.getText());
    }//GEN-LAST:event_buildingSearchKeyReleased

    private void buildingSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buildingSearchMouseClicked
        jList1.setVisible(true);
    }//GEN-LAST:event_buildingSearchMouseClicked

    /**
     * This method is responsible for displaying POI's when clicking on the list 'jList1'.
     * @param evt 
     */
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String val = jList1.getSelectedValue();
        POIStorage poi = new POIStorage();
        int floor = mapTabbedPane.getSelectedIndex();
        
        /*Iterating through all POI elements stored and displaying only those that
        * correspond with the current building selected.
        */
        for(Map.Entry<String, POI> entry : poi.poiMap.entrySet()){
            if (buildingName.equals(entry.getValue().getBuilding())&&entry.getValue().getRoomNumber().equals(val)){
                if (entry.getValue().getFloor().equals("Ground")) {
                    floor = 0;
                }
                else if (Character.isDigit(entry.getValue().getFloor().charAt((entry.getValue().getFloor().length()-1)))){
                    floor = Character.getNumericValue(entry.getValue().getFloor().charAt((entry.getValue().getFloor().length()-1)));
                }
                else {
                    floor = Character.getNumericValue(entry.getValue().getFloor().charAt((entry.getValue().getFloor().length()-2)));
                }
            }
        }
        mapTabbedPane.setSelectedIndex(floor);
    }//GEN-LAST:event_jList1MouseClicked

    private void poiBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poiBoxMouseClicked
        poiBox.removeAllItems();
        poiBox.addItem("Choose a POI");
        String val = (String) poiBox.getSelectedItem();
        POIStorage poi = new POIStorage();
        int floor = mapTabbedPane.getSelectedIndex();
        for(Map.Entry<String, POI> entry : poi.poiMap.entrySet()){
            if (buildingName.equals(entry.getValue().getBuilding())){
                poiBox.addItem(entry.getValue().getRoomNumber());
            }
        }
    }//GEN-LAST:event_poiBoxMouseClicked

    private void poiBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poiBoxActionPerformed
        String val = (String) poiBox.getSelectedItem();
        POIStorage poi = new POIStorage();
        int floor = mapTabbedPane.getSelectedIndex();
        if (poiBox.getSelectedIndex()!=0) {
            for(Map.Entry<String, POI> entry : poi.poiMap.entrySet()){
                if (entry.getValue().getRoomNumber().equals(val)&&entry.getValue().getFloor().equals("Ground")) {
                    floor = 0;
                    mapTabbedPane.setSelectedIndex(floor);
                }
                else if (entry.getValue().getRoomNumber().equals(val)&&Character.isDigit(entry.getValue().getFloor().charAt((entry.getValue().getFloor().length()-1)))){
                    floor = Character.getNumericValue(entry.getValue().getFloor().charAt((entry.getValue().getFloor().length()-1)));
                    mapTabbedPane.setSelectedIndex(floor);
                }
                else if (entry.getValue().getRoomNumber().equals(val)&&Character.isDigit(entry.getValue().getFloor().charAt((entry.getValue().getFloor().length()-2)))){
                    floor = Character.getNumericValue(entry.getValue().getFloor().charAt((entry.getValue().getFloor().length()-2)));
                    mapTabbedPane.setSelectedIndex(floor);
                }
            }
        }
    }//GEN-LAST:event_poiBoxActionPerformed

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
            java.util.logging.Logger.getLogger(UserMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> buildingDropdownMenu;
    private javax.swing.JLabel buildingInfo;
    private javax.swing.JTextField buildingSearch;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel categoryInfo;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JCheckBox check4;
    private javax.swing.JCheckBox check5;
    private javax.swing.JCheckBox check6;
    private javax.swing.JTextArea descriptionInfo;
    private javax.swing.JComboBox<String> favBox;
    private javax.swing.JLabel floorInfo;
    private javax.swing.JButton helpBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logOutBut;
    private javax.swing.JPanel mapInfoPanel;
    private javax.swing.JTabbedPane mapTabbedPane;
    private javax.swing.JLabel nameInfo;
    private javax.swing.JComboBox<String> poiBox;
    private javax.swing.JPanel poiInfoPanel;
    private javax.swing.JLabel poiInfoTitle;
    private javax.swing.JPanel poiSelectionPanel;
    private javax.swing.JLabel roomNumberInfo;
    private javax.swing.JButton saveFavButton;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JLabel title;
    private javax.swing.JPanel userInfoPanel;
    private javax.swing.JPanel userInfoPanel1;
    // End of variables declaration//GEN-END:variables
}
