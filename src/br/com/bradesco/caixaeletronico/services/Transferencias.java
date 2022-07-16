package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;

public interface Transferencias {


    double execute(double valor, int numeroDaConta, String nomeDoFavorecido);

}