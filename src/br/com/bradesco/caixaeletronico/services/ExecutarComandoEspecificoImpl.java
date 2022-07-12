package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.Repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutarComandoEspecificoImpl implements ExecutarComandoEspecifico {

//    private final Depositar depositar = new DepositarImpl();
//
//    private final Sacar sacar = new SacarImpl();
//
//    private AbrirConta abrirConta = new AbrirContaImpl(); //deu erro e corrigiu tirando o final após o private!Pq?


 private final Depositar depositar;

 private final AbrirConta abrirConta;

 private final Sacar sacar;



    public ExecutarComandoEspecificoImpl(){

        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.depositar = new DepositarImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
        this.sacar = new SacarImpl();


           }

    @Override
    public boolean execute(int comando) {
        Scanner entrada = new Scanner(System.in);
        boolean resultado = true;

        if (comando == 0) {

            System.out.println("Finalizando serviços...");
            resultado = false;

        }else if (comando == 1) {
            sacar.execute(100.00,101025);
            System.out.println("Saque Finalizado!");

        } else if (comando == 2) {
            System.out.println("Digite o numero da conta:");
            int numero = entrada.nextInt();

            System.out.println("Digite o Valor a Ser Depositado:");
            double valor = entrada.nextInt();

            this.depositar.execute(valor, numero);
            System.out.println("Depósito Finalizado!");
            System.out.println();

        } else if (comando == 3) {

            abrirConta.execute();


        } else
            System.out.println("Opção Inváida. Tente novamente!");


        return resultado;
    }
}
