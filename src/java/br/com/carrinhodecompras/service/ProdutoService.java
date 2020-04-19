/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carrinhodecompras.service;

import br.com.carrinhodecompras.domain.Produto;
import br.com.carrinhodecompras.service.ProdutoService;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.com.carrinhodecompras.dao.ProdutoDao;
import br.com.carrinhodecompras.domain.Produto;
import java.util.List;


public class ProdutoService {

    private ProdutoDao produtoDao = new ProdutoDao();
    
    public List<Produto> listar(){
        return produtoDao.listar();
    }

    public Produto consultar(Integer id){
        return produtoDao.consultar(id);
    }

    public boolean inserir(Produto produto){
        return produtoDao.inserir(produto);
    }

    
    public boolean alterar(Produto produto){
        return produtoDao.alterar(produto);
    }

    public boolean excluir(Produto produto){
        return produtoDao.excluir(produto);
    }
}
