package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;

public interface Transferencias {


    double execute(double valor, int numeroDaConta);

    public interface Transferencia {


        void transferir(double valor, Conta destino, Conta origem);

    }
}

