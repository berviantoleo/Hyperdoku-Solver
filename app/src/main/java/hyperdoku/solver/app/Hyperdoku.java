package hyperdoku.solver.app;

import hyperdoku.solver.utilities.HyperdokuSolver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Bervianto Leo P
 */
public class Hyperdoku extends javax.swing.JFrame {

    /**
     * Creates new form Hyperdoku
     */
    public Hyperdoku() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputField1 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        OpenButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputField = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();

        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setDialogTitle("Pecahkan Masalahmu");
        fileChooser.setFileFilter(new MyCustomFilter());
        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hyper-Sudoku Solver");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hyper-Sudoku Solver");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Input :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Hasil :");

        inputField1.setEditable(false);
        inputField1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("kali");

        jLabel5.setText("ms");

        jLabel6.setText("Waktu Eksekusi :");

        jLabel7.setText("Jumlah Assignment :");

        OpenButton.setText("Open");
        OpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenButtonActionPerformed(evt);
            }
        });

        outputField.setColumns(20);
        outputField.setRows(5);
        jScrollPane1.setViewportView(outputField);

        File.setText("File");

        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        File.add(Open);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        jMenuBar1.add(File);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(inputField1)
                                                        .addComponent(OpenButton, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel5)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputField1)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5)))
                                        .addComponent(OpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                // What to do with the file, e.g. display it in a TextArea
                inputField1.read(new FileReader(file.getAbsolutePath()), null);
                HyperdokuSolver HS = new HyperdokuSolver(9, 9);
                //Membaca File
                HS.readHyperdokuFromFile(file.getAbsolutePath());
                double start = System.currentTimeMillis();
                HS.solver();
                double end = System.currentTimeMillis();
                jTextField2.setText(String.valueOf(end - start));
                jTextField1.setText(String.valueOf(HS.assign));
                StringBuilder sb = new StringBuilder();
                int k;
                for (int i = 1; i <= HS.getNBrsEff(); i++) {
                    if ((i - 1) % 3 == 0) {
                        for (k = 1; k <= 21; k++) {
                            sb.append("-");
                        }
                        sb.append("\n");
                    }
                    for (int j = 1; j <= HS.getNKolEff(); j++) {
                        sb.append(String.valueOf(HS.getElmt(i, j)));
                        if (j == HS.getNKolEff()) {
                            sb.append("\n");
                        } else if (j % 3 == 0) {
                            sb.append(" | ");
                        } else sb.append(" ");
                    }
                }
                //Penutup
                for (k = 1; k <= 21; k++) {
                    sb.append("-");
                }
                sb.append("\n");
                outputField.setText(sb.toString());

            } catch (IOException ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_OpenActionPerformed

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_fileChooserActionPerformed

    private void OpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenButtonActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                // What to do with the file, e.g. display it in a TextArea
                inputField1.read(new FileReader(file.getAbsolutePath()), null);
                HyperdokuSolver solver = new HyperdokuSolver(9, 9);
                //Membaca File
                solver.readHyperdokuFromFile(file.getAbsolutePath());
                double start = System.currentTimeMillis();
                solver.solver();
                double end = System.currentTimeMillis();
                jTextField2.setText(String.valueOf(end - start));
                jTextField1.setText(String.valueOf(solver.assign));
                StringBuilder sb = new StringBuilder();
                int k;
                for (int i = 1; i <= solver.getNBrsEff(); i++) {
                    if ((i - 1) % 3 == 0) {
                        for (k = 1; k <= 21; k++) {
                            sb.append("-");
                        }
                        sb.append("\n");
                    }
                    for (int j = 1; j <= solver.getNKolEff(); j++) {
                        sb.append(String.valueOf(solver.getElmt(i, j)));
                        if (j == solver.getNKolEff()) {
                            sb.append("\n");
                        } else if (j % 3 == 0) {
                            sb.append(" | ");
                        } else sb.append(" ");
                    }
                }
                //Penutup
                for (k = 1; k <= 21; k++) {
                    sb.append("-");
                }
                sb.append("\n");
                outputField.setText(sb.toString());

            } catch (IOException ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_OpenButtonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Hyperdoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hyperdoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hyperdoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hyperdoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hyperdoku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    /**
     * Exit Menu Item
     */
    private javax.swing.JMenuItem Exit;
    /**
     * File Menu Item
     */
    private javax.swing.JMenu File;
    /**
     * Open Menu Item
     */
    private javax.swing.JMenuItem Open;
    /**
     * Open Button
     */
    private javax.swing.JButton OpenButton;
    /**
     * File chooser
     */
    private javax.swing.JFileChooser fileChooser;
    /**
     * Input Field
     */
    private javax.swing.JTextField inputField1;
    /**
     * Label
     */
    private javax.swing.JLabel jLabel1;
    /**
     * Label
     */
    private javax.swing.JLabel jLabel2;
    /**
     * Label
     */
    private javax.swing.JLabel jLabel3;
    /**
     * Label
     */
    private javax.swing.JLabel jLabel4;
    /**
     * Label
     */
    private javax.swing.JLabel jLabel5;
    /**
     * Label
     */
    private javax.swing.JLabel jLabel6;
    /**
     * Label
     */
    private javax.swing.JLabel jLabel7;
    /**
     * Menu Bar
     */
    private javax.swing.JMenuBar jMenuBar1;
    /**
     * Scroll Panel
     */
    private javax.swing.JScrollPane jScrollPane1;
    /**
     * Text Field
     */
    private javax.swing.JTextField jTextField1;
    /**
     * Text Field
     */
    private javax.swing.JTextField jTextField2;
    /**
     * Output Field
     */
    private javax.swing.JTextArea outputField;

    // End of variables declaration//GEN-END:variables
    class MyCustomFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
        }

        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Text documents (*.txt)";
        }
    }
}
