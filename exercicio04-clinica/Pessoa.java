public class Pessoa {

    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    // metodo que as subclasses vao sobrescrever
    public String ficha() {
        return "Pessoa: " + nome;
    }

    // sobrecarga: mesmo nome, parametros diferentes
    public String agendar(String data) {
        return "Consulta em " + data;
    }

    // sobrecarga: mesmo nome, parametros diferentes
    public String agendar(String data, String hora) {
        return "Consulta em " + data + " as " + hora;
    }
}
