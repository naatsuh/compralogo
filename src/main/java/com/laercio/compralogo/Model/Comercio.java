package com.laercio.compralogo.Model;

import com.laercio.compralogo.util.MetodosPersonalizados;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
@Table(name = "comercio")
public class Comercio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "tipo_do_comercio",nullable = false)
    private String tipoDoComercio;
    @Column(name = "nome_do_comercio",nullable = false)
    private String nomeDoComercio;
    @Column(name = "valor_total_compra", nullable = false)
    private double valorTotalDaCompra;
    @Column(name = "data",nullable = false)
    private String dataDaCompra;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getTipoDoComercio() {
        return tipoDoComercio;
    }

    public void setTipoDoComercio(String tipoDoComercio) {
        this.tipoDoComercio = tipoDoComercio;
    }

    public String getNomeDoComercio() {
        return nomeDoComercio;
    }

    public void setNomeDoComercio(String nomeDoComercio) {
        this.nomeDoComercio = nomeDoComercio;
    }

    public String getDataCompraFormatada () {
        return dataDaCompra;
    }

    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public String getDateNowPreLoadingPage () {
        MetodosPersonalizados mp = new MetodosPersonalizados();
        return mp.dataDeAgora();
    }

    public String getDataDaCompraBr() {
        MetodosPersonalizados mp = new MetodosPersonalizados();
        return mp.dataBr(dataDaCompra,"/");
    }

    public void setDataDaCompra(String dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public double getValorTotalDaCompra() {
        return valorTotalDaCompra;
    }

    public String getValorTotalDaCompraReais() {
        DecimalFormat valorTotal = new DecimalFormat("###,###.00");
        return valorTotal.format(valorTotalDaCompra);
    }

    public void setValorTotalDaCompra(double valorTotalDaCompra) {
        this.valorTotalDaCompra = valorTotalDaCompra;
    }
}
