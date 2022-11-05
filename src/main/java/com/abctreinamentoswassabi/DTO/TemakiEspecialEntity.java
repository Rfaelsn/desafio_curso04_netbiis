package com.abctreinamentoswassabi.DTO;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "temaki_especial", schema = "trabalho_netbiis", catalog = "")
public class TemakiEspecialEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idTemaki_Especial", nullable = false)
    private int idTemakiEspecial;
    @Basic
    @Column(name = "Nome", nullable = true, length = 45)
    private String nome;
    @Basic
    @Column(name = "Valor", nullable = true, precision = 0)
    private Double valor;
    @Basic
    @Column(name = "Descricao", nullable = true, length = 100)
    private String descricao;

    public int getIdTemakiEspecial() {
        return idTemakiEspecial;
    }

    public void setIdTemakiEspecial(int idTemakiEspecial) {
        this.idTemakiEspecial = idTemakiEspecial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemakiEspecialEntity that = (TemakiEspecialEntity) o;
        return idTemakiEspecial == that.idTemakiEspecial && Objects.equals(nome, that.nome) && Objects.equals(valor, that.valor) && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTemakiEspecial, nome, valor, descricao);
    }
}
