package variaveis;
/*
- Aula 6: Strings
    - String são sequencias de caracteres usadas para armazenar e manipular texto
    - Classe String: As string são objetos da classe String e oferecem metodos para manipulação de texto;
    - String não pode ser alterada
    - Qualquer manipulação gera outra String
    - Podemos concatenar duas strings com o operador +
*/
public class aula6 {
    public static void main(String[] args) {
			String firstName = "Kauan";
			String lastName = "Marques";
					
			System.out.println("Kauan Marques");
			System.out.println(firstName + " " + lastName); // concatenação 
			System.out.println("O nome dele é: " + firstName);
					
			// Concatenação = operador nas strings
			String fullName = firstName + " " + lastName;
					
			System.out.println(fullName);
		}
}
