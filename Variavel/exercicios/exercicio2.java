package variavel.exercicio;
/*
    
        Exercicio 2:

        Declare uma variavel char que armazena a letra 'B'.
        Faça o casting explicito dessa variavel para int e exiba o valor
        numerico correspondente.

*/
public class exercicio2 {
    public static void main(String[] args) {
        
        char letra = 'B';

        int codigo = (char) letra;

        System.out.println(codigo);
    }
}
