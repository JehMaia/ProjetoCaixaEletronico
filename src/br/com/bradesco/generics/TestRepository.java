
package br.com.bradesco.generics;

import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;
import br.com.bradesco.caixaeletronico.model.Conta;

public class TestRepository {

    public static void main(String[] args) {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        Conta conta1 = new Conta();
        conta1.adicionaSaldo(100);

        Conta conta2 = new Conta();
        conta2.adicionaSaldo(50);

        repository.adiciona(conta1);
        repository.adiciona(conta2);

        System.out.println(repository.findById(0).getSaldo(1000));
        System.out.println("Agora outra conta!");
        System.out.println(repository.findById(1).getSaldo(20));
    }





}