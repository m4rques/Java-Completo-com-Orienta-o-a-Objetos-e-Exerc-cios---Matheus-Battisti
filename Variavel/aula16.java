package variaveis;
/*
- Aula 16: Classe Scanner
    - A classe Scanner é utilizada para ler a entrada de dados do usuario via console/terminal;
    - Parte do pacote java.util: Para usar o Scanner, é necesario importa a classe do pacote jav.util;
    - Scanner pode ler diferentes tipos de dado, como int, double, String, etc;
    - Metodos comuns:
        - nextLine(): Le uma linha inteira de texto;
        - nextInt(): Le um valor inteiro;
        - nextDouble(): Le um valor decimal (ponto flutuante);
        - next(): Le uma unica palavra;
*/
import java.util.Scanner;

public class aula16 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.err.println("nome: " + nome + ". Idade: " + idade + ". Altura: " + altura);

    }
}
