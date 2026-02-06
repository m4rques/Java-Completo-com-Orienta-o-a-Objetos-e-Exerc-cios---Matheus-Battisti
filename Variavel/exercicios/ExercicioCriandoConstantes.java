package variavel.exercicio;
/*
    Criando Constantes
    Neste exercício, você vai praticar a criação de constantes em Java. 
    Constantes são variáveis cujo valor não pode ser alterado após a sua inicialização. 
    Em Java, elas são definidas usando a palavra-chave final.

    Seu objetivo será criar três constantes que representem informações imutáveis. 
    Aqui estão os valores que você deve armazenar:

    O valor de PI (3.14159).
    O número máximo de tentativas de login permitido (5).
    O nome da aplicação ("MeuApp").
*/
public class ExercicioCriandoConstantes {
    public static void main(String[] args) {
        
        final double P_I = 3.14159;
        final int TENTATIVAS_LOGIN = 5;
        final String NOME_APLICACAO = "MeuApp";

        System.out.println(P_I);
        System.out.println(TENTATIVAS_LOGIN);
        System.out.println(NOME_APLICACAO);
    }
}
