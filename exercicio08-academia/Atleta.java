public class Atleta {

    protected String nome;

    public Atleta(String nome) {
        this.nome = nome;
    }

    // metodo que as subclasses vao sobrescrever
    public String apresentar() {
        return "Atleta: " + nome;
    }

    // sobrecarga: mesmo nome, parametros diferentes
    public String registrarTempo(double segundos) {
        return "Tempo: " + segundos + " s";
    }

    // sobrecarga: mesmo nome, parametros diferentes
    public String registrarTempo(double segundos, String prova) {
        return "Tempo na prova " + prova + ": " + segundos + " s";
    }
}
