/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stage2_BranchAndBound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.round;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author LENOVO
 */
public class stage3 extends javax.swing.JFrame {
    
   public boolean validate = false ; 
    public int resultatoptimal ; 
    public ArrayList<Integer> wt  ;
     public static float score = 0 ; 
    public int sec = 0;
    public int min =0;
    public Timer time ;  
    
    DefaultListModel model2 = new DefaultListModel()  ;
    DefaultListModel model1 = new DefaultListModel()  ;

    /**
     * Creates new form stage3
     */
    public stage3() {
        initComponents();
        Home.image(jLabel9);
        time = new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             jLabel3.setText(String.valueOf(min));
               jLabel4.setText(String.valueOf(sec));
               
               if(sec==60)
        {
            sec = 0 ; 
            min ++ ; 
            if(min == 1 )
                time.stop();
            JOptionPane.showMessageDialog(null, "Time Over !! votre score 0","Attention !!!" , 2);
        
        }
               sec++; 
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 796));
        setSize(new java.awt.Dimension(1200, 700));

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Snap ITC", 1, 70)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("level 3");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 380, 100));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText(":");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 10, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 40, 30));

        jList2.setName("jListe2"); // NOI18N
        jScrollPane4.setViewportView(jList2);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 50, 300));

        jScrollPane3.setViewportView(jList1);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 50, 300));

        jButton6.setText("<<");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 48, -1));

        jButton5.setText(">>");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 48, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Valider La Reponse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 670, 260, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Score");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 280, -1));

        jButton11.setText("Home");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 720, -1, -1));

        jScrollPane1.setViewportView(jTextPane2);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 220, 190));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero piece  -  Poids");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 270, -1));

        jScrollPane5.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane5.setToolTipText("");

        jTextPane6.setBackground(new java.awt.Color(172, 67, 67,0));
        jTextPane6.setBorder(null);
        jTextPane6.setFont(new java.awt.Font("Source Code Pro Black", 1, 24)); // NOI18N
        jTextPane6.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane6.setText("Vous avez une urne et des pieces d'or chaqune ?? un poids . Vous devez remplir l'urne par le maximum de  poids d'or");
        jScrollPane5.setViewportView(jTextPane6);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 480, 150));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Documents\\NetBeansProjects\\projetProbSolv\\src\\main\\java\\images\\gold.jpg")); // NOI18N
        jLabel9.setMinimumSize(new java.awt.Dimension(1200, 796));
        jLabel9.setPreferredSize(new java.awt.Dimension(1200, 796));
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 796));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
       
        sec = 0 ;
        min = 0;
        time.start();

        // remplir la liste des entiers
        
         wt = new ArrayList<>();
        Random rd=new Random();
        String liste ="\n" ; 
        for(int i =0 ; i<10 ; i++)
        {wt.add(rd.nextInt(50)+1);
        liste +=  (i+1) +" - " + wt.get(i)+"\n"  ; 
        }
        jTextPane2.setText(liste);
         int w ; 
        do{
            w = rd.nextInt(100)+1;
        }
        while(w <= or.max(wt)*2) ; 
       int n = wt.size();
        resultatoptimal= or.Urneor(w, wt, n);
       

        for (int i= 1 ; i<= wt.size() ; i++)
            model2.addElement(i+"");
        jList2.setModel(model2);
        

        jLabel1.setText("La capacit?? de l'urne est  : "+w);
jButton1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        String n = jList1.getSelectedValue()  ;
        model2.addElement(n);
        jList2.setModel(model2);
        model1.removeElement(n);
        jList1.setModel(model1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        String n = jList2.getSelectedValue() ;
        model1.addElement(n);
        jList1.setModel(model1);
        model2.removeElement(n);
        jList2.setModel(model2);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        time.stop();

        ArrayList<Integer> proposition = new ArrayList<>();
        ArrayList<String> prop = new ArrayList<>();
         int n = model1.getSize();
         for (int i=0  ; i< n ; i++)
         {
             prop.add( model1.get(i).toString()); 
         }
         for(int i =0 ; i<prop.size() ; i++)
             proposition.add(Integer.parseInt(prop.get(i)));
         
            int sum = 0;
            for(int i = 0; i < proposition.size(); i++)
                 sum +=  wt.get(proposition.get(i)-1)   ;
            
          System.out.println("houma :" +resultatoptimal+"ena "+sum);
          System.out.println(sum == resultatoptimal);
         
        if ( sum == resultatoptimal)
        {
           score =sum *2 ; 
        }
        else 
            score = sum ; 
         
        if (score >= (resultatoptimal*80/100))
        {validate =true ; 
         JOptionPane.showMessageDialog(null, "WIN !! ","Felecitations", 1);
        }
        else 
            JOptionPane.showMessageDialog(null, "Fail , retry ","Sad For You", 3);
       
        
          jLabel2.setText("votre score est : "+score);

          
          jButton1.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Home a = new Home();
        a.show();
        this.hide();
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(stage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stage3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane6;
    // End of variables declaration//GEN-END:variables
}
