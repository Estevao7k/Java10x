package Condicoes;

public class ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios: São maneiras de reduzir o código
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
        */

        short numeroDeMissoes = 1;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivelDoNinja);


    }
}
