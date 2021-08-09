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
    @Column(name = "quantidade_un",nullable = false)
    private double quantidadeUnitario;
    @Column(name = "valor_un",nullable = false)
    private double valorUnitario;
    @Column(name = "valor_total_un",nullable = false)
    private double valorTotalUnitario;
    @Column(name = "valor_total_compra",nullable = false)
    private double valorTotalDaCompra;
    @Column(name = "tipo_do_comercio",nullable = false)
    private double tipoDoComercio;
    @Column(name = "nome_do_comercio",nullable = false)
    private double nomeDoComerio;
    @Column(name = "data",nullable = false)
    private double dataDaCompra;

    public long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
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

    public double getValorTotalDaCompra() {
        return valorTotalDaCompra;
    }

    public void setValorTotalDaCompra(double valorTotalDaCompra) {
        this.valorTotalDaCompra = valorTotalDaCompra;
    }

    public double getTipoDoComercio() {
        return tipoDoComercio;
    }

    public void setTipoDoComercio(double tipoDoComercio) {
        this.tipoDoComercio = tipoDoComercio;
    }

    public double getNomeDoComerio() {
        return nomeDoComerio;
    }

    public void setNomeDoComerio(double nomeDoComerio) {
        this.nomeDoComerio = nomeDoComerio;
    }

    public double getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(double dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }
}
