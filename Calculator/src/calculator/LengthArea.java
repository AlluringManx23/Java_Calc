package calculator;

import javax.swing.*;
import java.awt.*;

public class LengthArea extends javax.swing.JFrame {
    private Double Ans;
    private String pan;
    private javax.swing.JTextField TxtParAns;
    private javax.swing.JTextField TxtParAreA;
    private javax.swing.JTextField TxtParAreAltA;
    private javax.swing.JTextField TxtParAreAltB;
    private javax.swing.JTextField TxtParAreAltC;
    private javax.swing.JTextField TxtParAreB;
    private javax.swing.JTextField TxtParPerA;
    private javax.swing.JTextField TxtParPerB;
    private javax.swing.JTextField TxtTrAns;
    private javax.swing.JTextField TxtTrAreA;
    private javax.swing.JTextField TxtTrAreAltA;
    private javax.swing.JTextField TxtTrAreAltB;
    private javax.swing.JTextField TxtTrAreAltC;
    private javax.swing.JTextField TxtTrAreH;
    private javax.swing.JTextField TxtTriPerA;
    private javax.swing.JTextField TxtTriPerB;
    private javax.swing.JTextField TxtTriPerC;
    private javax.swing.JPanel mainPanel;
    /**
     * Creates new form LengthArea
     */

    public LengthArea() {
        initComponents();

    }

