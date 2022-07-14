package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.Repository.MemoriaContaRepository;
import br.com.bradesco.caixaeletronico.model.Conta;

public class DepositarImpl implements Depositar {

    private final MemoriaContaRepository repository;

    public DepositarImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public double execute(double valorASerDepositado, int numeroDaConta) {
        Conta conta;
        conta = repository.findById(numeroDaConta);

        conta.adicionaSaldo(valorASerDepositado);

        System.out.println ("Depositando:" + valorASerDepositado);
        System.out.println("Numero da conta:" + numeroDaConta);
        System.out.println("Voce depositou R$"+valorASerDepositado);

        return valorASerDepositado;
    }
}
