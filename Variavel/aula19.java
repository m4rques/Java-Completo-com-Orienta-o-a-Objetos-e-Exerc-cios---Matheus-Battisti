package variaveis;

import java.util.Scanner;

public class aula19 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.err.println("Digite um numero:");
        int n = scanner.nextInt();
        
        /*sempre que nextInt ou nextDouble for ficar na frente do nextLine(), 
        colocar um nextLine() entre eles */
        scanner.nextLine(); 

        System.err.println("Digite um texto:");
        String txt = scanner.nextLine();

        System.err.println(n + " " + txt);

        scanner.close();
    }
}
