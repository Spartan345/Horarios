/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siselector;

/**
 *
 * @author ACER 76AH
 */
public class panelazo extends javax.swing.JFrame {
    int semestre;
    int creditos;
    int clasificado;
    int acumulado[]={0,0,0,0,0,0,0,0,0,0};
    int topes[]={16,18,19,17,18,18,17,19,17,16};
    int max=0;
    int totalcred=0;

    /**
     * Creates new form panelazo
     */
    public panelazo() {
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

        boton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        boton22 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jToggleButton27 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton1.setText("MATERIA 1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("MATERIA 2");

        jToggleButton3.setText("MATERIA 3");

        jToggleButton4.setText("jToggleButton4");

        jToggleButton5.setText("jToggleButton5");

        jToggleButton6.setText("jToggleButton6");

        jToggleButton7.setText("jToggleButton7");

        jToggleButton8.setText("jToggleButton8");

        jToggleButton9.setText("jToggleButton9");

        boton22.setText("MATERIA 22");
        boton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton22ActionPerformed(evt);
            }
        });

        jToggleButton11.setText("jToggleButton11");

        jToggleButton12.setText("jToggleButton12");

        jToggleButton13.setText("jToggleButton13");

        jToggleButton14.setText("jToggleButton14");

        jToggleButton15.setText("jToggleButton15");

        jToggleButton16.setText("jToggleButton16");

        jToggleButton17.setText("jToggleButton17");

        jToggleButton18.setText("jToggleButton18");
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });

        jToggleButton19.setText("jToggleButton19");

        jToggleButton20.setText("jToggleButton20");

        jToggleButton21.setText("jToggleButton21");

        jToggleButton22.setText("jToggleButton22");

        jToggleButton23.setText("jToggleButton23");

        jToggleButton24.setText("jToggleButton24");

        jToggleButton25.setText("jToggleButton25");

        jToggleButton26.setText("jToggleButton26");

        jToggleButton27.setText("jToggleButton27");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton1)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton4)
                    .addComponent(jToggleButton5)
                    .addComponent(jToggleButton6)
                    .addComponent(jToggleButton7)
                    .addComponent(jToggleButton8)
                    .addComponent(jToggleButton9))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton22)
                    .addComponent(jToggleButton11)
                    .addComponent(jToggleButton12)
                    .addComponent(jToggleButton13)
                    .addComponent(jToggleButton14)
                    .addComponent(jToggleButton15)
                    .addComponent(jToggleButton16)
                    .addComponent(jToggleButton17)
                    .addComponent(jToggleButton18))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton27)
                    .addComponent(jToggleButton26)
                    .addComponent(jToggleButton25)
                    .addComponent(jToggleButton24)
                    .addComponent(jToggleButton23)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton22)
                        .addGap(48, 48, 48)
                        .addComponent(jButton1))
                    .addComponent(jToggleButton21)
                    .addComponent(jToggleButton20)
                    .addComponent(jToggleButton19))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton1)
                    .addComponent(boton22)
                    .addComponent(jToggleButton19))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton11)
                    .addComponent(jToggleButton20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton12)
                    .addComponent(jToggleButton21))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton4)
                    .addComponent(jToggleButton13)
                    .addComponent(jToggleButton22)
                    .addComponent(jButton1))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton5)
                    .addComponent(jToggleButton14)
                    .addComponent(jToggleButton23))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton6)
                    .addComponent(jToggleButton15)
                    .addComponent(jToggleButton24))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton7)
                    .addComponent(jToggleButton16)
                    .addComponent(jToggleButton25))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton8)
                    .addComponent(jToggleButton17)
                    .addComponent(jToggleButton26))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton9)
                    .addComponent(jToggleButton18)
                    .addComponent(jToggleButton27))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        semestre=1;
        creditos=3;
        
        if(boton1.isSelected()){
            
            acumulado[semestre-1]=creditos+acumulado[semestre-1];
        
      
        }
        else{
            acumulado[semestre-1]=acumulado[semestre-1]-creditos;
            System.out.println("SE HA DESPRESIONADO EL BOTÓN");
            
        }
        for(int i=0;i<9;i++){
                
                
                 if(acumulado[i]>max){
                   max=acumulado[i];
                   clasificado=i;
            }
            else{
                if(acumulado[i]!=0){
                   if(acumulado[i]==max){
                       max=max;
                   
                   }
              
            
            
            }

        
        }
        
        
        }/*FINAL DEL CICLO EVALUADOR DE SEMESTRES Y CLASIFICACIÓN DE ESTOS*/
        
        totalcred=acumulado[0]+acumulado[1]+acumulado[2]+acumulado[3]+acumulado[4]+acumulado[5]+acumulado[6]+acumulado[7]+acumulado[8]+acumulado[9];       
        
        if(totalcred>topes[clasificado]){
            System.out.println("ALERTA DE EXTRACREDITACIÓN ALERTA");
        }
        else{
            if(totalcred==topes[clasificado]){
                System.out.println("CREDITOS LLENOS");
            
            }
        
        
        
        }        

        //FINALMENTE AQUÍ SE COMUNICA AL USUARIO Y A TRAVÉS DE TEXTO EL SEMESTRE AL QUE QUEDA CLASIFICADO Y SU TOPE.
        System.out.println("el semestre de clasificaciones");
        System.out.println(max);
        System.out.println(clasificado+1);
        System.out.println("el total total de créditos es: "+totalcred);
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton22ActionPerformed
        // TODO add your handling code here:
        semestre=2;
        creditos=4;
        
        if(boton22.isSelected()){
           acumulado[semestre-1]=creditos+acumulado[semestre-1]; 
            
        }
        else{
            acumulado[semestre-1]=acumulado[semestre-1]-creditos;
            System.out.println("SE HA DESPRESIONADO EL BOTÓN");
        
        }
        
        
        for(int i=0;i<9;i++){
            if(acumulado[i]>max){
               max=acumulado[i];
               clasificado=i;
            }
            else{
                if(acumulado[i]!=0){
                   if(acumulado[i]==max){
                       max=max;
                   
                   }
              
            
            
            }

        
        }
        
        
        }/*FINAL DEL CICLO EVALUADOR DE SEMESTRES Y CLASIFICACIÓN DE ESTOS*/
        totalcred=acumulado[0]+acumulado[1]+acumulado[2]+acumulado[3]+acumulado[4]+acumulado[5]+acumulado[6]+acumulado[7]+acumulado[8]+acumulado[9];

        
        if(totalcred>topes[clasificado]){
            System.out.println("ALERTA DE EXTRACREDITACIÓN ALERTA");
        }
        else{
            if(totalcred==topes[clasificado]){
                System.out.println("CREDITOS LLENOS");
            
            }
        
        
        
        } 
        //FINALMENTE AQUÍ SE COMUNICA AL USUARIO Y A TRAVÉS DE TEXTO EL SEMESTRE AL QUE QUEDA CLASIFICADO Y SU TOPE.
        System.out.println("el semestre de clasificaciones");
        System.out.println(max);
        System.out.println(clasificado+1);
        System.out.println("el totatl total de créditos es: "+totalcred);
        
    }//GEN-LAST:event_boton22ActionPerformed

    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton18ActionPerformed
        //
    }//GEN-LAST:event_jToggleButton18ActionPerformed
    public static int calcular(){
        
        return 0;
    
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
            java.util.logging.Logger.getLogger(panelazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panelazo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton boton1;
    private javax.swing.JToggleButton boton22;
    private javax.swing.JButton jButton1;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    private javax.swing.JToggleButton jToggleButton27;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
