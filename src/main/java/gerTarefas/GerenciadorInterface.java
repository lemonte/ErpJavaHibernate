/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerTarefas;

import interfaces.Dashboard;
import interfaces.TelasCadastro.TelaCadastroProduto;
import interfaces.TelasCadastro.TelaCadastroUsuario;
import interfaces.TelasCadastro.TelaCadastroVenda;
import java.sql.SQLException;

/**
// *
 * @author geandersonlemonte
 */
public class GerenciadorInterface {

    private Dashboard dashboard = null;
    private TelaCadastroProduto telaCadastroProduto = null;
    private TelaCadastroUsuario telaCadastroUsuario = null;
    private TelaCadastroVenda telaCadastroVenda = null;
    private static GerenciadorInterface instancia = null;
    private GerenciadorDominio gerenciadorDominio = null;

    private GerenciadorInterface() throws ClassNotFoundException, SQLException{
       gerenciadorDominio = new GerenciadorDominio();
    }
    
    public static  GerenciadorInterface getInstancia() throws ClassNotFoundException, SQLException{
        if(instancia == null){
            instancia = new GerenciadorInterface();
        }
        return instancia;
    }
    
    public void janelaPrincipal() {
        dashboard = new Dashboard();
        dashboard.setVisible(true);

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
