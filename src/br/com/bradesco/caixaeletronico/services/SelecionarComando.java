package br.com.bradesco.caixaeletronico.services;

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

//package br.com.bradesco.caixaeletronico.services;
//
//public class SelecionarComando {
//
//    private final ListarComandos listarComandos;
//    private final ObtemComando obtemComando;
//    private final ExecutarComandoEspecifico executarComandoEspecifico;
//
//
//
//
//    public SelecionarComando() {
//
//
//        this.listarComandos = new ListarComandosImpl();
//        this.obtemComando = new ObtemComandoImpl();
//        this.executarComandoEspecifico = new ExecutarComandoEspecificoImpl(1010 ); //porque dá erro aqui?
//
//
//    }
//
//    public boolean executar() {
//        listarComandos.execute();
//        int comando = obtemComando.execute();
//        return executarComandoEspecifico.execute(comando);
//
//
//
//
//    }
//}
//
