package com.abctreinamentoswassabi.DTO;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "pedido", schema = "trabalho_netbiis", catalog = "")
@IdClass(PedidoEntityPK.class)
public class PedidoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPedido", nullable = false)
    private int idPedido;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Cliente_idCliente", nullable = false)
    private int clienteIdCliente;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Produto_idProduto", nullable = false)
    private int produtoIdProduto;
    @Basic
    @Column(name = "Valor_Total", nullable = true, length = 45)
    private String valorTotal;
    @Basic
    @Column(name = "Numero_nota", nullable = true, length = 45)
    private String numeroNota;
    @Basic
    @Column(name = "Forma_pagamento", nullable = true, length = 45)
    private String formaPagamento;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getClienteIdCliente() {
        return clienteIdCliente;
    }

    public void setClienteIdCliente(int clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
    }

    public int getProdutoIdProduto() {
        return produtoIdProduto;
    }

    public void setProdutoIdProduto(int produtoIdProduto) {
        this.produtoIdProduto = produtoIdProduto;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PedidoEntity that = (PedidoEntity) o;
        return idPedido == that.idPedido && clienteIdCliente == that.clienteIdCliente && produtoIdProduto == that.produtoIdProduto && Objects.equals(valorTotal, that.valorTotal) && Objects.equals(numeroNota, that.numeroNota) && Objects.equals(formaPagamento, that.formaPagamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPedido, clienteIdCliente, produtoIdProduto, valorTotal, numeroNota, formaPagamento);
    }
}
