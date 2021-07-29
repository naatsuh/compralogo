package com.laercio.compralogo.Model;

import javax.persistence.*;

@Entity
public class DispesasFixas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "agua")
    private double agua;
    @Column(name = "luz")
    private double luz;
    @Column(name = "gas")
    private double gas;
    @Column(name = "internet")
    private double internet;
    @Column(name = "mes")
    private double mes;

    public long getId() {
        return id;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public double getLuz() {
        return luz;
    }

    public void setLuz(double luz) {
        this.luz = luz;
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

    public double getMes() {
        return mes;
    }

    public void setMes(double mes) {
        this.mes = mes;
    }
}
