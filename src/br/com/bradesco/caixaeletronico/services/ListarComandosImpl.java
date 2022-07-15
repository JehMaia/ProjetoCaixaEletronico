package br.com.bradesco.caixaeletronico.services;

public class ListarComandosImpl implements ListarComandos {

    @Override // sobrepor o método da Interface
    public void execute() {

        System.out.println("Digite 1, para Abrir uma conta.");
        System.out.println("Digite 2, para depositar.");
        System.out.println("Digite 3, para realizar um saque.");
        System.out.println("Digite 4, para realizar uma Transferência.");
        System.out.println("Digite 0, para finalizar a operação");
        System.out.println();
    }

}
