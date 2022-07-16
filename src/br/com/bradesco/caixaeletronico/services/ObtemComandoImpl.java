//package br.com.bradesco.caixaeletronico.services;
//
//import java.util.Scanner;
//
//public class ObtemComandoImpl implements ObtemComando {
//
//    @Override
//    public int execute() {
//
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Qual a opção desejada?");
//        System.out.println();
//        int comando  = entrada.nextInt();
//        return comando;
//
//    }
//}

package br.com.bradesco.caixaeletronico.services;

import java.util.Scanner;

public class ObtemComandoImpl implements ObtemComando {

    @Override
    public int execute() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a opção desejada?");
        System.out.println();
        return entrada.nextInt(); //retorna o que usuario digitou

    }
}