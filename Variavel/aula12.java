package variaveis;
/*
- Aula 12: Operadores Aritimeticos - Parte 2.
    - Incrementa (++): Incrementa o valor de uma variavel em 1;
    - Decrementa (—): Decrementa o valor de uma variavel em 1;
    - Atribuição aditiva (+=): Soma e atribui o resultado a uma variavel;
    - Atribuição subtrativa (-=): Subtrai e atribui o resultado a uma variavel;
*/
public class aula12 {
    public static void main(String[] args) {
        
        int x = 50;

        x++;

        System.out.println(x); // Resposta = 51
        
        int y = 50;

        y--;

        System.out.println(y); // Resposta = 49

        int a = 100;

        a += 100;

        System.out.println(a); // Resposta = 200

        int b = 100;

        b -= 100;

        System.out.println(b); // Resposta = 0

        a += b;
        b -= a;

        System.out.println(a); // Resposta = 200
        System.out.println(b); // Resposta = -200
    }
}
