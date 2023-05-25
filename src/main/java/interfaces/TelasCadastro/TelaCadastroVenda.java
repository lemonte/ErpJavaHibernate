/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaces.TelasCadastro;

import dominio.Produto;
import dominio.Usuario;
import dominio.Venda;
import gerTarefas.GerenciadorInterface;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author geandersonlemonte
 */
public class TelaCadastroVenda extends javax.swing.JDialog {

    /**
     * Creates new form TelaCadastroProduto
     */
    public TelaCadastroVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    private void init() {
        try {
            GerenciadorInterface gerenciador = GerenciadorInterface.getInstancia();
            gerenciador.carregarComboBox(produto, new Produto());
            gerenciador.carregarComboBox(vendedor, new Usuario());
        } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantidade = new javax.swing.JSpinner();
        salvar = new javax.swing.JButton();
        produto = new javax.swing.JComboBox<>();
        vendedor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Vendas"));

        jLabel1.setText("Produto:");

        jLabel2.setText("Vendedor");

        jLabel3.setText("Quantidade");

        quantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantidadeStateChanged(evt);
            }
        });
        quantidade.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                quantidadeInputMethodTextChanged(evt);
            }
        });

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        vendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(produto, 0, 281, Short.MAX_VALUE)
                            .addComponent(vendedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidade)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(salvar)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        int valor = Integer.parseInt(quantidade.getValue().toString());
        Produto prod = (Produto)produto.getSelectedItem();
        int maximo = prod.getQuantidade();
        if(valor >= maximo || valor <= 0){
            quantidade.setValue(maximo);
            JOptionPane.showMessageDialog(this, "Quantidade não permitida");
        }else{
            try {
                GerenciadorInterface gerenciador = GerenciadorInterface.getInstancia();
                Venda venda = new Venda();
                venda.setQuantidade(Integer.parseInt(quantidade.getValue().toString()));
                venda.setProduto(prod);
                venda.setUsuario((Usuario) vendedor.getSelectedItem());
                gerenciador.inserirVenda(venda);
                this.setVisible(false);
                this.dispose();
            } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        
    }//GEN-LAST:event_salvarActionPerformed

    private void quantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantidadeStateChanged
        int valor = Integer.parseInt(quantidade.getValue().toString());
        Produto prod = (Produto)produto.getSelectedItem();
        int maximo = prod.getQuantidade();
        if(valor >= maximo){
            quantidade.setValue(maximo);
        }
    }//GEN-LAST:event_quantidadeStateChanged

    private void quantidadeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_quantidadeInputMethodTextChanged
        int valor = Integer.parseInt(quantidade.getValue().toString());
        Produto prod = (Produto)produto.getSelectedItem();
        int maximo = prod.getQuantidade();
        if(valor >= maximo){
            quantidade.setValue(maximo);
        }
    }//GEN-LAST:event_quantidadeInputMethodTextChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> produto;
    private javax.swing.JSpinner quantidade;
    private javax.swing.JButton salvar;
    private javax.swing.JComboBox<String> vendedor;
    // End of variables declaration//GEN-END:variables
}
