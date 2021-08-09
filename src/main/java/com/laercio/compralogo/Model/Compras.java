package com.laercio.compralogo.Model;

import javax.persistence.*;

@Entity
@Table (name = "compras")
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "codigo")
    private String codigo;
    @Column(name = "produto", nullable = false)
    private String descricao;
    @Column(name = "quantidade_un", nullable = false)
    private double quantidadeUnitario;
    @Column(name = "valor_un", nullable = false)
    private double valorUnitario;
    @Column(name = "valor_total_un", nullable = false)
    private double valorTotalUnitario;

    public long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProduto() {
        return descricao;
    }

    public void setProduto(String descricao) {
        this.descricao = descricao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getQuantidadeUnitario() {
        return quantidadeUnitario;
    }

    public void setQuantidadeUnitario(double quantidadeUnitario) {
        this.quantidadeUnitario = quantidadeUnitario;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotalUnitario() {
        return valorTotalUnitario;
    }

    public void setValorTotalUnitario(double valorTotalUnitario) {
        this.valorTotalUnitario = valorTotalUnitario;
    }
}
