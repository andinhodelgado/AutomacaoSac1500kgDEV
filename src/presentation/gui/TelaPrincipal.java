/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaPrincipal.java
 *
 * Created on 31/10/2011, 09:39:18
 */
package presentation.gui;

import business.bo.ManipPes2Ensac1200BO;
import business.bo.PingarIp2Ensac1200;
import business.bo.PingarIpBalanca1;
import business.bo.PingarIpBalanca2;
import business.bo.PingarIpBalanca3;
import business.to.PesagemEsteira;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import connection.tcp.ConnTCP2Ensac1200;

/**
 *
 * @author Administrador
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private DefaultTableModel modeloTabela = null;
    
    private boolean respPing1 = false;
    private boolean conecSocket1 = false;
    
    private boolean respPing2 = false;
    private boolean conecSocket2 = false;
    
    private boolean respPing3 = false;
    private boolean conecSocket3 = false;
    
    private double contador = 0;
    private DecimalFormat formato = new DecimalFormat("#");
    
    /** Creates new form TelaPrincipal */
    public TelaPrincipal() {
        initComponents();
        
//        facadeBO = new FacadeBO(this);

        jTablePesagem.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTablePesagem.getColumnModel().getColumn(1).setPreferredWidth(150); 
        jTablePesagem.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTablePesagem.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTablePesagem.getColumnModel().getColumn(4).setPreferredWidth(300);

        modeloTabela = (DefaultTableModel) jTablePesagem.getModel();
        
//        this.teste();
        
        ConnTCP2Ensac1200 connTCP2Ensac1200 = new ConnTCP2Ensac1200(this);
        connTCP2Ensac1200.start();
        
        //PingarIp2Ensac1200 pingarIp2Ensac1200 = new PingarIp2Ensac1200(this);
        //pingarIp2Ensac1200.start();

//        ManipPes2Ensac1200BO manipPes2Ensac1200BO = new ManipPes2Ensac1200BO(this);
//        manipPes2Ensac1200BO.manipulandoStringPes("030;00;  1206.2kg;11/06/2018;10:32:20;");
        
//        PingarIp2Ensac1200 pingarIp2Ensac1200 = new PingarIp2Ensac1200(this);
//        pingarIp2Ensac1200.start();
        
//        PingarIpBalanca1 pingarIp1 = new PingarIpBalanca1(this);
//        pingarIp1.start();
//
//        PingarIpBalanca2 pingarIp2 = new PingarIpBalanca2(this);
//        pingarIp2.start();
//        
//        PingarIpBalanca3 pingarIp3 = new PingarIpBalanca3(this);
//        pingarIp3.start();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesagem = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabelContador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PESAGEM DE ENSADEIRAS");

        jTablePesagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALANCA", "CACAMBA", "NUM. ID SACO", "PESO LIQ.", "DATA HORA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePesagem);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("ZERAR");
        jButton1.setActionCommand("jButtonZerar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelContador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelContador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelContador.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelContador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabelContador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        contador = 0;
        jLabelContador.setText(formato.format(contador));
        
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelContador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePesagem;
    // End of variables declaration//GEN-END:variables

    
    public boolean isRespPing1() {
        return respPing1;
    }

    public void setRespPing1(boolean respPing1) {
        this.respPing1 = respPing1;
    }

    public boolean isConecSocket1() {
        return conecSocket1;
    }

    public void setConecSocket1(boolean conecSocket1) {
        this.conecSocket1 = conecSocket1;
    }

    public boolean isRespPing2() {
        return respPing2;
    }

    public void setRespPing2(boolean respPing2) {
        this.respPing2 = respPing2;
    }

    public boolean isConecSocket2() {
        return conecSocket2;
    }

    public void setConecSocket2(boolean conecSocket2) {
        this.conecSocket2 = conecSocket2;
    }

    public boolean isRespPing3() {
        return respPing3;
    }

    public void setRespPing3(boolean respPing3) {
        this.respPing3 = respPing3;
    }

    public boolean isConecSocket3() {
        return conecSocket3;
    }

    public void setConecSocket3(boolean conecSocket3) {
        this.conecSocket3 = conecSocket3;
    }
    
    public void mostrarTela(PesagemEsteira pesEsteira){
        String[] dados = new String [7];

        int cacamba = Integer.parseInt(pesEsteira.getNumBalanca());
            
        switch (cacamba) {
            case 1:
                dados[0] = "1";
                dados[1] = "1";
                break;
            case 2:
                dados[0] = "1";
                dados[1] = "2";
                break;
            case 4:
                dados[0] = "2";
                dados[1] = "1";
                break;
            case 5:
                dados[0] = "2";
                dados[1] = "2";
                break;
            case 6:
                dados[0] = "3";
                dados[1] = "1";
                break;
            case 7:
                dados[0] = "3";
                dados[1] = "2";
                break;
            default:
                dados[0] = "0";
                dados[1] = "0";
                break;
        }
              
//        dados[0] = "0";
//        dados[1] = pesEsteira.getNumBalanca();
        dados[2] = pesEsteira.getNumIDSaco();
        dados[3] = pesEsteira.getPesoLiq();
        dados[4] = pesEsteira.getData() + " " + pesEsteira.getHora();

        modeloTabela.insertRow(0, dados);

        if(modeloTabela.getRowCount() == 30){
            modeloTabela.removeRow(29);
        }

        contador = contador + 1;

        jLabelContador.setText(formato.format(contador));

        pack();
    }

    public void teste(){
        

        
    }
    
}
