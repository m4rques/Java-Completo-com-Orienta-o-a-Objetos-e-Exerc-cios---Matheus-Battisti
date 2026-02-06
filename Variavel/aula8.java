package variaveis;
/*
- Aula 8: int
    - int é um tipo de dado primitivo utilizado para armazenar números inteiros
    - Tamanho fixo: Ocupa 4 bytes de memoria, permitindo armazenar valores de -2.147.483.648 a 2.147.483.647
    - Ideal para operações aritimeticas e contadores em loops
*/
public class aula8 {
    public static void main(String[] args) {
		int n = 42; 
		System.out.println(n);
		System.out.println(n + 5);
		System.out.println(n * 10);
		System.out.println(n / 5); // no caso, aqui era pra dar uma numero quebrado porem é um int então so vai dar o numero antes da vigula
		
		int soma = n + 12;
		
		System.out.println(soma); 
	}
}
