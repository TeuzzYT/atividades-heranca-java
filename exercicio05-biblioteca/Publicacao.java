public class Publicacao {

    protected String titulo;
    protected int ano;

    public Publicacao(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    // metodo que as subclasses vao sobrescrever
    public String citar() {
        return titulo + " (" + ano + ")";
    }

    // sobrecarga: mesmo nome, parametros diferentes
    public String emprestar(int dias) {
        return "Emprestimo de " + dias + " dias";
    }

    // sobrecarga: mesmo nome, parametros diferentes
    public String emprestar(int dias, String leitor) {
        return "Emprestimo de " + dias + " dias para " + leitor;
    }
}
