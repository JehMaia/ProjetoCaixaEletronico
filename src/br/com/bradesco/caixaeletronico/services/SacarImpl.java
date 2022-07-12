package br.com.bradesco.caixaeletronico.services;

public class SacarImpl implements Sacar {

    @Override
    public double execute(double valor, int numeroDaConta) {


        if (valor >= 1000) {
            System.out.println("Limite de Saque excedido.");

        } else if (valor <= 999.99) {
            System.out.println("Você sacou :"+valor);

        } else {
            System.out.println("Opção Inválida");

        }
        return valor;
    }
}
