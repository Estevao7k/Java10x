package Condicoes;

public class ifElse {
    public static void main(String[] args) {

        /*
         * IF e ELSE - Condições
         * Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
         */

        // ninja Naruto
        String nome = "Naruto";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 9;

        /*
        * if (condicao) { resultado }
        * else if (condicao) { resultado }
        * else { resultado caso nada seja verdadeiro }
         */

        // se (condicao) {faca isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        }else {
            System.out.println("Rank: Gennim");
        }
    }
}