/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerTarefas;

import dominio.Produto;
import dominio.Usuario;
import dominio.Venda;
import interfaces.Dashboard;
import interfaces.TelasCadastro.TelaCadastroProduto;
import interfaces.TelasCadastro.TelaCadastroUsuario;
import interfaces.TelasCadastro.TelaCadastroVenda;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * //
 *
 *
 * @author geandersonlemonte
 */
public class GerenciadorInterface {

    private Dashboard dashboard = null;
    private TelaCadastroProduto telaCadastroProduto = null;
    private TelaCadastroUsuario telaCadastroUsuario = null;
    private TelaCadastroVenda telaCadastroVenda = null;
    private static GerenciadorInterface instancia = null;
    private GerenciadorDominio gerenciadorDominio = null;

    private GerenciadorInterface() throws ClassNotFoundException, SQLException {
        gerenciadorDominio = new GerenciadorDominio();
    }

    public static GerenciadorInterface getInstancia() throws ClassNotFoundException, SQLException {
        if (instancia == null) {
            instancia = new GerenciadorInterface();
        }
        return instancia;
    }

    private List<Usuario> listarUsuarios() {
        try {
            return gerenciadorDominio.listarUsuarios();
        } catch (Exception e) {
            return new LinkedList();
        }
    }

    private List<Venda> listarVendas() {
        try {
            return gerenciadorDominio.listarVendas();
        } catch (Exception e) {
            return new LinkedList();
        }
    }

    private List<Produto> listarProdutos() {
        try {
            return gerenciadorDominio.listarProdutos();
        } catch (Exception e) {
            return new LinkedList();
        }
    }

    public void inserirProduto(Produto produto) {
        try {
            gerenciadorDominio.inserirProduto(produto);
        } catch (Exception e) {

        }
    }

    public void inserirUsuario(Usuario usuario) {
        try {
            gerenciadorDominio.inserirUsuario(usuario);
        } catch (Exception e) {

        }
    }

    public void inserirVenda(Venda venda) {
        try {
            gerenciadorDominio.inserirVenda(venda);
        } catch (Exception e) {

        }
    }

    public void janelaPrincipal() {
        dashboard = new Dashboard();
        dashboard.setVisible(true);

    }

    public void carregarTabela(JTable tabela, Object model) {
        List<String> colunas = new LinkedList();

        Object[][] data = {};
        var modelTabela = new DefaultTableModel(data, colunas.toArray());

        try {
            if (Venda.class.equals(model.getClass())) {
                colunas.add("ID");
                colunas.add("Produto");
                colunas.add("Vendedor");
                colunas.add("Quantidade");
                colunas.add("Total Venda");
                List<Venda> vendas = listarVendas();
                modelTabela = new DefaultTableModel(data, colunas.toArray());
                for (Venda venda : vendas) {
                    modelTabela.addRow(Arrays.asList(venda.getIdVenda(), venda.getProduto().getIdProduto(), venda.getUsuario().getNomeUsuario(), venda.getQuantidade(),( venda.getProduto().getPreco() * venda.getQuantidade())).toArray());
                }
            }
            if (Produto.class.equals(model.getClass())) {
                colunas.add("ID");
                colunas.add("Codigo");
                colunas.add("Nome");
                colunas.add("Quantidade");
                colunas.add("Preço");
                List<Produto> produtos = listarProdutos();
                System.out.println("Produtos");
                System.out.println(produtos);
                modelTabela = new DefaultTableModel(data, colunas.toArray());
                for (Produto produto : produtos) {
                    modelTabela.addRow(Arrays.asList(produto.getIdProduto(), produto.getCodigo(), produto.getNome(), produto.getQuantidade(), produto.getPreco()).toArray());
                }
            }
            if (Usuario.class.equals(model.getClass())) {
                colunas.add("ID");
                colunas.add("Nome");
                colunas.add("Administrador");
                List<Usuario> usuarios = listarUsuarios();
                modelTabela = new DefaultTableModel(data, colunas.toArray());
                for (Usuario usuario : usuarios) {
                    modelTabela.addRow(Arrays.asList(usuario.getIdUsuario(), usuario.getNomeUsuario(), usuario.isAdministrador()).toArray());
                }
            }
            tabela.setModel(modelTabela);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void carregarComboBox(JComboBox combo, Object model) {
        try {
            if (Venda.class.equals(model.getClass())) {
                combo.setModel(new DefaultComboBoxModel(listarVendas().toArray()));
            }
            if (Produto.class.equals(model.getClass())) {
                combo.setModel(new DefaultComboBoxModel(listarProdutos().toArray()));
            }
            if (Usuario.class.equals(model.getClass())) {
                combo.setModel(new DefaultComboBoxModel(listarUsuarios().toArray()));
            }
        } catch (Exception e) {

        }
    }

    public void cadastroProduto() {
        telaCadastroProduto = new TelaCadastroProduto(dashboard, true);
        telaCadastroProduto.setVisible(true);
    }

    public void cadastroVenda() {
        telaCadastroVenda = new TelaCadastroVenda(dashboard, true);
        telaCadastroVenda.setVisible(true);
    }

    public void cadastroUsuario() {
        telaCadastroUsuario = new TelaCadastroUsuario(dashboard, true);
        telaCadastroUsuario.setVisible(true);
    }

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("default".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        GerenciadorInterface gerenciador = GerenciadorInterface.getInstancia();
        gerenciador.janelaPrincipal();
    }

}
