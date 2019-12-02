package calculator;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.swing.JOptionPane;
import java.awt.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;


/**
 * @author Jason Hanafin
 * @version 5.3
 * @since 18th August 2019
 *The last calculator you'll ever need
 * 5am:*crying sounds*
 */

public class Calculator extends javax.swing.JFrame {
    ArrayList<String> equal = new ArrayList<>();
    ArrayList<String> displ = new ArrayList<>();
    String equasion = "",Display = "",angleType = "D",Output ="N",pan = "C";
    int abs = 0, place = 10,prev;
    double ANS = 0;
    boolean shift=false;
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");

    public ArrayList<String> readFromFile(String File) throws IOException {
        ArrayList<String> Placeholder = new ArrayList<>();
        Placeholder.add("0");
        String str;
        try (BufferedReader in = new BufferedReader(new FileReader(File))) {
            while ((str = in.readLine()) != null) {
                Placeholder.add(str);
            }
        } catch (FileNotFoundException e) {
            writeToFile(Placeholder, File);
        }
        return Placeholder;
    }



    private void writeToFile(ArrayList<String> array,String File) throws IOException {
        try (FileWriter writer = new FileWriter(File)) {
            for(String str: array)
            {
                writer.write(str + System.lineSeparator());
            }
        }
    }

    public void setType(String type) {
        angleType = type;
    }

    public void setPlace(int Place) {
        this.place = Place;
    }

    public void setOutput(String Output) {
        this.Output = Output;
    }

    private String Sub(String Convert){
        Convert = Convert.replaceAll("0", "₀");
        Convert = Convert.replaceAll("1", "₁");
        Convert = Convert.replaceAll("2", "₂");
        Convert = Convert.replaceAll("3", "₃");
        Convert = Convert.replaceAll("4", "₄");
        Convert = Convert.replaceAll("5", "₅");
        Convert = Convert.replaceAll("6", "₆");
        Convert = Convert.replaceAll("7", "₇");
        Convert = Convert.replaceAll("8", "₈");
        Convert = Convert.replaceAll("9", "₉");
        return Convert;
    }

    private String Super(String Convert){
        Convert = Convert.replaceAll("0", "⁰");
        Convert = Convert.replaceAll("1", "¹");
        Convert = Convert.replaceAll("2", "²");
        Convert = Convert.replaceAll("3", "³");
        Convert = Convert.replaceAll("4", "⁴");
        Convert = Convert.replaceAll("5", "⁵");
        Convert = Convert.replaceAll("6", "⁶");
        Convert = Convert.replaceAll("7", "⁷");
        Convert = Convert.replaceAll("8", "⁸");
        Convert = Convert.replaceAll("9", "⁹");
        Convert = Convert.replaceAll("-", "⁻");
        return Convert;
    }


