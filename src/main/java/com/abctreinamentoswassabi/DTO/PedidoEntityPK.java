package com.abctreinamentoswassabi.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class PedidoEntityPK implements Serializable {
    @Column(name = "idPedido", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;
    @Column(name = "Cliente_idCliente", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clienteIdCliente;
    @Column(name = "Produto_idProduto", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int produtoIdProduto;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PedidoEntityPK that = (PedidoEntityPK) o;
        return idPedido == that.idPedido && clienteIdCliente == that.clienteIdCliente && produtoIdProduto == that.produtoIdProduto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPedido, clienteIdCliente, produtoIdProduto);
    }
}
