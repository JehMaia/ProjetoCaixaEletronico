package br.com.bradesco.caixaeletronico;

// SHIFT + F6 = RENOMEAR
// CTRL + ALT + L = FORMATAR LAYOUT DO CÓDIGO

import br.com.bradesco.caixaeletronico.services.SelecionarComando;

public class App {

    public static void main(String[] args) {
        System.out.println("Caixa eletrônico ligado! Escolha uma opção:");
        SelecionarComando selecionaComando = new SelecionarComando();
        while (selecionaComando.executar()) {
            System.out.println("Se já terminou, pressione 0. Para continuar, escolha outra opção:");
        }
        System.out.println("Caixa eletrônico desligado!");
    }
}
