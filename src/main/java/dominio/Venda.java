/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author geandersonlemonte
 */
@Entity
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenda;

    // relaciona com a tabela produto
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idProduto", nullable = false)
    private Produto produto;

    // relaciona com a tabela usuario
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @Column(name = "quantidade", nullable = false)
    private int quantidade;

    // preco que o produto foi vendido
    @Column(name = "preco", nullable = false)
    private double preco;
    
    @Column(name = "dataVenda", nullable = false)
    private Date dataVenda;


    public Venda() {
        idVenda = -1;
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        dataVenda = sqlDate;
        produto = new Produto();
        usuario = new Usuario();
        quantidade = 0;
        preco = 0;
    }

    public Venda(int idVenda, Produto produto, Usuario usuario, int quantidade, double preco, Date dataVenda) {
        this.idVenda = idVenda;
        this.produto = produto;
        this.usuario = usuario;
        this.quantidade = quantidade;
        this.preco = preco;
        this.dataVenda = dataVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Date getDataVenda(){
        return dataVenda;
    }
    
    public void setDataVenda(Date dataVenda){
        this.dataVenda = dataVenda;
    }
    
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    

    @Override
    public String toString() {
        return produto.getNome();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venda other = (Venda) obj;
        return this.idVenda == other.idVenda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idVenda;
        return hash;
    }

}
