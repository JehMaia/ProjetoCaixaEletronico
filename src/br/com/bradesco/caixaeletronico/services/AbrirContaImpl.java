package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.Repository.MemoriaContaRepository;

public class AbrirContaImpl implements AbrirConta {

    private final MemoriaContaRepository repository;
    public AbrirContaImpl(MemoriaContaRepository repository){
        this.repository = repository;
    }

    @Override // sobrepor o método da Interface
    public Conta execute(){
        Conta conta;
        conta = new Conta ();
        repository.adiciona(conta);
        System.out.printf("Sua conta foi aberta com Sucesso. Seja bem-vindo(a)! O número da sua conta é %d, e o seu saldo atual é de R$ %.2f. %n", conta.getNumeroDaConta(),conta.getSaldo());
        System.out.println();
        return conta;
    }

}


