package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.Repository.MemoriaContaRepository;
import br.com.bradesco.caixaeletronico.model.Conta;

public class AbrirContaImpl implements AbrirConta {

    private final MemoriaContaRepository repository ;

    public AbrirContaImpl (MemoriaContaRepository repository) {
        this.repository = repository;

    }
    public Conta execute () {
        Conta conta;

        conta = new Conta();

        System.out.printf("Conta número %d o saldo atual é de R$ %.2f %n",conta.getNumeroDaConta(), conta.getSaldo());

        return conta;
    }
    }
