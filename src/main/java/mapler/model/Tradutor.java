package mapler.model;

public class Tradutor {
    private String status;
    private String traducao;


    public Tradutor(){
        this.status = "FALSE";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void ativar(String codigo){
        this.status = "TRUE";
        try{
            this.traducao = "Ola mundo, tradutor em construcao.";
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

}
