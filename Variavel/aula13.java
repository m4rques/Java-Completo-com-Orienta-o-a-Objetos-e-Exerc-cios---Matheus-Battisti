package variaveis;
/*
- Aula 13: Type Casting
    - Casting implícito (widening): Converte automaticamente tipos menores para tipos maiores (ex: int para long), sem perda de dados;
    - Casting explicito (narrowing): Necessario quando se converte tipos maiores para tipos menores (ex: double para int), podendo resultar em perda de dados;
    - Para realizar um casting explícito, é necessario especificar o tipo de destino entra parenteses;
*/
public class aula13 {
    public static void main(String[] args) {
        
        // implicito (Widening)
        int num1 = 10;

        long numeroLongo = num1;
        System.out.println(numeroLongo);

        double numeroDouble = num1;
        System.out.println(numeroDouble);

        // Explicito (narrowing)
        double valorDouble = 9.78;

        int valorInt = (int) valorDouble;

        System.out.println(valorInt);
    }
}
