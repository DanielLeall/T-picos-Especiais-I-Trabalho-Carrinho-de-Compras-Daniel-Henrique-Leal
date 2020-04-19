
package br.com.carrinhodecompras.controller;

import br.com.carrinhodecompras.domain.Produto;
import br.com.carrinhodecompras.service.ProdutoService;
import br.com.carrinhodecompras.domain.Carrinho;
import br.com.carrinhodecompras.service.CarrinhoService;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="carrinhoMB")
@SessionScoped
public class CarrinhoController {
    private Produto produto = new Produto();
    private List<Produto> produtos;
    private ProdutoService produtoService = new ProdutoService();
    
    private Carrinho carrinho = new Carrinho();
    private List<Carrinho> carrinhos;
    private CarrinhoService carrinhoService = new CarrinhoService();
    private float valores;
    private String tipoPagamento;
    
    public CarrinhoController(){
        listar();
    }

    public void listar(){
        produtos = produtoService.listar();
        carrinhos = carrinhoService.listar();
    }
    
    public String novo(){
        carrinho = new Carrinho();
        return "/index.xhtml?faces-redirect=true";
        
    }
    
    public String pagamentoCPF(){
        
        return "pagamentocpf.xhtml?faces-redirect=true";
    }
    
    public String pagamentoCARTAO(){
        
        return "pagamentocartao.xhtml?faces-redirect=true";
    }
    
    public String excluir(Carrinho carrinho){
        carrinhoService.excluir(carrinho);
        valores = carrinhoService.valor();
        setValores(valores);
        this.listar();
        return "list.xhtml?faces-redirect=true";
    }

    public String excluirTodos(Carrinho carrinho){
        carrinhoService.excluirTodos(carrinho);
        valores = 0;
        this.listar();
        return "/index.xhtml?faces-redirect=true";
    } 
    
    public String salvar(Produto produto){
       carrinho = new Carrinho(); 
       carrinho.setId(produto.getId());
       carrinho.setNomeproduto(produto.getNomeproduto());
       carrinho.setDescricao(produto.getDescricao());
       carrinho.setPeso(produto.getPeso());
       carrinho.setPreco(produto.getPreco());
       carrinhoService.inserir(carrinho);
       this.listar();
       valores = carrinhoService.valor();
       setValores(valores);
       return "/index.xhtml?faces-redirect=true";
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public float getValores() {
        return valores;
    }

    public void setValores(float valores) {
        this.valores = valores;
    }
    
    public ProdutoService getProdutoService() {
        return produtoService;
    }

    public void setProdutoService(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public List<Carrinho> getCarrinhos() {
        return carrinhos;
    }

    public void setCarrinhos(List<Carrinho> carrinhos) {
        this.carrinhos = carrinhos;
    }

    public CarrinhoService getCarrinhoService() {
        return carrinhoService;
    }

    public void setCarrinhoService(CarrinhoService carrinhoService) {
        this.carrinhoService = carrinhoService;
    }
    
    
}
