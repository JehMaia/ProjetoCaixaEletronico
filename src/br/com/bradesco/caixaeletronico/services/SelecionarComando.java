package br.com.bradesco.caixaeletronico.services;

import java.util.Scanner;

public class SelecionarComando {

    private final ListarComandos listarComandos;
    private final ObtemComando obtemComando;
    private final ExecutarComandoEspecifico executarComandoEspecifico;




    public SelecionarComando() {


        this.listarComandos = new ListarComandosImpl();
        this.obtemComando = new ObtemComandoImpl();
        this.executarComandoEspecifico = new ExecutarComandoEspecificoImpl();


    }

    public boolean executar() {
        listarComandos.execute();
        int comando = obtemComando.execute();
        return executarComandoEspecifico.execute(comando);




    }
}



    //private boolean executarComandoEspecifico(int comando) {
       // boolean resultado = true;
       // return resultado;

        //If-Else

//        if (comando == 0) {
//
//            System.out.println("Finalizando serviços...");
//            resultado = false;
//
//        }else if (comando == 1) {
//            System.out.println("Realizando Saque!");
//
//        } else if (comando == 2) {
//            System.out.println("Realizando Depósito!");
//
//
//        } else
//            System.out.println("Opção Inváida. Tente novamente!");

        //Switch - case

//        switch (comando) {
//            case 0:
//                System.out.println("Finalizando serviços...");
//                resultado = false;
//                break;
//
//            case 1:
//                System.out.println("Realizando Saque!");
//
//            case 2:
//                System.out.println("Realizando Depósito!");
//
//            default:
//                System.out.println("Opção Inváida. Tente novamente!");
//                break;








