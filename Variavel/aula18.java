package variaveis;
/*
- Aula 18: Fechamento de Scanner
    - O Scanner consome recursos de entrada, como fluxo de dados do teclado;
    - Fechar o Scanner libera esses recursos, evitando problemas de performance;
    - Deixar o Scanner aberto pode causar vazamentos de memoria ou travamentos;
    - close() é uma boa priatica recomendada apos a leitura dos dados;
    - O fechamento do Scanner ajuda a manter a aplicação eficiente e estavel;
*/
import java.util.Scanner;

public class aula18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Qual o seu nome?");
        String nome = sc.nextLine();

        System.out.println(nome);

        sc.close();
    }
}
