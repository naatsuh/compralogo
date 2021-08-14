package com.laercio.compralogo.Model;

import com.laercio.compralogo.util.MetodosPersonalizados;

import javax.persistence.*;

@Entity
@Table(name = "despesas_fixas")
public class DespesasFixas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "agua")
    private double agua;
    @Column(name = "energia")
    private double energia;
    @Column(name = "gas")
    private double gas;
    @Column(name = "internet")
    private double internet;
    @Column(name = "data")
    private String dataDaConta;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getInternet() {
        return internet;
    }

    public void setInternet(double internet) {
        this.internet = internet;
    }

    public String getDataDaConta() {
        return dataDaConta;
    }

    public String getDataDespesasFixasBr() {
        MetodosPersonalizados mp = new MetodosPersonalizados();
        return mp.dataBr(dataDaConta,"/");
    }
    public String getDateNowPreLoadingPage(){
        MetodosPersonalizados mp = new MetodosPersonalizados();
        return mp.dataDeAgora();
    }

    public void setDataDaConta(String data) {
        this.dataDaConta = data;
    }
}
