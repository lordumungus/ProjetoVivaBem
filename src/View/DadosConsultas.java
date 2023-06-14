/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class DadosConsultas extends javax.swing.JFrame {

    /**
     * Creates new form DadosMedicos
     */
    public DadosConsultas() {
        initComponents();
        setIcon();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        PainelMedicos = new javax.swing.JTextPane();
        btVoltar = new javax.swing.JButton();
        ShowMedicos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VivaBem");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(PainelMedicos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 390, 500));

        btVoltar.setBackground(new java.awt.Color(175, 217, 159));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 130, 30));

        ShowMedicos.setBackground(new java.awt.Color(175, 217, 159));
        ShowMedicos.setText("Consultas");
        ShowMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowMedicosActionPerformed(evt);
            }
        });
        jPanel1.add(ShowMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 130, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/VivaBem.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 0, 630, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/consulta-online (1).png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -20, 130, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowMedicosActionPerformed
   String dados = "";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera", "root", "");
        Statement stm = con.createStatement();
        ResultSet res = stm.executeQuery("SELECT * FROM tabela_consultas ORDER BY STR_TO_DATE(data_formatada, '%d/%m/%Y')");
        while (res.next()) {
            dados += "\nNOME PACIENTE: " + res.getString("nome");
            dados += "\nNOME MÉDICO: " + res.getString("nome_medico");
            dados += "\nDATA: " + res.getString("data_formatada");
            dados += "\nHORÁRIO: " + res.getString("horario");
            dados += "\nDESCRIÇÃO: " + res.getString("descricao");
            dados += "\n-----------------------------------------";
        }
        PainelMedicos.setText(dados);
    } catch (ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }         // TODO add your handling code here:
    }//GEN-LAST:event_ShowMedicosActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane PainelMedicos;
    private javax.swing.JButton ShowMedicos;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        URL url = this.getClass().getResource("/Imagens/heart.png");
         Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
         this.setIconImage(imgTitulo);
    }
}