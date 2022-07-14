package br.com.bradesco.caixaeletronico.model;

public class Conta {

    private int numeroDaConta;
    private double saldo;

    private int numerodaContaOrigem;


    public Conta() {
        saldo = 0; // ideia: toda conta inicia com saldo zerado
    }


    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumerodaContaOrigem() {
        return numerodaContaOrigem;
    }

    public void setNumerodaContaOrigem(int numeroDaConta) {
        this.numerodaContaOrigem = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionaSaldo(double valorASerAdicionado) {
        saldo = saldo + valorASerAdicionado;
    }

    public boolean retirarSaldo (double valorASerRetirado){
        if (saldo >= valorASerRetirado) {
            saldo = saldo - valorASerRetirado;
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

}