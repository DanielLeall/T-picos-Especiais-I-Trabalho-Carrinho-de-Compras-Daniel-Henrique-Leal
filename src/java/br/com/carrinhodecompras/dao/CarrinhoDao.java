
package br.com.carrinhodecompras.dao;

import br.com.carrinhodecompras.domain.Carrinho;
import br.com.carrinhodecompras.domain.Produto;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDao {
   private ArrayList<Carrinho> carr = new ArrayList<>();
   int tamanho = 0;
   
   
    public List<Carrinho> listar(){
        return carr;
    }
    
   public boolean inserir(Carrinho carrinho){  
        tamanho = carr.size() + 1;
        carrinho.setId(tamanho);
        carr.add(carrinho);
        return true;
    }
   public float valor(){
        float valortotal = 0;
        for (Carrinho carrinho: carr){
            valortotal = valortotal + carrinho.getPreco();
        }
        return valortotal;
    }
   
   public boolean excluir(Carrinho carrinho){
        for (Carrinho c: carr){
            if(c == carrinho){
                carr.remove(c);
                return true;
            }
        }
        return false;
    }
   
   public boolean excluirTodos(Carrinho carrinho){
       
        for (Carrinho c: carr){
                carr.remove(c);
        }
        return false;
    }
}
