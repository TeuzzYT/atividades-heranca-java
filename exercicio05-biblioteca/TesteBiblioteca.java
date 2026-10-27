public class TesteBiblioteca {

    public static void main(String[] args) {
        Publicacao[] publicacoes = new Publicacao[2];
        publicacoes[0] = new Livro("Dom Casmurro", 1899, 256);
        publicacoes[1] = new Revista("Ciencia Hoje", 2024, 301);

        // chamada polimorfica: cada objeto usa a sua versao
        for (int i = 0; i < publicacoes.length; i++) {
            System.out.println(publicacoes[i].citar());
        }

        // sobrecarga: as duas versoes no primeiro objeto
        System.out.println(publicacoes[0].emprestar(7));
        System.out.println(publicacoes[0].emprestar(7, "Ana"));
    }
}
