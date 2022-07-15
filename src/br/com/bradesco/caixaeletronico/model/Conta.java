package br.com.bradesco.caixaeletronico.model;

public class Conta {

    private int numeroDaConta;
    private double saldo;


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public Conta() {
        saldo = 1000;
    }


    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo(int saldo) {
        return saldo;
    }


    public void adicionaSaldo(double valorASerAdicionado) {
        saldo = saldo + valorASerAdicionado;
    }

    public boolean retirarSaldo(double valorASerRetirado) {
        if (saldo >= valorASerRetirado) {
            saldo = saldo - valorASerRetirado;
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
}
