package view;

import model.GerenciarEmpregado;
import model.ParametroINSS;
import model.Empregado;
import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Giovane de Oliveira
 */
public class EmpregadoGUI extends javax.swing.JFrame {

    /**
     * Creates new form EmpregadoGUI
     */
    GerenciarEmpregado ge;
    Empregado e;
    public EmpregadoGUI() {
        initComponents();
        
        //Máscara para o campo salário bruto
        textSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.##"))));
        
        ge = new GerenciarEmpregado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panelEmpregado = new javax.swing.JPanel();
        labelCodigoEmpregado = new javax.swing.JLabel();
        labelNomeEmpregado = new javax.swing.JLabel();
        labelSetor = new javax.swing.JLabel();
        labelSalarioBruto = new javax.swing.JLabel();
        labelRecolhimento = new javax.swing.JLabel();
        labelValorCalculado = new javax.swing.JLabel();
        buttonCalcular = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();
        buttonApresentar = new javax.swing.JButton();
        textCodigoEmpregado = new javax.swing.JTextField();
        textNomeEmpregado = new javax.swing.JTextField();
        textSetor = new javax.swing.JTextField();
        buttonLimpar = new javax.swing.JButton();
        textSalario = new javax.swing.JFormattedTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Empregados");

        panelEmpregado.setBorder(javax.swing.BorderFactory.createTitledBorder("Calcular recolhimento"));
        panelEmpregado.setToolTipText("Calcular ");

        labelCodigoEmpregado.setText("Código do Empregado");

        labelNomeEmpregado.setText("Nome do Empregado");

        labelSetor.setText("Setor");

        labelSalarioBruto.setText("Salário Bruto");

        labelRecolhimento.setText("Recolhimento");

        labelValorCalculado.setText("R$");

        buttonCalcular.setText("Calcular Recolhimento INSS");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });

        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        buttonApresentar.setText("Apresentar Empregados");
        buttonApresentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApresentarActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEmpregadoLayout = new javax.swing.GroupLayout(panelEmpregado);
        panelEmpregado.setLayout(panelEmpregadoLayout);
        panelEmpregadoLayout.setHorizontalGroup(
            panelEmpregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpregadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmpregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodigoEmpregado)
                    .addComponent(labelNomeEmpregado)
                    .addComponent(labelSetor)
                    .addComponent(labelSalarioBruto)
                    .addComponent(labelRecolhimento)
                    .addComponent(buttonLimpar))
                .addGap(18, 18, 18)
                .addGroup(panelEmpregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEmpregadoLayout.createSequentialGroup()
                        .addComponent(buttonCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonApresentar))
                    .addComponent(labelValorCalculado)
                    .addComponent(buttonCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textSetor)
                    .addComponent(textNomeEmpregado)
                    .addComponent(textCodigoEmpregado)
                    .addComponent(textSalario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEmpregadoLayout.setVerticalGroup(
            panelEmpregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpregadoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelEmpregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoEmpregado, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(textCodigoEmpregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeEmpregado, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(textNomeEmpregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelEmpregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSetor, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(textSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelEmpregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSalarioBruto, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(textSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCalcular)
                .addGap(13, 13, 13)
                .addGroup(panelEmpregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRecolhimento)
                    .addComponent(labelValorCalculado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(panelEmpregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrar)
                    .addComponent(buttonApresentar)
                    .addComponent(buttonLimpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEmpregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEmpregado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão calcular pressionado
    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed

        try {
            
            e = new Empregado();
        
            e.setCodigoEmpregado(Integer.parseInt(textCodigoEmpregado.getText()));
            e.setNomeEmpregado(textNomeEmpregado.getText());
            
            //Desaplicando máscara no campo salário bruto
            String temp = textSalario.getText().replace(".", "");
            temp = temp.replace(",", ".");
            
            e.setSalarioBruto(Double.parseDouble(temp));
            e.setSetor(textSetor.getText());

            //Calcula e grava valor do recolhimento do INSS para o objeto criado
            ParametroINSS pin = new ParametroINSS();
            labelValorCalculado.setText("R$ " + pin.calcularInss(Double.parseDouble(temp)));
            e.setRecInss(pin.calcularInss(Double.parseDouble(temp)));
            
        //Verificação geral de erros/exceções, com mensagem de retorno ao usuário               
        } catch (Exception e) {
            JOptionPane optionPane = new JOptionPane("Erro! Confira os dados e tente novamente!", 
                    JOptionPane.ERROR_MESSAGE);    
            JDialog dialog = optionPane.createDialog("Erro");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);    
        }

    }//GEN-LAST:event_buttonCalcularActionPerformed

    //Botão cadastrar pressionado
    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        try {
            
            //Envia pedido para cadastro de Uusuário
            if(ge.adicionarEmpregado(e)){
                //Exibe mensagem de cadastro realizado com sucesso
                Component frame = null;
                JOptionPane.showMessageDialog(frame, "Empregado cadastrado com sucesso!");

                //Simula clique no botão limpar para limpar o formulário
                buttonLimpar.doClick();
                
                //Criando nova instância para zerar referências ao empregado que
                //acabou de ser adicionado na lista de empregados
                e = new Empregado();
            }
            else {
                JOptionPane optionPane = new JOptionPane("Erro! Confira os dados e tente novamente!", 
                        JOptionPane.ERROR_MESSAGE);    
                JDialog dialog = optionPane.createDialog("Erro");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
            }
            
            
        
        //Verificação geral de erros/exceções, com mensagem de retorno ao usuário               
        } catch (Exception e) {
            JOptionPane optionPane = new JOptionPane("Erro! Confira os dados e tente novamente!", 
                    JOptionPane.ERROR_MESSAGE);    
            JDialog dialog = optionPane.createDialog("Erro");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }
 
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    //Botão apresentar empregados pressionado   
    private void buttonApresentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApresentarActionPerformed
        
        //Abre a tela Gerenciar Empregados e encerra a atual
        GerenciarEmpregadosGUI gerEmp = new GerenciarEmpregadosGUI();
        gerEmp.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonApresentarActionPerformed

    //Botão limpar pressionado
    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        
        //Zera todos os campos
        textCodigoEmpregado.setText("");
        textNomeEmpregado.setText("");
        textSetor.setText("");
        textSalario.setText("");
        labelValorCalculado.setText("R$");
        
    }//GEN-LAST:event_buttonLimparActionPerformed

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
            java.util.logging.Logger.getLogger(EmpregadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpregadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpregadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpregadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpregadoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonApresentar;
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelCodigoEmpregado;
    private javax.swing.JLabel labelNomeEmpregado;
    private javax.swing.JLabel labelRecolhimento;
    private javax.swing.JLabel labelSalarioBruto;
    private javax.swing.JLabel labelSetor;
    private javax.swing.JLabel labelValorCalculado;
    private javax.swing.JPanel panelEmpregado;
    private javax.swing.JTextField textCodigoEmpregado;
    private javax.swing.JTextField textNomeEmpregado;
    private javax.swing.JFormattedTextField textSalario;
    private javax.swing.JTextField textSetor;
    // End of variables declaration//GEN-END:variables
}
