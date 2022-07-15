package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;

public interface Transferencias {


    double execute(double valor, int numeroDaConta);

    double execute(double valor, int numeroDaConta, int numeroDaContaFavorecida);

}
