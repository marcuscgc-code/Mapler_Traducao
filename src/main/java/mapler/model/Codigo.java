package mapler.model;

public class Codigo {

    private String texto;

    public Codigo(){
        this.texto = "variaveis\n" +
                      "inicio\n" +
                      "    escrever \"Hello, world!\";\n" +
                      "fim";
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String codigo) {
        this.texto = codigo;
    }
}
