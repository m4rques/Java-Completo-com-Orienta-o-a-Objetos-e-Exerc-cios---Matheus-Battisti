package variaveis;
/*
- Aula 14: Constante em Java com Final
    - final: Define uma variavel como constante, impendindo que seu valor seja alterado apos a inicialização;
    - Uma vez atribuído, o valor não pode ser modificado;
    - Boas praticas: Usado para valores que não devem mudar durante a execução do programa, com PI ou taxas de juros;
    - Convenção de nomes: Constantes geralmente são nomeados em letras maiusculas, com palavras separadas por sublinhados(_);
*/
public class aula14 {
    public static void main(String[] args) {

        final int DIAS_DA_SEMANA = 7;

        System.out.println(DIAS_DA_SEMANA);

    }
}
