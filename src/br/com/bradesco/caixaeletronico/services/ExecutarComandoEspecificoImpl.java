package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutarComandoEspecificoImpl implements ExecutarComandoEspecifico {

    private final Depositar depositar;
    private final Sacar saque;
    private final AbrirConta abrirConta;
    private final Transferencias transferir; //Não entendi porque aqui fica pintadinho.



    public ExecutarComandoEspecificoImpl() {

        MemoriaContaRepository repository = new MemoriaContaRepository();


        this.depositar = new DepositarImpl(repository);
        this.saque = new SacarImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
        this.transferir = new TransferenciasImpl(repository);
    }


    @Override
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
            int numeroDaConta = entrada.nextInt();
            System.out.println("Digite o valor a ser depositado: ");
            double valorASerDepositado = entrada.nextInt();
            System.out.println("Digite o nome do Favorecido");
            String nomeDoFavorecido = entrada.next();
            System.out.printf("Você Depositou R$ %.2f para %s !%n", valorASerDepositado, nomeDoFavorecido);
            System.out.println("Transação finalizada!");
            System.out.println();
            //this.depositar.execute( valorASerDepositado, numeroDaConta, nomeDoFavorecido);
            //A linha acima era uma tentativa de retornar o saldo para ver se havia funcionado, mas
            //quando eu coloco a linha acima, dá erro após o nome do favorecido.



        } else if (comando == 3) {
            System.out.println("Digite o número da conta: ");
            int numeroDaConta = entrada.nextInt();
            System.out.println("Digite o valor a ser sacado: ");
            double valorASerSacado = entrada.nextInt();
            this.saque.execute(valorASerSacado, numeroDaConta);

        } else if (comando == 4) {
            System.out.println("Digite o número da sua conta: ");
            int numeroDaConta= entrada.nextInt();
            System.out.println("Digite o valor a ser Transferido: ");
            double valorASerTransferido = entrada.nextInt();
            System.out.println("Digite o nome do Favorecido");
            String nomeDoFavorecido = entrada.next();
            //System.out.println("Vocês transferiu:"+ valorASerTransferido);
            System.out.printf("Você transferiu R$ %.2f para %s !%n", valorASerTransferido, nomeDoFavorecido);
            System.out.println();
            System.out.println("--------------------------------------");
            //this.transferir.execute(valorASerTransferido, numeroDaConta);
            //A linha acima era uma tentativa de retornar o saldo para ver se havia funcionado, mas
            //quando eu coloco a linha acima, dá erro e o programa quebra.

        } else {
            System.out.println("Comando inválido!");
        }
        return resultado;
    }

    // Não entendi porque tive que criar um get pra deposita e transferir aqui dentro desta classe, conforme abaixo:
    public Depositar getDepositar() {
        return depositar;
    }

    public Transferencias getTransferir() {
        return transferir;
    }
}
