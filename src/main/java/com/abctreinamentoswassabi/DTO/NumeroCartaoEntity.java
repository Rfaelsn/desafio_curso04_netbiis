package com.abctreinamentoswassabi.DTO;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "numero_cartao", schema = "trabalho_netbiis", catalog = "")
@IdClass(NumeroCartaoEntityPK.class)
public class NumeroCartaoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idNumero_Cartao", nullable = false)
    private int idNumeroCartao;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Cliente_idCliente", nullable = false)
    private int clienteIdCliente;
    @Basic
    @Column(name = "Numero_Cartao", nullable = true, length = 45)
    private String numeroCartao;
    @Basic
    @Column(name = "Nome_Cartao", nullable = true, length = 45)
    private String nomeCartao;

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

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroCartaoEntity that = (NumeroCartaoEntity) o;
        return idNumeroCartao == that.idNumeroCartao && clienteIdCliente == that.clienteIdCliente && Objects.equals(numeroCartao, that.numeroCartao) && Objects.equals(nomeCartao, that.nomeCartao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumeroCartao, clienteIdCliente, numeroCartao, nomeCartao);
    }
}
