package br.com.henio.naturassp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tbl_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer idPedido;

    @Column(name = "data_pedido")
    private LocalDate dataPedido;

    @Column(name = "valorTotal")
    private Double valorTotal;

    @Column(name = "observacoes", length = 500)
    private String observacoes;

    @Column(name = "status")
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("pedido")
    private List<ItemPedido> itensPedido;

    public Integer getIdPedido() {
        return idPedido;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Integer getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
