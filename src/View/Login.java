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
import javax.swing.JTextField;
import java.sql.PreparedStatement;


public class Login extends javax.swing.JFrame {

   
    public static String teste;
    
    public Login() {
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

        btEntrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMostrarSenha = new javax.swing.JButton();
        campoSenha = new javax.swing.JPasswordField();
        btRecuperarSenha = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btEntrar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VivaBem");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btEntrar.setText("ENTRAR");
        btEntrar.setBorder(null);
        btEntrar.setBorderPainted(false);
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 70, 30));

        jLabel8.setText("E-mail: *");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, -1));

        campoEmail.setOpaque(true);
        campoEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoEmailFocusLost(evt);
            }
        });
        campoEmail.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                campoEmailComponentShown(evt);
            }
        });
        campoEmail.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                campoEmailInputMethodTextChanged(evt);
            }
        });
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 240, -1));

        jLabel9.setText("senha: *");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, -1, -1));

        jLabel3.setText("Saiba Mais Sobre o Viva Bem");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, -1, -1));

        btnMostrarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/olho.png"))); // NOI18N
        btnMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, 30, 20));

        campoSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoSenhaFocusLost(evt);
            }
        });
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 240, -1));

        btRecuperarSenha.setBackground(new java.awt.Color(141, 254, 141));
        btRecuperarSenha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btRecuperarSenha.setText("Recuperar a senha");
        btRecuperarSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btRecuperarSenha.setBorderPainted(false);
        btRecuperarSenha.setContentAreaFilled(false);
        btRecuperarSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btRecuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecuperarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btRecuperarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 100, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Login:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        btEntrar1.setText("Quem Somos");
        btEntrar1.setBorder(null);
        btEntrar1.setBorderPainted(false);
        btEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Login3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
         
    String email = campoEmail.getText();
    teste = campoEmail.getText();
    String cpf = campoEmail.getText();
    String senha = campoSenha.getText();
    View.CaixaDeAviso aviso = new View.CaixaDeAviso();
    if(senha.equals("")|| cpf.equals("")||email.equals("")){
        JOptionPane.showMessageDialog(null, "Campo em Branco");
        
        
        
    }else{
    
    

    try 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera", "root", "");
     Statement stmPaciente = con.createStatement();
    Statement stmMedico = con.createStatement();

    String queryPaciente = "SELECT * FROM cadastro_funcionarios WHERE (email = '" + email + "' OR cpf = '" + cpf + "') AND senha = '" + senha + "'";
    ResultSet rsPaciente = stmPaciente.executeQuery(queryPaciente);

    String queryMedico = "SELECT * FROM cadastro_medico WHERE (email = '" + email + "' OR cpf = '" + cpf + "') AND senha = '" + senha + "'";
    ResultSet rsMedico = stmMedico.executeQuery(queryMedico);

    
    
    
    if (rsPaciente.next() || rsMedico.next()) {
        boolean a=false;
    if(rsPaciente.isFirst()){    
        a = true;}       
        JOptionPane.showMessageDialog(null, "Login realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        if(a==true){
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setLocationRelativeTo(null);
        telaPrincipal.setVisible(true);
        dispose();}
        else{
            TelaPrincipalMedico tela = new TelaPrincipalMedico();
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
            Dados.Pessoa pessoa = new Dados.Pessoa();            
            dispose();
            
        }        
    

    } else {
        JOptionPane.showMessageDialog(null, "Credenciais inválidas. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        campoSenha.setText("");
        campoEmail.setText("");
    }

    rsPaciente.close();
    rsMedico.close();
    stmPaciente.close();
    stmMedico.close();
    con.close();

} catch (ClassNotFoundException | SQLException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
}
        
    }//GEN-LAST:event_btEntrarActionPerformed
    }
    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoEmailInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_campoEmailInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailInputMethodTextChanged

    private void campoEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEmailFocusGained
        JTextField textField = (JTextField)evt.getSource();
    if (textField.getText().equals("Digite seu CPF ou E-mail: ")) {
        textField.setText("");
    }

  
    }//GEN-LAST:event_campoEmailFocusGained

    private void campoEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEmailFocusLost
    JTextField textField = (JTextField)evt.getSource();
    if (textField.getText().isEmpty()) {
        textField.setText("Digite seu CPF ou E-mail: ");
    }
      
    }//GEN-LAST:event_campoEmailFocusLost

    private void campoSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaFocusGained
