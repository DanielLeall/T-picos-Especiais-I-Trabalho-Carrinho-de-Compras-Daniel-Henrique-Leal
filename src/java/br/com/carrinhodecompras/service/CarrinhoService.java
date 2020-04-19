
package br.com.carrinhodecompras.service;

import br.com.carrinhodecompras.domain.Produto;
import br.com.carrinhodecompras.service.ProdutoService;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.com.carrinhodecompras.dao.ProdutoDao;
import br.com.carrinhodecompras.dao.CarrinhoDao;
import br.com.carrinhodecompras.domain.Carrinho;
import br.com.carrinhodecompras.domain.Produto;
import java.util.List;

public class CarrinhoService {
    
    private CarrinhoDao carrinhoDao = new CarrinhoDao();
    
    public List<Carrinho> listar(){
        return carrinhoDao.listar();
    }
    
    public boolean inserir(Carrinho carrinho){
        return carrinhoDao.inserir(carrinho);
        
    }
    
    public boolean excluir(Carrinho carrinho){
        return carrinhoDao.excluir(carrinho);
    }
    
    public boolean excluirTodos(Carrinho carrinho){
        return carrinhoDao.excluirTodos(carrinho);
    }
    
    public float valor(){
        return carrinhoDao.valor();
        
    }
}
