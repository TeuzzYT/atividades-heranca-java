public class Animal {

    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // metodo que as subclasses vao sobrescrever
    public String descrever() {
        return "Animal: " + nome + ", " + idade + " anos";
    }

    // sobrecarga: mesmo nome, parametros diferentes
    public int idadeEmMeses() {
        return idade * 12;
    }

    // sobrecarga: mesmo nome, parametros diferentes
    public int idadeEmMeses(int mesesJaVividos) {
        return idade * 12 + mesesJaVividos;
    }
}
