package calculator;

import java.awt.*;

public class Cust_Pow extends javax.swing.JDialog {

    private javax.swing.JTextField Pow;
    private javax.swing.JTextField number;

    public Cust_Pow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public String getjTextNumber() {
        return number.getText();
    }

    public String getjTextPower() {
        return Pow.getText();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        number = new javax.swing.JTextField();
        javax.swing.JButton accept = new javax.swing.JButton();
        javax.swing.JButton cancel = new javax.swing.JButton();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        Pow = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        accept.setText("ok");
        accept.setMaximumSize(new java.awt.Dimension(65, 25));
        accept.setMinimumSize(new java.awt.Dimension(65, 25));
        accept.setPreferredSize(new java.awt.Dimension(65, 25));
        accept.addActionListener(evt -> AcceptActionPerformed(evt));

        cancel.setText("Cancel");
        cancel.setMaximumSize(new java.awt.Dimension(65, 25));
        cancel.setMinimumSize(new java.awt.Dimension(65, 25));
        cancel.setPreferredSize(new java.awt.Dimension(65, 25));
        cancel.addActionListener(this::CancelActionPerformed);

        jLabel2.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18));
        jLabel2.setText("Enter Custom Power");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Pow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(67, 67, 67)
                                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(Pow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
        );

        pack();
    }

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
}
