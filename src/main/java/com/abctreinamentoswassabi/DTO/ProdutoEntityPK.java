package com.abctreinamentoswassabi.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class ProdutoEntityPK implements Serializable {
    @Column(name = "idProduto", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduto;
    @Column(name = "Temaki_Especial_idTemaki_Especial1", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int temakiEspecialIdTemakiEspecial1;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
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
        ProdutoEntityPK that = (ProdutoEntityPK) o;
        return idProduto == that.idProduto && temakiEspecialIdTemakiEspecial1 == that.temakiEspecialIdTemakiEspecial1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduto, temakiEspecialIdTemakiEspecial1);
    }
}
