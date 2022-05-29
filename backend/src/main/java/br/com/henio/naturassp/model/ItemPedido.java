package br.com.henio.naturassp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_itempedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_seq")
    private Integer numSeq;

    @Column(name = "qtde_item")
    private Integer qtdeItem;

    @Column(name = "preco_unitario")
    private Double precoUnitario;

    @Column(name = "preco_total")
    private Double precoTotal;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    @JsonIgnoreProperties("itensPedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    public Integer getNumSeq() {
        return numSeq;
    }

    public Integer getQtdeItem() {
        return qtdeItem;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setNumSeq(Integer numSeq) {
        this.numSeq = numSeq;
    }

    public void setQtdeItem(Integer qtdeItem) {
        this.qtdeItem = qtdeItem;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

	@Override
	public String toString() {
		return "ItemPedido [numSeq=" + numSeq + ", qtdeItem=" + qtdeItem + ", precoUnitario=" + precoUnitario
				+ ", precoTotal=" + precoTotal + ", pedido=" + pedido + ", produto=" + produto.getId() + "]";
	}
    
    
}
