package br.com.bradesco.caixaeletronico.services;

public class ListarComandosImpl implements ListarComandos {

    @Override
    public void execute() {
        System.out.println("Para iniciar, insira o cartão e verifique o menu de serviços abaixo:");
        System.out.println();
        System.out.println("Digite 1, para sacar");
        System.out.println("Digite 2, para depositar");
        System.out.println("Digite 3 para Abrir uma Nova Conta!");
        System.out.println("Digite 0, para finalizar a operação");
        System.out.println();

    }
}
