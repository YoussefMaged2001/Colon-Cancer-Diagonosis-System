
package colon.cancer.diagnosis.system.GUI;

import static colon.cancer.diagnosis.system.ColonCancerDiagnosisSystem.Program;
import colon.cancer.diagnosis.system.Singleton;
import static colon.cancer.diagnosis.system.Singleton.patients;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class AddInfo extends javax.swing.JPanel {

    public AddInfo() {
        setOpaque(false);
        initComponents();
        Age1_txt.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        Gender1_txt.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        ID1_txt.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        Name1_txt.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jButton1.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jButton2.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jButton1.setFocusable(false);
        jButton2.setFocusable(false);
        jLabel1.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jLabel2.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jLabel3.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jLabel4.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jLabel5.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        
        Age1_txt.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        Gender1_txt.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        ID1_txt.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        Name1_txt.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
    
        ImageIcon submitIcon = new ImageIcon("Icons\\submit.png");
        Image submitImg = submitIcon.getImage();
        Image resizedSubmitImg = submitImg.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        submitIcon = new ImageIcon(resizedSubmitImg);
        
        ImageIcon backIcon = new ImageIcon("Icons\\back.png");
        Image backImg = backIcon.getImage();
        Image resizedBackImg = backImg.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        backIcon = new ImageIcon(resizedBackImg);
        
        jButton1.setIcon(submitIcon);
        jButton2.setIcon(backIcon);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ID1_txt = new javax.swing.JTextField();
        Name1_txt = new javax.swing.JTextField();
        Gender1_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Age1_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("           Add Patient Info");

        jLabel2.setText("Patient ID");

        jLabel3.setText("Patient Age");

        jLabel4.setText("Patient Name");

        jLabel5.setText("Patient Gender");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(ID1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gender1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Age1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Age1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int i=Integer.parseInt(ID1_txt.getText());
                System.out.println(i);

        if( i <= Singleton.getPatientsNum()) 
        {
        patients[i-1].setName(Name1_txt.getText());
        patients[i-1].setAge(Integer.parseInt(Age1_txt.getText()));
        patients[i-1].setGender(Gender1_txt.getText().charAt(0));
        JOptionPane.showMessageDialog(this, "Submitted", "Submitted Successfully", JOptionPane.NO_OPTION);
        ID1_txt.setText("");
            Name1_txt.setText("");
            Age1_txt.setText("");
            Gender1_txt.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

        else 
        {
            JOptionPane.showMessageDialog(this, "Wrong ID", "Alert", JOptionPane.WARNING_MESSAGE);
            ID1_txt.setText("");
            Name1_txt.setText("");
            Age1_txt.setText("");
            Gender1_txt.setText("");
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age1_txt;
    private javax.swing.JTextField Gender1_txt;
    public javax.swing.JTextField ID1_txt;
    private javax.swing.JTextField Name1_txt;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
