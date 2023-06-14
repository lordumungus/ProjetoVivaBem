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
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CadastroDeProfissionais extends javax.swing.JFrame {
    
    public String nome, endereco, data, cpf, telefone, crm, email, senha;
    public String senhaconf;

    /**
     * Creates new form CadastroDeProfissionais
     */
    public CadastroDeProfissionais() {
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

        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoRepetSenha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoCrm = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btCadastro = new javax.swing.JButton();
        campoCpf = new javax.swing.JFormattedTextField();
        CampoData = new javax.swing.JFormattedTextField();
        campoTelefone = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VivaBem");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nome completo: *");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, -1));

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 340, -1));

        jLabel3.setText("CPF: * ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel4.setText("Endereço: *");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        campoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(campoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 340, -1));

        jLabel5.setText("Dada de nascimento: *");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel6.setText("Telefone: *");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 340, -1));

        jLabel7.setText("E-mail: *");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 340, -1));

        jLabel8.setText("Senha: *");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));
        getContentPane().add(campoRepetSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 340, -1));

        jLabel9.setText("Repita a senha: *");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));
        getContentPane().add(campoCrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 340, -1));

        jLabel10.setText("CRM : *");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 100, 30));

        btCadastro.setText("Cadastrar");
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, 100, 30));

        try {
            campoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(campoCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 340, -1));

        try {
            CampoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(CampoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 120, -1));

        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Cadastro de Novo Médico");
        jLabel11.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastro de Profissionais2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void campoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoActionPerformed

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        nome = campoNome.getText();
        if (!nome.matches("[a-zA-ZãÃ.éÉõçíóúéÍÉÓÚ ' ']+")) {
JOptionPane.showMessageDialog(null, "O nome deve conter apenas letras.", "Erro", JOptionPane.ERROR_MESSAGE);
return;
        }       
        cpf = campoCpf.getText();
        if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
JOptionPane.showMessageDialog(null, "O campo CPF deve ser Preenchido", "Erro", JOptionPane.ERROR_MESSAGE);
return;
        }
	endereco = campoEndereco.getText();
        if (!endereco.matches("[a-zA-ZãÃ.éÉõç ' '0123456789°,]+")) {
JOptionPane.showMessageDialog(null, "O Campo endereço deve ser Preenchido.", "Erro", JOptionPane.ERROR_MESSAGE);
return;}
        data = CampoData.getText();
        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
JOptionPane.showMessageDialog(null, "A data deve ser preenchida", "Erro", JOptionPane.ERROR_MESSAGE);
return;
        }
	telefone = campoTelefone.getText();       
        crm = campoCrm.getText();        
	email = campoEmail.getText();        
        senha =campoSenha.getText();
        senhaconf = campoRepetSenha.getText();
	View.CaixaDeAviso aviso = new CaixaDeAviso();
         
        if(senha.equals("")|| cpf.equals("")||email.equals("")){
        JOptionPane.showMessageDialog(null, "Campo Senha em Branco");
        }
        else if(campoRepetSenha.getText() == null ? campoSenha.getText() != null : !campoRepetSenha.getText().equals(campoSenha.getText())){
                            JOptionPane.showMessageDialog(null, "Campo SENHA e REPITA A SENHA estão Diferentes!");
                }
        else{	
            
	try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera", "root", "");
            Statement stm = con.createStatement();
    
        if (stm.executeUpdate("INSERT INTO cadastro_medico (nome, cpf, endereco, data_de_nascimento, telefone, crm, email, senha) VALUES ('" + nome + "','" + cpf + "','" + endereco + "','" + data + "','" + telefone + "','" + crm + "','" + email + "','" + senha + "')") != 0) {
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        campoNome.setText("");
        campoCpf.setText("");
        CampoData.setText("");
        campoEndereco.setText("");
        campoCrm.getText();
        campoTelefone.setText("");
        campoEmail.setText("");
        campoSenha.setText("");
        campoRepetSenha.setText("");
    } 
        else {
        JOptionPane.showMessageDialog(null, "Erro para realizar o cadastro!!!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}       catch (ClassNotFoundException | SQLException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
}
            // TODO add your handling code here:


                   // TODO add your handling code here:
    }//GEN-LAST:event_btCadastroActionPerformed
    }
    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
       dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CampoData;
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btVoltar;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JTextField campoCrm;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoRepetSenha;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

   

    private void setIcon() {
         URL url = this.getClass().getResource("/Imagens/heart.png");
         Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
         this.setIconImage(imgTitulo);
    }
}
