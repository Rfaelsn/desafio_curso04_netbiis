package com.abctreinamentoswassabi.DTO;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "produto", schema = "trabalho_netbiis", catalog = "")
@IdClass(ProdutoEntityPK.class)
public class ProdutoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idProduto", nullable = false)
    private int idProduto;
    @Basic
    @Column(name = "Quantidade", nullable = true)
    private Integer quantidade;
    @Basic
    @Column(name = "Holl_Wasabi_idHoll_Wasabi", nullable = false)
    private int hollWasabiIdHollWasabi;
    @Basic
    @Column(name = "Promocao_idPromocao", nullable = false)
    private int promocaoIdPromocao;
    @Basic
    @Column(name = "Entradas_idEntradas", nullable = false)
    private int entradasIdEntradas;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Temaki_Especial_idTemaki_Especial1", nullable = false)
    private int temakiEspecialIdTemakiEspecial1;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public int getHollWasabiIdHollWasabi() {
        return hollWasabiIdHollWasabi;
    }

    public void setHollWasabiIdHollWasabi(int hollWasabiIdHollWasabi) {
        this.hollWasabiIdHollWasabi = hollWasabiIdHollWasabi;
    }

    public int getPromocaoIdPromocao() {
        return promocaoIdPromocao;
    }

    public void setPromocaoIdPromocao(int promocaoIdPromocao) {
        this.promocaoIdPromocao = promocaoIdPromocao;
    }

    public int getEntradasIdEntradas() {
        return entradasIdEntradas;
    }

    public void setEntradasIdEntradas(int entradasIdEntradas) {
        this.entradasIdEntradas = entradasIdEntradas;
    }

    public int getTemakiEspecialIdTemakiEspecial1() {
        return temakiEspecialIdTemakiEspecial1;
    }

    public void setTemakiEspecialIdTemakiEspecial1(int temakiEspecialIdTemakiEspecial1) {
        this.temakiEspecialIdTemakiEspecial1 = temakiEspecialIdTemakiEspecial1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoEntity that = (ProdutoEntity) o;
        return idProduto == that.idProduto && hollWasabiIdHollWasabi == that.hollWasabiIdHollWasabi && promocaoIdPromocao == that.promocaoIdPromocao && entradasIdEntradas == that.entradasIdEntradas && temakiEspecialIdTemakiEspecial1 == that.temakiEspecialIdTemakiEspecial1 && Objects.equals(quantidade, that.quantidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduto, quantidade, hollWasabiIdHollWasabi, promocaoIdPromocao, entradasIdEntradas, temakiEspecialIdTemakiEspecial1);
    }
}
