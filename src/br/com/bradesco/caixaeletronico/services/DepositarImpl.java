package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.Repository.MemoriaContaRepository;
import br.com.bradesco.caixaeletronico.model.Conta;

public class DepositarImpl implements Depositar{

    private final MemoriaContaRepository repository;

    public DepositarImpl(MemoriaContaRepository repository) {
        this.repository = repository;


    }

    @Override
     public void execute (double valor, int numeroDaConta) {
        Conta conta;

        conta = repository.findById(numeroDaConta);
        conta.adicionaSaldo(valor);


        System.out.println("Depositando:" + valor);
        System.out.println("Numero da conta:" + numeroDaConta);
        System.out.printf("O saldo resultante é de R$ %.2f %n " + conta.getSaldo());

    }
}
