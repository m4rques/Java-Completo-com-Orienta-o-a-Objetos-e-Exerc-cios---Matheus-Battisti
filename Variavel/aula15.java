package variaveis;
/*
- Aula 15: Interferencia de Tipo com var
    - var: Introduzido no Java 10, permite ao compilador inferir o tipo da variavel com base no valor atribuido;
    - Reduz a necessidade de escrever tipos longos e complexos, aumentando a legibilidade do codigo;
    - Tipo estatico: Embora o tipo seja inferido, ele é fixo após atribuição e não pode ser alterado;
    - Regras: Dever ser inicializado no momento da declaração, e não pode ser usado para variaveis não inicializadas;
    - Boas praticas: Util para tipos complexos ou quando o tipo é obvio a partir do contexto;
*/
public class aula15 {
    public static void main(String[] args) {
	
        var z = 10;

        System.out.println(z);

        // z = "teste"; (forma incorreta)
        z = 5;

        System.out.println(z);

        var doubleteste = 2.0;

        System.out.println(doubleteste);

        var texto = "teste";

        System.out.println(texto);
    }
}
