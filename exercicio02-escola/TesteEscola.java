public class TesteEscola {

    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];
        funcionarios[0] = new Professor("Ana", 3000, "POO");
        funcionarios[1] = new Coordenador("Bruno", 4500, "Pedagogico");

        // chamada polimorfica: cada objeto usa a sua versao
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println(funcionarios[i].descrever());
        }

        // sobrecarga: as duas versoes no primeiro objeto
        System.out.println(funcionarios[0].bonificacao());
        System.out.println(funcionarios[0].bonificacao(20));
    }
}
