/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.JLabel;
import static mainproject.AddEntry.textt;

/**
 *
 * @author user
 */
public class GroupInfo extends javax.swing.JFrame {
    public static int c=0;

    /**
     * Creates new form GroupInfo
     */
    public GroupInfo() {
        setContentPane(new JLabel(new ImageIcon("D:/ENTC/Show/thiss.jpg")));
        initComponents();
        nl1.setVisible(false);
        name2.setVisible(false);
        rl1.setVisible(false);
        roll2.setVisible(false);
        cl1.setVisible(false);
        cont2.setVisible(false);
        add2.setVisible(false);
        nl2.setVisible(false);
        name3.setVisible(false);
        rl2.setVisible(false);
        roll3.setVisible(false);
        cl2.setVisible(false);
        cont3.setVisible(false);
        add3.setVisible(false);
        nl2.setVisible(false);
        name3.setVisible(false);
        rl2.setVisible(false);
        roll2.setVisible(false);
        cl2.setVisible(false);
        cont3.setVisible(false);
        nl3.setVisible(false);
        name4.setVisible(false);
        rl3.setVisible(false);
        roll4.setVisible(false);
        cl3.setVisible(false);
        cont4.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        guide = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        grp = new javax.swing.JTextField();
        home = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        roll1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cont1 = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        nl1 = new javax.swing.JLabel();
        name2 = new javax.swing.JTextField();
        rl1 = new javax.swing.JLabel();
        roll2 = new javax.swing.JTextField();
        cl1 = new javax.swing.JLabel();
        cont2 = new javax.swing.JTextField();
        nl2 = new javax.swing.JLabel();
        name3 = new javax.swing.JTextField();
        rl2 = new javax.swing.JLabel();
        roll3 = new javax.swing.JTextField();
        cl2 = new javax.swing.JLabel();
        cont3 = new javax.swing.JTextField();
        nl3 = new javax.swing.JLabel();
        name4 = new javax.swing.JTextField();
        rl3 = new javax.swing.JLabel();
        roll4 = new javax.swing.JTextField();
        cl3 = new javax.swing.JLabel();
        cont4 = new javax.swing.JTextField();
        add1 = new javax.swing.JButton();
        add2 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1708, 1024));

        next.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        next.setText("NEXT");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel1.setText("GENERAL INFORMATION");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Enter Details of All Group Members (Name : RollNo : ContactNo) :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("PROJECT GUIDE :");

        guide.setBackground(new java.awt.Color(230, 255, 255));
        guide.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        guide.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                guideFocusGained(evt);
            }
        });
        guide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("GROUP NAME:");

        grp.setBackground(new java.awt.Color(230, 255, 255));
        grp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        grp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grpActionPerformed(evt);
            }
        });

        home.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        home.setText("BACK TO HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DEVELOPED AND MAINTAINED BY VARAD KULKARNI /Mob: 9850410762");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("NAME");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("ROLL NO");

        roll1.setBackground(new java.awt.Color(230, 255, 255));
        roll1.setFont(new java.awt.Font("Corbel", 2, 15)); // NOI18N
        roll1.setText("Member One RollNo");
        roll1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                roll1FocusGained(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("CONTACT NO");

        cont1.setBackground(new java.awt.Color(230, 255, 255));
        cont1.setFont(new java.awt.Font("Corbel", 2, 16)); // NOI18N
        cont1.setText("Member One Contact No");
        cont1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cont1FocusGained(evt);
            }
        });
        cont1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont1ActionPerformed(evt);
            }
        });

        name1.setBackground(new java.awt.Color(230, 255, 255));
        name1.setFont(new java.awt.Font("Corbel", 2, 16)); // NOI18N
        name1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name1FocusGained(evt);
            }
        });

        nl1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nl1.setText("NAME");

        name2.setBackground(new java.awt.Color(230, 255, 255));
        name2.setFont(new java.awt.Font("Corbel", 2, 16)); // NOI18N
        name2.setText("Member Two Name");
        name2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name2FocusGained(evt);
            }
        });

        rl1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rl1.setText("ROLL NO");

        roll2.setBackground(new java.awt.Color(230, 255, 255));
        roll2.setFont(new java.awt.Font("Corbel", 2, 15)); // NOI18N
        roll2.setText("Member Two RollNo");
        roll2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                roll2FocusGained(evt);
            }
        });

        cl1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cl1.setText("CONTACT NO");

        cont2.setBackground(new java.awt.Color(230, 255, 255));
        cont2.setFont(new java.awt.Font("Corbel", 2, 16)); // NOI18N
        cont2.setText("Member Two Contact No");
        cont2.setPreferredSize(new java.awt.Dimension(146, 22));
        cont2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cont2FocusGained(evt);
            }
        });
        cont2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont2ActionPerformed(evt);
            }
        });

        nl2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nl2.setText("NAME");

        name3.setBackground(new java.awt.Color(230, 255, 255));
        name3.setFont(new java.awt.Font("Corbel", 2, 16)); // NOI18N
        name3.setText("Member Three Name");
        name3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name3FocusGained(evt);
            }
        });

        rl2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rl2.setText("ROLL NO");

        roll3.setBackground(new java.awt.Color(230, 255, 255));
        roll3.setFont(new java.awt.Font("Corbel", 2, 15)); // NOI18N
        roll3.setText("Member Three RollNo");
        roll3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                roll3FocusGained(evt);
            }
        });

        cl2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cl2.setText("CONTACT NO");

        cont3.setBackground(new java.awt.Color(230, 255, 255));
        cont3.setFont(new java.awt.Font("Corbel", 2, 16)); // NOI18N
        cont3.setText("Member Three Contact No");
        cont3.setPreferredSize(new java.awt.Dimension(146, 22));
        cont3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cont3FocusGained(evt);
            }
        });

        nl3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nl3.setText("NAME");

        name4.setBackground(new java.awt.Color(230, 255, 255));
        name4.setFont(new java.awt.Font("Corbel", 2, 16)); // NOI18N
        name4.setText("Member Four Name");
        name4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name4FocusGained(evt);
            }
        });

        rl3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rl3.setText("ROLL NO");

        roll4.setBackground(new java.awt.Color(230, 255, 255));
        roll4.setFont(new java.awt.Font("Corbel", 2, 15)); // NOI18N
        roll4.setText("Member Four RollNo");
        roll4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                roll4FocusGained(evt);
            }
        });

        cl3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cl3.setText("CONTACT NO");

        cont4.setBackground(new java.awt.Color(230, 255, 255));
        cont4.setFont(new java.awt.Font("Corbel", 2, 16)); // NOI18N
        cont4.setText("Member Four Contact No");
        cont4.setPreferredSize(new java.awt.Dimension(146, 22));
        cont4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cont4FocusGained(evt);
            }
        });
        cont4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont4ActionPerformed(evt);
            }
        });

        add1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        add1.setText("ADD NEW MEMBER!");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        add2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        add2.setText("ADD NEW MEMBER!");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        add3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        add3.setText("ADD NEW MEMBER!");
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(roll1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nl3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(rl3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roll4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cl3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nl2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(rl2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roll3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(nl1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(rl1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roll2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cl1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(cl2)))))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cont3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cont2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cont1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(cont4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add1)
                            .addComponent(add2)
                            .addComponent(add3))
                        .addGap(766, 766, 766))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guide, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(207, 207, 207)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grp, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1150, 1150, 1150)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(487, 487, 487)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roll1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cont1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roll2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nl1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rl1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cl1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cont2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roll3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nl2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rl2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cl2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cont3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roll4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nl3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rl3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cl3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cont4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(guide, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(grp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(255, 255, 255))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        String info[]=new String[3];  //creates an array to store  variable values. You can increase the size when needed
        String n2="Member Two Name",r2="Member Two RollNo",c2="Member Two Contact No";
        String n3="Member Three Name",r3="Member Three RollNo",c3="Member Three Contact No";
        String n4="Member Four Name",r4="Member Four RollNo",c4="Member Four Contact No";
        String nn2=name2.getText(),rr2=roll2.getText(),cc2=cont2.getText();
        String nn3=name3.getText(),rr3=roll3.getText(),cc3=cont3.getText();
        String nn4=name4.getText(),rr4=roll4.getText(),cc4=cont4.getText();
        int flag1=0,flag2=0,flag3=0;
        if(c==0){
            String nn1=name1.getText(),rr1=roll1.getText(),cc1=cont1.getText();
         int fn=0;
         if(nn1.length()==0){fn=1;
             JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name1.setText(null);
         }else{int fail=0;
             for(int i=0;i<nn1.length();i++){ 
                 if((nn1.charAt(i)>='A'&& nn1.charAt(i)<='Z') || (nn1.charAt(i)>='a'&& nn1.charAt(i)<='z') || nn1.charAt(i)==' ' ){
                     
                 }else{
                     fail=1;
                 }
             }
             if(fail==1){fn=1;
                 JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name1.setText(null);
             }else{
                 flag1=1;
             }
         }int  fr=0;
         if(rr1.length()!=4 && fn==0){fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll1.setText(null);
        }else{
               if(fn==0){ if(rr1.charAt(0)=='3'){
                    if(rr1.charAt(1)>='5'&&rr1.charAt(1)<='8'){
                        if((rr1.charAt(2)>='0'&&rr1.charAt(2)<='9') && (rr1.charAt(3)>='0'&&rr1.charAt(3)<='9') ){
                               flag2=1;
                        }else{fr=1;
                            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll1.setText(null);
                        }
                    }else{fr=1;
                        JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll1.setText(null);
                    }
                }else{fr=1;
                    JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll1.setText(null);
                }
            }
        }
         if(cc1.length()!=10 && fr==0 &&fn==0){//fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont1.setText(null);
        }else{
               if(fr==0 && fn==0){ 
                   int fail=0;
                   for(int i=0;i<cc1.length();i++){
                       if(cc1.charAt(i)<'0' || cc1.charAt(i)>'9'){
                           fail=1;
                           break;
                       }
                   }
                   if(fail==1){
                       JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont1.setText(null);
                   }else{
                       flag3=1;
                   }
               }
        }
                   System.out.println(flag1+flag2+flag3);
        }
        if(c==1 ){if(nn2.equals(n2) && rr2.equals(r2) && cc2.equals(c2)){
            flag1=flag2=flag3=1;
        }
            else{   String nn1=name2.getText(),rr1=roll2.getText(),cc1=cont2.getText();
         int fn=0;
         if(nn1.length()==0){fn=1;
             JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name2.setText(null);
         }else{int fail=0;
             for(int i=0;i<nn1.length();i++){ 
                 if((nn1.charAt(i)>='A'&& nn1.charAt(i)<='Z') || (nn1.charAt(i)>='a'&& nn1.charAt(i)<='z') || nn1.charAt(i)==' ' ){
                     
                 }else{
                     fail=1;
                 }
             }
             if(fail==1){fn=1;
                 JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name2.setText(null);
             }else{
                 flag1=1;
             }
         }int  fr=0;
         if(rr1.length()!=4 && fn==0){fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll2.setText(null);
        }else{
               if(fn==0){ if(rr1.charAt(0)=='3'){
                    if(rr1.charAt(1)>='5'&&rr1.charAt(1)<='8'){
                        if((rr1.charAt(2)>='0'&&rr1.charAt(2)<='9') && (rr1.charAt(3)>='0'&&rr1.charAt(3)<='9') ){
                               flag2=1;
                        }else{fr=1;
                            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll2.setText(null);
                        }
                    }else{fr=1;
                        JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll2.setText(null);
                    }
                }else{fr=1;
                    JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll2.setText(null);
                }
            }
        }
         if(cc1.length()!=10 && fr==0 &&fn==0){//fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont2.setText(null);
        }else{
               if(fr==0 && fn==0){ 
                   int fail=0;
                   for(int i=0;i<cc1.length();i++){
                       if(cc1.charAt(i)<'0' || cc1.charAt(i)>'9'){
                           fail=1;
                           break;
                       }
                   }
                   if(fail==1){
                       JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont2.setText(null);
                   }else{
                       flag3=1;
                   }
               }
        }
        }
                      System.out.println(flag1+flag2+flag3);           //JOptionPane.showMessageDialog(null,"idhar hai");
        }
        
        if(c==2 ){
            if(nn3.equals(n3)&& rr3.equals(r3) && cc3.equals(c3)){
            flag1=flag2=flag3=1;
            
        }
            else{   String nn1=name3.getText(),rr1=roll3.getText(),cc1=cont3.getText();
            int fn=0;
         if(nn1.length()==0){fn=1;
             JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name3.setText(null);
         }else{int fail=0;
             for(int i=0;i<nn1.length();i++){ 
                 if((nn1.charAt(i)>='A'&& nn1.charAt(i)<='Z') || (nn1.charAt(i)>='a'&& nn1.charAt(i)<='z') || nn1.charAt(i)==' ' ){
                     
                 }else{
                     fail=1;
                 }
             }
             if(fail==1){fn=1;
                 JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name3.setText(null);
             }else{
                 flag1=1;
             }
         }int  fr=0;
         if(rr1.length()!=4 && fn==0){fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll3.setText(null);
        }else{
               if(fn==0){ if(rr1.charAt(0)=='3'){
                    if(rr1.charAt(1)>='5'&&rr1.charAt(1)<='8'){
                        if((rr1.charAt(2)>='0'&&rr1.charAt(2)<='9') && (rr1.charAt(3)>='0'&&rr1.charAt(3)<='9') ){
                               flag2=1;
                        }else{fr=1;
                            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll3.setText(null);
                        }
                    }else{fr=1;
                        JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll3.setText(null);
                    }
                }else{fr=1;
                    JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll3.setText(null);
                }
            }
        }
         if(cc1.length()!=10 && fr==0 &&fn==0){//fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont3.setText(null);
        }else{
               if(fr==0 && fn==0){ 
                   int fail=0;
                   for(int i=0;i<cc1.length();i++){
                       if(cc1.charAt(i)<'0' || cc1.charAt(i)>'9'){
                           fail=1;
                           break;
                       }
                   }
                   if(fail==1){
                       JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont3.setText(null);
                   }else{
                       flag3=1;
                   }
               }
        }
                      System.out.println(flag1+flag2+flag3);
            }
         
        }
        if(c==3 ){
            
            
            if(nn4.equals(n4) && rr4.equals(r4) && cc4.equals(c4)){
            flag1=flag2=flag3=1;
        }
            else{   String nn1=name4.getText(),rr1=roll4.getText(),cc1=cont4.getText();
         int fn=0;
         if(nn1.length()==0){fn=1;
             JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name4.setText(null);
         }else{int fail=0;
             for(int i=0;i<nn1.length();i++){ 
                 if((nn1.charAt(i)>='A'&& nn1.charAt(i)<='Z') || (nn1.charAt(i)>='a'&& nn1.charAt(i)<='z') || nn1.charAt(i)==' ' ){
                     
                 }else{
                     fail=1;
                 }
             }
             if(fail==1){fn=1;
                 JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name4.setText(null);
             }else{
                 flag1=1;
             }
         }int  fr=0;
         if(rr1.length()!=4 && fn==0){fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll4.setText(null);
        }else{
               if(fn==0){ if(rr1.charAt(0)=='3'){
                    if(rr1.charAt(1)>='5'&&rr1.charAt(1)<='8'){
                        if((rr1.charAt(2)>='0'&&rr1.charAt(2)<='9') && (rr1.charAt(3)>='0'&&rr1.charAt(3)<='9') ){
                               flag2=1;
                        }else{fr=1;
                            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll4.setText(null);
                        }
                    }else{fr=1;
                        JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll4.setText(null);
                    }
                }else{fr=1;
                    JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll4.setText(null);
                }
            }
        }
         if(cc1.length()!=10 && fr==0 &&fn==0){//fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont4.setText(null);
        }else{
               if(fr==0 && fn==0){ 
                   int fail=0;
                   for(int i=0;i<cc1.length();i++){
                       if(cc1.charAt(i)<'0' || cc1.charAt(i)>'9'){
                           fail=1;
                           break;
                       }
                   }
                   if(fail==1){
                       JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont4.setText(null);
                   }else{
                       flag3=1;
                   }
               }
        }
            System.out.println(flag1+flag2+flag3);
        }
        }int flagc=0;
        if(grp.getText().length()==0 || guide.getText().length()==0){
             JOptionPane.showMessageDialog(null,"Field cannot be empty!");
        }else{
            flagc=1;
        }
        info[1]=guide.getText();
        info[2]=grp.getText();
        if(flag1==1&& flag2==1&&flag3==1 &&flagc==1){
            System.out.println("hi"+c);
            String god="";
            if(c==0) god="1. "+roll1.getText()+"\t\t"+name1.getText()+"\t\t"+cont1.getText()+"\n";
            else if(c==1 ){
                int arr[],f1=0;
                if(!nn2.equals(n2)){arr=new int[2];f1=0;}
                else {arr=new int[1];f1=1;}
                arr[0]=name1.getText().length();
                if(!nn2.equals(n2))arr[1]=name2.getText().length();  
                Arrays.sort(arr);
                int ma;
                if(f1==1)
                 ma=arr[0];
                else ma=arr[1];
                String s1=name1.getText(),s2=name2.getText();
                while(s1.length()<ma)s1+=" ";
                while(s2.length()<ma)s2+=" ";
                god="1. "+roll1.getText()+"\t\t"+s1+"\t\t"+cont1.getText()+"\n";
                if(!nn2.equals(n2)) god+="2. "+roll2.getText()+"\t\t"+s2+"\t\t"+cont2.getText()+"\n";
            }else if(c==2){
                int arr[],f1=0;
                if(!nn3.equals(n3)){arr=new int[3];}
                else {arr=new int[2];f1=1;}
                arr[0]=name1.getText().length();
                arr[1]=name2.getText().length();
                if(!nn3.equals(n3))arr[2]=name3.getText().length();
                Arrays.sort(arr);
                int ma;
                if(f1==1)
                ma=arr[1];
                else ma=arr[2];
                String s1=name1.getText(),s2=name2.getText(),s3=name3.getText();
                while(s1.length()<ma)s1+=" ";
                while(s2.length()<ma)s2+=" ";
                while(s3.length()<ma)s3+=" ";
                System.out.println("reached");
                god="1. "+roll1.getText()+"\t\t"+s1+"\t\t"+cont1.getText()+"\n";
                god+="2. "+roll2.getText()+"\t\t"+s2+"\t\t"+cont2.getText()+"\n";
                if(!nn3.equals(n3))god+="3. "+roll3.getText()+"\t\t"+s3+"\t\t"+cont3.getText()+"\n";
            }else if(c==3){ 
                int arr[],f1=0;
               if(!nn4.equals(n4)){  arr=new int[4];f1=0;}
               else  {arr=new int [3];f1=1;}
                arr[0]=name1.getText().length();
                arr[1]=name2.getText().length();
                arr[2]=name3.getText().length();
                if(!nn4.equals(n4))arr[3]=name4.getText().length();
                Arrays.sort(arr);
                int ma;
                if(f1==1)
                ma=arr[2];
                else ma=arr[3];
                String s1=name1.getText(),s2=name2.getText(),s3=name3.getText(),s4=name4.getText();
                while(s1.length()<ma)s1+=" ";
                while(s2.length()<ma)s2+=" ";
                while(s3.length()<ma)s3+=" ";
                while(s4.length()<ma)s4+=" ";
                god="1. "+roll1.getText()+"\t\t"+s1+"\t\t"+cont1.getText()+"\n";
                god+="2. "+roll2.getText()+"\t\t"+s2+"\t\t"+cont2.getText()+"\n";
                god+="3. "+roll3.getText()+"\t\t"+s3+"\t\t"+cont3.getText()+"\n";
                if(!nn4.equals(n4))god+="4. "+roll4.getText()+"\t\t"+s4+"\t\t"+cont4.getText()+"\n";
            }info[0]=god;
            System.out.println(god);
            AddEntry.main(info);
            AddEntry a=new AddEntry();
            dispose();
        }
        
    }//GEN-LAST:event_nextActionPerformed

    private void grpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grpActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Prim pr=new Prim();
        pr.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeActionPerformed


    private void guideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guideActionPerformed

    private void guideFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_guideFocusGained
        // TODO add your handling code here:
        guide.setText("");
    }//GEN-LAST:event_guideFocusGained

    private void name1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name1FocusGained
        // TODO add your handling code here:
        //name1.setText("");
    }//GEN-LAST:event_name1FocusGained

