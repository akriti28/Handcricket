/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handcricket;

/**
 *
 * @author MAHE
 */
public class Batting extends javax.swing.JFrame {
int overn,computerscore;
int balls;
String usersco,compsco;
int users,comps;
int score=0,i=0;
    /**
     * Creates new form Batting
     */
    public Batting() {
        initComponents();
    }
    public Batting(int overn){
        initComponents();
        this.overn=overn;
        balls=(6*overn);
    }
    public Batting(int computerscore,int balls){
        initComponents();
        this.computerscore=computerscore;
        this.balls=balls;
        jLabel8.setText(Integer.toString(computerscore));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userscore = new javax.swing.JTextField();
        scorebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        compscore = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arabic Typesetting", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("You are batting");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 40, 270, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 255));
        jLabel3.setText("Enter numbers between 1-6 and press Score");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 160, 420, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 230, 150, 70);

        userscore.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        userscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userscoreActionPerformed(evt);
            }
        });
        getContentPane().add(userscore);
        userscore.setBounds(70, 90, 140, 60);

        scorebtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        scorebtn.setForeground(new java.awt.Color(102, 0, 102));
        scorebtn.setText("Score");
        scorebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scorebtnActionPerformed(evt);
            }
        });
        getContentPane().add(scorebtn);
        scorebtn.setBounds(250, 380, 157, 47);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Computer's bowling");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 40, 250, 37);

        compscore.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        compscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compscoreActionPerformed(evt);
            }
        });
        getContentPane().add(compscore);
        compscore.setBounds(440, 80, 130, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Your Score:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 240, 230, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Comp Score:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 310, 260, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("0");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(340, 310, 120, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 190, 530, 40);

        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(446, 409, 150, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/handcricket/AACC.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 30, 690, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

@SuppressWarnings("empty-statement")
    private void scorebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scorebtnActionPerformed
         usersco=userscore.getText();
         users=Integer.parseInt(usersco);
        
     if(users>=1 && users<=6)
     {
          comps=(int)(Math.random()*6+1);
         compsco=Integer.toString(comps);
         compscore.setText(compsco);
         score=score+users;
         if(comps!=users){
             jLabel4.setText(Integer.toString(score));
            if(computerscore!=0){
                 if(score>computerscore){
                     jLabel10.setText("You won the match!");
                 }
                    
            }
         }
         else if(comps==users){
             jLabel4.setText(Integer.toString(score-users));
             jLabel10.setText("You Got Out!!");
             if(computerscore==0){
             for(int j=0;j<3000;j++);
             Bowling bowling=new Bowling(score-users,balls);
             bowling.setVisible(true); 
             }
             else if(computerscore!=0){
                 if(computerscore>score){
                     jLabel10.setText("Computer won the match!");
                 }else{
                     jLabel10.setText("You have won the match!");
                 }
             }
            
           }
         else if(i==balls){
             jLabel4.setText(Integer.toString(score));
             if (computerscore==0) 
             {
             jLabel10.setText("Your Innings is over! Time to change sides!");}
             else {jLabel10.setText("You have lost the match");}
             for(int j=0;j<13000;j++);
             Bowling bowling=new Bowling(score,balls);
             bowling.setVisible(true);
         }
        
         userscore.setText("");
     }
       else { jLabel9.setText("Error, please try again"); userscore.setText(""); jLabel9.setText(""); 
     
     
    i=i+1;
}
         
    }//GEN-LAST:event_scorebtnActionPerformed
   
    private void userscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userscoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userscoreActionPerformed

    private void compscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compscoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compscoreActionPerformed
           
 
    private static class jLabel8 {

        private static void setText(String toString) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jLabel8() {
        }
    }
    

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
            java.util.logging.Logger.getLogger(Batting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batting().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField compscore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton scorebtn;
    private javax.swing.JTextField userscore;
    // End of variables declaration//GEN-END:variables

}

