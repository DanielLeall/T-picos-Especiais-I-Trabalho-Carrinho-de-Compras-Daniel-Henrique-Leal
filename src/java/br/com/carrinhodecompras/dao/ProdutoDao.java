
package br.com.carrinhodecompras.dao;

import br.com.carrinhodecompras.domain.Produto;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDao {
    
   private ArrayList<Produto> prod = new ArrayList<>();
   int codigo = 0;
   
    public List<Produto> listar(){
        return prod;
    }

    public Produto consultar(Integer id){
        for (Produto produto: prod){
            if(id == produto.getId()){
                return produto;
            }
        }
        return null;
    }

    public Integer ultimocod(int codigo){
        for (Produto produto: prod){
            codigo = produto.getId();
        }
        codigo = codigo + 1;
        return codigo;
    }
    
    public boolean inserir(Produto produto){  
        codigo = ultimocod(codigo);
        produto.setId(codigo);
        prod.add(produto);
        return true;
    }

    public boolean alterar(Produto produto){
        for (Produto c: prod){
            if(c == produto){
                c = produto;
                return true;
            }
        }
        return false;
    }

    public boolean excluir(Produto produto){
        for (Produto c: prod){
            if(c == produto){
                prod.remove(c);
                return true;
            }
        }
        return false;
    }
}
