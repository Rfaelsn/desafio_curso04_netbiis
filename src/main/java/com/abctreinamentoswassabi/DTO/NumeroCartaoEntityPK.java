package com.abctreinamentoswassabi.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class NumeroCartaoEntityPK implements Serializable {
    @Column(name = "idNumero_Cartao", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNumeroCartao;
    @Column(name = "Cliente_idCliente", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clienteIdCliente;

    public int getIdNumeroCartao() {
        return idNumeroCartao;
    }

    public void setIdNumeroCartao(int idNumeroCartao) {
        this.idNumeroCartao = idNumeroCartao;
    }

    public int getClienteIdCliente() {
        return clienteIdCliente;
    }

    public void setClienteIdCliente(int clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroCartaoEntityPK that = (NumeroCartaoEntityPK) o;
        return idNumeroCartao == that.idNumeroCartao && clienteIdCliente == that.clienteIdCliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumeroCartao, clienteIdCliente);
    }
}
