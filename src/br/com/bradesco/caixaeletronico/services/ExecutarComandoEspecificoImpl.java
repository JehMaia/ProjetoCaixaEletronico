package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutarComandoEspecificoImpl implements ExecutarComandoEspecifico {

    private final Depositar depositar;
    private final Sacar saque;
    private final AbrirConta abrirConta;
    private final Transferencias transferir;



    public ExecutarComandoEspecificoImpl() {

        MemoriaContaRepository repository = new MemoriaContaRepository();


        this.depositar = new DepositarImpl(repository);
        this.saque = new SacarImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
        this.transferir = new TransferenciasImpl(repository);
    }


    @Override // sobrepor o método da Interface
    public boolean execute(int comando) {
        boolean resultado = true;
        Scanner entrada = new Scanner(System.in);

        if (comando == 0) {
            System.out.println("Operação encerrada!");
            resultado = false;

        } else if (comando == 1) {
            this.abrirConta.execute();

        } else if (comando == 2) {
            System.out.println("Digite o número da sua Conta: ");
            int numeroDaContaOrigem = entrada.nextInt();
            System.out.println("Digite o valor a ser depositado: ");
            double valorASerDepositado = entrada.nextInt();
            System.out.println("Voce depositou R$"+valorASerDepositado);
            System.out.println("Depósito finalizado!");
            System.out.println();


        } else if (comando == 3) {
            System.out.println("Digite o número da conta: ");
            int numeroDaConta = entrada.nextInt();
            System.out.println("Digite o valor a ser sacado: ");
            double valorASerSacado = entrada.nextInt();
            this.saque.execute(valorASerSacado, numeroDaConta);

        } else if (comando == 4) {
            System.out.println("Digite o número da conta de Origem: ");
            int numeroDaContaOrigem = entrada.nextInt();
            System.out.println("Digite o valor a ser Transferido: ");
            double valorASerTransferido = entrada.nextInt();
            System.out.println("Digite o número da conta Favorecida:");
            int numeroDaConta = entrada.nextInt();
            System.out.println("Vocês transferiu:"+ valorASerTransferido);
            System.out.println("Transação Concluida!");
            System.out.println();
            this.transferir.execute(valorASerTransferido, numeroDaConta);

        } else {
            System.out.println("Comando inválido!");
        }
        return resultado;
    }
}