    public void setPan(String pan) {
        this.pan = pan;
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, pan);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        javax.swing.JPanel parallelogram = new javax.swing.JPanel();
        javax.swing.JLabel labParTitle = new javax.swing.JLabel();
        javax.swing.JLabel labParPer = new javax.swing.JLabel();
        javax.swing.JLabel labParAre = new javax.swing.JLabel();
        javax.swing.JLabel labParIMG = new javax.swing.JLabel();
        javax.swing.JLabel labParPerA = new javax.swing.JLabel();
        javax.swing.JLabel labParPerB = new javax.swing.JLabel();
        javax.swing.JLabel labParAreA = new javax.swing.JLabel();
        javax.swing.JLabel labParAreH = new javax.swing.JLabel();
        javax.swing.JLabel labParOr = new javax.swing.JLabel();
        javax.swing.JLabel labParAreAltA = new javax.swing.JLabel();
        javax.swing.JLabel labParAreAltB = new javax.swing.JLabel();
        javax.swing.JLabel labParAreAltC = new javax.swing.JLabel();
        javax.swing.JLabel labParAnswer = new javax.swing.JLabel();
        TxtParPerA = new javax.swing.JTextField();
        TxtParPerB = new javax.swing.JTextField();
        TxtParAns = new javax.swing.JTextField();
        TxtParAreA = new javax.swing.JTextField();
        TxtParAreB = new javax.swing.JTextField();
        TxtParAreAltA = new javax.swing.JTextField();
        TxtParAreAltB = new javax.swing.JTextField();
        TxtParAreAltC = new javax.swing.JTextField();
        javax.swing.JButton btnParPer = new javax.swing.JButton();
        javax.swing.JButton btnParAre = new javax.swing.JButton();
        javax.swing.JPanel triangle = new javax.swing.JPanel();
        javax.swing.JLabel labTriTitle = new javax.swing.JLabel();
        javax.swing.JLabel labTriOr = new javax.swing.JLabel();
        javax.swing.JLabel labTriPer = new javax.swing.JLabel();
        javax.swing.JLabel labTriAre = new javax.swing.JLabel();
        javax.swing.JLabel labTriPerA = new javax.swing.JLabel();
        javax.swing.JLabel labTriPerB = new javax.swing.JLabel();
        javax.swing.JLabel labTriPerC = new javax.swing.JLabel();
        javax.swing.JLabel labTriAreA = new javax.swing.JLabel();
        javax.swing.JLabel labTriAreH = new javax.swing.JLabel();
        javax.swing.JLabel labTriAreAltA = new javax.swing.JLabel();
        javax.swing.JLabel labTriAreAltB = new javax.swing.JLabel();
        javax.swing.JLabel labTriAreAltC = new javax.swing.JLabel();
        javax.swing.JLabel labTriAreAns = new javax.swing.JLabel();
        javax.swing.JLabel labTriIMG = new javax.swing.JLabel();
        TxtTriPerB = new javax.swing.JTextField();
        TxtTriPerC = new javax.swing.JTextField();
        TxtTrAreA = new javax.swing.JTextField();
        TxtTrAreH = new javax.swing.JTextField();
        TxtTrAreAltA = new javax.swing.JTextField();
        TxtTrAreAltB = new javax.swing.JTextField();
        TxtTrAreAltC = new javax.swing.JTextField();
        TxtTrAns = new javax.swing.JTextField();
        TxtTriPerA = new javax.swing.JTextField();
        javax.swing.JButton btnTriAre = new javax.swing.JButton();
        javax.swing.JButton btnTriPer = new javax.swing.JButton();
        javax.swing.JMenuBar menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu menuMaths = new javax.swing.JMenu();
        javax.swing.JMenu matLenSub = new javax.swing.JMenu();
        javax.swing.JMenuItem matLenSubPar = new javax.swing.JMenuItem();
        javax.swing.JMenuItem matLenSubTri = new javax.swing.JMenuItem();
        javax.swing.JMenu matAreSub = new javax.swing.JMenu();
        javax.swing.JMenuItem matAreSubPlaceHolder = new javax.swing.JMenuItem();
        javax.swing.JMenu matTriSub = new javax.swing.JMenu();
        javax.swing.JMenuItem matTriSubPlaceHolder = new javax.swing.JMenuItem();
        javax.swing.JMenuItem matCalc = new javax.swing.JMenuItem();
        javax.swing.JMenu menuScience = new javax.swing.JMenu();
        javax.swing.JMenuItem sciSubPlaceHolder = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));

        mainPanel.setMaximumSize(new java.awt.Dimension(400, 322));
        mainPanel.setMinimumSize(new java.awt.Dimension(400, 322));
        mainPanel.setPreferredSize(new java.awt.Dimension(400, 322));
        mainPanel.setLayout(new java.awt.CardLayout());

        parallelogram.setMaximumSize(new java.awt.Dimension(400, 300));
        parallelogram.setMinimumSize(new java.awt.Dimension(400, 300));
        parallelogram.setRequestFocusEnabled(false);

        labParTitle.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24));
        labParTitle.setText("Parallelogram");

        labParPer.setText("Perimeter");

        labParAre.setText("Area");

        labParIMG.setIcon(new javax.swing.ImageIcon("src/calculator/pictures/Paralellogram.png"));

        labParPerA.setText("a");

        labParPerB.setText("b");

        labParAreA.setText("a");

        labParAreH.setText("h");

        labParOr.setText("Or");

        labParAreAltA.setText("a");

        labParAreAltB.setText("b");

        labParAreAltC.setText("C");

        labParAnswer.setText("Answer");

        TxtParPerA.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtParPerA.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtParPerA.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtParPerB.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtParPerB.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtParPerB.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtParAns.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtParAns.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtParAns.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtParAreA.setToolTipText("");
        TxtParAreA.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtParAreA.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtParAreA.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtParAreA.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtParAreB.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtParAreB.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtParAreB.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtParAreAltA.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtParAreAltA.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtParAreAltA.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtParAreAltB.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtParAreAltB.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtParAreAltB.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtParAreAltC.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtParAreAltC.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtParAreAltC.setPreferredSize(new java.awt.Dimension(50, 23));

        btnParPer.setText("Perimeter");
        btnParPer.addActionListener(evt -> BtnParPerActionPerformed(evt));

        btnParAre.setText("Area");
        btnParAre.addActionListener(evt -> BtnParAreActionPerformed(evt));

        javax.swing.GroupLayout ParallelogramLayout = new javax.swing.GroupLayout(parallelogram);
        parallelogram.setLayout(ParallelogramLayout);
        ParallelogramLayout.setHorizontalGroup(
                ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(labParPer))
                                                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                                                                .addComponent(labParPerB)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(TxtParPerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                                                                .addComponent(labParPerA)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(TxtParPerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(btnParPer)))
                                                .addGap(34, 34, 34)
                                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labParIMG)
                                                        .addComponent(TxtParAns, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                                .addGap(121, 121, 121)
                                                .addComponent(labParTitle)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParallelogramLayout.createSequentialGroup()
                                                .addComponent(labParAre)
                                                .addGap(48, 48, 48))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParallelogramLayout.createSequentialGroup()
                                                .addComponent(labParOr)
                                                .addGap(55, 55, 55))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParallelogramLayout.createSequentialGroup()
                                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labParAreAltA)
                                                        .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(labParAreAltC)
                                                                .addComponent(labParAreAltB))
                                                        .addComponent(labParAreA, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(labParAreH, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TxtParAreAltC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TxtParAreAltB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TxtParAreAltA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TxtParAreA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TxtParAreB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(32, 32, 32))
                                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                                .addComponent(btnParAre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(labParAnswer)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ParallelogramLayout.setVerticalGroup(
                ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                                .addComponent(labParTitle)
                                                .addGap(18, 18, 18)
                                                .addComponent(labParIMG))
                                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                                .addComponent(labParAre)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TxtParAreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labParAreA))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TxtParAreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labParAreH))
                                                .addGap(18, 18, 18)
                                                .addComponent(labParOr)
                                                .addGap(16, 16, 16)
                                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labParAreAltA)
                                                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                                                .addComponent(TxtParAreAltA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(TxtParAreAltB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(labParAreAltB))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(TxtParAreAltC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(labParAreAltC)))))
                                        .addGroup(ParallelogramLayout.createSequentialGroup()
                                                .addComponent(labParPer)
                                                .addGap(18, 18, 18)
                                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TxtParPerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labParPerA))
                                                .addGap(13, 13, 13)
                                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TxtParPerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labParPerB))))
                                .addGap(20, 20, 20)
                                .addComponent(labParAnswer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ParallelogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtParAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnParAre)
                                        .addComponent(btnParPer))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        mainPanel.add(parallelogram, "LAP");

        triangle.setMaximumSize(new java.awt.Dimension(400, 300));
        triangle.setMinimumSize(new java.awt.Dimension(400, 300));
        triangle.setPreferredSize(new java.awt.Dimension(400, 300));

        labTriTitle.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24));
        labTriTitle.setText("Triangle");

        labTriOr.setText("OR");

        labTriPer.setText("Perimeter");

        labTriAre.setText("Area");

        labTriPerA.setText("a");

        labTriPerB.setText("b");

        labTriPerC.setText("c");

        labTriAreA.setText("a");

        labTriAreH.setText("h");

        labTriAreAltA.setText("a");

        labTriAreAltB.setText("b");

        labTriAreAltC.setText("C");

        labTriAreAns.setText("Answer");

        labTriIMG.setIcon(new javax.swing.ImageIcon("src/calculator/pictures/Triangle.png"));

        TxtTriPerB.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtTriPerB.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtTriPerB.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtTriPerC.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtTriPerC.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtTriPerC.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtTrAreA.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtTrAreA.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtTrAreA.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtTrAreH.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtTrAreH.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtTrAreH.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtTrAreAltA.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtTrAreAltA.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtTrAreAltA.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtTrAreAltB.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtTrAreAltB.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtTrAreAltB.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtTrAreAltC.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtTrAreAltC.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtTrAreAltC.setPreferredSize(new java.awt.Dimension(50, 23));

        TxtTrAns.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtTrAns.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtTrAns.setPreferredSize(new java.awt.Dimension(100, 23));

        TxtTriPerA.setMaximumSize(new java.awt.Dimension(50, 23));
        TxtTriPerA.setMinimumSize(new java.awt.Dimension(50, 23));
        TxtTriPerA.setPreferredSize(new java.awt.Dimension(50, 23));

        btnTriAre.setText("Area");
        btnTriAre.addActionListener(evt -> BtnTriAreActionPerformed(evt));

        btnTriPer.setText("Perimeter");
        btnTriPer.addActionListener(evt -> BtnTriPerActionPerformed(evt));

        javax.swing.GroupLayout TriangleLayout = new javax.swing.GroupLayout(triangle);
        triangle.setLayout(TriangleLayout);
        TriangleLayout.setHorizontalGroup(
                TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TriangleLayout.createSequentialGroup()
                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TriangleLayout.createSequentialGroup()
                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(TriangleLayout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(btnTriPer)
                                                                        .addGroup(TriangleLayout.createSequentialGroup()
                                                                                .addComponent(labTriPer)
                                                                                .addGap(15, 15, 15))))
                                                        .addGroup(TriangleLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(labTriPerB, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(labTriPerC)
                                                                        .addComponent(labTriPerA, javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(TxtTriPerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(TxtTriPerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(TxtTriPerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(47, 47, 47)
                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labTriIMG)
                                                        .addGroup(TriangleLayout.createSequentialGroup()
                                                                .addGap(19, 19, 19)
                                                                .addComponent(TxtTrAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TriangleLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(labTriAreAns)
                                                .addGap(104, 104, 104)))
                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TriangleLayout.createSequentialGroup()
                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(TriangleLayout.createSequentialGroup()
                                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(labTriAreH)
                                                                        .addComponent(labTriAreA)
                                                                        .addComponent(labTriAreAltA)
                                                                        .addComponent(labTriAreAltB)
                                                                        .addComponent(labTriAreAltC))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(TxtTrAreH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(TxtTrAreA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TriangleLayout.createSequentialGroup()
                                                                                        .addComponent(labTriOr)
                                                                                        .addGap(24, 24, 24)))
                                                                        .addComponent(TxtTrAreAltC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TxtTrAreAltB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TxtTrAreAltA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(btnTriAre))
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TriangleLayout.createSequentialGroup()
                                                .addComponent(labTriAre)
                                                .addGap(28, 28, 28))))
                        .addGroup(TriangleLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(labTriTitle)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        TriangleLayout.setVerticalGroup(
                TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TriangleLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labTriTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TriangleLayout.createSequentialGroup()
                                                .addComponent(labTriPer)
                                                .addGap(18, 18, 18)
                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labTriPerA)
                                                        .addComponent(TxtTriPerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TxtTriPerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labTriPerB))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TxtTriPerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labTriPerC)))
                                        .addGroup(TriangleLayout.createSequentialGroup()
                                                .addComponent(labTriAre)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(TriangleLayout.createSequentialGroup()
                                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(TxtTrAreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(labTriAreA))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(TxtTrAreH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(labTriAreH))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(TriangleLayout.createSequentialGroup()
                                                                                .addGap(31, 31, 31)
                                                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(TxtTrAreAltA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(labTriAreAltA))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(TxtTrAreAltB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(labTriAreAltB))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(TxtTrAreAltC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(labTriAreAltC)))
                                                                        .addComponent(labTriOr)))
                                                        .addGroup(TriangleLayout.createSequentialGroup()
                                                                .addComponent(labTriIMG)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(labTriAreAns)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTriAre)
                                        .addComponent(btnTriPer)
                                        .addComponent(TxtTrAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(15, Short.MAX_VALUE))
        );

        mainPanel.add(triangle, "LAT");

        menuMaths.setText("Maths");

        matLenSub.setText("Lenght&Area");

        matLenSubPar.setText("Parallelogram");
        matLenSubPar.addActionListener(evt -> MatLenSubParActionPerformed(evt));
        matLenSub.add(matLenSubPar);

        matLenSubTri.setText("Triangle");
        matLenSubTri.addActionListener(evt -> MatLenSubTriActionPerformed(evt));
        matLenSub.add(matLenSubTri);

        menuMaths.add(matLenSub);

        matAreSub.setText("Area&Volumn");

        matAreSubPlaceHolder.setText("Will Be Developed In future");
        matAreSub.add(matAreSubPlaceHolder);

        menuMaths.add(matAreSub);

        matTriSub.setText("Triangles");

        matTriSubPlaceHolder.setText("Will Be Developed In future");
        matTriSub.add(matTriSubPlaceHolder);

        menuMaths.add(matTriSub);

        matCalc.setText("calculator");
        matCalc.addActionListener(evt -> MatCalcActionPerformed(evt));
        menuMaths.add(matCalc);

        menuBar.add(menuMaths);

        menuScience.setText("Physics");

        sciSubPlaceHolder.setText("Will Be Developed In future");
        menuScience.add(sciSubPlaceHolder);

        menuBar.add(menuScience);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void BtnParAreActionPerformed(java.awt.event.ActionEvent evt) {
        String AAString = TxtParAreA.getText().trim(), AHString = TxtParAreB.getText().trim(), AMAString = TxtParAreAltA.getText().trim(), ABString = TxtParAreAltB.getText().trim(), ACString = TxtParAreAltC.getText().trim();
        try {
            if ((AAString.length() != 0 && AHString.length() != 0) || (AMAString.length() != 0 && ABString.length() != 0 && ACString.length() != 0)) {
                if (AAString.length() != 0 && AHString.length() != 0) {
                    Double AA, AH;
                    AA = Double.parseDouble(AAString);
                    AH = Double.parseDouble(AHString);
                    Ans = AA * AH;
                    TxtParAns.setText(Ans.toString());
                } else if (AMAString.length() != 0 && ABString.length() != 0) {
                    Double AMA, AB, AC;
                    AMA = Double.parseDouble(AMAString);
                    AB = Double.parseDouble(ABString);
                    AC = Double.parseDouble(ACString);
                    Ans = ((AMA * AB) * (Math.sin(AC)));
                    TxtParAns.setText(Ans.toString());
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please fill relevent text boxes");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Numbers and decimal points only please");
        }
    }

    private void BtnParPerActionPerformed(java.awt.event.ActionEvent evt) {
        String PeraString = TxtParPerA.getText().trim(), PerbString = TxtParPerB.getText().trim();
        try {
            if (PeraString.length() != 0 && PerbString.length() != 0) {
                Double PerimeterA, PerimeterB;
                PerimeterA = Double.parseDouble(PeraString);
                PerimeterB = Double.parseDouble(PerbString);
                Ans = ((2 * PerimeterA) * (2 * PerimeterB));
                TxtParAns.setText(Ans.toString());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please fill relevent text boxes");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Numbers and decimal points only please");
        }
    }

    private void MatLenSubParActionPerformed(java.awt.event.ActionEvent evt) {
        pan = "LAP";
        setPan(pan);
    }

    private void MatLenSubTriActionPerformed(java.awt.event.ActionEvent evt) {
        pan = "LAT";
        setPan(pan);
    }

    private void MatCalcActionPerformed(java.awt.event.ActionEvent evt) {
        Calculator cal = new Calculator();
        cal.setVisible(true);
        dispose();
    }

    private void BtnTriAreActionPerformed(java.awt.event.ActionEvent evt) {
        String TAAString = TxtTrAreA.getText().trim(), TAHString = TxtTrAreH.getText().trim(), TAMAString = TxtTrAreAltA.getText().trim(), TAMBString = TxtTrAreAltB.getText().trim(), TAMCString = TxtTrAreAltC.getText().trim();
        try {
            if ((TAAString.length() != 0 && TAHString.length() != 0) || (TAMAString.length() != 0 && TAMBString.length() != 0 && TAMCString.length() != 0)) {
                if (TAAString.length() != 0 && TAHString.length() != 0) {
                    Double TAA, TAH;
                    TAA = Double.parseDouble(TAAString);
                    TAH = Double.parseDouble(TAHString);
                    Ans = ((0.5 * TAA) * TAH);
                    TxtTrAns.setText(Ans.toString());
                } else if (TAMAString.length() != 0 && TAMBString.length() != 0) {
                    Double TAMA, TAMB, TAMC;
                    TAMA = Double.parseDouble(TAMAString);
                    TAMB = Double.parseDouble(TAMBString);
                    TAMC = Double.parseDouble(TAMCString);
                    Ans = (((0.5 * TAMA) * TAMB) * Math.sin(TAMC));
                    TxtTrAns.setText(Ans.toString());
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please fill relevent text boxes");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Numbers and decimal points only please");
        }
    }

    private void BtnTriPerActionPerformed(java.awt.event.ActionEvent evt) {
        String TPAString = TxtTriPerA.getText().trim(), TPBString = TxtTriPerB.getText().trim(), TPCString = TxtTriPerC.getText().trim();
        try {
            if ((TPAString.length() != 0 && TPBString.length() != 0 && TPCString.length() != 0)) {
                Double TPA, TPB, TPC;
                TPA = Double.parseDouble(TPAString);
                TPB = Double.parseDouble(TPBString);
                TPC = Double.parseDouble(TPCString);
                Ans = (TPA + TPB + TPC);
                TxtTrAns.setText(Ans.toString());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please fill relevent text boxes");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Numbers and decimal points only please");
        }
    }

}