if (campoSenha.getText().equals("Digite a sua senha: ")) {
    campoSenha.setText("");
    campoSenha.setEchoChar('*'); // Para exibir a máscara de senha
}        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaFocusGained

    private void campoSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaFocusLost
if (campoSenha.getText().isEmpty()) {
    campoSenha.setText("Digite a sua senha: ");
    campoSenha.setEchoChar((char) 0); // Para remover a máscara de senha
}        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaFocusLost

    private void btnMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSenhaActionPerformed

    if (campoSenha.getEchoChar() == 0) {
        campoSenha.setEchoChar('*'); // Exibe a máscara de senha
    } else {
        campoSenha.setEchoChar((char) 0); // Remove a máscara de senha
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarSenhaActionPerformed

    private void campoEmailComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_campoEmailComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailComponentShown

    private void btRecuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecuperarSenhaActionPerformed
     btRecuperarSenha.setOpaque(false);
    btRecuperarSenha.setContentAreaFilled(false);
    btRecuperarSenha.setBorderPainted(false);
        
    String cpf = JOptionPane.showInputDialog("Digite seu CPF:");
    String dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento (dd/mm/aaaa):");

    if (cpf != null && !cpf.isEmpty() && dataNascimento != null && !dataNascimento.isEmpty()) {
        boolean senhaAtualizadaFuncionario = atualizarSenha("cadastro_funcionarios", cpf, dataNascimento);
        boolean senhaAtualizadaMedico = atualizarSenha("cadastro_medico", cpf, dataNascimento);

        if (senhaAtualizadaFuncionario || senhaAtualizadaMedico) {
            JOptionPane.showMessageDialog(null, "Senha atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar a senha. Verifique os dados informados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

private boolean atualizarSenha(String tabela, String cpf, String dataNascimento) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera", "root", "");
        PreparedStatement statement = con.prepareStatement("SELECT * FROM " + tabela + " WHERE cpf = ? AND data_de_nascimento = ?");
        statement.setString(1, cpf);
        statement.setString(2, dataNascimento);
        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            System.out.println("Dados de recuperação corretos.");
            String novaSenha = JOptionPane.showInputDialog("Digite a nova senha:");
            String confirmarSenha = JOptionPane.showInputDialog("Confirme a nova senha:");

            if (novaSenha.equals(confirmarSenha)) {
                System.out.println("Senha atualizada com sucesso.");
                PreparedStatement updateStatement = con.prepareStatement("UPDATE " + tabela + " SET senha = ? WHERE cpf = ? AND data_de_nascimento = ?");
                updateStatement.setString(1, novaSenha);
                updateStatement.setString(2, cpf);
                updateStatement.setString(3, dataNascimento);
                updateStatement.executeUpdate();

                rs.close();
                statement.close();
                updateStatement.close();
                con.close();

                return true;
            } else {
                System.out.println("As senhas não correspondem.");
                JOptionPane.showMessageDialog(null, "As senhas não correspondem.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            System.out.println("Dados de recuperação inválidos.");
            JOptionPane.showMessageDialog(null, "Dados de recuperação inválidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        rs.close();
        statement.close();
        con.close();

        return false;
    } catch (ClassNotFoundException | SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    }//GEN-LAST:event_btRecuperarSenhaActionPerformed

    private void btEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrar1ActionPerformed
        QuemSomos chamar = new QuemSomos();
        chamar.setLocationRelativeTo(null);
        chamar.show();
    }//GEN-LAST:event_btEntrar1ActionPerformed

 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btEntrar1;
    private javax.swing.JButton btRecuperarSenha;
    private javax.swing.JButton btnMostrarSenha;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public void setIcon() {
         URL url = this.getClass().getResource("/Imagens/heart.png");
         Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
         this.setIconImage(imgTitulo);
            }

   

   
}