private void cont1FocusGained(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
        cont1.setText("");
    }
private void name2FocusGained(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
        name2.setText("");
    }                                 
private void roll2FocusGained(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
        roll2.setText("");
    }       
private void cont2FocusGained(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
        cont2.setText("");
    }
private void name3FocusGained(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
        name3.setText("");
    }                                 
private void roll3FocusGained(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
        roll3.setText("");
    }       
private void cont3FocusGained(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
        cont3.setText("");
    }
private void name4FocusGained(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
        name4.setText("");
    }                                 
private void roll4FocusGained(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
        roll4.setText("");
    }       
private void cont4FocusGained(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
        cont4.setText("");
    }

    private void roll1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roll1FocusGained
        // TODO add your handling code here:
        roll1.setText("");
    }//GEN-LAST:event_roll1FocusGained
/*
    private void name2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_name2FocusGained

    private void roll2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roll2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_roll2FocusGained

    private void cont2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cont2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cont2FocusGained

    private void name3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_name3FocusGained

    private void cont3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cont3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cont3FocusGained

    private void name4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_name4FocusGained

    private void roll4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roll4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_roll4FocusGained

    private void cont4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cont4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cont4FocusGained

    private void roll3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roll3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_roll3FocusGained
*/
    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        // TODO add your handling code here:
         String nn1=name1.getText(),rr1=roll1.getText(),cc1=cont1.getText();
         int flag1=0,flag2=0,flag3=0,fn=0;
         if(nn1.length()==0){fn=1;
             JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name1.setText(null);
         }else{int fail=0;
             for(int i=0;i<nn1.length();i++){ 
                 if((nn1.charAt(i)>='A'&& nn1.charAt(i)<='Z') || (nn1.charAt(i)>='a'&& nn1.charAt(i)<='z') || nn1.charAt(i)==' ' ){
                     
                 }else{
                     fail=1;
                 }
             }
             if(fail==1){fn=1;
                 JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name1.setText(null);
             }else{
                 flag1=1;
             }
         }int  fr=0;
         if(rr1.length()!=4 && fn==0){fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll1.setText(null);
        }else{
               if(fn==0){ if(rr1.charAt(0)=='3'){
                    if(rr1.charAt(1)>='5'&&rr1.charAt(1)<='8'){
                        if((rr1.charAt(2)>='0'&&rr1.charAt(2)<='9') && (rr1.charAt(3)>='0'&&rr1.charAt(3)<='9') ){
                               flag2+=1;
                        }else{fr=1;
                            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll1.setText(null);
                        }
                    }else{fr=1;
                        JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll1.setText(null);
                    }
                }else{fr=1;
                    JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll1.setText(null);
                }
            }
        }
         if(cc1.length()!=10 && fr==0 && fn==0){//fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont1.setText(null);
        }else{
               if(fr==0 && fn==0){ 
                   int fail=0;
                   for(int i=0;i<cc1.length();i++){
                       if(cc1.charAt(i)<'0' || cc1.charAt(i)>'9'){
                           fail=1;
                           break;
                       }
                   }
                   if(fail==1){
                       JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont1.setText(null);
                   }else{
                       flag3=1;
                   }
               }
        }
         if(flag1==1 && flag2==1 && flag3==1){c++;
            int ff=0;
            try {
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (Exception ex) {

            }
            String url = "jdbc:mysql://localhost:3306/maindatabase";
            String username = "root";
            String pwd = "varad11041997";
           
                Connection con = DriverManager.getConnection(url, username, pwd);
                Statement stmt = con.createStatement();
                String query="Insert into roll(rn) values ('"+roll1.getText()+"')" ;
                stmt.execute(query);
                
        } catch (SQLException ex) {roll1.setText(null);ff=1;
            JOptionPane.showMessageDialog(null, ex.toString());

        }
            if(ff==0){
                nl1.setVisible(true);
            name2.setVisible(true);
            roll2.setVisible(true);
            cont2.setVisible(true);
            add2.setVisible(true);
            add1.setVisible(false);
            rl1.setVisible(true);
            cl1.setVisible(true);
            }
        }
    }//GEN-LAST:event_add1ActionPerformed

    private void cont2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont2ActionPerformed

    private void cont4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont4ActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        // TODO add your handling code here:
        String nn1=name2.getText(),rr1=roll2.getText(),cc1=cont2.getText();
         int flag1=0,flag2=0,flag3=0,fn=0;
         if(nn1.length()==0){fn=1;
             JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name2.setText(null);
         }else{int fail=0;
             for(int i=0;i<nn1.length();i++){ 
                 if((nn1.charAt(i)>='A'&& nn1.charAt(i)<='Z') || (nn1.charAt(i)>='a'&& nn1.charAt(i)<='z') || nn1.charAt(i)==' ' ){
                     
                 }else{
                     fail=1;
                 }
             }
             if(fail==1){fn=1;
                 JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name2.setText(null);
             }else{
                 flag1=1;
             }
         }int  fr=0;
         if(rr1.length()!=4 && fn==0){fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll2.setText(null);
        }else{
               if(fn==0){ if(rr1.charAt(0)=='3'){
                    if(rr1.charAt(1)>='5'&&rr1.charAt(1)<='8'){
                        if((rr1.charAt(2)>='0'&&rr1.charAt(2)<='9') && (rr1.charAt(3)>='0'&&rr1.charAt(3)<='9') ){
                               flag2+=1;
                        }else{fr=1;
                            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll2.setText(null);
                        }
                    }else{fr=1;
                        JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll2.setText(null);
                    }
                }else{fr=1;
                    JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll2.setText(null);
                }
            }
        }
         if(cc1.length()!=10 && fr==0 &&fn==0){//fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont2.setText(null);
        }else{
               if(fr==0 && fn==0){ 
                   int fail=0;
                   for(int i=0;i<cc1.length();i++){
                       if(cc1.charAt(i)<'0' || cc1.charAt(i)>'9'){
                           fail=1;
                           break;
                       }
                   }
                   if(fail==1){
                       JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont2.setText(null);
                   }else{
                       flag3=1;
                   }
               }
        }if(flag1==1 && flag2==1 && flag3==1){ c++;
        int ff=0;   
        try {
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (Exception ex) {

            }
            String url = "jdbc:mysql://localhost:3306/maindatabase";
            String username = "root";
            String pwd = "varad11041997";
           
                Connection con = DriverManager.getConnection(url, username, pwd);
                Statement stmt = con.createStatement();
                String query="Insert into roll(rn) values ('"+roll2.getText()+"')" ;
                stmt.execute(query);
                
        } catch (SQLException ex) {
            roll2.setText(null);ff=1;
            JOptionPane.showMessageDialog(null, ex.toString());

        }
        if(ff==0){
             nl2.setVisible(true);
            name3.setVisible(true);
            roll3.setVisible(true);
            cont3.setVisible(true);
            add3.setVisible(true);
            add2.setVisible(false);
            rl2.setVisible(true);
            cl2.setVisible(true);
           
        }
        }
        
    }//GEN-LAST:event_add2ActionPerformed


    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        // TODO add your handling code here:
        String nn1=name3.getText(),rr1=roll3.getText(),cc1=cont3.getText();
         int flag1=0,flag2=0,flag3=0,fn=0;
         if(nn1.length()==0){fn=1;
             JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name3.setText(null);
         }else{int fail=0;
             for(int i=0;i<nn1.length();i++){ 
                 if((nn1.charAt(i)>='A'&& nn1.charAt(i)<='Z') || (nn1.charAt(i)>='a'&& nn1.charAt(i)<='z') || nn1.charAt(i)==' ' ){
                     
                 }else{
                     fail=1;
                 }
             }
             if(fail==1){fn=1;
                 JOptionPane.showMessageDialog(null,"Please Enter Valid Name!");
                            name3.setText(null);
             }else{
                 flag1=1;
             }
         }int  fr=0;
         if(rr1.length()!=4 && fn==0){fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll3.setText(null);
        }else{
               if(fn==0){ if(rr1.charAt(0)=='3'){
                    if(rr1.charAt(1)>='5'&&rr1.charAt(1)<='8'){
                        if((rr1.charAt(2)>='0'&&rr1.charAt(2)<='9') && (rr1.charAt(3)>='0'&&rr1.charAt(3)<='9') ){
                               flag2+=1;
                        }else{fr=1;
                            JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll3.setText(null);
                        }
                    }else{fr=1;
                        JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll3.setText(null);
                    }
                }else{fr=1;
                    JOptionPane.showMessageDialog(null,"Please Enter Valid Roll No!");
                            roll3.setText(null);
                }
            }
        }
         if(cc1.length()!=10 && fr==0 &&fn==0){//fr=1;
            JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont3.setText(null);
        }else{
               if(fr==0 && fn==0){ 
                   int fail=0;
                   for(int i=0;i<cc1.length();i++){
                       if(cc1.charAt(i)<'0' || cc1.charAt(i)>'9'){
                           fail=1;
                           break;
                       }
                   }
                   if(fail==1){
                       JOptionPane.showMessageDialog(null,"Please Enter Valid Mobile No!");
                            cont3.setText(null);
                   }else{
                       flag3=1;
                   }
               }
        }if(flag1==1 && flag2==1 && flag3==1){c++;
            int ff=0;
            try {
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (Exception ex) {

            }
            String url = "jdbc:mysql://localhost:3306/maindatabase";
            String username = "root";
            String pwd = "varad11041997";
           
                Connection con = DriverManager.getConnection(url, username, pwd);
                Statement stmt = con.createStatement();
                String query="Insert into roll(rn) values ('"+roll3.getText()+"')" ;
                stmt.execute(query);
                
        } catch (SQLException ex) {
            roll3.setText(null);ff=1;
            JOptionPane.showMessageDialog(null, ex.toString());

        }
           if(ff==0){
               nl3.setVisible(true);
            name4.setVisible(true);
            roll4.setVisible(true);
            cont4.setVisible(true);
            add3.setVisible(false);
            rl3.setVisible(true);
            cl3.setVisible(true);
           }
        }
    }//GEN-LAST:event_add3ActionPerformed

//GEN-FIRST:event_cont1FocusGained
 
//GEN-LAST:event_cont1FocusGained

    private void cont1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(GroupInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroupInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroupInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroupInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroupInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add1;
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JLabel cl1;
    private javax.swing.JLabel cl2;
    private javax.swing.JLabel cl3;
    private javax.swing.JTextField cont1;
    private javax.swing.JTextField cont2;
    private javax.swing.JTextField cont3;
    private javax.swing.JTextField cont4;
    private javax.swing.JTextField grp;
    private javax.swing.JTextField guide;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField name3;
    private javax.swing.JTextField name4;
    private javax.swing.JButton next;
    private javax.swing.JLabel nl1;
    private javax.swing.JLabel nl2;
    private javax.swing.JLabel nl3;
    private javax.swing.JLabel rl1;
    private javax.swing.JLabel rl2;
    private javax.swing.JLabel rl3;
    private javax.swing.JTextField roll1;
    private javax.swing.JTextField roll2;
    private javax.swing.JTextField roll3;
    private javax.swing.JTextField roll4;
    // End of variables declaration//GEN-END:variables
}
