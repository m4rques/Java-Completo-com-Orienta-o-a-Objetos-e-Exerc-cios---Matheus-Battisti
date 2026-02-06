package variaveis;
/*
- Aula 9: Long
    - Long é um  tipo de dado primitivo para armazenar números inteiros muito grandes;
    - Ocupa 8 bytes memoria. permitindo valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.808;
    - ideal para calculos financeiros, contegem de tempo, ou quando o tipo int não é sufiente;
    - Valores literais do tipo long devem ser seguidos por L (maiusculo) para indicar o tipo;
    - O sublinhado pode ser usado para melhoras a legibilidade em números longos, separando grupos de dígitos (EX: 123_456_789_012_345L)
*/
public class aula9 {
    public static void main(String[] args) {
		long populaçãoMundial = 780000000000000L;
				
		System.out.println(populaçãoMundial);
				
		long grandeNumero = 1_000_000L;
				
		System.out.println(grandeNumero + 1);
	}
}
