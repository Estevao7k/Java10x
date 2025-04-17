package Condicoes;
import java.util.Scanner;

public class estudoSwitchCases {
    public static void main(String[] args) {

        /*
        * SwitchCases: Que servem para gerar casos especificos
        * Objetivo: Pedir para o usuário escolher entre os Ninjas
        * SwitchCase
        */

        // Pedir para o usuário
        Scanner scanner = new Scanner(System.in);

        // Mostrar opções para o usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Naruto Sakura Haruno");

        // Pedir para o usuário escolher um das opções

        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("VocÊ digitou o número: " + escolhaDoUsuario);

        // Reação ao escolher um personagem
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki, o próximo Hokage");
                break;

            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha, o ninja mais revoltado");
                break;

            case 3:
                System.out.println("O usuário escolheu a Sakura Haruno. a personagem feminina mais legal");
                break;

            default:
                System.out.println("Você não digitou nenhuma respota válida, tente de novo");


        }
        scanner.close();






    }
}
