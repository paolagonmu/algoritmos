/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos_2;

import static javafx.beans.binding.Bindings.select;
import javax.swing.JOptionPane;

/**
 *
 * @author sena
 */
public class formulario_vida extends javax.swing.JFrame {

    /**
     * Creates new form formulario_vida
     */
    public formulario_vida() {
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

        genero = new javax.swing.JComboBox<>();
        fuma = new javax.swing.JComboBox<>();
        bebe = new javax.swing.JComboBox<>();
        sedentario = new javax.swing.JComboBox<>();
        comida_chat = new javax.swing.JComboBox<>();
        vive_medellin = new javax.swing.JComboBox<>();
        alimenta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        edad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mujer", "hombre" }));
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });

        fuma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));
        fuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fumaActionPerformed(evt);
            }
        });

        bebe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));
        bebe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebeActionPerformed(evt);
            }
        });

        sedentario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));
        sedentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedentarioActionPerformed(evt);
            }
        });

        comida_chat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));
        comida_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comida_chatActionPerformed(evt);
            }
        });

        vive_medellin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));
        vive_medellin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vive_medellinActionPerformed(evt);
            }
        });

        alimenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));
        alimenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alimentaActionPerformed(evt);
            }
        });

        jLabel1.setText("¿eres hombre o mujer?");

        jLabel2.setText("¿fuma?");

        jLabel3.setText("¿consume licor ?");

        jLabel4.setText("¿es sedentario?");

        jLabel5.setText("¿consume comida chatarra?");

        jLabel6.setText("¿vive en medellin?");

        jLabel7.setText("¿tiene buena alimentacion?");

        jButton1.setText("calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        edad.setText("edad");

        jLabel8.setText("ingresa tu edad ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alimenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vive_medellin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comida_chat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sedentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sedentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comida_chat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vive_medellin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alimenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        String vgenero = genero.getSelectedItem().toString();

        if (vgenero.equals("mujer")) {
        } else {

        }

        if (vgenero.equals("hombre")) {
        } else {
        }
    }//GEN-LAST:event_generoActionPerformed

    private void fumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fumaActionPerformed
        String vfuma = fuma.getSelectedItem().toString();

        if (vfuma.equals("si")) {
        } else {

        }
    }//GEN-LAST:event_fumaActionPerformed

    private void bebeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebeActionPerformed
        String vbebe = bebe.getSelectedItem().toString();

        if (vbebe.equals("si")) {
        } else {

        }
    }//GEN-LAST:event_bebeActionPerformed

    private void sedentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedentarioActionPerformed
        String vsedentario = sedentario.getSelectedItem().toString();

        if (vsedentario.equals("si")) {
        } else {

        }
    }//GEN-LAST:event_sedentarioActionPerformed

    private void comida_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comida_chatActionPerformed
        String vcomida_c = comida_chat.getSelectedItem().toString();

        if (vcomida_c.equals("si")) {
        } else {

        }
    }//GEN-LAST:event_comida_chatActionPerformed

    private void vive_medellinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vive_medellinActionPerformed
        String vvive_m = vive_medellin.getSelectedItem().toString();

        if (vvive_m.equals("si")) {
        } else {

        }
    }//GEN-LAST:event_vive_medellinActionPerformed

    private void alimentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alimentaActionPerformed
        String valimenta = alimenta.getSelectedItem().toString();

        if (valimenta.equals("si")) {
        } else {

        }
    }//GEN-LAST:event_alimentaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String vgenero = genero.getSelectedItem().toString();
        
   

        if (vgenero.equals("mujer")) {
            
            double edad_m = 90;
            
            String vedad =  edad.getText();
   double n_edad = Double.parseDouble(vedad);
            String vfuma = fuma.getSelectedItem().toString();
            String vbebe = bebe.getSelectedItem().toString();
            String vsedentario = sedentario.getSelectedItem().toString();
            String vcomida_c = comida_chat.getSelectedItem().toString();
            String vvive_m = vive_medellin.getSelectedItem().toString();
            String valimenta = alimenta.getSelectedItem().toString();
            
           
            if (vcomida_c.equals("si") && vfuma.equals("si") && vbebe.equals("si") && vsedentario.equals("si")) {
                edad_m= edad_m - 25;
            } else {
                if (vsedentario.equals("si") && vfuma.equals("si") && vbebe.equals("si")) {
                    edad_m = edad_m - 18;
                } else {
                    if (vbebe.equals("si") && vfuma.equals("si")) {
                        edad_m = edad_m - 13;

                    } else {

                        if (vcomida_c.equals("si")) {
                            edad_m = edad_m - 22;
                        }
                        if (vfuma.equals("si")) {
                            edad_m = edad_m - 7;
                        }
                        if (vbebe.equals("si")) {
                            edad_m = edad_m - 6;
                        }
                        if (vsedentario.equals("si")) {
                            edad_m = edad_m - 5;
                        }
                    }
                    
                }

            }
            // JOptionPane.showMessageDialog(this, edad_hombre + "años");

            if (vvive_m.equals("si")) {
                edad_m = edad_m - (edad_m * 10 / 100);
            
                if (valimenta.equals("si")) {
                    edad_m = edad_m + 6;
                    // JOptionPane.showMessageDialog(this, edad_hombre + "años");
                } else {

                }
                  
            }
            n_edad= edad_m - n_edad;
              JOptionPane.showMessageDialog(this, "vas a vivir hasta los"+ edad_m + "años");
            JOptionPane.showMessageDialog(this,"te quedan"+ n_edad + "años");
          
            
            
            
            
            
            
          
        } else {
        }

        if (vgenero.equals("hombre")) {
            double edad_hombre = 100;
    String vedad =  edad.getText();
   double n_edad = Double.parseDouble(vedad);
            String vfuma = fuma.getSelectedItem().toString();
            String vbebe = bebe.getSelectedItem().toString();
            String vsedentario = sedentario.getSelectedItem().toString();
            String vcomida_c = comida_chat.getSelectedItem().toString();
            String vvive_m = vive_medellin.getSelectedItem().toString();
            String valimenta = alimenta.getSelectedItem().toString();

            if (vcomida_c.equals("si") && vfuma.equals("si") && vbebe.equals("si") && vsedentario.equals("si")) {
                edad_hombre = edad_hombre - 25;
            } else {
                if (vsedentario.equals("si") && vfuma.equals("si") && vbebe.equals("si")) {
                    edad_hombre = edad_hombre - 18;
                } else {
                    if (vbebe.equals("si") && vfuma.equals("si")) {
                        edad_hombre = edad_hombre - 13;

                    } else {

                        if (vcomida_c.equals("si")) {
                            edad_hombre = edad_hombre - 22;
                        }
                        if (vfuma.equals("si")) {
                            edad_hombre = edad_hombre - 7;
                        }
                        if (vbebe.equals("si")) {
                            edad_hombre = edad_hombre - 6;
                        }
                        if (vsedentario.equals("si")) {
                            edad_hombre = edad_hombre - 5;
                        }
                    }
                }

            }
            // JOptionPane.showMessageDialog(this, edad_hombre + "años");

            if (vvive_m.equals("si")) {
                edad_hombre = edad_hombre - (edad_hombre * 10 / 100);
            
                if (valimenta.equals("si")) {
                    edad_hombre = edad_hombre + 4;
                    // JOptionPane.showMessageDialog(this, edad_hombre + "años");
                } else {
                }
               
            }
            n_edad= edad_hombre - n_edad; 
            JOptionPane.showMessageDialog(this, "vas a vivir hasta los " + edad_hombre + "años");
            JOptionPane.showMessageDialog(this, "te quedan"+n_edad + "años");

        } else {
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(formulario_vida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario_vida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario_vida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario_vida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario_vida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alimenta;
    private javax.swing.JComboBox<String> bebe;
    private javax.swing.JComboBox<String> comida_chat;
    private javax.swing.JTextField edad;
    private javax.swing.JComboBox<String> fuma;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> sedentario;
    private javax.swing.JComboBox<String> vive_medellin;
    // End of variables declaration//GEN-END:variables
}
