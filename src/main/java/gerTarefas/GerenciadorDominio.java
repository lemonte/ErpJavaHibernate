/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerTarefas;

import dao.ConexaoHibernate;
import dao.GenericsDao;
import dominio.Produto;
import dominio.Usuario;
import dominio.Venda;
import java.util.List;

/**
 *
 * @author geandersonlemonte
 */
public class GerenciadorDominio {

    GenericsDao genDao;

    public GerenciadorDominio() {
//         TESTE
        ConexaoHibernate.getSessionFactory();
        genDao = new GenericsDao();

    }

    public void inserirUsuario(Usuario usuario) throws Exception {
        genDao.inserir(usuario);
    }

    public void inserirProduto(Produto produto) throws Exception {
        genDao.inserir(produto);
    }
    
    public void inserirVenda(Venda venda) throws Exception {
        genDao.inserir(venda);
    }
    
    public List<Venda> listarVendas() throws Exception {
        return genDao.listar(Venda.class);
    }
        
    public List<Produto> listarProdutos() throws Exception {
        return genDao.listar(Produto.class);
    }
    public List<Usuario> listarUsuarios() throws Exception {
        return genDao.listar(Usuario.class);
    }
}
