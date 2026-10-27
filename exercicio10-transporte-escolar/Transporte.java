public class Transporte {

    protected String linha;

    public Transporte(String linha) {
        this.linha = linha;
    }

    // metodo que as subclasses vao sobrescrever
    public String anunciar() {
        return "Linha " + linha;
    }

    // sobrecarga: mesmo nome, parametros diferentes
    public String lotacao(int ocupantes) {
        return "Ocupantes: " + ocupantes;
    }

    // sobrecarga: mesmo nome, parametros diferentes
    public String lotacao(int ocupantes, int capacidade) {
        if (ocupantes <= capacidade) {
            return "Viagem liberada";
        }
        return "Lotacao excedida";
    }
}
