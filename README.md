# Herança, sobrecarga e sobrescrita em Java

Lista de atividades do Laboratório de Técnicas de Programação Orientada a Objetos.
Cada pasta é um exercício independente, com uma superclasse, duas subclasses e uma classe de teste.

| # | Pasta | Superclasse | Subclasses | Método sobrescrito | Método sobrecarregado |
|---|-------|-------------|------------|--------------------|-----------------------|
| 1 | exercicio01-petshop | Animal | Cachorro, Gato | descrever() | idadeEmMeses() / idadeEmMeses(int) |
| 2 | exercicio02-escola | Funcionario | Professor, Coordenador | descrever() | bonificacao() / bonificacao(double) |
| 3 | exercicio03-papelaria | Produto | Caderno, Caneta | descrever() | precoComDesconto(double) / precoComDesconto(double, double) |
| 4 | exercicio04-clinica | Pessoa | Paciente, Medico | ficha() | agendar(String) / agendar(String, String) |
| 5 | exercicio05-biblioteca | Publicacao | Livro, Revista | citar() | emprestar(int) / emprestar(int, String) |
| 6 | exercicio06-lanchonete | Item | Lanche, Bebida | descrever() | total() / total(int) |
| 7 | exercicio07-imobiliaria | Imovel | Casa, Apartamento | descrever() | valorEstimado(double) / valorEstimado(double, double) |
| 8 | exercicio08-academia | Atleta | Corredor, Nadador | apresentar() | registrarTempo(double) / registrarTempo(double, String) |
| 9 | exercicio09-cinema | Ingresso | MeiaEntrada, Vip | valorFinal() | resumo() / resumo(boolean) |
| 10 | exercicio10-transporte-escolar | Transporte | Van, OnibusEscolar | anunciar() | lotacao(int) / lotacao(int, int) |

## Como compilar e executar

Exemplo com o exercício 1 (precisa do JDK instalado):

```bash
cd exercicio01-petshop
javac *.java
java TestePetShop
```

O nome da classe de teste de cada exercício está no arquivo `Teste*.java` da pasta.
