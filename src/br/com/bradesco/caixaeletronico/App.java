package br.com.bradesco.caixaeletronico;

import br.com.bradesco.caixaeletronico.services.SelecionarComando;

public class App {

    public static void main(String[] args) {
        System.out.println("Caixa eletrônico ligado! Escolha uma opção:");
        System.out.println();

        SelecionarComando selecionaComando = new SelecionarComando();

        while (selecionaComando.executar()) {
            System.out.println(" Para continuar, escolha outra opção:");
        }
        System.out.println("Caixa eletrônico desligado!");
    }
}