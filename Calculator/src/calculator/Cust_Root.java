package calculator;

import java.awt.*;

public class Cust_Root extends javax.swing.JDialog {
    private boolean cancel = true;
    private javax.swing.JTextField Number;
    private javax.swing.JTextField Root;

    /**
     * Creates new form Cust_Root
     */
    public Cust_Root(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
    }

    public String getjTextField1() {
        return Root.getText();
    }

    public String getjTextField2() {
        return Number.getText();
    }

    public boolean cancel() {
        return cancel;
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        Root = new javax.swing.JTextField();
        Number = new javax.swing.JTextField();
        javax.swing.JButton accept = new javax.swing.JButton();
        javax.swing.JButton cancel1 = new javax.swing.JButton();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24));
        jLabel1.setText("Custom Roots");

        Root.setText(" ");

        Number.setText(" ");

        accept.setText("ok");
        accept.addActionListener(evt -> AcceptActionPerformed(evt));

        cancel1.setText("Cancel");
        cancel1.addActionListener(evt -> CancelActionPerformed(evt));

        jLabel2.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 36));
        jLabel2.setText("√");

        jLabel3.setText("────────────────────");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(accept)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cancel1)
                                                        .addContainerGap())
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(Root, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3)
                                                                .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(Root, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(8, 8, 8)
                                                                .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(accept)
                                                        .addComponent(cancel1))))
                                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {
        cancel = false;
        dispose();
    }

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {
        cancel = true;
        dispose();
    }
}
