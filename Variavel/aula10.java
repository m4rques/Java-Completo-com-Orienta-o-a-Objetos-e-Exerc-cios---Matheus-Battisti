package variaveis;
/*
- Aula 10: Double
    - Double é um tipo de dado primitivo usado para armazenar números de ponto flutuante(decimais) com dupla precisão;
    - Ocupa 8 bbytes de memoria, permitindo armazenar uma ampla gama de valores decimais;
    - Ideal para operações matematicas que requerem precisão, como calculos cientificos e finaceiros;
    - Valores literais podem ser seguidos por d ou D, embora não seja obrigatorio;
    - O sublinhado pode ser usado para separar grupos de digitos em numeros longos para melhorar a legibilidade;
*/
public class aula10 {
    public static void main(String[] args) {
        
        double preco = 19.99;
        System.out.println(preco);
        System.out.println(preco - 12);
        System.out.println(preco / 2);
        
        double pi = 3.141_592_123;
        System.out.println(pi);

        double valorComD = 12.1D;
        System.out.println(valorComD);
        
    }
}
