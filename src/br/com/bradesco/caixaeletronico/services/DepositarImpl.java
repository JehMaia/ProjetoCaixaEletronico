package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;
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

        return valorASerDepositado;
    }
}

