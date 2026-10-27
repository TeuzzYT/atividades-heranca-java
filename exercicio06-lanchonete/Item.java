public class Item {

    protected String nome;
    protected double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // metodo que as subclasses vao sobrescrever
    public String descrever() {
        return "Item: " + nome;
    }

    // sobrecarga: mesmo nome, parametros diferentes
    public double total() {
        return preco;
    }

    // sobrecarga: mesmo nome, parametros diferentes
    public double total(int unidades) {
        return preco * unidades;
    }
}
