package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;
import br.com.bradesco.caixaeletronico.model.Conta;

public class TransferenciasImpl implements Transferencias{

    private final MemoriaContaRepository repository;

    public TransferenciasImpl (MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
   public double execute(double valor, int numeroDaConta, String nomeDoFavorecido) {
        Conta conta;
        conta = repository.findById(numeroDaConta);
        conta.adicionaSaldo(valor);
        System.out.printf("Transferência realizada! Seu saldo atual é de R$ %.2f !%n", conta.getSaldo());

        return valor;
    }
}
