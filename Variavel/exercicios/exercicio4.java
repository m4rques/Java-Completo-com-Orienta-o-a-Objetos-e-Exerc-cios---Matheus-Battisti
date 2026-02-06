package variavel.exercicio;
/*
    
        EXERCICIO 4
        Declare uma variavel long para armazenar o 
        numero 2 bilhoes (2_000_000_000).
        Em seguida, declare uma variavel int e faça o casting explicito
        do valor long para o int.
        Exiba o resultado.
*/
public class exercicio4 {
    public static void main(String[] args) {
        
        long bilhao = 2_000_000_000L;
        
        int casting = (int) bilhao;

        System.out.println(casting);

    }
}
