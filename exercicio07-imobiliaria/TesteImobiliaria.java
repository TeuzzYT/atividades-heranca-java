public class TesteImobiliaria {

    public static void main(String[] args) {
        Imovel[] imoveis = new Imovel[2];
        imoveis[0] = new Casa("Rua A, 10", 80, 3);
        imoveis[1] = new Apartamento("Rua B, 200", 60, 5);

        // chamada polimorfica: cada objeto usa a sua versao
        for (int i = 0; i < imoveis.length; i++) {
            System.out.println(imoveis[i].descrever());
        }

        // sobrecarga: as duas versoes no primeiro objeto
        System.out.println(imoveis[0].valorEstimado(3000));
        System.out.println(imoveis[0].valorEstimado(3000, 2000));
    }
}
