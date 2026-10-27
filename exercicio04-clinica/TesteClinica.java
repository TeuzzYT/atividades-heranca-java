public class TesteClinica {

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = new Paciente("Carla", "Unimed");
        pessoas[1] = new Medico("Diego", "Clinica");

        // chamada polimorfica: cada objeto usa a sua versao
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].ficha());
        }

        // sobrecarga: as duas versoes no primeiro objeto
        System.out.println(pessoas[0].agendar("12/10/2026"));
        System.out.println(pessoas[0].agendar("12/10/2026", "14:00"));
    }
}
