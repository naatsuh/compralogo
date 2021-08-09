package com.laercio.compralogo.Model;

import javax.persistence.*;

@Entity
@Table(name = "compra_comercio")
public class Comercio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "tipo_do_comercio",nullable = false)
    private double tipoDoComercio;
    @Column(name = "nome_do_comercio",nullable = false)
    private double nomeDoComerio;
    @Column(name = "data",nullable = false)
    private double dataDaCompra;

    @Column(name = "valor_total_compra", nullable = false)
    private double valorTotalDaCompra;

    public long getId() {
        return id;
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

    public double getValorTotalDaCompra() {
        return valorTotalDaCompra;
    }

    public void setValorTotalDaCompra(double valorTotalDaCompra) {
        this.valorTotalDaCompra = valorTotalDaCompra;
    }
}
