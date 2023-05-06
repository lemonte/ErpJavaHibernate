/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author geandersonlemonte
 */
public class Venda {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idVenda;   

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public String toString() {
        return "Venda{" + "idVenda=" + idVenda + ", idProduto=" + idProduto + ", quantidade=" + quantidade + ", idUsuario=" + idUsuario + ", preco=" + preco + '}';
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

   

    public Venda(int idVenda, int idProduto, int quantidade, int idUsuario, double preco) {
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.idUsuario = idUsuario;
        this.preco = preco;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    // relaciona com a tabela produto
    private int idProduto; 
    
    @Column (name="quantidade", nullable = false)
    private int quantidade;

    
    // relaciona com a tabela usuario
    private int idUsuario;   
    
    // preco que o produto foi vendido
    @Column (name="preco", nullable = false)
    private double preco;
   
}
