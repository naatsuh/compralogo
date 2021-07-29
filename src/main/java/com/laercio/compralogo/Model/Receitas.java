package com.laercio.compralogo.Model;

import javax.persistence.*;

@Entity
public class Receitas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "salario")
    private double salario;
    @Column(name = "decimo_terceiro")
    private double decimoTerceiro;
    @Column(name = "ferias")
    private double ferias;
    @Column(name = "gratifcacao")
    private double gratifcacao;
    @Column(name = "restituicao_imposto_renda")
    private double restituicaoImpostoRenda;
    @Column(name = "heranca")
    private double heranca;
    @Column(name = "outros")
    private double outros;
    @Column(name = "dinheiro_guardado")
    private double dinheiroGuardado;

    public long getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDecimoTerceiro() {
        return decimoTerceiro;
    }

    public void setDecimoTerceiro(double decimoTerceiro) {
        this.decimoTerceiro = decimoTerceiro;
    }

    public double getFerias() {
        return ferias;
    }

    public void setFerias(double ferias) {
        this.ferias = ferias;
    }

    public double getGratifcacao() {
        return gratifcacao;
    }

    public void setGratifcacao(double gratifcacao) {
        this.gratifcacao = gratifcacao;
    }

    public double getRestituicaoImpostoRenda() {
        return restituicaoImpostoRenda;
    }

    public void setRestituicaoImpostoRenda(double restituicaoImpostoRenda) {
        this.restituicaoImpostoRenda = restituicaoImpostoRenda;
    }

    public double getHeranca() {
        return heranca;
    }

    public void setHeranca(double heranca) {
        this.heranca = heranca;
    }

    public double getOutros() {
        return outros;
    }

    public void setOutros(double outros) {
        this.outros = outros;
    }

    public double getDinheiroGuardado() {
        return dinheiroGuardado;
    }

    public void setDinheiroGuardado(double dinheiroGuardado) {
        this.dinheiroGuardado = dinheiroGuardado;
    }
}
