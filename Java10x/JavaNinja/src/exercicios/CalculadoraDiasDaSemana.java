package exercicios;
import java.util.Scanner;

public class CalculadoraDiasDaSemana {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Selecione o dia da semana");

        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda-Feira");
        System.out.println("3 - Terca-Feira");
        System.out.println("4 - Quarta-Feira");
        System.out.println("5 - Quinta-Feira");
        System.out.println("6 - Sexta-Feira");
        System.out.println("7 - Sabado");

        int diaDaSemana = caixaDeTexto.nextInt();

        System.out.println("Voce digitou " + diaDaSemana);

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-Feira");
                break;

            case 3:
                System.out.println("Terca-Feira");
                break;

            case 4:
                System.out.println("Quarta-Feira");
                break;

            case 5:
                System.out.println("Quinta-Feira");
                break;

            case 6:
                System.out.println("Sexta-Feira");
                break;

            case 7:
                System.out.println("Sabado");
                break;

            default:
                System.out.println("Numero Invalido");
        }

    caixaDeTexto.close();
    }
}
