/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stage2_BranchAndBound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author LENOVO
 */
public class stage1_easy extends javax.swing.JFrame {
    
     
    public int sec = 0;
    public int min =0;
    public Timer time ;  
    public static ArrayList<ArrayList<Integer> > ans ; 
    public static ArrayList<ArrayList<Integer> > ans_user = new ArrayList<>() ; 
    DefaultListModel model2 = new DefaultListModel()  ;
    DefaultListModel model1 = new DefaultListModel()  ;
    
    /**
     * Creates new form stage1_easy
     */
    public stage1_easy() {
        initComponents();
       // Home.image(jLabel9);
        time = new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {  
             jLabel3.setText(String.valueOf(min));
             jLabel4.setText(String.valueOf(sec));
             if(sec==60)
                {
                    sec = 0 ; 
                    min ++ ; 
                }
                if(min == 1 )
                    {
                        time.stop();
                        JOptionPane.showMessageDialog(null, "Time Over !! votre score 0","Attention !!!" , 2);
                    }
             sec++; 
            }
        });
    }
    
    public void initialiser()
    {
        ans_user = new ArrayList<>() ; 
        ans = new ArrayList<>();
        model1.clear();
        model2.clear();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 796));
        setMinimumSize(new java.awt.Dimension(1200, 796));
        setPreferredSize(new java.awt.Dimension(1200, 796));
        setSize(new java.awt.Dimension(1200, 796));

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(1200, 796));
        jPanel4.setPreferredSize(new java.awt.Dimension(1200, 796));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Snap ITC", 1, 110)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 102));
        jLabel7.setText("level 1");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 540, 200));

        jScrollPane2.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane2.setToolTipText("");

        jTextPane1.setBackground(new java.awt.Color(172, 67, 67,0));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Source Code Pro Light", 0, 18)); // NOI18N
        jTextPane1.setText("Vous Avez une liste des Entiers Positifs , et une Somme . Vous devez pressisez  toutes les combinaisons possibles pour fomrmer cette somme . chaque combinaison fausse coute -5% ! Vous avez 1 min pour choisir . Emjoy !!");
        jScrollPane2.setViewportView(jTextPane1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 830, 110));

        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 19, 18));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText(":");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 10, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 20, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("La Somme à Combiner est : ");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 227, -1));

        jList2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jList2.setName("jListe2"); // NOI18N
        jScrollPane4.setViewportView(jList2);
        jList2.getAccessibleContext().setAccessibleName("");

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 80, 330));

        jList1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jScrollPane3.setViewportView(jList1);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 70, 320));

        jButton6.setText("<<");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 48, -1));

        jButton5.setText(">>");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 48, -1));

        jButton3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton3.setText("Ajouter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 90, -1));

        jButton4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton4.setText("Supprimer");
        jButton4.setName(""); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 120, -1));

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton1.setText("Valider Toutes Les Reponses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 260, 60));

        jLabel2.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("jLabel2");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 610, 100));

        jButton11.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton11.setText("Home");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 660, 100, 30));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 190, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Home a = new Home();
        a.show();
        this.hide();
    }//GEN-LAST:event_jButton11ActionPerformed
public boolean eguale(ArrayList<ArrayList<Integer> > system ,ArrayList<ArrayList<Integer> > user )
{
    boolean equal = true ;
    int i=0 ; 
    if(system.size()!= user.size())
        equal =false ; 
    else 
    {
        while ((i<system.size()) && equal)
        {
            int j = 0  ; 
            boolean all =false  ; 
            while((j<user.size()) && !all)
            {
                if(user.get(j).containsAll(system.get(i)) && user.get(j).size() == system.get(i).size() )
                    all= true ; 
                else 
                    j++ ; 
            }
            equal = all ;
            i++ ;
        }
    }
    
    return equal ;
}

