package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.Repository.MemoriaContaRepository;
import br.com.bradesco.caixaeletronico.model.Conta;

public class SacarImpl implements Sacar {

    public SacarImpl(MemoriaContaRepository repository) {
    }

    @Override
    public double execute(double valor, int numeroDaConta) {


        if (valor >= 1000) {
            System.out.println("Limite de Saque excedido. Tente um valor Válido.");
            System.out.println();

        } else if (valor <= 999.9 ) {

            Conta conta = new Conta();
            System.out.println("Saque realizado! ");
            System.out.printf("Você sacou :"+valor); //como colocar os Reais depois do valor usando o PrintF?
            System.out.println();
            System.out.println();

        } else {
            System.out.println("Opção Inválida");

        }
        return valor;
    }
}
