public class TestePetShop {

    public static void main(String[] args) {
        Animal[] animais = new Animal[2];
        animais[0] = new Cachorro("Rex", 3, "Labrador");
        animais[1] = new Gato("Mia", 2, "curta");

        // chamada polimorfica: cada objeto usa a sua versao
        for (int i = 0; i < animais.length; i++) {
            System.out.println(animais[i].descrever());
        }

        // sobrecarga: as duas versoes no primeiro objeto
        System.out.println(animais[0].idadeEmMeses());
        System.out.println(animais[0].idadeEmMeses(6));
    }
}
