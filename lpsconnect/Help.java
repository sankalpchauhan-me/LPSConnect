/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lpsconnect;

/**
 *
 * @author Sankalp
 */
public class Help extends javax.swing.JFrame {

    /**
     * Creates new form Help
     */
    public Help() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Contact = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        faq = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        incompatible = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        notrun = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        forgot = new javax.swing.JTabbedPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help Page");
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.background"));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Currently we are working on our systems to get\nyou online support you can contact us on\nwww.ufco.webs.com\nor,\nufcorganization@gmail.com\nFor Developer-\nsnklpchauhan841@gmail.com\n");
        jScrollPane1.setViewportView(jTextArea2);

        Contact.addTab("Welcome", jScrollPane1);

        jTabbedPane1.addTab("Contact Us", Contact);

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("Waiting for htttp//www.ufco.webs.com\nFailed To Connect..........\nRetry Failed!!");
        jScrollPane4.setViewportView(jTextArea5);

        faq.addTab("Error 404", jScrollPane4);

        jTabbedPane1.addTab("Faq's", faq);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("This app is platform independent. If this issue\nis raising then your computer is missing JRE\n(Java Runtime Enviornment). Download it from \nsunmicrosystem's website or just contact your\nseller");
        jScrollPane3.setViewportView(jTextArea4);

        incompatible.addTab("Error 104", jScrollPane3);

        jTabbedPane1.addTab("Incompatible", incompatible);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("This app works on java ensure that you have\njava and mysql installed. If not download it\nfrom the net or just email us we will give you\nthe link. ");
        jScrollPane2.setViewportView(jTextArea3);

        notrun.addTab("Error 204", jScrollPane2);

        jTabbedPane1.addTab("Not Running", notrun);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Contact Us we will give you your new password\nto reset.");
        forgot.addTab("Error 504", jTextArea1);

        jTabbedPane1.addTab("Forgot Password", forgot);

        jMenu3.setText("Options");

        jMenuItem1.setText("Back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Help().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Contact;
    private javax.swing.JTabbedPane faq;
    private javax.swing.JTabbedPane forgot;
    private javax.swing.JTabbedPane incompatible;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTabbedPane notrun;
    // End of variables declaration//GEN-END:variables
}
