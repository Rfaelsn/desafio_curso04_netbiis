package com.abctreinamentoswassabi.DTO;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "cliente", schema = "trabalho_netbiis", catalog = "")
public class ClienteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idCliente", nullable = false)
    private int idCliente;
    @Basic
    @Column(name = "Nome", nullable = true, length = 100)
    private String nome;
    @Basic
    @Column(name = "CPF", nullable = true)
    private Integer cpf;
    @Basic
    @Column(name = "Endereço", nullable = true, length = 150)
    private String endereço;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntity that = (ClienteEntity) o;
        return idCliente == that.idCliente && Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf) && Objects.equals(endereço, that.endereço);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nome, cpf, endereço);
    }
}
