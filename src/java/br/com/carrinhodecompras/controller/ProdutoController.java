
package br.com.carrinhodecompras.controller;
import br.com.carrinhodecompras.domain.Produto;
import br.com.carrinhodecompras.service.ProdutoService;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="produtoMB")
@SessionScoped
public class ProdutoController {
    private Produto produto = new Produto();
    private List<Produto> produtos;
    private ProdutoService produtoService = new ProdutoService();

    public ProdutoController(){
        listar();
    }

    public void listar(){
        produtos = produtoService.listar();
    }

    public String novo(){
        produto = new Produto();
        return "new.xhtml?faces-redirect=true";
    }
    
    
    public String cancelar(){
        return "list.xhtml?faces-redirect=true";
    }
    public String voltar(){
        return "index.xhtml?faces-redirect=true";
    }
    public String buscarDados(Produto produto){
        this.produto = produto;
        return "alter.xhtml?faces-redirect=true";
    }

    public String alterar(){
        produtoService.alterar(produto);
        this.listar();
        return "list.xhtml?faces-redirect=true";
    }
    public String excluir(Produto produto){
        produtoService.excluir(produto);
        this.listar();
        return "list.xhtml?faces-redirect=true";
    }
    public String salvar(){
       produtoService.inserir(produto);
       this.listar();
       return "list.xhtml?faces-redirect=true";
    }
    
    
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
