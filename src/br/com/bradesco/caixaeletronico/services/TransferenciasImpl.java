package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;
import br.com.bradesco.caixaeletronico.model.Conta;

import java.util.Scanner;

public class TransferenciasImpl implements Transferencias {

    public TransferenciasImpl(MemoriaContaRepository repository) {
    }

    @Override
    public double execute(double valor, int numeroDaConta, String nomeDoFavorecido) {

        Scanner entrada = new Scanner(System.in);


        if (valor >= 2500.00) {
            System.out.println(" Limite Diário Excedido. Tente um valor Válido.");
            System.out.println();


        } else if (valor <= 2499.99) {

            Conta conta = new Conta();
            System.out.println("Transferência realizada! ");
            System.out.println();

        } else {
            System.out.println("Opção Inválida");

        }
        return valor;
    }

}

//Nessa eu queria fazer como saque, pois mesmo colocando valor acima de 2500 da como transação realizada
// e depois fala do limite excedido. Porém lá no saque se coloca um valor maior, ele ja dá a mensagem e pede outro valor.
//Ao tentar fazer igual neste, a palavra valor fica vermelhinha.