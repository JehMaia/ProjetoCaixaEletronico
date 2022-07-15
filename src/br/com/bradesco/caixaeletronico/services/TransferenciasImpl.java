package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.Repository.MemoriaContaRepository;
import br.com.bradesco.caixaeletronico.model.Conta;

public class TransferenciasImpl implements Transferencias {

    public TransferenciasImpl (MemoriaContaRepository repository) {
    }

    @Override
    public double execute(double valor, int numeroDaConta) {


        if (valor >= 2500.00) {
            System.out.println(" Limite Diário Excedido. Tente um valor Válido.");
            System.out.println();

        } else if (valor <= 2499.99 ) {

            Conta conta = new Conta();
            System.out.println("Transferência realizada! ");
            System.out.printf("Você Transferiu :"+valor);
            System.out.println();
            System.out.println();

        } else {
            System.out.println("Opção Inválida");

        }
        return valor;
    }

    @Override
    public double execute(double valor, int numeroDaConta, int numeroDaContaFavorecida) {
        return valor;
    }
}

