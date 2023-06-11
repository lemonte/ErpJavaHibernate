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
        ConexaoHibernate.getSessionFactory();
        genDao = new GenericsDao();

    }

    public void inserirUsuario(Usuario usuario) throws Exception {
        genDao.inserir(usuario);
    }
    
    public void alterarUsuario(Usuario usuario) throws Exception {
        genDao.alterar(usuario);
    }
    
    public void excluirUsuario(Usuario usuario) throws Exception {
        genDao.excluir(usuario);
    }

    public void inserirProduto(Produto produto) throws Exception {
        genDao.inserir(produto);
    }

    public void alterarProduto(Produto produto) throws Exception {
        genDao.alterar(produto);
    }
    
    public void excluirProduto(Produto produto) throws Exception {
        genDao.excluir(produto);
    }

    public void alterarVenda(Venda venda) throws Exception {
        genDao.alterar(venda);
    }

    public void inserirVenda(Venda venda) throws Exception {
        genDao.inserir(venda);
    }
    
    public void excluirVenda(Venda venda) throws Exception {
        genDao.excluir(venda);
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
