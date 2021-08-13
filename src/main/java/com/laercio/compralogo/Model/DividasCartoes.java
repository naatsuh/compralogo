package com.laercio.compralogo.Model;

import javax.persistence.*;

@Entity
@Table(name = "dividas_cartoes")
public class DividasCartoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "banco")
    private String banco;
    @Column(name = "valor_divida")
    private double valorDaDivida;
    @Column(name = "total_pago")
    private double totalPago;
    @Column(name = "total_a_pagar")
    private double totalAPagar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getValorDaDivida() {
        return valorDaDivida;
    }

    public void setValorDaDivida(double valorDaDivida) {
        this.valorDaDivida = valorDaDivida;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }
}
