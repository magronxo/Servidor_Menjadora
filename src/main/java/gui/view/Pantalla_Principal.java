/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import server.machine.Menjadora;

/**
 *
 * @author oriol
 */
public class Pantalla_Principal extends javax.swing.JFrame {
    
    //ArrayList<PropertyChangeListener> listeners = new ArrayList<PropertyChangeListener>();
    
    //private Menjadora menjadoraDreta, menjadoraEsquerra;
        /**
     * Creates new form Principal
     */
    public Pantalla_Principal() {
        initComponents();
    }
    
    
    
    /*
    public Pantalla_Principal(Menjadora menjadoraDreta, Menjadora menjadoraEsquerra){
        initComponents();
        this.menjadoraDreta=menjadoraDreta;
        this.menjadoraEsquerra=menjadoraEsquerra;

    }
    
    public static Pantalla_Principal addGui(){
        return new Pantalla_Principal();
    }
    
    
    
    
    
    
    
    

        /**
     * @param args the command line arguments
     * 
     */
    public static void main(String args[]) {
        
        
        
        
        
        //Servidor_Menjadora servidor = new Servidor_Menjadora();
        
        
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
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Principal().setVisible(true);
            }
        });
        
        
        
        
        
        
        
        
        
        
        //servidor.iniciaPrograma();
        
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        horaPantalla = new javax.swing.JLabel();
        limitDiariEsquerra = new javax.swing.JLabel();
        nomMascotaEsquerra = new javax.swing.JLabel();
        diaMesHoraPantalla = new javax.swing.JLabel();
        nomMascotaDreta = new javax.swing.JLabel();
        progressBarEsquerra = new javax.swing.JProgressBar();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        raccionsEsquerra = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        limitDiariDreta = new javax.swing.JLabel();
        acumulatGramsEsquerra = new javax.swing.JLabel();
        raccionsDreta = new javax.swing.JLabel();
        acumulatRaccionsEsquerra = new javax.swing.JLabel();
        gramsRaccioEsquerra = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        acumulatRaccionsDreta = new javax.swing.JLabel();
        progressBarDreta = new javax.swing.JProgressBar();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        acumulatGramsDreta = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        nivellDipositDreta = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        gramsRaccioDreta = new javax.swing.JLabel();
        gramsPlatDreta = new javax.swing.JLabel();
        gramsPlatEsquerra = new javax.swing.JLabel();
        nivellDipositEsquerra = new javax.swing.JLabel();
        raccioExtraDreta = new javax.swing.JButton();
        raccioExtraEsquerra = new javax.swing.JButton();
        fonsPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menjadora Automàtica");
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Raccions");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 30));

        horaPantalla.setFont(new java.awt.Font("Ink Free", 1, 54)); // NOI18N
        horaPantalla.setForeground(new java.awt.Color(0, 153, 153));
        horaPantalla.setText("17:14");
        horaPantalla.setToolTipText("");
        jPanel1.add(horaPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));
        horaPantalla.getAccessibleContext().setAccessibleName("horaPantalla");

        limitDiariEsquerra.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        limitDiariEsquerra.setForeground(new java.awt.Color(0, 153, 0));
        limitDiariEsquerra.setText("200");
        limitDiariEsquerra.setToolTipText("");
        limitDiariEsquerra.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                limitDiariEsquerraPropertyChange(evt);
            }
        });
        jPanel1.add(limitDiariEsquerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, 40));
        limitDiariEsquerra.getAccessibleContext().setAccessibleName("limitDiariEsquerra");

        nomMascotaEsquerra.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        nomMascotaEsquerra.setForeground(new java.awt.Color(153, 51, 255));
        nomMascotaEsquerra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomMascotaEsquerra.setText("BONNIE");
        nomMascotaEsquerra.setToolTipText("");
        nomMascotaEsquerra.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                nomMascotaEsquerraPropertyChange(evt);
            }
        });
        jPanel1.add(nomMascotaEsquerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, -1));
        nomMascotaEsquerra.getAccessibleContext().setAccessibleName("nomMascotaEsquerra");

        diaMesHoraPantalla.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        diaMesHoraPantalla.setForeground(new java.awt.Color(0, 153, 153));
        diaMesHoraPantalla.setText("Divendres, 17 Setembre 2022");
        diaMesHoraPantalla.setToolTipText("");
        jPanel1.add(diaMesHoraPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));
        diaMesHoraPantalla.getAccessibleContext().setAccessibleName("diaMesAnyPantalla");

        nomMascotaDreta.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        nomMascotaDreta.setForeground(new java.awt.Color(255, 51, 204));
        nomMascotaDreta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomMascotaDreta.setText("CLYDE");
        nomMascotaDreta.setToolTipText("");
        nomMascotaDreta.setFocusable(false);
        nomMascotaDreta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nomMascotaDreta.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                nomMascotaDretaVetoableChange(evt);
            }
        });
        jPanel1.add(nomMascotaDreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 250, -1));
        nomMascotaDreta.getAccessibleContext().setAccessibleName("");

        progressBarEsquerra.setAutoscrolls(true);
        progressBarEsquerra.setDoubleBuffered(true);
        progressBarEsquerra.setFocusCycleRoot(true);
        progressBarEsquerra.setFocusTraversalPolicyProvider(true);
        progressBarEsquerra.setOpaque(true);
        progressBarEsquerra.setStringPainted(true);
        jPanel1.add(progressBarEsquerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 290, -1));
        progressBarEsquerra.getAccessibleContext().setAccessibleName("barAcumulatEsquerra");

        jLabel13.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("Acumulat Avui");
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Limit Diàri");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText("Limit Diàri");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, -1, 30));

        jLabel16.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("g.");
        jLabel16.setToolTipText("");
        jLabel16.setEnabled(false);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, 40));

        jLabel17.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setText("Acumulat Avui");
        jLabel17.setToolTipText("");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, -1, 30));

        raccionsEsquerra.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        raccionsEsquerra.setForeground(new java.awt.Color(0, 153, 0));
        raccionsEsquerra.setText("7");
        raccionsEsquerra.setToolTipText("");
        jPanel1.add(raccionsEsquerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, 50));
        raccionsEsquerra.getAccessibleContext().setAccessibleName("raccionsEsquerra");

        jLabel19.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 255));
        jLabel19.setText("g.");
        jLabel19.setToolTipText("");
        jLabel19.setEnabled(false);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 40));

        jLabel20.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 255));
        jLabel20.setText("g.");
        jLabel20.setToolTipText("");
        jLabel20.setEnabled(false);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, -1, 30));

        jLabel21.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText("de");
        jLabel21.setToolTipText("");
        jLabel21.setEnabled(false);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, 40));

        jLabel23.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 255));
        jLabel23.setText("g.");
        jLabel23.setToolTipText("");
        jLabel23.setEnabled(false);
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, 50));

        jLabel24.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 255));
        jLabel24.setText("g.");
        jLabel24.setToolTipText("");
        jLabel24.setEnabled(false);
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 120, -1, 30));

        limitDiariDreta.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        limitDiariDreta.setForeground(new java.awt.Color(0, 153, 0));
        limitDiariDreta.setText("200");
        limitDiariDreta.setToolTipText("");
        jPanel1.add(limitDiariDreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, -1, 30));
        limitDiariDreta.getAccessibleContext().setAccessibleName("limitDiariDreta");

        acumulatGramsEsquerra.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        acumulatGramsEsquerra.setText("200");
        acumulatGramsEsquerra.setToolTipText("");
        jPanel1.add(acumulatGramsEsquerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 60));
        acumulatGramsEsquerra.getAccessibleContext().setAccessibleName("acumulatGramsEsquerra");

        raccionsDreta.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        raccionsDreta.setForeground(new java.awt.Color(0, 153, 0));
        raccionsDreta.setText("9");
        raccionsDreta.setToolTipText("");
        jPanel1.add(raccionsDreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 240, -1, 50));
        raccionsDreta.getAccessibleContext().setAccessibleName("raccionsDreta");

        acumulatRaccionsEsquerra.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        acumulatRaccionsEsquerra.setText("2");
        acumulatRaccionsEsquerra.setToolTipText("");
        jPanel1.add(acumulatRaccionsEsquerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, 50));
        acumulatRaccionsEsquerra.getAccessibleContext().setAccessibleName("acumulatRaccionsEsquerra");

        gramsRaccioEsquerra.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        gramsRaccioEsquerra.setText("22,22");
        gramsRaccioEsquerra.setToolTipText("");
        jPanel1.add(gramsRaccioEsquerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, 70));
        gramsRaccioEsquerra.getAccessibleContext().setAccessibleName("gramsRaccioEsquerra");

        jLabel30.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 255));
        jLabel30.setText("Grams/Racció");
        jLabel30.setToolTipText("");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 30));

        acumulatRaccionsDreta.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        acumulatRaccionsDreta.setText("1");
        acumulatRaccionsDreta.setToolTipText("");
        jPanel1.add(acumulatRaccionsDreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, -1, 50));
        acumulatRaccionsDreta.getAccessibleContext().setAccessibleName("acumulatRaccionsDreta");

        progressBarDreta.setAutoscrolls(true);
        progressBarDreta.setDoubleBuffered(true);
        progressBarDreta.setOpaque(true);
        progressBarDreta.setStringPainted(true);
        jPanel1.add(progressBarDreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 290, -1));
        progressBarDreta.getAccessibleContext().setAccessibleName("barAcumulatDreta");

        jLabel33.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 255));
        jLabel33.setText("de");
        jLabel33.setToolTipText("");
        jLabel33.setEnabled(false);
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, -1, 40));

        jLabel34.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 255));
        jLabel34.setText("Raccions");
        jLabel34.setToolTipText("");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, -1, 40));

        acumulatGramsDreta.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        acumulatGramsDreta.setText("200");
        acumulatGramsDreta.setToolTipText("");
        jPanel1.add(acumulatGramsDreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, -1, 50));
        acumulatGramsDreta.getAccessibleContext().setAccessibleName("acumulatGramsDreta");

        jLabel36.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 255));
        jLabel36.setText("Grams/Racció");
        jLabel36.setToolTipText("");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, 30));

        nivellDipositDreta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nivellDipositDreta.setForeground(new java.awt.Color(51, 51, 255));
        nivellDipositDreta.setText("36,5 cm.");
        nivellDipositDreta.setToolTipText("");
        nivellDipositDreta.setName(""); // NOI18N
        jPanel1.add(nivellDipositDreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, 70));
        nivellDipositDreta.getAccessibleContext().setAccessibleName("nivellDipositDreta");

        jLabel38.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 255));
        jLabel38.setText("g.");
        jLabel38.setToolTipText("");
        jLabel38.setEnabled(false);
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, -1, 50));

        gramsRaccioDreta.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        gramsRaccioDreta.setText("22,22");
        gramsRaccioDreta.setToolTipText("");
        jPanel1.add(gramsRaccioDreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, -1, 70));

        gramsPlatDreta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        gramsPlatDreta.setForeground(new java.awt.Color(51, 51, 255));
        gramsPlatDreta.setText("16,5 g.");
        gramsPlatDreta.setToolTipText("");
        gramsPlatDreta.setName(""); // NOI18N
        jPanel1.add(gramsPlatDreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, 70));
        gramsPlatDreta.getAccessibleContext().setAccessibleName("gramsPlatDreta");

        gramsPlatEsquerra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        gramsPlatEsquerra.setForeground(new java.awt.Color(51, 51, 255));
        gramsPlatEsquerra.setText("2,6 g.");
        gramsPlatEsquerra.setToolTipText("");
        gramsPlatEsquerra.setName(""); // NOI18N
        jPanel1.add(gramsPlatEsquerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, 70));

        nivellDipositEsquerra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nivellDipositEsquerra.setForeground(new java.awt.Color(51, 51, 255));
        nivellDipositEsquerra.setText("40 cm.");
        nivellDipositEsquerra.setToolTipText("");
        nivellDipositEsquerra.setName(""); // NOI18N
        jPanel1.add(nivellDipositEsquerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, 70));

        raccioExtraDreta.setBackground(new java.awt.Color(255, 153, 204));
        raccioExtraDreta.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        raccioExtraDreta.setText("RACCIÓ EXTRA");
        raccioExtraDreta.setActionCommand("RACCIÓ\nEXTRA");
        raccioExtraDreta.setAutoscrolls(true);
        raccioExtraDreta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 153), 3, true));
        raccioExtraDreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raccioExtraDretaActionPerformed(evt);
            }
        });
        jPanel1.add(raccioExtraDreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 120, 60));
        raccioExtraDreta.getAccessibleContext().setAccessibleName("raccioExtraDreta");

        raccioExtraEsquerra.setBackground(new java.awt.Color(153, 153, 255));
        raccioExtraEsquerra.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        raccioExtraEsquerra.setText("RACCIÓ EXTRA");
        raccioExtraEsquerra.setActionCommand("RACCIÓ\nEXTRA");
        raccioExtraEsquerra.setAutoscrolls(true);
        raccioExtraEsquerra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 255), 3, true));
        raccioExtraEsquerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raccioExtraEsquerraActionPerformed(evt);
            }
        });
        jPanel1.add(raccioExtraEsquerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 120, 60));
        raccioExtraEsquerra.getAccessibleContext().setAccessibleName("raccioExtraEsquerra");

        fonsPantalla.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oriol\\Documents\\NetBeansProjects\\Servidor_Menjadora\\src\\main\\java\\gui\\view\\images\\Ensamblatge54projecte.JPG")); // NOI18N
        fonsPantalla.setAlignmentY(0.0F);
        fonsPantalla.setAutoscrolls(true);
        fonsPantalla.setFocusable(false);
        fonsPantalla.setName(""); // NOI18N
        fonsPantalla.setOpaque(true);
        fonsPantalla.setRequestFocusEnabled(false);
        fonsPantalla.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fonsPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1050, 730));
        fonsPantalla.getAccessibleContext().setAccessibleName("imatge_fons_principal");

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void raccioExtraDretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raccioExtraDretaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raccioExtraDretaActionPerformed

    private void raccioExtraEsquerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raccioExtraEsquerraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raccioExtraEsquerraActionPerformed

    private void limitDiariEsquerraPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_limitDiariEsquerraPropertyChange
        // TODO add your handling code here:       
    }//GEN-LAST:event_limitDiariEsquerraPropertyChange

    private void nomMascotaEsquerraPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_nomMascotaEsquerraPropertyChange
        // TODO add your handling code here:
        //nomMascotaEsquerra.setText(this.menjadoraEsquerra.getMascota().getNom());
    }//GEN-LAST:event_nomMascotaEsquerraPropertyChange

    private void nomMascotaDretaVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_nomMascotaDretaVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_nomMascotaDretaVetoableChange

    
    
    
        //ACCESSORS
    
    //GETTERS
    public JLabel getAcumulatGramsDreta() {
        return acumulatGramsDreta;
    }

    public JLabel getAcumulatGramsEsquerra() {
        return acumulatGramsEsquerra;
    }

    public JLabel getAcumulatRaccionsDreta() {
        return acumulatRaccionsDreta;
    }

    public JLabel getAcumulatRaccionsEsquerra() {
        return acumulatRaccionsEsquerra;
    }

    public JLabel getDiaMesHoraPantalla() {
        return diaMesHoraPantalla;
    }

    public JLabel getGramsPlatDreta() {
        return gramsPlatDreta;
    }

    public JLabel getGramsPlatEsquerra() {
        return gramsPlatEsquerra;
    }

    public JLabel getGramsRaccioDreta() {
        return gramsRaccioDreta;
    }

    public JLabel getGramsRaccioEsquerra() {
        return gramsRaccioEsquerra;
    }

    public JLabel getHoraPantalla() {
        return horaPantalla;
    }

    public JLabel getLimitDiariDreta() {
        return limitDiariDreta;
    }

    public JLabel getLimitDiariEsquerra() {
        return limitDiariEsquerra;
    }

    public JLabel getNivellDipositDreta() {
        return nivellDipositDreta;
    }

    public JLabel getNivellDipositEsquerra() {
        return nivellDipositEsquerra;
    }

    public JLabel getNomMascotaDreta() {
        return nomMascotaDreta;
    }

    public JLabel getNomMascotaEsquerra() {
        return nomMascotaEsquerra;
    }

    public JProgressBar getProgressBarDreta() {
        return progressBarDreta;
    }

    public JProgressBar getProgressBarEsquerra() {
        return progressBarEsquerra;
    }

    public JButton getRaccioExtraDreta() {
        return raccioExtraDreta;
    }

    public JButton getRaccioExtraEsquerra() {
        return raccioExtraEsquerra;
    }

    public JLabel getRaccionsDreta() {
        return raccionsDreta;
    }

    public JLabel getRaccionsEsquerra() {
        return raccionsEsquerra;
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel acumulatGramsDreta;
    public javax.swing.JLabel acumulatGramsEsquerra;
    public javax.swing.JLabel acumulatRaccionsDreta;
    public javax.swing.JLabel acumulatRaccionsEsquerra;
    public javax.swing.JLabel diaMesHoraPantalla;
    private javax.swing.JLabel fonsPantalla;
    public javax.swing.JLabel gramsPlatDreta;
    public javax.swing.JLabel gramsPlatEsquerra;
    public javax.swing.JLabel gramsRaccioDreta;
    public javax.swing.JLabel gramsRaccioEsquerra;
    public javax.swing.JLabel horaPantalla;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel limitDiariDreta;
    public javax.swing.JLabel limitDiariEsquerra;
    public javax.swing.JLabel nivellDipositDreta;
    public javax.swing.JLabel nivellDipositEsquerra;
    public javax.swing.JLabel nomMascotaDreta;
    public javax.swing.JLabel nomMascotaEsquerra;
    public javax.swing.JProgressBar progressBarDreta;
    public javax.swing.JProgressBar progressBarEsquerra;
    public javax.swing.JButton raccioExtraDreta;
    public javax.swing.JButton raccioExtraEsquerra;
    public javax.swing.JLabel raccionsDreta;
    public javax.swing.JLabel raccionsEsquerra;
    // End of variables declaration//GEN-END:variables
}
