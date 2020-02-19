/*
 * To chang    @Override
    public int getWidth(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHeight(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImageProducer getSource() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Graphics getGraphics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getProperty(String name, ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
e this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 *
 * @author Phil Rey
 */
public class registrationLogin extends javax.swing.JFrame {
    myFunctions my;
    public registrationLogin() {
        my = new myFunctions();
        initComponents();
        this.setLocationRelativeTo(null);
        initUI();
        
    }
    void initUI(){        
        //Add to tabbedPane
        tpDashboard.addTab("Manage Students", my.getImgIcn(myVariables.getStudentsIcon()), studentsPanel,"");
        tpDashboard.addTab("Student's Personal Info", my.getImgIcn(myVariables.getStudentsPrsnlInfIcon()), studentsPrsnlInfPanel);
        tpDashboard.addTab("Subjects", my.getImgIcn(myVariables.getSubjectsIcon()), subjectsPanel);
        tpDashboard.addTab("Loads", my.getImgIcn(myVariables.getSubjeLoadsIcon()), loadsPanel);
        tpDashboard.addTab("Users", my.getImgIcn(myVariables.getUsersIcon()), usersPanel);
        tpDashboard.addTab("User's Personal Info", my.getImgIcn(myVariables.getUsersPrsnlInfIcon()), usersPrsnlInfPanel);
        
        tpStudentControls.setIconAt(0, my.getImgIcn(myVariables.getAddIcon()));
        tpStudentControls.setIconAt(1, my.getImgIcn(myVariables.getEditIcon()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainWindow = new javax.swing.JFrame();
        mainPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tfSchoolName = new javax.swing.JLabel();
        tpDashboard = new javax.swing.JTabbedPane();
        studentsPanel = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        tfStudentSearch = new javax.swing.JTextField();
        btnSearchStudent = new javax.swing.JButton();
        tpStudentControls = new javax.swing.JTabbedPane();
        addStudentPanel = new javax.swing.JPanel();
        editStudentPanel = new javax.swing.JPanel();
        studentsPrsnlInfPanel = new keeptoo.KGradientPanel();
        subjectsPanel = new keeptoo.KGradientPanel();
        loadsPanel = new keeptoo.KGradientPanel();
        usersPanel = new keeptoo.KGradientPanel();
        usersPrsnlInfPanel = new keeptoo.KGradientPanel();
        loginPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Background = new javax.swing.JLabel();

        mainWindow.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setMinimumSize(new java.awt.Dimension(600, 500));

        mainPanel.setBackground(new java.awt.Color(0, 153, 0));

        jPanel4.setBackground(new java.awt.Color(0, 102, 0));

        tfSchoolName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfSchoolName.setForeground(new java.awt.Color(255, 255, 255));
        tfSchoolName.setText("SCHOOL_NAME");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfSchoolName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfSchoolName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpDashboard.setBackground(new java.awt.Color(255, 255, 255));
        tpDashboard.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 466, Short.MAX_VALUE))
                    .addComponent(tpDashboard))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainWindowLayout = new javax.swing.GroupLayout(mainWindow.getContentPane());
        mainWindow.getContentPane().setLayout(mainWindowLayout);
        mainWindowLayout.setHorizontalGroup(
            mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainWindowLayout.setVerticalGroup(
            mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        studentsPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                studentsPanelMouseWheelMoved(evt);
            }
        });

        studentTable.setAutoCreateRowSorter(true);
        studentTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data ID", "LRN", "First Name", "Middle Name", "Last Name", "Gender", "Initial Grade", "Current Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.setRowHeight(20);
        studentTable.setSelectionBackground(new java.awt.Color(22, 66, 33));
        studentTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(studentTable);

        tfStudentSearch.setToolTipText("");

        btnSearchStudent.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchStudent.setText("Search");
        btnSearchStudent.setBorder(null);
        btnSearchStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchStudent.setOpaque(false);
        btnSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStudentActionPerformed(evt);
            }
        });

        tpStudentControls.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tpStudentControls.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        javax.swing.GroupLayout addStudentPanelLayout = new javax.swing.GroupLayout(addStudentPanel);
        addStudentPanel.setLayout(addStudentPanelLayout);
        addStudentPanelLayout.setHorizontalGroup(
            addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        addStudentPanelLayout.setVerticalGroup(
            addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        tpStudentControls.addTab("Add", addStudentPanel);

        javax.swing.GroupLayout editStudentPanelLayout = new javax.swing.GroupLayout(editStudentPanel);
        editStudentPanel.setLayout(editStudentPanelLayout);
        editStudentPanelLayout.setHorizontalGroup(
            editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        editStudentPanelLayout.setVerticalGroup(
            editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        tpStudentControls.addTab("Edit", editStudentPanel);

        javax.swing.GroupLayout studentsPanelLayout = new javax.swing.GroupLayout(studentsPanel);
        studentsPanel.setLayout(studentsPanelLayout);
        studentsPanelLayout.setHorizontalGroup(
            studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsPanelLayout.createSequentialGroup()
                .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tfStudentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpStudentControls, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        studentsPanelLayout.setVerticalGroup(
            studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStudentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tpStudentControls, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        studentsPrsnlInfPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                studentsPrsnlInfPanelMouseWheelMoved(evt);
            }
        });

        javax.swing.GroupLayout studentsPrsnlInfPanelLayout = new javax.swing.GroupLayout(studentsPrsnlInfPanel);
        studentsPrsnlInfPanel.setLayout(studentsPrsnlInfPanelLayout);
        studentsPrsnlInfPanelLayout.setHorizontalGroup(
            studentsPrsnlInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        studentsPrsnlInfPanelLayout.setVerticalGroup(
            studentsPrsnlInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        subjectsPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                subjectsPanelMouseWheelMoved(evt);
            }
        });

        javax.swing.GroupLayout subjectsPanelLayout = new javax.swing.GroupLayout(subjectsPanel);
        subjectsPanel.setLayout(subjectsPanelLayout);
        subjectsPanelLayout.setHorizontalGroup(
            subjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        subjectsPanelLayout.setVerticalGroup(
            subjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        loadsPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                loadsPanelMouseWheelMoved(evt);
            }
        });

        javax.swing.GroupLayout loadsPanelLayout = new javax.swing.GroupLayout(loadsPanel);
        loadsPanel.setLayout(loadsPanelLayout);
        loadsPanelLayout.setHorizontalGroup(
            loadsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        loadsPanelLayout.setVerticalGroup(
            loadsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        usersPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                usersPanelMouseWheelMoved(evt);
            }
        });

        javax.swing.GroupLayout usersPanelLayout = new javax.swing.GroupLayout(usersPanel);
        usersPanel.setLayout(usersPanelLayout);
        usersPanelLayout.setHorizontalGroup(
            usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        usersPanelLayout.setVerticalGroup(
            usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        usersPrsnlInfPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                usersPrsnlInfPanelMouseWheelMoved(evt);
            }
        });

        javax.swing.GroupLayout usersPrsnlInfPanelLayout = new javax.swing.GroupLayout(usersPrsnlInfPanel);
        usersPrsnlInfPanel.setLayout(usersPrsnlInfPanelLayout);
        usersPrsnlInfPanelLayout.setHorizontalGroup(
            usersPrsnlInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        usersPrsnlInfPanelLayout.setVerticalGroup(
            usersPrsnlInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Registration System");
        setIconImage(my.getImgIcn(myVariables.getRegistrationWindowIcon()).getImage()
        );
        setMinimumSize(new java.awt.Dimension(460, 320));
        setResizable(false);
        getContentPane().setLayout(null);

        loginPanel.setOpaque(false);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRATION SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jButton1.setBackground(java.awt.Color.orange);
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorderPainted(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(loginPanel);
        loginPanel.setBounds(30, 30, 210, 240);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration/Imagez/depeduseplogo.png"))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("This system was developed in collaboration with the Department of Education (DepED), University of Southeastern Philippines (USeP) and Crossing Bayabas National High School (CBNHS) intended to automate the registration process.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jTextArea1.setOpaque(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(250, 30, 200, 240);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration/Imagez/login.png"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 457, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showWindow(1);
        tfSchoolName.setText(myVariables.getSchoolName());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void studentsPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_studentsPanelMouseWheelMoved
        scrollTabs(tpDashboard, evt.getWheelRotation());
    }//GEN-LAST:event_studentsPanelMouseWheelMoved

    private void btnSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStudentActionPerformed
        
    }//GEN-LAST:event_btnSearchStudentActionPerformed

    private void studentsPrsnlInfPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_studentsPrsnlInfPanelMouseWheelMoved
        scrollTabs(tpDashboard, evt.getWheelRotation());
    }//GEN-LAST:event_studentsPrsnlInfPanelMouseWheelMoved

    private void subjectsPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_subjectsPanelMouseWheelMoved
        scrollTabs(tpDashboard, evt.getWheelRotation());
    }//GEN-LAST:event_subjectsPanelMouseWheelMoved

    private void loadsPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_loadsPanelMouseWheelMoved
        scrollTabs(tpDashboard, evt.getWheelRotation());
    }//GEN-LAST:event_loadsPanelMouseWheelMoved

    private void usersPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_usersPanelMouseWheelMoved
        scrollTabs(tpDashboard, evt.getWheelRotation());
    }//GEN-LAST:event_usersPanelMouseWheelMoved

    private void usersPrsnlInfPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_usersPrsnlInfPanelMouseWheelMoved
        scrollTabs(tpDashboard, evt.getWheelRotation());
    }//GEN-LAST:event_usersPrsnlInfPanelMouseWheelMoved
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registrationLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationLogin().setVisible(true);
            }
        });
    }
    void scrollTabs(JTabbedPane tabbedPane,int wheelDirection){
        if(wheelDirection == 0){
            return;
        }
        int currentTab = tabbedPane.getSelectedIndex();
        int limit = tabbedPane.getTabCount();
        if(currentTab == -1){
            tabbedPane.setSelectedIndex(0);
            return;
        }else{
            //Down
            if(wheelDirection > 0){
                if(currentTab+1<limit){
                    tabbedPane.setSelectedIndex(currentTab+1);
                }
            }else{
                if(wheelDirection < 0){
                    if(currentTab-1>=0){
                        tabbedPane.setSelectedIndex(currentTab-1);
                    }
                }
            }
        }
        //Down
        if(wheelDirection > 0){
            
        }
    }
    void showWindow(int index){
        JFrame windows[] = {
            this,
            mainWindow,
        };
        
        for(int n=0;n<windows.length;n++){
            if(n==index){
                if(!windows[n].isVisible()){
                    windows[n].setLocationRelativeTo(null);
                    windows[n].setVisible(true);
                }
            }else{
                if(windows[n].isVisible()){
                    windows[n].setVisible(false);
                }
            }
        }
    }
    //<editor-fold desc="Tab Alignment Classes">
    class JXTabbedPane extends JTabbedPane {

        private ITabRenderer tabRenderer = new DefaultTabRenderer();

        public JXTabbedPane() {
            super();
        }

        public JXTabbedPane(int tabPlacement) {
            super(tabPlacement);
        }

        public JXTabbedPane(int tabPlacement, int tabLayoutPolicy) {
            super(tabPlacement, tabLayoutPolicy);
        }

        public ITabRenderer getTabRenderer() {
            return tabRenderer;
        }

        public void setTabRenderer(ITabRenderer tabRenderer) {
            this.tabRenderer = tabRenderer;
        }

        @Override
        public void addTab(String title, Component component) {
            this.addTab(title, null, component, null);
        }

        @Override
        public void addTab(String title, Icon icon, Component component) {
            this.addTab(title, icon, component, null);
        }

        @Override
        public void addTab(String title, Icon icon, Component component, String tip) {
            super.addTab(title, icon, component, tip);
            int tabIndex = getTabCount() - 1;
            Component tab = tabRenderer.getTabRendererComponent(this, title, icon, tabIndex);
            super.setTabComponentAt(tabIndex, tab);
        }
    }

    interface ITabRenderer {

        public Component getTabRendererComponent(JTabbedPane tabbedPane, String text, Icon icon, int tabIndex);

    }

    abstract class AbstractTabRenderer implements ITabRenderer {

        private String prototypeText = "";
        private Icon prototypeIcon = UIManager.getIcon("OptionPane.informationIcon");
        private int horizontalTextAlignment = SwingConstants.CENTER;
        private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

        public AbstractTabRenderer() {
            super();
        }

        public void setPrototypeText(String text) {
            String oldText = this.prototypeText;
            this.prototypeText = text;
            firePropertyChange("prototypeText", oldText, text);
        }

        public String getPrototypeText() {
            return prototypeText;
        }

        public Icon getPrototypeIcon() {
            return prototypeIcon;
        }

        public void setPrototypeIcon(Icon icon) {
            Icon oldIcon = this.prototypeIcon;
            this.prototypeIcon = icon;
            firePropertyChange("prototypeIcon", oldIcon, icon);
        }

        public int getHorizontalTextAlignment() {
            return horizontalTextAlignment;
        }

        public void setHorizontalTextAlignment(int horizontalTextAlignment) {
            this.horizontalTextAlignment = horizontalTextAlignment;
        }

        public PropertyChangeListener[] getPropertyChangeListeners() {
            return propertyChangeSupport.getPropertyChangeListeners();
        }

        public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {
            return propertyChangeSupport.getPropertyChangeListeners(propertyName);
        }

        public void addPropertyChangeListener(PropertyChangeListener listener) {
            propertyChangeSupport.addPropertyChangeListener(listener);
        }

        public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
            propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
        }

        protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
            PropertyChangeListener[] listeners = getPropertyChangeListeners();
            for (int i = listeners.length - 1; i >= 0; i--) {
                listeners[i].propertyChange(new PropertyChangeEvent(this, propertyName, oldValue, newValue));
            }
        }
    }

    class DefaultTabRenderer extends AbstractTabRenderer implements PropertyChangeListener {

        private Component prototypeComponent;

        public DefaultTabRenderer() {
            super();
            prototypeComponent = generateRendererComponent(getPrototypeText(), getPrototypeIcon(), getHorizontalTextAlignment());
            addPropertyChangeListener(this);
        }

        private Component generateRendererComponent(String text, Icon icon, int horizontalTabTextAlignmen) {
            JPanel rendererComponent = new JPanel(new GridBagLayout());
            rendererComponent.setOpaque(false);

            GridBagConstraints c = new GridBagConstraints();
            c.insets = new Insets(2, 4, 2, 4);
            c.fill = GridBagConstraints.HORIZONTAL;
            rendererComponent.add(new JLabel(icon), c);

            c.gridx = 1;
            c.weightx = 1;
            rendererComponent.add(new JLabel(text, horizontalTabTextAlignmen), c);

            return rendererComponent;
        }

        @Override
        public Component getTabRendererComponent(JTabbedPane tabbedPane, String text, Icon icon, int tabIndex) {
            Component rendererComponent = generateRendererComponent(text, icon, getHorizontalTextAlignment());
            int prototypeWidth = prototypeComponent.getPreferredSize().width;
            int prototypeHeight = prototypeComponent.getPreferredSize().height;
            rendererComponent.setPreferredSize(new Dimension(prototypeWidth, prototypeHeight));
            return rendererComponent;
        }

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            String propertyName = evt.getPropertyName();
            if ("prototypeText".equals(propertyName) || "prototypeIcon".equals(propertyName)) {
                this.prototypeComponent = generateRendererComponent(getPrototypeText(), getPrototypeIcon(), getHorizontalTextAlignment());
            }
        }
    }
    //</editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel addStudentPanel;
    private javax.swing.JButton btnSearchStudent;
    private javax.swing.JPanel editStudentPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel loadsPanel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JFrame mainWindow;
    private javax.swing.JTable studentTable;
    private keeptoo.KGradientPanel studentsPanel;
    private keeptoo.KGradientPanel studentsPrsnlInfPanel;
    private keeptoo.KGradientPanel subjectsPanel;
    private javax.swing.JLabel tfSchoolName;
    private javax.swing.JTextField tfStudentSearch;
    private javax.swing.JTabbedPane tpDashboard;
    private javax.swing.JTabbedPane tpStudentControls;
    private keeptoo.KGradientPanel usersPanel;
    private keeptoo.KGradientPanel usersPrsnlInfPanel;
    // End of variables declaration//GEN-END:variables
}
