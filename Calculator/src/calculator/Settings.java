package calculator;

import javax.swing.*;
import java.awt.*;

public class Settings extends javax.swing.JDialog {
    Calculator Calc = new Calculator();

    public Settings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        javax.swing.JButton accept = new javax.swing.JButton();
        javax.swing.JLabel labTitle = new javax.swing.JLabel();
        javax.swing.JButton btnDegrees = new javax.swing.JButton();
        javax.swing.JButton btnRadians = new javax.swing.JButton();
        javax.swing.JButton btnFixedOut = new javax.swing.JButton();
        javax.swing.JButton btnScienOut = new javax.swing.JButton();
        javax.swing.JButton btnNormalOut = new javax.swing.JButton();
        javax.swing.JButton btnGRAD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        accept.setText("Done");
        accept.setMaximumSize(new java.awt.Dimension(75, 25));
        accept.setMinimumSize(new java.awt.Dimension(75, 25));
        accept.setPreferredSize(new java.awt.Dimension(75, 25));
        accept.addActionListener(evt -> AcceptActionPerformed(evt));

        labTitle.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18));
        labTitle.setText("Settings");

        btnDegrees.setText("Degrees");
        btnDegrees.setMaximumSize(new java.awt.Dimension(75, 25));
        btnDegrees.setMinimumSize(new java.awt.Dimension(75, 25));
        btnDegrees.setPreferredSize(new java.awt.Dimension(75, 25));
        btnDegrees.addActionListener(evt -> BtnDegreesActionPerformed(evt));

        btnRadians.setText("Radians");
        btnRadians.setMaximumSize(new java.awt.Dimension(75, 25));
        btnRadians.setMinimumSize(new java.awt.Dimension(75, 25));
        btnRadians.setPreferredSize(new java.awt.Dimension(75, 25));
        btnRadians.addActionListener(evt -> BtnRadiansActionPerformed(evt));

        btnFixedOut.setText("Fixed");
        btnFixedOut.setMaximumSize(new java.awt.Dimension(75, 25));
        btnFixedOut.setMinimumSize(new java.awt.Dimension(75, 25));
        btnFixedOut.setPreferredSize(new java.awt.Dimension(75, 25));
        btnFixedOut.addActionListener(evt -> BtnFixedOutActionPerformed(evt));

        btnScienOut.setText("Scientific");
        btnScienOut.setMaximumSize(new java.awt.Dimension(75, 25));
        btnScienOut.setMinimumSize(new java.awt.Dimension(75, 25));
        btnScienOut.setPreferredSize(new java.awt.Dimension(75, 25));
        btnScienOut.addActionListener(evt -> BtnScienOutActionPerformed(evt));

        btnNormalOut.setText("Normal");
        btnNormalOut.setMaximumSize(new java.awt.Dimension(75, 25));
        btnNormalOut.setMinimumSize(new java.awt.Dimension(75, 25));
        btnNormalOut.setPreferredSize(new java.awt.Dimension(75, 25));
        btnNormalOut.addActionListener(evt -> BtnNormalOutActionPerformed(evt));

        btnGRAD.setText("Grad");
        btnGRAD.setMaximumSize(new java.awt.Dimension(75, 25));
        btnGRAD.setMinimumSize(new java.awt.Dimension(75, 25));
        btnGRAD.setPreferredSize(new java.awt.Dimension(75, 25));
        btnGRAD.addActionListener(evt -> BtnGRADActionPerformed(evt));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(123, 123, 123)
                                                .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(btnDegrees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnRadians, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnGRAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnNormalOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnFixedOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnScienOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(labTitle)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnDegrees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRadians, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnGRAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNormalOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnFixedOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnScienOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void BtnRadiansActionPerformed(java.awt.event.ActionEvent evt) {
        Calc.setType("R");
    }

    private void BtnDegreesActionPerformed(java.awt.event.ActionEvent evt) {
        Calc.setType("D");
    }

    private void BtnGRADActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Not implemented yet");
    }

    private void BtnNormalOutActionPerformed(java.awt.event.ActionEvent evt) {
        Calc.setOutput("N");
    }

    private void BtnFixedOutActionPerformed(java.awt.event.ActionEvent evt) {
        Calc.setOutput("F");
        Calc.setPlace(Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Enter Degree Of accutacy 0~9")));
        JOptionPane.showMessageDialog(null, "Not implemented yet");
        Calc.setOutput("N");
    }

    private void BtnScienOutActionPerformed(java.awt.event.ActionEvent evt) {
        Calc.setOutput("S");
        Calc.setPlace(Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Enter Degree Of accutacy 0~9")));
        JOptionPane.showMessageDialog(null, "Not implemented yet");
        Calc.setOutput("N");
    }
}
