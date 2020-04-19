
package br.com.carrinhodecompras.domain;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="carrinho")
public class Carrinho implements Serializable{
  
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull
    @Size(min=1,max=45)
    private String nomeproduto;
    
    @NotNull
    @Size(min=1,max=45)
    private String descricao;
    
    @NotNull
    @Size(min=1,max=45)
    private String peso;
    
    @NotNull
    private float preco;
    
    @NotNull
    private int quantidade;
    
    @NotNull
    private float total;
    
    @NotNull
    private boolean finalizar;

    public Carrinho() {
    }

    public Carrinho(Integer id, String nomeproduto, String descricao, String peso, float preco, int quantidade, float total, boolean finalizar) {
        this.id = id;
        this.nomeproduto = nomeproduto;
        this.descricao = descricao;
        this.peso = peso;
        this.preco = preco;
        this.quantidade = quantidade;
        this.total = total;
        this.finalizar = finalizar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public boolean isFinalizar() {
        return finalizar;
    }

    public void setFinalizar(boolean finalizar) {
        this.finalizar = finalizar;
    }
    
    
    
}
