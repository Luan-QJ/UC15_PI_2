package br.com.senac.uc15_etapa_4.telas;

import br.com.senac.uc15_etapa_4.persistencia.Usuario;
import br.com.senac.uc15_etapa_4.persistencia.Utilizacao;
import br.com.senac.uc15_etapa_4.persistencia.UtilizacaoJPA;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaUtilizacao extends javax.swing.JFrame {

    public TelaUtilizacao(Usuario u) {
        initComponents();
        
        if(u.getTipo().equalsIgnoreCase("gerente")) {
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            jButtonGravar.setEnabled(true);
            
        } else if (u.getTipo().equalsIgnoreCase("analista")) {
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(false);
            jButtonGravar.setEnabled(true);
            
        } else {
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonGravar.setEnabled(false);
        }
    }
    
    public TelaUtilizacao() {
        initComponents();
    }

    private DefaultTableModel montarTabela(List<Utilizacao> listaUtilizacao) {
        String[] colunas = {"ID", "Descrição"};
        DefaultTableModel tabela = new DefaultTableModel();
        tabela.setColumnIdentifiers(colunas);

        for (int i = 0; listaUtilizacao.size() > i; i++) {
            Utilizacao utilizacao = listaUtilizacao.get(i);

            String[] linha = {
                Integer.toString(utilizacao.getId()),
                utilizacao.getDescricao()
            };
            tabela.addRow(linha);
        }
        return tabela;
    }

    private String getIdItemSelecionado() {
        int posicao = jtableUtilizacao.getSelectedRow();
        if (posicao == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um item da tabela!");
        }
        return (String) jtableUtilizacao.getValueAt(posicao, 0);
    }

    private Utilizacao utilizacaoEdicao = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonExcluir = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableUtilizacao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Banco");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(188, 202, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Utilização", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setToolTipText("");

        jButtonExcluir.setBackground(new java.awt.Color(139, 173, 196));
        jButtonExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(51, 51, 51));
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonGravar.setBackground(new java.awt.Color(139, 173, 196));
        jButtonGravar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonGravar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonGravar.setText("GRAVAR");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Utilização");

        jTextFieldDescricao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldDescricao.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldDescricao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonEditar.setBackground(new java.awt.Color(139, 173, 196));
        jButtonEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonEditar.setText("EDITAR");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDescricao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGravar)))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtableUtilizacao.setModel(montarTabela(UtilizacaoJPA.listar()));
        jScrollPane2.setViewportView(jtableUtilizacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        String idSelecionado = getIdItemSelecionado();
        utilizacaoEdicao = UtilizacaoJPA.obter(Integer.parseInt(idSelecionado));
        jTextFieldDescricao.setText(utilizacaoEdicao.getDescricao());
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        // TODO add your handling code here:
        Utilizacao utilizacao = new Utilizacao();
        utilizacao.setDescricao(jTextFieldDescricao.getText());

        if (utilizacaoEdicao != null) {
            utilizacaoEdicao.setDescricao(jTextFieldDescricao.getText());
            UtilizacaoJPA.atualizar(utilizacaoEdicao);
            JOptionPane.showMessageDialog(null, "Utilização atualizada com sucesso!");

        } else {
            UtilizacaoJPA.cadastrar(utilizacao);
            JOptionPane.showMessageDialog(null, "Utilização cadastrada com sucesso!");

        }
        jtableUtilizacao.setModel(montarTabela(UtilizacaoJPA.listar()));
        jScrollPane2.setViewportView(jtableUtilizacao);

        jTextFieldDescricao.setText("");

        utilizacaoEdicao = null;
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        UtilizacaoJPA.excluir(Integer.parseInt(getIdItemSelecionado()));
        jtableUtilizacao.setModel(montarTabela(UtilizacaoJPA.listar()));
        jScrollPane2.setViewportView(jtableUtilizacao);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUtilizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUtilizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUtilizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUtilizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUtilizacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTable jtableUtilizacao;
    // End of variables declaration//GEN-END:variables
}
