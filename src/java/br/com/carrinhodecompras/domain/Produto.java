
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
@Table(name="produto")
public class Produto implements Serializable {
   
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

    public Produto() {
    }

    public Produto(Integer id, String nomeproduto, String descricao, String peso, float preco) {
        this.id = id;
        this.nomeproduto = nomeproduto;
        this.descricao = descricao;
        this.peso = peso;
        this.preco = preco;
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
    
    
    @Override
    public int hashCode(){
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.id, other.id)){
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return "Produto(" + "id" + id + "produto" + nomeproduto +", descricao=" + descricao + ')';
    }
}
