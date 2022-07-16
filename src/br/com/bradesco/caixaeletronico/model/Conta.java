package br.com.bradesco.caixaeletronico.model;

public class Conta {

    private int numeroDaConta;
    private double saldo;
    String nomeDoFavorecido;

    public String getNomeDoFavorecido() {
        return nomeDoFavorecido;
    }

    public void setNomeDoFavorecido(String nomeDoFavorecido) {
        this.nomeDoFavorecido = nomeDoFavorecido;
    }


    public Conta() {
        saldo = 0; // ideia: toda conta inicia com saldo zerado
    }

    // GET e SET

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
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
