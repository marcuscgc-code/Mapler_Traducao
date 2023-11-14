package mapler.model;

import conversores.ConversorStrategy;
import debug.DebugSnapshot;
import debug.EstadoDebug;
import interpretador.AcaoInterpretador;
import interpretador.InterpretadorService;
import interpretador.LeitorEntradaConsole;
import org.springframework.beans.factory.annotation.Autowired;

public class Tradutor implements AcaoInterpretador{
    private String status;
    private String traducao;

   
    private InterpretadorService interpretadorService;

    public Tradutor(){
      interpretadorService = new InterpretadorService(this);
        this.status = "FALSE";
    }

    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }

    public void ativar(String codigo){
        this.status = "TRUE";
        try{
            this.traducao = interpretadorService.traduzirDoTexto(codigo, ConversorStrategy.JAVA);
        }catch (Exception e){
            this.traducao = e.toString();
            System.out.println("Erro ao traduzir.");
        }

    }

    public void desativar(){
        this.status = "FALSE";
    }

    public String getTraducao() {
        return traducao;
    }

    public void setTraducao(String traducao) {
        this.traducao = traducao;
    }

    @Override
    public void onInput(LeitorEntradaConsole leitorEntradaConsole) {

    }

    @Override
    public void onOutput(String s) {

    }

    @Override
    public void onInterpretacaoConcluida(double v) {

    }

    @Override
    public void onInterpretacaoInterrompida(double v) {

    }

    @Override
    public void onDebugMudancaEstado(EstadoDebug estadoDebug) {

    }

    @Override
    public void onDebugPassoExecutado(DebugSnapshot debugSnapshot) {

    }

    @Override
    public void onErro(RuntimeException e) {

    }

    @Override
    public void onLog(String s) {

    }
}