    public Calculator() {
        try {
            equal = readFromFile("equasion.data");
            displ = readFromFile("Display.data");

        } catch (IOException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        prev = equal.size();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        TxtAreaOutput = new javax.swing.JTextField();
        TxtAreaDebug = new javax.swing.JTextField();
        Btn0 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        BtnDot = new javax.swing.JButton();
        javax.swing.JButton btnEquals = new javax.swing.JButton();
        BtnPlus = new javax.swing.JButton();
        BtnMinus = new javax.swing.JButton();
        BtnMultiply = new javax.swing.JButton();
        BtnDevide = new javax.swing.JButton();
        javax.swing.JButton btnClear = new javax.swing.JButton();
        javax.swing.JButton btnSqr = new javax.swing.JButton();
        BtnOpen = new javax.swing.JButton();
        BtnClose = new javax.swing.JButton();
        BtnRoot = new javax.swing.JButton();
        javax.swing.JButton btnCubeRoot = new javax.swing.JButton();
        javax.swing.JButton btnCustRoot = new javax.swing.JButton();
        javax.swing.JButton btnFraction = new javax.swing.JButton();
        javax.swing.JButton btnCos = new javax.swing.JButton();
        javax.swing.JButton btnSin = new javax.swing.JButton();
        javax.swing.JButton btnTan = new javax.swing.JButton();
        javax.swing.JButton btnAbsolute = new javax.swing.JButton();
        javax.swing.JButton btnSettings = new javax.swing.JButton();
        javax.swing.JButton btnShift = new javax.swing.JButton();
        javax.swing.JLabel shftbtnsqr = new javax.swing.JLabel();
        javax.swing.JButton btnscien = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        javax.swing.JButton btnAns = new javax.swing.JButton();
        javax.swing.JButton btnPrevious = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JButton btnAbsolute1 = new javax.swing.JButton();
        javax.swing.JMenuBar menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu menuMaths = new javax.swing.JMenu();
        javax.swing.JMenu matLenSub = new javax.swing.JMenu();
        javax.swing.JMenuItem matLenSubPar = new javax.swing.JMenuItem();
        javax.swing.JMenuItem matLenSubTri = new javax.swing.JMenuItem();
        javax.swing.JMenu matAreSub = new javax.swing.JMenu();
        javax.swing.JMenuItem matAreSubPlaceHolder = new javax.swing.JMenuItem();
        javax.swing.JMenu matTriSub = new javax.swing.JMenu();
        javax.swing.JMenuItem matTriSubPlaceHolder = new javax.swing.JMenuItem();
        javax.swing.JMenu menuScience = new javax.swing.JMenu();
        javax.swing.JMenuItem sciSubPlaceHolder = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtAreaDebug.addActionListener(evt -> TxtAreaDebugActionPerformed(evt));

        Btn0.setText("0");
        Btn0.setMaximumSize(new java.awt.Dimension(40, 25));
        Btn0.setMinimumSize(new java.awt.Dimension(40, 25));
        Btn0.setPreferredSize(new java.awt.Dimension(40, 25));
        Btn0.addActionListener(evt -> Btn0ActionPerformed(evt));

        Btn1.setText("1");
        Btn1.setMaximumSize(new java.awt.Dimension(40, 25));
        Btn1.setMinimumSize(new java.awt.Dimension(40, 25));
        Btn1.setPreferredSize(new java.awt.Dimension(40, 25));
        Btn1.addActionListener(evt -> Btn1ActionPerformed(evt));

        Btn2.setText("2");
        Btn2.setMaximumSize(new java.awt.Dimension(40, 25));
        Btn2.setMinimumSize(new java.awt.Dimension(40, 25));
        Btn2.setPreferredSize(new java.awt.Dimension(40, 25));
        Btn2.addActionListener(evt -> Btn2ActionPerformed(evt));

        Btn3.setText("3");
        Btn3.setMaximumSize(new java.awt.Dimension(40, 25));
        Btn3.setMinimumSize(new java.awt.Dimension(40, 25));
        Btn3.setPreferredSize(new java.awt.Dimension(40, 25));
        Btn3.addActionListener(evt -> Btn3ActionPerformed(evt));

        Btn4.setText("4");
        Btn4.setMaximumSize(new java.awt.Dimension(40, 25));
        Btn4.setMinimumSize(new java.awt.Dimension(40, 25));
        Btn4.setPreferredSize(new java.awt.Dimension(40, 25));
        Btn4.addActionListener(evt -> Btn4ActionPerformed(evt));

        Btn5.setText("5");
        Btn5.setMaximumSize(new java.awt.Dimension(40, 25));
        Btn5.setMinimumSize(new java.awt.Dimension(40, 25));
        Btn5.setPreferredSize(new java.awt.Dimension(40, 25));
        Btn5.addActionListener(evt -> Btn5ActionPerformed(evt));

        Btn6.setText("6");
        Btn6.setMaximumSize(new java.awt.Dimension(40, 25));
        Btn6.setMinimumSize(new java.awt.Dimension(40, 25));
        Btn6.setPreferredSize(new java.awt.Dimension(40, 25));
        Btn6.addActionListener(evt -> Btn6ActionPerformed(evt));

        Btn7.setText("7");
        Btn7.setMaximumSize(new java.awt.Dimension(40, 25));
        Btn7.setMinimumSize(new java.awt.Dimension(40, 25));
        Btn7.setPreferredSize(new java.awt.Dimension(40, 25));
        Btn7.addActionListener(evt -> Btn7ActionPerformed(evt));

        Btn8.setText("8");
        Btn8.setMaximumSize(new java.awt.Dimension(40, 25));
        Btn8.setMinimumSize(new java.awt.Dimension(40, 25));
        Btn8.setPreferredSize(new java.awt.Dimension(40, 25));
        Btn8.addActionListener(evt -> Btn8ActionPerformed(evt));

        Btn9.setText("9");
        Btn9.setMaximumSize(new java.awt.Dimension(40, 25));
        Btn9.setMinimumSize(new java.awt.Dimension(40, 25));
        Btn9.setPreferredSize(new java.awt.Dimension(40, 25));
        Btn9.addActionListener(evt -> Btn9ActionPerformed(evt));

        BtnDot.setText(".");
        BtnDot.setMaximumSize(new java.awt.Dimension(40, 25));
        BtnDot.setMinimumSize(new java.awt.Dimension(40, 25));
        BtnDot.setPreferredSize(new java.awt.Dimension(40, 25));
        BtnDot.addActionListener(evt -> BtnDotActionPerformed(evt));

        btnEquals.setText("=");
        btnEquals.setMaximumSize(new java.awt.Dimension(40, 25));
        btnEquals.setMinimumSize(new java.awt.Dimension(40, 25));
        btnEquals.setPreferredSize(new java.awt.Dimension(40, 25));
        btnEquals.addActionListener(evt -> BtnEqualsActionPerformed(evt));

        BtnPlus.setText("+");
        BtnPlus.setMaximumSize(new java.awt.Dimension(40, 25));
        BtnPlus.setMinimumSize(new java.awt.Dimension(40, 25));
        BtnPlus.setPreferredSize(new java.awt.Dimension(40, 25));
        BtnPlus.addActionListener(evt -> BtnPlusActionPerformed(evt));

        BtnMinus.setText("-");
        BtnMinus.setMaximumSize(new java.awt.Dimension(40, 25));
        BtnMinus.setMinimumSize(new java.awt.Dimension(40, 25));
        BtnMinus.setPreferredSize(new java.awt.Dimension(40, 25));
        BtnMinus.addActionListener(evt -> BtnMinusActionPerformed(evt));

        BtnMultiply.setText("x");
        BtnMultiply.setMaximumSize(new java.awt.Dimension(40, 25));
        BtnMultiply.setMinimumSize(new java.awt.Dimension(40, 25));
        BtnMultiply.setPreferredSize(new java.awt.Dimension(40, 25));
        BtnMultiply.addActionListener(evt -> BtnMultiplyActionPerformed(evt));

        BtnDevide.setText("÷");
        BtnDevide.setMaximumSize(new java.awt.Dimension(40, 25));
        BtnDevide.setMinimumSize(new java.awt.Dimension(40, 25));
        BtnDevide.setPreferredSize(new java.awt.Dimension(40, 25));
        BtnDevide.addActionListener(evt -> BtnDevideActionPerformed(evt));

        btnClear.setText("AC");
        btnClear.addActionListener(evt -> BtnClearActionPerformed(evt));

        btnSqr.setText("x²");
        btnSqr.addActionListener(evt -> BtnSqrActionPerformed(evt));

        BtnOpen.setText("(");
        BtnOpen.addActionListener(evt -> BtnOpenActionPerformed(evt));

        BtnClose.setText(")");
        BtnClose.addActionListener(evt -> BtnCloseActionPerformed(evt));

        BtnRoot.setText("√");
        BtnRoot.addActionListener(evt -> BtnRootActionPerformed(evt));

        btnCubeRoot.setText("³√");
        btnCubeRoot.addActionListener(evt -> BtnCubeRootActionPerformed(evt));

        btnCustRoot.setText("ⁿ√");
        btnCustRoot.addActionListener(evt -> BtnCustRootActionPerformed(evt));

        btnFraction.setText("⅍");
        btnFraction.setToolTipText("");
        btnFraction.addActionListener(evt -> BtnFractionActionPerformed(evt));

        btnCos.setText("cos");
        btnCos.addActionListener(evt -> BtnCosActionPerformed(evt));

        btnSin.setText("sin");
        btnSin.addActionListener(evt -> BtnSinActionPerformed(evt));

        btnTan.setText("tan");
        btnTan.addActionListener(evt -> BtnTanActionPerformed(evt));

        btnAbsolute.setText("ABS");
        btnAbsolute.setToolTipText("");
        btnAbsolute.addActionListener(evt -> BtnAbsoluteActionPerformed(evt));

        btnSettings.setFont(new java.awt.Font("Segoe UI Symbol", Font.PLAIN, 18));
        btnSettings.setText("⚙");
        btnSettings.setMaximumSize(new java.awt.Dimension(40, 25));
        btnSettings.setMinimumSize(new java.awt.Dimension(40, 25));
        btnSettings.setPreferredSize(new java.awt.Dimension(40, 25));
        btnSettings.addActionListener(evt -> BtnSettingsActionPerformed(evt));

        btnShift.setText("Shift");
        btnShift.addActionListener(evt -> BtnShiftActionPerformed(evt));

        shftbtnsqr.setText("xⁿ");

        btnscien.setText("x10ⁿ");
        btnscien.setMaximumSize(new java.awt.Dimension(40, 25));
        btnscien.setMinimumSize(new java.awt.Dimension(40, 25));
        btnscien.setPreferredSize(new java.awt.Dimension(40, 25));
        btnscien.addActionListener(evt -> BtnscienActionPerformed(evt));

        jLabel2.setText("𝜋");

        btnAns.setText("ANS");
        btnAns.setToolTipText("");
        btnAns.addActionListener(evt -> btnAnsActionPerformed(evt));

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(evt -> BtnPreviousActionPerformed(evt));

        jLabel1.setText("n⅍");

        btnAbsolute1.setText("Clr");
        btnAbsolute1.setToolTipText("");
        btnAbsolute1.addActionListener(evt -> BtnAbsolute1ActionPerformed(evt));

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
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TxtAreaDebug)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(BtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnscien, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(136, 136, 136)
                                                                .addComponent(jLabel2)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(BtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(BtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(BtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(BtnDevide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(btnCubeRoot)
                                                                                        .addComponent(btnCustRoot)
                                                                                        .addComponent(BtnRoot)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(17, 17, 17)
                                                                                                .addComponent(shftbtnsqr))
                                                                                        .addComponent(btnSqr))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                                .addComponent(BtnOpen)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                                                                                .addComponent(BtnClose)
                                                                                                .addGap(108, 108, 108)
                                                                                                .addComponent(jLabel1)
                                                                                                .addGap(129, 129, 129))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(btnAbsolute1)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                        .addComponent(btnCos)
                                                                                                                        .addComponent(btnSin))
                                                                                                                .addGap(46, 46, 46)
                                                                                                                .addComponent(btnFraction)
                                                                                                                .addGap(116, 116, 116))
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(btnAbsolute)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(btnTan)
                                                                                                                .addGap(204, 204, 204))))))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(17, 17, 17)
                                                                                .addComponent(btnPrevious)
                                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(btnClear)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnAns)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addComponent(TxtAreaOutput)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnShift)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TxtAreaOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TxtAreaDebug, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnShift)
                                        .addComponent(btnPrevious))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(shftbtnsqr)
                                                                        .addGap(4, 4, 4)
                                                                        .addComponent(btnSqr))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(59, 59, 59)
                                                                        .addComponent(BtnRoot)
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btnCubeRoot)
                                                                                .addComponent(btnAbsolute1))
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(btnCustRoot)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(BtnOpen)
                                                                        .addComponent(BtnClose))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnSin)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnCos)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(btnAbsolute))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(btnTan)))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnAns)
                                                        .addComponent(btnClear))
                                                .addGap(26, 26, 26))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(32, 32, 32)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnFraction))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                        .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                        .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                        .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jLabel2)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(BtnDevide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(BtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(BtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(BtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(14, 14, 14)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(BtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnscien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + Btn0.getText();
        equasion = equasion + Btn0.getText();
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + Btn1.getText();
        equasion = equasion + Btn1.getText();
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + Btn2.getText();
        equasion = equasion + Btn2.getText();
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + Btn4.getText();
        equasion = equasion + Btn4.getText();
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + Btn8.getText();
        equasion = equasion + Btn8.getText();
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + Btn9.getText();
        equasion = equasion + Btn9.getText();
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + Btn6.getText();
        equasion = equasion + Btn6.getText();
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + Btn3.getText();
        equasion = equasion + Btn3.getText();
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + Btn7.getText();
        equasion = equasion + Btn7.getText();
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + Btn5.getText();
        equasion = equasion + Btn5.getText();
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void BtnDevideActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + BtnDevide.getText();
        equasion = equasion + "/";
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void BtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + BtnMultiply.getText();
        equasion = equasion + "*";
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void BtnPlusActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + BtnPlus.getText();
        equasion = equasion + "+";
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void BtnMinusActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + BtnMinus.getText();
        equasion = equasion + "-";
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void BtnDotActionPerformed(java.awt.event.ActionEvent evt) {
//I would limit the maximum decimal points to 1 per number but the calculator
//I am using for reference has no limit on decimal points.
        equasion = TxtAreaDebug.getText() + BtnDot.getText();
        Display = TxtAreaOutput.getText() + BtnDot.getText();
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);

    }

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {
        equasion = "";
        Display = "";
        TxtAreaOutput.setText(Display);
        TxtAreaDebug.setText(equasion);
    }

    private void BtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
            String ansStr = String.valueOf(engine.eval(equasion));
            TxtAreaOutput.setText(ansStr);
            TxtAreaDebug.setText("("+ansStr+")");
            ANS = Double.parseDouble(ansStr);
            equal.add(equasion);
            displ.add(Display);
            try
            {
                writeToFile(displ,"Display.data");
                writeToFile(equal,"equasion.data");
            }
            catch (IOException ex)
            {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (ScriptException ex)
        {
            TxtAreaOutput.setText("Syntax Error");
        }
    }

    private void BtnOpenActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + BtnOpen.getText();
        equasion = equasion + BtnOpen.getText();
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void BtnCloseActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + BtnClose.getText();
        equasion = equasion + BtnClose.getText();
        abs=0;
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void BtnCosActionPerformed(java.awt.event.ActionEvent evt) {
        if(angleType == "D")
        {
            Display = TxtAreaOutput.getText() + "cos(";
            equasion = equasion + " Math.cos(Math.PI / 180 * ";
            TxtAreaDebug.setText(equasion);
            TxtAreaOutput.setText(Display);
        }
        else if(angleType == "R")
        {
            Display = TxtAreaOutput.getText() + "cos(";
            equasion = equasion + " Math.cos(";
            TxtAreaDebug.setText(equasion);
            TxtAreaOutput.setText(Display);
        }
    }

    private void BtnSinActionPerformed(java.awt.event.ActionEvent evt) {
        if(angleType == "D")
        {
            Display = TxtAreaOutput.getText() + "sin(";
            equasion = equasion + " Math.sin(Math.PI / 180 * ";
            TxtAreaDebug.setText(equasion);
            TxtAreaOutput.setText(Display);
        }
        else if(angleType == "R")
        {
            Display = TxtAreaOutput.getText() + "sin(";
            equasion = equasion + " Math.sin(";
            TxtAreaDebug.setText(equasion);
            TxtAreaOutput.setText(Display);
        }
    }

    private void BtnTanActionPerformed(java.awt.event.ActionEvent evt) {
        if(angleType == "D")
        {
            Display = TxtAreaOutput.getText() + "tan(";
            equasion = equasion + " Math.tan(Math.PI / 180 *";
            TxtAreaDebug.setText(equasion);
            TxtAreaOutput.setText(Display);
        }
        else if(angleType == "R")
        {
            Display = TxtAreaOutput.getText() + "tan(";
            equasion = equasion + " Math.tan(";
            TxtAreaDebug.setText(equasion);
            TxtAreaOutput.setText(Display);
        }
    }

    private void BtnSqrActionPerformed(java.awt.event.ActionEvent evt) {
        if(!shift)
        {
            try
            {
                String d = JOptionPane.showInputDialog(rootPane,"Please enter the number to be squared");
                Double sqr = Double.parseDouble(d);
                Display = TxtAreaOutput.getText() + d + "²";
                equasion = equasion + "Math.pow("+sqr+",2)";
                TxtAreaDebug.setText(equasion);
                TxtAreaOutput.setText(Display);
            }
            catch(NullPointerException ignored)
            {

            }
        }
        else
        {
            Cust_Pow customP = new Cust_Pow(new javax.swing.JFrame(), true);
            customP.setVisible(true);
            String number = customP.getjTextNumber();
            String pow = customP.getjTextPower();
            equasion = equasion + "Math.pow("+number+","+pow+")";
            pow = Super(pow);
            Display = TxtAreaOutput.getText() + number + pow;
            TxtAreaDebug.setText(equasion);
            TxtAreaOutput.setText(Display);
            shift = false;
        }
    }

    private void BtnRootActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + BtnRoot.getText() + "(";
        equasion = equasion + "Math.sqrt(";
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void BtnFractionActionPerformed(java.awt.event.ActionEvent evt) {
        if(!shift)
        {
            Fraction Fraction = new Fraction(new javax.swing.JFrame(), true);
            Fraction.setVisible(true);
            if(!Fraction.cancel())
            {
                String numerator = Fraction.getjTextField1();
                String denominator = Fraction.getjTextField2();
                if(!numerator.equals("") && !denominator.equals(""))
                {
                    equasion = equasion + "(" + numerator + "/" + denominator + ")";
                    numerator = Super(numerator);
                    denominator = Sub(denominator);
                    Display = Display + "(" + numerator + "/" + denominator + ")";
                    TxtAreaDebug.setText(equasion);
                    TxtAreaOutput.setText(Display);
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Both Boxes must be fiilled");
                }
            }
        }
        else
        {
            Mixed_Fraction MixedF = new Mixed_Fraction(new javax.swing.JFrame(), true);
            MixedF.setVisible(true);
            try
            {
                String numerator = MixedF.getjTextField1();
                String denominator = MixedF.getjTextField2();
                String whole = MixedF.getjTextField3();
                equasion = equasion + "(" + whole + "*" + "(" + numerator + "/" + denominator + "))";
                numerator = Super(numerator);
                denominator = Sub(denominator);
                Display = Display + "(" + whole + "x" + "(" + numerator + "/" + denominator + "))";
                TxtAreaDebug.setText(equasion);
                TxtAreaOutput.setText(Display);
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(rootPane, "Both Boxes must be fiilled");
            }
        }
    }

    private void BtnCubeRootActionPerformed(java.awt.event.ActionEvent evt) {
        String cubeRootStr = JOptionPane.showInputDialog(rootPane, "Cubed Root of: ");
        int cubeRootInt = Integer.parseInt(cubeRootStr);
        Display = TxtAreaOutput.getText() + Super("3") + BtnRoot.getText() + "(" + cubeRootStr + ")";
        equasion = equasion + Math.cbrt(cubeRootInt);
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void BtnCustRootActionPerformed(java.awt.event.ActionEvent evt) {
        Cust_Root Root = new Cust_Root(new javax.swing.JFrame(), true);
        Root.setVisible(true);
        if(!Root.cancel())
        {
            equasion = equasion + "Math.pow(" + Root.getjTextField2() + ", 1.0 / " + Root.getjTextField1() + ")";
            Display = Display + Super(Root.getjTextField1()) + BtnRoot.getText() +"("+ Root.getjTextField2() + ")";
            TxtAreaDebug.setText(equasion);
            TxtAreaOutput.setText(Display);
        }
    }

    private void BtnAbsoluteActionPerformed(java.awt.event.ActionEvent evt) {

        if(abs == 0)
        {
            Display = TxtAreaOutput.getText() + "|";
            equasion = equasion + "Math.abs(";
            TxtAreaDebug.setText(equasion);
            TxtAreaOutput.setText(Display);
            abs++;
        }
        else if(abs == 1)
        {
            Display = TxtAreaOutput.getText() + "|";
            equasion = equasion + ")";
            TxtAreaDebug.setText(equasion);
            TxtAreaOutput.setText(Display);
            abs--;
        }
    }

    private void BtnSettingsActionPerformed(java.awt.event.ActionEvent evt) {
        Settings Settings = new Settings(new javax.swing.JFrame(), true);
        Settings.setVisible(true);
    }

    private void BtnShiftActionPerformed(java.awt.event.ActionEvent evt) {
        shift = true;
    }

    private void BtnscienActionPerformed(java.awt.event.ActionEvent evt) {
        if(!shift)
        {
            Display = TxtAreaOutput.getText() + "x₁₀(";
            equasion = equasion + "*Math.pow(10,";
            TxtAreaDebug.setText(equasion);
            TxtAreaOutput.setText(Display);
        }
        else
        {
            Display = TxtAreaOutput.getText() + jLabel2.getText();
            equasion = equasion + "Math.PI";
            TxtAreaDebug.setText(equasion);
            TxtAreaOutput.setText(Display);
        }
    }

    private void btnAnsActionPerformed(java.awt.event.ActionEvent evt) {
        Display = TxtAreaOutput.getText() + ANS;
        equasion = equasion + ANS;
        TxtAreaDebug.setText(equasion);
        TxtAreaOutput.setText(Display);
    }

    private void BtnPreviousActionPerformed(java.awt.event.ActionEvent evt) {
        if(prev == 0)
        {
            TxtAreaDebug.setText(equal.get(prev));
            TxtAreaOutput.setText(displ.get(prev));
            prev = equal.size();
        }
        else if(prev > 0)
        {
            prev--;
            TxtAreaDebug.setText(equal.get(prev));
            TxtAreaOutput.setText(displ.get(prev));

        }
    }

    private void TxtAreaDebugActionPerformed(java.awt.event.ActionEvent evt) {
        TxtAreaOutput.setText(Display);
    }

    private void MatLenSubParActionPerformed(java.awt.event.ActionEvent evt) {
        pan="LAP";
        LengthArea window = new LengthArea();
        window.setPan(pan);
        window.setVisible(true);
        dispose();
    }

    private void MatLenSubTriActionPerformed(java.awt.event.ActionEvent evt) {
        pan="LAT";
        LengthArea window = new LengthArea();
        window.setPan(pan);
        window.setVisible(true);
        dispose();
    }

    private void BtnAbsolute1ActionPerformed(java.awt.event.ActionEvent evt) {
        displ.clear();
        equal.clear();
        TxtAreaDebug.setText("");
        TxtAreaOutput.setText("");
        equasion = "";
        Display = "";
        displ.add("0");
        equal.add("0");
        try {
            writeToFile(displ,"Display.data");
            writeToFile(equal,"equasion.data");
        } catch (IOException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        prev = equal.size();
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new Calculator().setVisible(true));
    }

    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnClose;
    private javax.swing.JButton BtnDevide;
    private javax.swing.JButton BtnDot;
    private javax.swing.JButton BtnMinus;
    private javax.swing.JButton BtnMultiply;
    private javax.swing.JButton BtnOpen;
    private javax.swing.JButton BtnPlus;
    private javax.swing.JButton BtnRoot;
    private javax.swing.JTextField TxtAreaDebug;
    private javax.swing.JTextField TxtAreaOutput;
    private javax.swing.JLabel jLabel2;
}
