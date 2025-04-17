package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados primitivos - int, double, float, char, boolean, short.
        * Objetivo da aula: Criar um ninja - Naruto -
        */

        int idade = 17; // valor máximo: 2147483647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto= true;
        Long saldoBancario = 99999L; // Valor máximo: 9,223,372,036,854,775,807

        System.out.println(idade); //Comando para mostrar para o usuário
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("saldoBancario é = " + saldoBancario);
        System.out.println("Minha idade é: " +idade );
    }
}