public boolean equal (ArrayList<Integer> system , ArrayList<Integer> user)
{
    boolean equal = true ; 
    if(system.size()!= user.size())
        equal = false ; 
   
    return equal ;
}
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
	   time.stop();  
           jButton1.setVisible(false);
           
           System.out.println(eguale(ans, ans_user));
	    	
                int juste =0;//= ans_user.size()-nb_5 ; 
                int nb_5 = 0 ; 
              for (int i =0 ; i<ans.size() ; i++)
              {
                  Collections.sort(ans.get(i));
              }
              for (int i =0 ; i<ans_user.size() ; i++)
              {
                  Collections.sort(ans_user.get(i));
              }
	      
              if(eguale(ans , ans_user) || (ans.isEmpty() && ans_user.isEmpty()))
              {
                  stage1.score = 100 ; 
              }
              else
              {
                  if(ans.isEmpty() && !ans_user.isEmpty())
                      stage1.score = 0 ; 
                  else {
                  for (int i = 0 ; i<ans_user.size() ; i++)
                  {
                       int j = 0  ; 
                        boolean all =false  ; 
                             while((j<ans.size()) && !all)
                             {
                                 if(ans.get(j).equals(ans_user.get(i))  && ans.get(j).size() == ans_user.get(i).size() )
                                     
                                 {
                                     
                                     all= true ; 
                                 juste++ ; 
                                     
                                 }
                                else 
                                 { j++ ; 
                                 
                                 }
                                }
                             if (!all)
                                 nb_5++ ; 
                  }
                  int total = ans.size();
                  
                  
                     
                  stage1.score = ( (juste *100)/total) ; 
                  stage1.score -= (stage1.score*5/100 )*nb_5 ; 
                      System.out.println("fausse "+nb_5+"  total "+total +"  tt juste "+ans_user.size()+"  juste "+juste+"  score "+stage1.score);
                   System.out.println(nb_5);
                  }
              }
               jLabel2.setText("votre score est : "+stage1.score);
               
               jComboBox1.removeAllItems();
                
	
	 
	/* ArrayList<Integer> proposition = new ArrayList<>();
	 for (int i=1;i<=n;i++)
	 {
		 System.out.println("donner le nombre a ajouter dans l'ensemmble ");
		 int nb = s.nextInt();
		 
		 proposition.add(nb);
	 }
	System.out.println(proposition);
	
	        // If result is empty, then
	        if (ans.size() == 0) {
	            System.out.println("Empty");
	            return;
	        }
	 
	        // print all combinations stored in ans
	 
	        for (int i = 0; i < ans.size(); i++) {
	        
	 
	            System.out.print("(");
	            for (int j = 0; j < ans.get(i).size(); j++) {
	            	
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.print(") ");
	        	
	            if (ans.get(i).equals(proposition))
	            	
            	{ 
	            	nb1 = nb1+1;
	            	}
	         
	        } System.out.println((nb1/ans.size())*100+"%");*/
	   
        System.out.println("shih : "+ans+ " ena : "+ans_user);
	       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.out.println(stage1.niveau) ; 
        initialiser();
        sec = 0 ; 
        min = 0;
        time.start();
        
         // remplir la liste des entiers
        	    	Scanner s = new Scanner (System.in);
	        ArrayList<Integer> arr = new ArrayList<>();
                Random rd=new Random();
                for(int i =0 ; i<stage1.niveau ; i++)
                    arr.add(rd.nextInt(10)+1);
	       
	        int sum = rd.nextInt(15)+1;
                
	        int score=0;
	        int nb1 =0;
	        int taille=0;
                
               ans = backtracking.combinationSum(arr, sum);  
                
                
	        System.out.println("voici la liste des entiers "+ arr );
                
                 for (int i= 0 ; i< arr.size() ; i++)
                    model2.addElement(arr.get(i)+"");
                jList2.setModel(model2);
                
                jLabel1.setText("La Somme à Combiner est : "+sum);
        
           jButton1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ArrayList<Integer> temp = new ArrayList<>();
       for (int i=0 ; i<model1.getSize() ; i++)
       {
           temp.add(Integer.parseInt((String) model1.get(i)));
            String n = model1.get(i).toString() ;
        model2.addElement(n);
        jList2.setModel(model2);
        
       }
       ans_user.add(temp) ; 
        System.out.println(ans_user);
       jComboBox1.addItem(temp.toString());
       model1.removeAllElements();
       
    
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       // jComboBox1.remove(jComboBox1.getSelectedIndex());
        jComboBox1.removeItem(jComboBox1.getSelectedItem());
       // ans_user.indexOf(jComboBox1.getSelectedItem());
        ans_user.remove(ans_user.indexOf(jComboBox1.getSelectedItem()));
        System.out.println(ans_user);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(stage1_easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stage1_easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stage1_easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stage1_easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stage1_easy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}