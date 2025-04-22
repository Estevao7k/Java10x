package exercicios;
import java.util.Scanner;

public class verificadorDeIdade {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.printf("Digite aqui a sua idade");
        int idade = caixaDeTexto.nextInt();
        System.out.println("A sua idade e " + idade + " anos");

        if (idade >= 18)
        {
            System.out.println("Voce e maior de idade ");

        } else {

            System.out.println("Voce e menor de idade");
        }

        caixaDeTexto.close();

    }
}