package calculator;

import java.awt.*;

public class Fraction extends javax.swing.JDialog {

    private boolean cancel = true;
    private javax.swing.JTextField Denominator;
    private javax.swing.JTextField Numerator;

    public Fraction(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * Creates new form Fraction
     */
    public String getjTextField1() {
        return Numerator.getText();
    }

    public String getjTextField2() {
        return Denominator.getText();
    }

    public boolean cancel() {
        return cancel;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        Numerator = new javax.swing.JTextField();
        Denominator = new javax.swing.JTextField();

        javax.swing.JButton accept = new javax.swing.JButton();
        javax.swing.JButton cancel1 = new javax.swing.JButton();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("──────────────────────");

        accept.setText("ok");
        accept.setMaximumSize(new java.awt.Dimension(65, 25));
        accept.setMinimumSize(new java.awt.Dimension(65, 25));
        accept.setPreferredSize(new java.awt.Dimension(65, 25));
        accept.addActionListener(evt -> AcceptActionPerformed(evt));

        cancel1.setText("Cancel");
        cancel1.setMaximumSize(new java.awt.Dimension(65, 25));
        cancel1.setMinimumSize(new java.awt.Dimension(65, 25));
        cancel1.setPreferredSize(new java.awt.Dimension(65, 25));
        cancel1.addActionListener(evt -> CancelActionPerformed(evt));

        jLabel2.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18));
        jLabel2.setText("Enter Fraction");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Numerator, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Denominator)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Numerator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Denominator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
        );

        pack();
    }


    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        cancel = false;
    }

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        cancel = true;
    }
}
