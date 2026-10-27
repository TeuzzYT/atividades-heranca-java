public class TesteLanchonete {

    public static void main(String[] args) {
        Item[] itens = new Item[2];
        itens[0] = new Lanche("X-burguer", 18, 2);
        itens[1] = new Bebida("Suco", 8, 300);

        // chamada polimorfica: cada objeto usa a sua versao
        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i].descrever());
        }

        // sobrecarga: as duas versoes no primeiro objeto
        System.out.println(itens[0].total());
        System.out.println(itens[0].total(2));
    }
}
